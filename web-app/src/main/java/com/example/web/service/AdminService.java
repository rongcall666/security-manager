package com.example.web.service;

/**
 * @author:rong
 * @Description 管理员service
 */

public interface AdminService {
    /**
     * 管理员登录
     * @param adminId
     * @param adminPassword
     * @return
     */
    boolean login(Integer adminId, String adminPassword);
}
