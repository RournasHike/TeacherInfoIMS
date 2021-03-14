package com.mytest.teainfoims.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mytest.teainfoims.dao.TCourseMapper;
import com.mytest.teainfoims.query.base.BaseQuery;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TCourse;
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
 * @Date: create in 2021/3/14
 */
@Service
public class CourseService extends BaseService<TCourse,Integer> {

    @Resource
    private TCourseMapper tCourseMapper;

    public Map<String,Object> queryCourseList(BaseQuery query){
        Map<String,Object> result=new HashMap<>();

        //使用PageHelper进行分页
        PageHelper.startPage(query.getPage(),query.getLimit());
        List<TCourse> tCourses = tCourseMapper.selCourseList(query);

        PageInfo pageInfo=new PageInfo(tCourses);
        //封装返回结果
        result.put("count",pageInfo.getTotal());
        result.put("data",pageInfo.getList());
        result.put("code",0);
        result.put("msg","分页查询");
        return result;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addCourse(TCourse tCourse){
        AssertUtil.isTrue(tCourse==null,"课程信息为空，添加失败");
        tCourse.setState(true);
        int index = tCourseMapper.insertSelective(tCourse);
        AssertUtil.isTrue(index<1,"课程添加失败");
    }
}
