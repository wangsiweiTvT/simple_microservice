package com.wsw;

import com.alibaba.dubbo.config.*;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

@EnableDubbo
@SpringBootApplication
public class ConsumerApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApplication.class, args);

        // 创建配置上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 注册当前配置 Bean
        context.register(DubboConfiguration.class);
        context.refresh();
        // application
        ApplicationConfig applicationConfig = context.getBean("consumer1", ApplicationConfig.class);
        System.out.printf("applicationBean.name = %s \n", applicationConfig.getName());


        // registry
        RegistryConfig registryConfig = context.getBean(RegistryConfig.class);
        System.out.printf("registryConfig.name = %s \n", registryConfig.getAddress());

        // protocol
        ProtocolConfig protocolConfig = context.getBean(ProtocolConfig.class);
        System.out.printf("protocolConfig.name = %s \n", protocolConfig.getName());
        System.out.printf("protocolConfig.port = %s \n", protocolConfig.getPort());


        // consumer
        ConsumerConfig consumerConfig = context.getBean(ConsumerConfig.class);
        System.out.printf("consumerConfig.name = %s \n", consumerConfig.getClient());

    }
}
