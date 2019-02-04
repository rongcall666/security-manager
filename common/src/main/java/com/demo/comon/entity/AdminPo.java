package com.demo.comon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:rong
 * @Description 管理员账号
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdminPo {
    private Integer id;
    private Integer adminId;
    private String adminName;
    private String adminPassword;
}
