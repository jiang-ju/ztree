package com.jiang.ztree.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDto {
  private Integer pagesize=3;//每页数据
  private Integer pagenum=1;//第几页
}
