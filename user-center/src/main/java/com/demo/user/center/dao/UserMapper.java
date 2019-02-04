package com.demo.user.center.dao;

import com.demo.comon.entity.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:rong
 * @Description 用户dao
 */
@Mapper
public interface UserMapper {

    /**
     * 修改用户名
     * @param userPo
     */
    void updateNickname(@Param("userPo") UserPo userPo);

    /**
     * 新增用户
     * @param userPo
     */
    void addUser(@Param("userPo") UserPo userPo);

    /**
     * 查找全部用户
     * @return
     */
    List<UserPo> findAll();

}
