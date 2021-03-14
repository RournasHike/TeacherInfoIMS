package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.THonorMapper;
import com.mytest.teainfoims.dao.TTeacherMapper;
import com.mytest.teainfoims.query.HonorQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.THonor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/2/6
 */
@Service
public class HonorService extends BaseService<THonor,Integer> {
    @Resource
    private TTeacherMapper tTeacherMapper;

    @Resource
    private THonorMapper tHonorMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addHonor(THonor tHonor){
        //参数校验
        AssertUtil.isTrue(tHonor==null,"荣誉信息为空！");
        int tid = tTeacherMapper.queryTeaIdByTeacherName(tHonor.getTeacherName());
        tHonor.setTid(tid);

        //执行插入操作
        int index = tHonorMapper.insertSelective(tHonor);

        //判断执行结果
        AssertUtil.isTrue(index<1,"添加失败");

    }

    public Map<String, Object> queryHonorInfo(BaseQuery query, Integer uid){
        Map<String,Object> result=new HashMap<>();
        //参数校验
        AssertUtil.isTrue(uid==null,"用户id为空，无法查询项目信息");

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<THonor> tHonors = tHonorMapper.selHonorInfoByUserId(uid);

        PageInfo pageInfo=new PageInfo(tHonors);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public THonor queryHonorDetail(Integer hid){
        //参数校验
        AssertUtil.isTrue(hid==null,"参数传入错误");
        THonor tHonor = tHonorMapper.selHonorInfoByHid(hid);
        AssertUtil.isTrue(tHonor==null,"查询失败");
        return tHonor;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateHonor(THonor tHonor){
        //参数校验
        AssertUtil.isTrue(tHonor==null,"荣誉信息为空");

        //执行更新操作
        int index = tHonorMapper.updateByPrimaryKeySelective(tHonor);

        //校验返回结果
        AssertUtil.isTrue(index<1,"更新失败");

    }

    public Map<String,Object> queryHonorList(HonorQuery query){
        Map<String,Object> result=new HashMap<>();


        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<THonor> tHonors = tHonorMapper.selAuditHonorList(query);

        PageInfo pageInfo=new PageInfo(tHonors);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteHonorByPK(Integer hid){
        //参数校验
        AssertUtil.isTrue(hid==null,"参数传入失败!");

        tHonorMapper.deleteByPrimaryKey(hid);
    }
}
