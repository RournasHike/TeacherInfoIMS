package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TPatentMapper;
import com.mytest.teainfoims.dao.TTeacherMapper;
import com.mytest.teainfoims.query.PatentQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TPatent;
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
public class PatentService extends BaseService<TPatent,Integer> {
    @Resource
    private TTeacherMapper tTeacherMapper;

    @Resource
    private TPatentMapper tPatentMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addPatent(TPatent tPatent){
        //参数校验
        AssertUtil.isTrue(tPatent==null,"专利信息为空！");
        int tid = tTeacherMapper.queryTeaIdByTeacherName(tPatent.getTeacherName());
        tPatent.setTid(tid);

        //执行插入操作
        int index = tPatentMapper.insertSelective(tPatent);

        //判断执行结果
        AssertUtil.isTrue(index<1,"添加失败");

    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deletePatentByPK(Integer patid){
        //参数校验
        AssertUtil.isTrue(patid==null,"参数传入错误");

        tPatentMapper.deleteByPrimaryKey(patid);
    }

    public Map<String, Object> queryPatentInfo(BaseQuery query, Integer uid){
        Map<String,Object> result=new HashMap<>();
        //参数校验
        AssertUtil.isTrue(uid==null,"用户id为空，无法查询项目信息");

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TPatent> tPatents = tPatentMapper.selPatentInfoByUserId(uid);

        PageInfo pageInfo=new PageInfo(tPatents);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public TPatent queryPatentDetail(Integer patid){
        //参数校验
        AssertUtil.isTrue(patid==null,"参数传入错误");
        TPatent tPatent = tPatentMapper.selPatentInfoByPatid(patid);
        AssertUtil.isTrue(tPatent==null,"查询失败");
        return tPatent;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updatePatent(TPatent tPatent){
        //参数校验
        AssertUtil.isTrue(tPatent==null,"荣誉信息为空");

        //执行更新操作
        int index = tPatentMapper.updateByPrimaryKeySelective(tPatent);

        //校验返回结果
        AssertUtil.isTrue(index<1,"更新失败");

    }

    public Map<String, Object> queryAuditPatentInfo(PatentQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TPatent> tPatents = tPatentMapper.selAuditPatentList(query);

        PageInfo pageInfo=new PageInfo(tPatents);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

}
