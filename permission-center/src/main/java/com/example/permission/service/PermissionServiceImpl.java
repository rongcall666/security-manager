package com.example.permission.service;

import com.demo.comon.entity.PermissionPo;
import com.example.permission.dao.PermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:rong
 * @Description 权限服务实现类
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    public boolean addPermission(String permissionUrl, String permissionDetail) {
        if (permissionDetail != null && permissionUrl != null) {
            PermissionPo permissionPo = new PermissionPo();
            permissionPo.setPermissionUrl(permissionUrl);
            permissionPo.setPermissionDetail(permissionDetail);
            permissionMapper.addPermission(permissionPo);
            return true;
        }
        return false;
    }

    public boolean updatePermissionUrl(Integer permissionId, String permissionUrl) {
        if (permissionId != null && permissionUrl != null) {
            PermissionPo permissionPo = new PermissionPo();
            permissionPo.setPermissionUrl(permissionUrl);
            permissionPo.setPermissionId(permissionId);
            permissionMapper.updatePermissionUrl(permissionPo);
            return true;
        }
        return false;
    }

    public boolean updatePermissionDetail(Integer permissionId, String permissionDetail) {
        if (permissionId != null && permissionDetail != null) {
            PermissionPo permissionPo = new PermissionPo();
            permissionPo.setPermissionDetail(permissionDetail);
            permissionPo.setPermissionId(permissionId);
            permissionMapper.updatePermissionUrl(permissionPo);
            return true;
        }
        return false;
    }

    public List<PermissionPo> findAll() {
        return permissionMapper.findAll();
    }

    public List<PermissionPo> findByRoleId(Integer roleId) {
        return permissionMapper.findByRoleId(roleId);
    }

    public boolean addPermissionForRole(Integer roleId, Integer permissionId) {
        if (roleId!=null && permissionId != null){
            permissionMapper.addPermissionForRole(roleId,permissionId);
            return true;
        }
        return false;
    }
}
