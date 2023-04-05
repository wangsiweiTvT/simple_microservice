package com.wsw.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.wsw.bean.Boss;
import com.wsw.service.ProviderService;
import org.springframework.stereotype.Component;

/**
 * @Auther: wangsiwei
 * @Date: 2022/5/19 14:25
 * @Description:
 */

@Service
@Component
public class ShabiServiceImpl implements ProviderService {

    @Override
    public Boss fetchAsb() {
        Boss boss = new Boss();
        boss.setName("xxxxx");
        boss.setSalary(2000);
        return boss;
    }
}
