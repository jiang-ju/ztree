package com.jiang.ztree.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ztree.dto.PageDto;
import com.jiang.ztree.entity.Users;

/**
 * (Users)表服务接口
 *
 * @author makejava
 * @since 2020-03-19 14:41:30
 */
public interface UsersService {

//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    Users queryById(Integer id);
//
//    /**
//     * 查询多条数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    List<Users> queryAllByLimit(int offset, int limit);
//
    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    boolean insert(Users users);

    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    boolean update(Users users);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    //查询所有数据并且分页
    PageInfo<Users> findAll(PageDto pageDto);
    //添加
    boolean saveuser(Users users);
}