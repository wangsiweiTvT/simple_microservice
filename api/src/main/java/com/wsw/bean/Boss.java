package com.wsw.bean;


import lombok.Data;

import java.io.Serializable;

/**
 * @Auther: wangsiwei
 * @Date: 2022/5/19 14:10
 * @Description:
 */
@Data
public class Boss implements Serializable {

    private Integer id;

    private String name;

    private Integer salary;

}
