package com.mytest.teainfoims.service;


import com.mytest.teainfoims.dao.TDictMapper;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;

import com.mytest.teainfoims.vo.TDict;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/4
 */
@Service
public class DictService extends BaseService<TDict,Integer> {
    @Resource
    private TDictMapper tDictMapper;

    public Map<String,Object> queryDictList() {
        Map<String, Object> map = new HashMap<>();
        // 查询资源列表
        List<TDict> dictList = tDictMapper.queryDictList();
        map.put("code",0);
        map.put("msg","");
        map.put("count", dictList.size());
        map.put("data",dictList);
        return map;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void addDict(TDict tDict){
        AssertUtil.isTrue(tDict==null,"数据字典为空");
        tDict.setIsValid(true);
        Date date = new Date();
        tDict.setCreateTime(date);
        tDict.setUpdateTime(date);
        int index = tDictMapper.insertSelective(tDict);
        AssertUtil.isTrue(index<1,"添加字典失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void updateDict(TDict tDict){
        AssertUtil.isTrue(tDict==null,"字典为空");
        tDict.setUpdateTime(new Date());
        AssertUtil.isTrue(tDictMapper.updateByPrimaryKeySelective(tDict)<1,"更新字典失败");
    }

    @Transactional(propagation = Propagation.REQUIRED)
    @SuppressWarnings("all")
    public void deleteDict(Integer id,Integer parentId){
        AssertUtil.isTrue(id==null,"参数错误");
        int index=0;
        if(parentId==0){
            List<TDict> dicts = tDictMapper.selByParentId(id);
            index+=tDictMapper.deleteByParentId(id);
            index+=tDictMapper.deleteByPrimaryKey(id);
            AssertUtil.isTrue(index!=dicts.size()+1,"删除失败");
        }else{
            AssertUtil.isTrue(tDictMapper.deleteByPrimaryKey(id)<1,"删除失败");
        }
    }

    public TDict getDictById(Integer id){
        AssertUtil.isTrue(id==null,"参数错误");
        TDict tDict = tDictMapper.selectByPrimaryKey(id);
        AssertUtil.isTrue(tDict==null,"数据字典为空");
        return tDict;
    }
}
