package com.demo.comon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:rong
 * @Description 用户信息
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserPo {
    private Integer id;
    private Integer userId;
    private String nickname;
}
