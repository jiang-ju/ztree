package com.jiang.ztree.service.impl;

import com.jiang.ztree.entity.Ztree;
import com.jiang.ztree.dao.ZtreeDao;
import com.jiang.ztree.service.ZtreeService;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Ztree)表服务实现类
 *
 * @author makejava
 * @since 2020-03-18 14:03:26
 */
@Service("ztreeService")
public class ZtreeServiceImpl implements ZtreeService {
    @Resource
    private ZtreeDao ztreeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Ztree queryById(Integer id) {
        return this.ztreeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Ztree> queryAllByLimit(int offset, int limit) {
        return this.ztreeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param ztree 实例对象
     * @return 实例对象
     */
    @Override
    public Ztree insert(Ztree ztree) {
        this.ztreeDao.insert(ztree);
        return ztree;
    }

    /**
     * 修改数据
     *
     * @param ztree 实例对象
     * @return 实例对象
     */
    @Override
    public Ztree update(Ztree ztree) {
        this.ztreeDao.update(ztree);
        return this.queryById(ztree.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.ztreeDao.deleteById(id) > 0;
    }

    @Override
    public List<Ztree> findztreebypid(Integer pid) {
        Example example=new Example(Ztree.class);
        Example.Criteria criteria=example.createCriteria();
        criteria.andEqualTo("pid",pid);
        return ztreeDao.selectByExample(example);
    }
}