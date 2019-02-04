package com.example.permission.dao;

import com.demo.comon.entity.PermissionPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:rong
 * @Description 权限dao
 */
@Mapper
public interface PermissionMapper {

    /**
     * 新增权限
     * @param permissionPo
     */
    void addPermission(@Param("permissionPo") PermissionPo permissionPo);

    /**
     * 修改权限路径
     * @param permissionPo
     */
    void updatePermissionUrl(@Param("permissionPo") PermissionPo permissionPo);

    /**
     * 修改权限详细信息
     * @param permissionPo
     */
    void updatePermissionDetail(@Param("permissionPo") PermissionPo permissionPo);

    /**
     * 查找全部权限
     * @param
     */
    List<PermissionPo> findAll();

    /**
     * 查找用户定义的权限
     * @param roleId
     */
    List<PermissionPo> findByRoleId(@Param("roleId") Integer roleId);
}
