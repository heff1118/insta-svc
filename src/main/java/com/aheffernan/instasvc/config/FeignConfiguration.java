package com.aheffernan.instasvc.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.aheffernan.instasvc")
public class FeignConfiguration {

}
