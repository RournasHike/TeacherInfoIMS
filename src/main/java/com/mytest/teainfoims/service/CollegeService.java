package com.mytest.teainfoims.service;

import com.mytest.teainfoims.dao.TCollegeMapper;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.vo.TCollege;
import com.mytest.teainfoims.vo.TCourse;
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
public class CollegeService extends BaseService<TCollege,Integer> {
    @Resource
    private TCollegeMapper tCollegeMapper;

    public List<TCollege> selAllCollege(){
        return tCollegeMapper.selAllCollege();
    }

    public TCollege selCollegeById(Integer id){
        return tCollegeMapper.selectByPrimaryKey(id);
    }
}
