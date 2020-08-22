package com.weChat.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;

@Component
public class UploadUtil {


    public static LinkedHashMap<String,String> uploadPhoto(HttpServletRequest req, @RequestParam("file") MultipartFile file, String uploadPhotoDir) {
        LinkedHashMap<String,String> map = new LinkedHashMap<String,String>();
        try {
            //2.根据时间戳创建新的文件名
            String fileName = System.currentTimeMillis() + file.getOriginalFilename();

            String destFileName = uploadPhotoDir + fileName;
            //4.第一次运行的时候，这个文件所在的目录往往是不存在的
            File destFile = new File(destFileName);
            if((destFile.getParent()).isEmpty()){
                destFile.getParentFile().mkdirs();
            }
            //5.把浏览器上传的文件复制到希望的位置
            file.transferTo(destFile);
            map.put("destFileName",destFileName);
            map.put("result","SUCCESS");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            map.put("destFileName","");
            map.put("result","FAIL");
        } catch (IOException e) {
            e.printStackTrace();
            map.put("destFileName","");
            map.put("result","FAIL");
        }
        return map;
    }
}
