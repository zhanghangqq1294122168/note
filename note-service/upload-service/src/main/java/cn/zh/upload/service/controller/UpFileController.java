package cn.zh.upload.service.controller;

import cn.zh.upload.service.util.OssUtil;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;


/**
 * @author zhanghang
 */
@RestController("/upFile")
public class UpFileController {


    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile multipartFile, HttpServletRequest request) throws IOException {
        if (!multipartFile.isEmpty()) {
                File tempFile;
                String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/";
                File dir = new File(filePath);
                if(! dir.exists()) {
                    dir.mkdir();
                }
                String path = filePath + multipartFile.getOriginalFilename();
                //save to the /upload path
                tempFile =  new File(path);

            multipartFile.transferTo(tempFile);

            return OssUtil.upLoad(tempFile);
        }
        return "file is null";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }
}
