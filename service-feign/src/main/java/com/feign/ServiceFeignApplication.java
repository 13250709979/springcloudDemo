package com.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @SpringBootApplication:启动springboot工程
 * @EnableEurekaClient:表明自己是一个EurekaClient
 * @EnableDiscoveryClient:EurekaClient向服务注册中心注册
 * @EnableFeignClients:开启feign消费服务者的功能（自带断路器的功能）
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceFeignApplication.class, args);
	}
}
