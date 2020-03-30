package com.jiang.ztree.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration    //配置类
public class UploadConfig {
  @Component
  public class MvcConfing implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//      创建一个虚拟路径用在存储上传的文件
      registry.addResourceHandler("/upload/**").addResourceLocations("file:E:/upload/");
    }
  }


}
