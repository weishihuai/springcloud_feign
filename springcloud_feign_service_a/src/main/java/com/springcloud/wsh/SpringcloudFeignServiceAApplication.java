package com.springcloud.wsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description: Feign远程服务调用(这里模拟A服务通过远程服务调用B服务的接口)
 * @Author: WeiShiHuai
 * @Date: 2018/9/10 15:01
 * Feign是一个声明式的Web Service客户端，使用Feign来创建一个接口并用@FeignClient注解来配置它既可。
 * Spring Cloud为Feign增加了对Spring MVC注解的支持，还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现。
 * 通过Feign远程服务调用，方便了各个服务之间的接口调用，就像调用本地方法一样。
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients注解用于开启Feign远程服务调用功能
@EnableFeignClients
public class SpringcloudFeignServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFeignServiceAApplication.class, args);
    }
}
