package com.weChat.service.impl;

import com.weChat.entity.Article;
import com.weChat.entity.ArticlePublisher;
import com.weChat.mapper.ArticleMapper;
import com.weChat.service.ArticlePublisherService;
import com.weChat.service.ArticleService;
import com.weChat.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleMapper articleMapper;

    // 上传图片地址路径
    @Value("${upload.photo.dir}")
    private String uploadPhotoDir;

    @Autowired
    private ArticlePublisherService articlePublisherService;

    /**
     * 功能描述:
     * 〈根据类型查文章〉
     *
     * @return
     * @Param: [articleTypeId]
     * @Return: java.util.List<com.weChat.entity.Article>
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:17
     */
    @Override
    public List<Map<String, Object>> queryAllArticleByType(String articleTypeId) {
        //Object
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        // 查询选择文章类型下的所有处于审核通过的文章
        Example example = new Example(Article.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("typeUuid", articleTypeId);
        criteria.andEqualTo("status", "1");
        List<Article> listR = articleMapper.selectByExample(example);

        // 循环遍历
        if (listR.size() > 0) {
            for (Article at : listR) {
                // 获取此篇文章的作者
                ArticlePublisher articlePublisher = articlePublisherService.queryPublisherByPId(at.getPublisherUuid());
                // 判断作者现在状态：作者信息不为空且作者位处于被封号状态
                final String status = articlePublisher.getStatus();
                Map<String, Object> map = new HashMap<String, Object>();
                if ("1".equalsIgnoreCase(status)) {
                    map.put("article", at);
                    map.put("publisher", articlePublisher);
                    list.add(map);
                }
            }
        }
        return list;
    }

    /**
     * 功能描述:
     * 〈上传图片〉
     *
     * @Param: [uploadPhoto]
     * @Return: com.weChat.utils.JSONResult
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020年8月22日
     **/
    @Override
    public List<LinkedHashMap<String, Object>> uploadPhoto(HttpServletRequest request, MultipartFile file) {
        List<LinkedHashMap<String, Object>> li = new ArrayList<LinkedHashMap<String, Object>>();
        LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();
        LinkedHashMap<String,String> uploadMap = UploadUtil.uploadPhoto(request, file, uploadPhotoDir);
        if("SUCCESS".equalsIgnoreCase((uploadMap.get("result").toString()))){
            map.put("destFileName", uploadMap.get("destFileName"));
        }else{
            map.put("uploadPhoto","FAIL");

        }
        li.add(map);
        return li;
    }
}
