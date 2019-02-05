package com.example.permission.service;

import com.demo.comon.entity.PermissionPo;

import java.util.List;

/**
 * @author:rong
 * @Description 权限服务类
 */
public interface PermissionService {
    /**
     * 新增权限
     * @param permissionUrl
     * @param permissionDetail
     * @return
     */
    boolean addPermission(String permissionUrl, String permissionDetail);

    /**
     * 修改权限路径
     * @param permissionId
     * @param permissionUrl
     * @return
     */
    boolean updatePermissionUrl(Integer permissionId, String permissionUrl);

    /**
     * 修改权限详细信息
     * @param permissionId
     * @param permissionDetail
     * @return
     */
    boolean updatePermissionDetail(Integer permissionId, String permissionDetail);

    /**
     * 查找全部权限
     * @return
     */
    List<PermissionPo> findAll();

    /**
     * 查找用户定义的权限
     * @param roleId
     * @return
     */
    List<PermissionPo> findByRoleId(Integer roleId);


    boolean addPermissionForRole(Integer roleId,Integer permissionId);
}
