package com.mytest.teainfoims.dao;

import com.mytest.teainfoims.dao.base.BaseMapper;
import com.mytest.teainfoims.query.UserInfo;
import com.mytest.teainfoims.query.UserQuery;
import com.mytest.teainfoims.vo.TUser;
import com.mytest.teainfoims.vo.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper extends BaseMapper<TUser,Integer> {
    int countByExample(TUserExample example);

    int deleteByExample(TUserExample example);

    @Override
    Integer deleteByPrimaryKey(Integer uid);

    int insert(TUser record);

    @Override
    Integer insertSelective(TUser record);

    List<TUser> selectByExample(TUserExample example);

    @Override
    TUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") TUser record, @Param("example") TUserExample example);

    int updateByExample(@Param("record") TUser record, @Param("example") TUserExample example);

    @Override
    Integer updateByPrimaryKeySelective(TUser record);

    int updateByPrimaryKey(TUser record);

    TUser queryUserByUserName(String username);

    int deleteUserByUserName(String username);

    List<UserInfo> selAllUsers(UserQuery query);

    List<Integer> selUserIdByUserName(String usertruename);
}