package com.njzhenghou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;

    @NotNull(message = "名称不能为空")
    private String username;

    @NotNull(message = "密码不能为空")
    private String password;

    private String name;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String email;

    private String tel;

    private String address;

    private Date createTime;


    private Integer status;

    private Date lastModifyTime;

}
