package com.wsw;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Auther: wangsiwei
 * @Date: 2022/5/19 16:50
 * @Description:
 */
@EnableDubboConfig
@PropertySource("classpath:dubbo-config.properties")
@Configuration
public class DubboConfiguration {

}
