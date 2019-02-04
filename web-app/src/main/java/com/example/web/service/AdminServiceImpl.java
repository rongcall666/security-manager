package com.example.web.service;

import com.example.web.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author:rong
 * @Description 管理员service实现类
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean login(Integer adminId, String adminPassword) {
        if (adminId != null && adminPassword != null) {
            if (0 != adminMapper.login(adminId, adminPassword)) {
                return true;
            }
        }
        return false;
    }
}
