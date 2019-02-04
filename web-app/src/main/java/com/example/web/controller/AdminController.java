package com.example.web.controller;

import com.demo.comon.entity.AdminPo;
import com.example.web.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:rong
 * @Description 管理员controller
 */
@Controller
public class AdminController {

    @Autowired
    private AdminService adminService;


    @ResponseBody
    @RequestMapping("/loginPost")
    public String login(@RequestBody AdminPo adminPo) {
        if (adminPo.getAdminId() != null && adminPo.getAdminPassword() != null) {
            adminService.login(adminPo.getAdminId(), adminPo.getAdminPassword());
            return "home";
        }
        return "login";
    }

}
