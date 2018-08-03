package com.example.demo.Dao;

import com.example.demo.Entity.User;
import com.example.demo.Entity.UserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByExample( UserExample example );

    int deleteByPrimaryKey( Integer userid );

    int insert( User record );

    int insertSelective( User record );

    List<User> selectByExample( UserExample example );

    User selectByPrimaryKey( Integer userid );

    int updateByExampleSelective( @Param("record") User record, @Param("example") UserExample example );

    int updateByExample( @Param("record") User record, @Param("example") UserExample example );

    int updateByPrimaryKeySelective( User record );

    int updateByPrimaryKey( User record );

    User selectOneByExample( UserExample example );
}