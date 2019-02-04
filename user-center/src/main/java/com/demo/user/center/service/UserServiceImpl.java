package com.demo.user.center.service;

import com.demo.comon.entity.UserPo;
import com.demo.user.center.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:rong
 * @Description 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean updateNickname(Integer id, String nickname) {
        if (id != null && nickname != null) {
            UserPo userPo = new UserPo();
            userPo.setId(id);
            userPo.setNickname(nickname);
            userMapper.updateNickname(userPo);
            return true;
        }
        return false;
    }

    @Override
    public boolean addUser(UserPo userPo) {
        if (userPo.getUserId() != null && userPo.getNickname() != null) {
            userMapper.addUser(userPo);
            return true;
        }
        return false;
    }

    @Override
    public List<UserPo> findAll() {
        return userMapper.findAll();
    }
}
