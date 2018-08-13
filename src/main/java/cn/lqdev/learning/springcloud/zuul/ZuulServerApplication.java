package cn.lqdev.learning.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableZuulProxy
@Slf4j
public class ZuulServerApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZuulServerApplication.class, args);
		log.info("zuul服务启动!");
	}
	
	@Bean
	public CustomPreFilter getPreFilter() {
		return new CustomPreFilter();
	}
}
