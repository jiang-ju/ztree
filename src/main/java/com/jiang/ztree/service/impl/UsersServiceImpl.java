package com.jiang.ztree.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ztree.dao.UsersDao;
import com.jiang.ztree.dto.PageDto;
import com.jiang.ztree.entity.Users;
import com.jiang.ztree.service.UsersService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * (Users)表服务实现类
 *
 * @author makejava
 * @since 2020-03-19 14:41:30
 */
@Service("usersService")
public class UsersServiceImpl implements UsersService {
    @Resource
    private UsersDao usersDao;

//    /**
//     * 通过ID查询单条数据
//     *
//     * @param id 主键
//     * @return 实例对象
//     */
//    @Override
//    public Users queryById(Integer id) {
//        return this.usersDao.queryById(id);
//    }
//
//    /**
//     * 查询多条数据
//     *
//     * @param offset 查询起始位置
//     * @param limit 查询条数
//     * @return 对象列表
//     */
//    @Override
//    public List<Users> queryAllByLimit(int offset, int limit) {
//        return this.usersDao.queryAllByLimit(offset, limit);
//    }
//
    /**
     * 新增数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Users users) {
      users.setDa(new Date());
       return this.usersDao.insert(users)==1?true:false;
    }
//
    /**
     * 修改数据
     *
     * @param users 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Users users) {
        return this.usersDao.updateByPrimaryKey(users)==1?true:false;
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.usersDao.deleteByPrimaryKey(id)>0?true:false;
    }

  @Override
  public PageInfo<Users> findAll(PageDto pageDto) {
    PageHelper.startPage(pageDto.getPagenum(),pageDto.getPagesize());
    List<Users> users = usersDao.selectAll();
    PageInfo<Users> pageInfo=new PageInfo<>(users);
    return pageInfo;
  }

  @Override
    public boolean saveuser(Users users) {
        return usersDao.insert(users)==1?true:false;
    }
}