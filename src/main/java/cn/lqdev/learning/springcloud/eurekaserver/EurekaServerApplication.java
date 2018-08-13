package cn.lqdev.learning.springcloud.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

/**
 * Eureka 注册中心
 * 
 * @author oKong
 *
 */
@EnableEurekaServer
@SpringBootApplication
@Slf4j
public class EurekaServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		log.info("Eureka 注册中心1000 启动");
	}

}
