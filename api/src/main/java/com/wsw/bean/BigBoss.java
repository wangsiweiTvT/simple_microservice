package com.wsw.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: wangsiwei
 * @Date: 2022/7/15 11:34
 * @Description:
 */
@Data
public class BigBoss implements Serializable {

    private Integer id;

    private String name;

    private Integer salary;

}
