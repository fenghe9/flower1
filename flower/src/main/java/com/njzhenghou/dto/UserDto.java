package com.njzhenghou.dto;

import com.njzhenghou.utils.MD5Utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@NoArgsConstructor
public class UserDto {
    @NotNull
    @Pattern(regexp = "\\w{4,20}")
    private  String username;
    @NotNull
    @Pattern(regexp = "\\d{6}")
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = MD5Utils.findMD5(password);
    }

    private Integer status=1;

}
