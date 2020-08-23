package com.weChat.staticsController;

import com.weChat.controller.ArticleController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/uploadHTML")
public class UploadHTMLController {

    /**
     * 日志
     */
    private static Logger logger = LoggerFactory.getLogger(ArticleController.class);

    @GetMapping("/uploadPhotoHTML")
    public String uploadPhotoHTML(){
        logger.info("进入上传界面！");
        return "/upload";
    }
}
