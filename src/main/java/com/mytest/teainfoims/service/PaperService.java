package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TPaperMapper;
import com.mytest.teainfoims.dao.TTeacherMapper;
import com.mytest.teainfoims.query.PaperQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TPaper;
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
public class PaperService extends BaseService<TPaper,Integer> {
    @Resource
    private TTeacherMapper tTeacherMapper;

    @Resource
    private TPaperMapper tPaperMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addPaper(TPaper tPaper){
        //参数校验
        AssertUtil.isTrue(tPaper==null,"论文信息为空！");
        int tid = tTeacherMapper.queryTeaIdByTeacherName(tPaper.getTeacherName());
        tPaper.setTid(tid);

        //执行插入操作
        int index = tPaperMapper.insertSelective(tPaper);

        //判断执行结果
        AssertUtil.isTrue(index<1,"添加失败");

    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deletePaperByPK(Integer paid){
        //参数校验
        AssertUtil.isTrue(paid==null,"参数传入错误");

        tPaperMapper.deleteByPrimaryKey(paid);
    }

    public Map<String, Object> queryPaperInfo(BaseQuery query, Integer uid){
        Map<String,Object> result=new HashMap<>();
        //参数校验
        AssertUtil.isTrue(uid==null,"用户id为空，无法查询项目信息");

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TPaper> tPapers = tPaperMapper.selPaperInfoByUserId(uid);

        PageInfo pageInfo=new PageInfo(tPapers);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public TPaper queryPaperDetail(Integer paid){
        //参数校验
        AssertUtil.isTrue(paid==null,"参数传入错误");
        TPaper tPaper = tPaperMapper.selPaperByPaid(paid);
        AssertUtil.isTrue(tPaper==null,"查询失败");
        return tPaper;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updatePaper(TPaper tPaper){
        //参数校验
        AssertUtil.isTrue(tPaper==null,"论文信息为空");

        //执行更新操作
        int index = tPaperMapper.updateByPrimaryKeySelective(tPaper);

        //校验返回结果
        AssertUtil.isTrue(index<1,"更新失败");

    }

    public Map<String, Object> queryAuditPaperInfo(PaperQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TPaper> tPapers = tPaperMapper.selAuditPaperList(query);

        PageInfo pageInfo=new PageInfo(tPapers);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }
}
