package com.example.web.controller;

import com.demo.comon.entity.UserPo;
import com.demo.user.center.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author:rong
 * @Description 用户相关controller
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PutMapping("/updateNickname")
    public String updateNickname(@RequestBody UserPo userPo) {
        if (userPo != null) {
            if (userPo.getId() != null && userPo.getNickname() != null) {
                userService.updateNickname(userPo.getId(), userPo.getNickname());
                return "SUCCESS";
            }
        }
        return "ERROR";
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserPo userPo) {
        if (userPo != null) {
            if (userPo.getUserId() != null && userPo.getNickname() != null) {
                userService.addUser(userPo);
                return "SUCCESS";
            }
        }
        return "ERROR";
    }

    @ResponseBody
    @GetMapping
    public List<UserPo> findAll() {
        return userService.findAll();
    }


}
