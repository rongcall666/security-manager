package com.example.role.service;

import com.demo.comon.entity.RolePo;
import com.example.role.dao.RoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:rong
 * @Description 角色服务实现类
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public boolean addRole(String roleName, String roleDetail) {
        if (roleDetail != null && roleName != null) {
            RolePo rolePo = new RolePo();
            rolePo.setRoleDetail(roleDetail);
            rolePo.setRoleName(roleName);
            roleMapper.addRole(rolePo);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateRoleName(Integer roleId, String roleName) {
        if (roleName != null && roleId != null) {
            RolePo rolePo = new RolePo();
            rolePo.setRoleName(roleName);
            rolePo.setRoleId(roleId);
            roleMapper.updateRoleName(rolePo);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateRoleDetail(Integer roleId, String roleDetail) {
        if (roleDetail != null && roleId != null) {
            RolePo rolePo = new RolePo();
            rolePo.setRoleDetail(roleDetail);
            rolePo.setRoleId(roleId);
            roleMapper.updateRoleDetail(rolePo);
            return true;
        }
        return false;
    }

    @Override
    public List<RolePo> findAll() {
        return roleMapper.findAll();
    }

    @Override
    public List<RolePo> findByUserId(Integer userId) {
        return roleMapper.findByUserId(userId);
    }
}
