package com.njzhenghou.utils;

import cn.hutool.crypto.SecureUtil;

/**
 * @author zzhhStyle
 * @create 2022-10-11 10:36
 */
public class MD5Utils {


    public static  String init(String txt){
        if(txt ==null){
            return null;
        }

        //加密
        String encry = SecureUtil.md5(txt);
        return encry;

    }

    public static  String findMD5(String txt){
        return  init(init(init(txt)+"aaa")+"bbb");
    }

    public static void main(String[] args) {
        System.out.println(findMD5("abc123"));
    }

}
