package com.wsw.service;

import com.wsw.bean.Boss;
import com.wsw.entity.User;

/**
 * @Auther: wangsiwei
 * @Date: 2022/5/19 15:34
 * @Description:
 */
public interface RuoZhiService {

    Boss giveMeASB();
    User giveMeOneUser(String name);

}
