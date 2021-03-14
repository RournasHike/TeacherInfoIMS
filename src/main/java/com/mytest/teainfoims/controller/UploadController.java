package com.mytest.teainfoims.controller;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/28
 */

import com.mytest.teainfoims.entity.UserEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class UploadController {


    /**
     * 项目端口
     */
    @Value("${server.port}")
    public String port;

    /**
     * 项目路径
     */
    @Value("${server.servlet.context-path}")
    public String contextPath;


    /**
     * 文件上传
     * @param file
     * @return
     */
    @SuppressWarnings("all")
    @PostMapping("upload")
    @ResponseBody
    public Map<String, Object> uploadFile(MultipartFile file) {
        Map<String, Object> result = new HashMap<>();
        try {

            if (file.isEmpty()) {
                return null;
            }
            // 获取文件的名称
            String originalFilename = file.getOriginalFilename();
            // 文件后缀 例如：.png
            String fileSuffix = originalFilename.substring(originalFilename.lastIndexOf("."));
            // uuid 生成文件名
            String uuid = String.valueOf(UUID.randomUUID());
            // 根路径，在 resources/static/upload
            String basePath = ResourceUtils.getURL("classpath:").getPath() + "static/upload/";
            // 新的文件名，使用uuid生成文件名
            String fileName = uuid + fileSuffix;
            // 创建新的文件
            File fileExist = new File(basePath);
            // 文件夹不存在，则新建
            if (!fileExist.exists()) {
                fileExist.mkdirs();
            }
            // 获取文件对象
            File baseFile = new File(basePath, fileName);
            // 完成文件的上传
            file.transferTo(baseFile);
            // 返回绝对路径
            result.put("code", 200);
            result.put("msg", "success");
            result.put("filePath","upload/"+fileName);
        } catch (Exception e) {
            result.put("code", -1);
            result.put("msg", "文件上传出错，请重新上传！");
            e.printStackTrace();
        }

        return result;
    }


    /**
     * 获取文件上传进度
     * @param request
     * @return
     */
    @RequestMapping("getUploadProgress")
    @ResponseBody
    public UserEntity getUploadProgress(HttpServletRequest request){
        return (UserEntity) request.getSession().getAttribute("uploadStatus");
    }

}


