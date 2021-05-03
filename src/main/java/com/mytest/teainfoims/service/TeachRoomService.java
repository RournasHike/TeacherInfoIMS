package com.mytest.teainfoims.service;

import com.mytest.teainfoims.dao.TTeachRoomMapper;
import com.mytest.teainfoims.service.base.BaseService;
import com.mytest.teainfoims.utils.AssertUtil;
import com.mytest.teainfoims.vo.TTeachRoom;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Alex
 * @Description
 * @Date: create in 2021/3/17
 */
@Service
public class TeachRoomService extends BaseService<TTeachRoom,Integer> {
    @Resource
    private TTeachRoomMapper tTeachRoomMapper;

    public List<TTeachRoom> getAllTeachRooms(){
        return tTeachRoomMapper.getAllTeachRoom();
    }

    public TTeachRoom getTeachRoomByName(String teachRoomName){
        AssertUtil.isTrue(teachRoomName==null,"参数错误");
        TTeachRoom tTeachRoom = tTeachRoomMapper.selTeachRoomByName(teachRoomName);
        AssertUtil.isTrue(tTeachRoom==null,"记录为空");
        return tTeachRoom;
    }

    public TTeachRoom getTeachRoomById(Integer id){
        return tTeachRoomMapper.selectByPrimaryKey(id);
    }
}
