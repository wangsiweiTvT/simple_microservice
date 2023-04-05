package com.wsw.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wsw.bean.Boss;
import com.wsw.entity.User;
import com.wsw.service.IUserService;
import com.wsw.service.RuoZhiService;
import com.wsw.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangsiwei
 * @Date: 2022/5/19 15:35
 * @Description:
 */
@Component
public class RuoZhiServiceImpl implements RuoZhiService {


    @Reference
    ProviderService providerService;


    @Reference
    IUserService userService;
    @Override
    public Boss giveMeASB() {
        return providerService.fetchAsb();
    }

    @Override
    public User giveMeOneUser(String name) {
        return userService.getOne(name);
    }
}
