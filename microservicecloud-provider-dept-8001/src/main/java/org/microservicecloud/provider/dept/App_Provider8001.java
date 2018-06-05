package org.microservicecloud.provider.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // 添加Hystrix熔断器支持
public class App_Provider8001 {
	public static void main(String[] args) {
		SpringApplication.run(App_Provider8001.class, args);
	}
}
