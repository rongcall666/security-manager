package com.example.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author:rong
 * @Description 管理员dao
 */
@Mapper
public interface AdminMapper {

    /**
     * 管理员登录
     * @param adminId
     * @param adminPassword
     * @return
     */
    Integer login(@Param("adminId") Integer adminId, @Param("adminPassword") String adminPassword);

}
