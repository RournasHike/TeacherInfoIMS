package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TProjectMapper;
import com.mytest.teainfoims.dao.TTeacherMapper;
import com.mytest.teainfoims.query.PatentQuery;
import com.mytest.teainfoims.query.ProjectQuery;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TProject;
import com.mytest.teainfoims.vo.TTeacher;
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
 * @Date: create in 2021/2/4
 */
@Service
public class ProjectService extends BaseService<TProject,Integer> {

    @Resource
    private TProjectMapper projectMapper;

    @Resource
    private TTeacherMapper tTeacherMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addProject(TProject project){
        //参数校验
        AssertUtil.isTrue(project==null,"项目信息为空");

        //查询教师id
        int teaId = tTeacherMapper.queryTeaIdByTeacherName(project.getTeacherName());
        project.setTid(teaId);

        //执行添加操作
        int index = projectMapper.insertSelective(project);

        //校验返回结果
        AssertUtil.isTrue(index<1,"项目信息添加失败！");

    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteProjectByPK(Integer pid){
        //参数校验
        AssertUtil.isTrue(pid==null,"参数传入失败");

        projectMapper.deleteByPrimaryKey(pid);
    }


    public Map<String, Object> queryProjectInfo(BaseQuery query,Integer uid){
        Map<String,Object> result=new HashMap<>();
        //参数校验
        AssertUtil.isTrue(uid==null,"用户id为空，无法查询项目信息");

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TProject> tProjects = projectMapper.selProjectInfoByUserId(uid);

        PageInfo pageInfo=new PageInfo(tProjects);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    public TProject queryProjectDetail(Integer pid){
        AssertUtil.isTrue(pid==null,"参数错误查询失败");
        TProject tProject = projectMapper.selProjectInfoByPid(pid);
        return tProject;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateProject(TProject project){
        //参数校验
        AssertUtil.isTrue(project==null,"项目信息为空，无法更新");

        //执行更新操作
        AssertUtil.isTrue(projectMapper.updateByPrimaryKeySelective(project)<1,"项目信息更新失败");
    }

    public Map<String, Object> queryAuditProjectInfo(ProjectQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TProject> tProjects = projectMapper.selAuditProjectList(query);

        PageInfo pageInfo=new PageInfo(tProjects);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

}
