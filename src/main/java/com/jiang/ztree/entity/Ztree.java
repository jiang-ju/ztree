package com.jiang.ztree.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * (Ztree)实体类
 *
 * @author makejava
 * @since 2020-03-18 14:03:23
 */
@Table(name = "ztree")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Ztree implements Serializable {
    @Id
    private Integer id;
    
    private Integer pid;
    
    private String name;
    
    private Integer leaf;
    
    private String url;
    
    private String description;
    
    private Date intime;

    public boolean getleafBoolean(){
      if(this.leaf==1){
        return true;
      }
      return false;
    }
}