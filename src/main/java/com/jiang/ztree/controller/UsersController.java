package com.jiang.ztree.controller;

import com.github.pagehelper.PageInfo;
import com.jiang.ztree.dto.PageDto;
import com.jiang.ztree.entity.Users;
import com.jiang.ztree.service.UsersService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Users)表控制层
 *
 * @author makejava
 * @since 2020-03-19 14:41:30
 */
@RestController
@RequestMapping("users")
public class UsersController {
    /**
     * 服务对象
     */
    @Resource
    private UsersService usersService;


    //添加
    @PostMapping("saveuser")
    public boolean saveuser(@RequestBody Users users){
        return usersService.saveuser(users);
    }
//    修改
    @PostMapping("updateusersbyid")
    public boolean updateusersbyid(Users users){
        return usersService.update(users);
    }
    //根据id删除
    @GetMapping("deleteuserbyid")
    public boolean deleteuserbyid(Integer id){
        return usersService.deleteById(id);
    }
    //查询出所有数据并且分页
    @PostMapping("findusersAll")
    public PageInfo<Users> findusersAll(@RequestBody PageDto pageDto){
        return usersService.findAll(pageDto);
    }
}