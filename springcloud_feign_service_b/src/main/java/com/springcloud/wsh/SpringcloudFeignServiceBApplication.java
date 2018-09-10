package com.springcloud.wsh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudFeignServiceBApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudFeignServiceBApplication.class, args);
	}
}
