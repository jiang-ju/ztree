package com.jiang.ztree.service;

import com.jiang.ztree.entity.Ztree;
import java.util.List;

/**
 * (Ztree)表服务接口
 *
 * @author makejava
 * @since 2020-03-18 14:03:25
 */
public interface ZtreeService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Ztree queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Ztree> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param ztree 实例对象
     * @return 实例对象
     */
    Ztree insert(Ztree ztree);

    /**
     * 修改数据
     *
     * @param ztree 实例对象
     * @return 实例对象
     */
    Ztree update(Ztree ztree);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /*
    根据pid查询数据
    * */
    List<Ztree> findztreebypid(Integer pid);
}