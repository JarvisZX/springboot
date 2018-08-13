package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class Springboot3Application {

	public static void main(String[] args) {
		SpringApplication.run(Springboot3Application.class, args);
		log.info("Consumer服务启动!");
	}
	
	@Bean
	//@LoadBalanced //加入负载均衡能力
    RestTemplate restTemplate() {
		return new RestTemplate();
	}	

}
