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
 * (Users)实体类
 *
 * @author makejava
 * @since 2020-03-19 14:41:30
 */
@Table(name = "users")
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Users implements Serializable {
    private static final long serialVersionUID = 147616742877821607L;
    @Id
    private Integer id;
    private String name;
    private String sex;
    private String hobby;
    private String img;
    private Date da;
    private String db;

}