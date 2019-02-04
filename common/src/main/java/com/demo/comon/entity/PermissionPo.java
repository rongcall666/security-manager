package com.demo.comon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:rong
 * @Description 权限信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PermissionPo {
    private Integer permissionId;
    private String permissionUrl;
    private String permissionDetail;
}
