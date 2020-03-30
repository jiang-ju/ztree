package com.jiang.ztree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan("com.jiang.ztree.dao")
@SpringBootApplication
public class ZtreeApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZtreeApplication.class, args);
  }

}
