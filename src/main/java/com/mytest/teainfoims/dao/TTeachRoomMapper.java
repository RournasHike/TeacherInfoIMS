package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.vo.TTeachRoom;
import com.mytest.teainfoims.vo.TTeachRoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTeachRoomMapper {
    int countByExample(TTeachRoomExample example);

    int deleteByExample(TTeachRoomExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TTeachRoom record);

    int insertSelective(TTeachRoom record);

    List<TTeachRoom> selectByExample(TTeachRoomExample example);

    TTeachRoom selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TTeachRoom record, @Param("example") TTeachRoomExample example);

    int updateByExample(@Param("record") TTeachRoom record, @Param("example") TTeachRoomExample example);

    int updateByPrimaryKeySelective(TTeachRoom record);

    int updateByPrimaryKey(TTeachRoom record);
}