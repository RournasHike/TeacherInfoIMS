package com.mytest.teainfoims.service;

import com.mytest.teainfoims.dao.TDeptMapper;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.vo.TDept;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/1/25
 */
@Service
public class DeptService extends BaseService<TDept,Integer> {
    @Resource
    private TDeptMapper tDeptMapper;

    public List<TDept> selAllDept(){
        return tDeptMapper.selAllDept();
    }
}
