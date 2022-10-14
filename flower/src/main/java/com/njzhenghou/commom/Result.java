package com.njzhenghou.commom;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    //表示成功 状态码200
    private Integer code=200;
    //显示错误消息内容 值是-1 的时候才显示
    private  String msg;
    //显示查询成功之后显示的内容信息
    private Object data;
    //查询时候满足条件的记录数
    private  Long total=0l;

    public Result(Integer code,String msg){
        this.code=code;
        this.msg=msg;
    }
    public static  final  Result Data_FORMAT_ERROR=new  Result(-1,"传入的数据格式错误");


}
