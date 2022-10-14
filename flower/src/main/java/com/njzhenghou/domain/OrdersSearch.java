package com.njzhenghou.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrdersSearch {
    private Integer oid;
    private String username;
    private String f_ame;
    private Integer total;
    private String state;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createTime;
    private String address;
    private Double sum;
    private String cName;
    private String cPhone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date payTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date closeTime;
    private Integer status;
}
