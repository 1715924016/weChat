package com.weChat.service;

import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface ArticleService {

    /**
     * 功能描述:
     * 〈根据类型查文章〉
     *
     * @return
     * @Param: [articleTypeId]
     * @Return: java.util.List<com.weChat.entity.Article>
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020/8/4 11:16
     */
    List<Map<String, Object>> queryAllArticleByType(String articleTypeId);

    /**
     * 功能描述:
     * 〈上传图片〉
     *
     * @Param: [uploadPhoto]
     * @Return: com.weChat.utils.JSONResult
     * @Author: https://home.cnblogs.com/u/90s-ITBoy/
     * @Date: 2020年8月22日
     **/
    List<LinkedHashMap<String, Object>> uploadPhoto(HttpServletRequest request, MultipartFile file);
}
