package com.example.practice.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @description:
 * @author: yanghaojie 31648
 * @date: 2020/9/17 13:19
 */
@Data
public class ResposeResult<T> implements Serializable {

    private Integer code;//错误码(自己定义)

    private String msg;//操作信息(自己定义)

    private String detail;//错误详情

    private String error;//错误信息

    private T data;//具体数据(自己定义)

}
