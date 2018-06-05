package org.microservicecloud.consumer.dept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = { "org.microservicecloud" })
@ComponentScan("org.microservicecloud")
public class App_Consumer80 {
	public static void main(String[] args) {
		SpringApplication.run(App_Consumer80.class, args);
	}
}
