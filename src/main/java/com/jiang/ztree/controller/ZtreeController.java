package com.jiang.ztree.controller;

import com.jiang.ztree.entity.Ztree;
import com.jiang.ztree.service.ZtreeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Ztree)表控制层
 *
 * @author makejava
 * @since 2020-03-18 14:03:27
 */
@RestController
@RequestMapping("ztree")
public class ZtreeController {
    /**
     * 服务对象
     */
    @Resource
    private ZtreeService ztreeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Ztree selectOne(Integer id) {
        return this.ztreeService.queryById(id);
    }
    //查询所有数据
    @GetMapping("findztreeall")
    public List<Ztree> findZtreeAll(Integer pid){
        return ztreeService.findztreebypid(pid);
    }
}