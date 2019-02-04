package com.example.web.controller;

import com.demo.comon.entity.PermissionPo;
import com.example.permission.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:rong
 * @Description 权限相关controller
 */
@Controller
@RequestMapping("/permission")
public class PermissionController {
    @Autowired
    private PermissionService permissionService;

    @ResponseBody
    @PostMapping("/addPermission")
    public String addPermission(@RequestBody PermissionPo permissionPo) {
        if (permissionPo != null) {
            if (permissionPo.getPermissionUrl() != null && permissionPo.getPermissionDetail() != null) {
                if (permissionService.addPermission(permissionPo.getPermissionUrl(), permissionPo.getPermissionDetail())) {
                    return "SUCCESS";
                }
            }
        }
        return "ERROR";
    }

    @ResponseBody
    @PutMapping("/updatePermissionUrl")
    public String updatePermissionUrl(@RequestBody PermissionPo permissionPo) {
        if (permissionPo != null) {
            if (permissionPo.getPermissionUrl() != null && permissionPo.getPermissionId() != null) {
                if (permissionService.updatePermissionUrl(permissionPo.getPermissionId(), permissionPo.getPermissionUrl())) {
                    return "SUCCESS";
                }
            }
        }
        return "ERROR";
    }

    @ResponseBody
    @PutMapping("/updatePermissionDetail")
    public String updatePermissionDetail(@RequestBody PermissionPo permissionPo) {
        if (permissionPo != null) {
            if (permissionPo.getPermissionDetail() != null && permissionPo.getPermissionId() != null) {
                if (permissionService.updatePermissionDetail(permissionPo.getPermissionId(), permissionPo.getPermissionDetail())) {
                    return "SUCCESS";
                }
            }
        }
        return "ERROR";
    }

    @ResponseBody
    @GetMapping("/findAll")
    public List<PermissionPo> findAll() {
        return permissionService.findAll();
    }

    @ResponseBody
    @GetMapping("/findByRoleId")
    public List<PermissionPo> findByRoleId(Integer roleId) {
        return permissionService.findByRoleId(roleId);
    }
}
