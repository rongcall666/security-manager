package com.demo.user.center.service;

import com.demo.comon.entity.UserPo;

import java.util.List;

/**
 * @author:rong
 * @Description 用户service
 */
public interface UserService {
    /**
     * 修改用户名
     * @param id
     * @param nickname
     * @return
     */
    boolean updateNickname(Integer id, String nickname);

    /**
     * 新增用户
     * @param userPo
     */
    boolean addUser(UserPo userPo);
    /**
     * 查找全部用户
     * @return
     */
    List<UserPo> findAll();
}
