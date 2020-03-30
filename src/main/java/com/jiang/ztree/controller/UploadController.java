package com.jiang.ztree.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
/*
* 文件的上传
* */
@RestController
public class UploadController {
  @PostMapping("upload")
  public String upload(MultipartFile img, HttpSession session) throws IOException {
    String oldName=img.getOriginalFilename();
    String ext=oldName.substring(oldName.lastIndexOf("."));
    String newName= UUID.randomUUID()+ext;
    String timePate=new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    String path="E:/upload/"+timePate;        //系统的路径
    if(! new File(path).exists()){
      new File(path).mkdirs();
    }
    String realpath=path+"/"+newName;
    img.transferTo(new File(realpath));
    System.out.println(realpath);
    return newName;   //返回新的文件名
  }
}
