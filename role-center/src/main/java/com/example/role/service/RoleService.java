package com.example.role.service;

import com.demo.comon.entity.RolePo;

import java.util.List;

/**
 * @author:rong
 * @Description 角色服务类
 */
public interface RoleService {
    /**
     * 新增角色
     * @param roleName
     * @param roleDetail
     * @return
     */
    boolean addRole(String roleName, String roleDetail);

    /**
     * 修改角色名称
     * @param roleId
     * @param roleName
     * @return
     */
    boolean updateRoleName(Integer roleId, String roleName);

    /**
     * 修改角色详情
     * @param roleId
     * @param roleDetail
     * @return
     */
    boolean updateRoleDetail(Integer roleId, String roleDetail);


    /**
     * 查找全部角色
     * @return
     */
    List<RolePo> findAll();


    /**
     * 查找用户拥有的角色
     * @param userId
     * @return
     */
    List<RolePo> findByUserId(Integer userId);


    /**
     * 给用户新增角色
     * @param userId
     * @param roleId
     * @return
     */
    boolean UserAddRole(Integer userId,Integer roleId);
}
