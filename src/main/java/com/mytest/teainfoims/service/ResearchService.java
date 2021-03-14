package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TPatentMapper;
import com.mytest.teainfoims.dao.TResearchMapper;
import com.mytest.teainfoims.dao.TTeacherMapper;
import com.mytest.teainfoims.query.ResearchQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TPatent;
import com.mytest.teainfoims.vo.TResearch;
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
public class ResearchService extends BaseService<TResearch,Integer> {
    @Resource
    private TTeacherMapper tTeacherMapper;

    @Resource
    private TResearchMapper tResearchMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addResearch(TResearch tResearch){
        //参数校验
        AssertUtil.isTrue(tResearch==null,"课题信息为空！");
        int tid = tTeacherMapper.queryTeaIdByTeacherName(tResearch.getTeacherName());
        tResearch.setTid(tid);

        //执行插入操作
        int index = tResearchMapper.insertSelective(tResearch);

        //判断执行结果
        AssertUtil.isTrue(index<1,"添加失败");

    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteResearchByPK(Integer id){
        //参数校验
        AssertUtil.isTrue(id==null,"参数传入错误");

        tResearchMapper.deleteByPrimaryKey(id);
    }

    public Map<String, Object> queryResearchInfo(BaseQuery query, Integer uid){
        Map<String,Object> result=new HashMap<>();
        //参数校验
        AssertUtil.isTrue(uid==null,"用户id为空，无法查询项目信息");

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TResearch> tResearches = tResearchMapper.selResearchInfoByUserId(uid);

        PageInfo pageInfo=new PageInfo(tResearches);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public TResearch queryResearchDetail(Integer patid){
        //参数校验
        AssertUtil.isTrue(patid==null,"参数传入错误");
        TResearch tResearch = tResearchMapper.selResearchInfoById(patid);
        AssertUtil.isTrue(tResearch==null,"查询失败");
        return tResearch;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateResearch(TResearch tResearch){
        //参数校验
        AssertUtil.isTrue(tResearch==null,"课题信息为空");

        //执行更新操作
        int index = tResearchMapper.updateByPrimaryKeySelective(tResearch);

        //校验返回结果
        AssertUtil.isTrue(index<1,"更新失败");

    }

    public Map<String, Object> queryAuditResearchInfo(ResearchQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TResearch> tResearches = tResearchMapper.selAuditResearchList(query);

        PageInfo pageInfo=new PageInfo(tResearches);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }
}
