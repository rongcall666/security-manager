package com.example.web.controller;

import com.demo.comon.entity.RolePo;
import com.example.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:rong
 * @Description 角色相关controller
 */
@Controller
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @ResponseBody
    @PostMapping("/addRole")
    public String addRole(@RequestBody RolePo rolePo) {
        if (rolePo != null) {
            if (rolePo.getRoleName() != null && rolePo.getRoleDetail() != null) {
                if (roleService.addRole(rolePo.getRoleName(), rolePo.getRoleDetail())) {
                    return "SUCCESS";
                }
            }
        }
        return "ERROR";
    }

    @ResponseBody
    @PutMapping("/updateRoleName")
    public String updateRoleName(@RequestBody RolePo rolePo) {
        if (rolePo != null) {
            if (rolePo.getRoleName() != null && rolePo.getRoleId() != null) {
                if (roleService.updateRoleName(rolePo.getRoleId(), rolePo.getRoleName())) {
                    return "SUCCESS";
                }
            }
        }
        return "ERROR";
    }

    @ResponseBody
    @PutMapping("/updateRoleDetail")
    public String updateRoleDetail(@RequestBody RolePo rolePo) {
        if (rolePo != null) {
            if (rolePo.getRoleDetail() != null && rolePo.getRoleId() != null) {
                if (roleService.updateRoleDetail(rolePo.getRoleId(), rolePo.getRoleDetail())) {
                    return "SUCCESS";
                }
            }
        }
        return "ERROR";
    }

    @ResponseBody
    @GetMapping("/findAll")
    public List<RolePo> findAll() {
        return roleService.findAll();
    }


    @ResponseBody
    @GetMapping("/findByUserId")
    public List<RolePo> findByUserId(Integer userId) {
        return roleService.findByUserId(userId);
    }


}
