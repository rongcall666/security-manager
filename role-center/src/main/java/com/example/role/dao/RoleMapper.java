package com.example.role.dao;

import com.demo.comon.entity.RolePo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:rong
 * @Description 角色dao
 */
@Mapper
public interface RoleMapper {

    /**
     * 新增角色
     * @param rolePo
     */
    void addRole(@Param("rolePo") RolePo rolePo);

    /**
     * 修改角色名称
     * @param rolePo
     */
    void updateRoleName(@Param("rolePo") RolePo rolePo);

    /**
     * 修改角色详情
     * @param rolePo
     */
    void updateRoleDetail(@Param("rolePo") RolePo rolePo);

    /**
     * 查找全部角色
     * @param
     */
    List<RolePo> findAll();

    /**
     * 查找用户拥有的角色
     * @param userId
     */
    List<RolePo> findByUserId(@Param("userId") Integer userId);

}
