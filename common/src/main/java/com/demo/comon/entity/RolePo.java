package com.demo.comon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:rong
 * @Description 角色信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolePo {
    private Integer roleId;
    private String roleName;
    private String roleDetail;
}
