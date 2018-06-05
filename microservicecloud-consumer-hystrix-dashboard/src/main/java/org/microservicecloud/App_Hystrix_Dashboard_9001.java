package org.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableHystrixDashboard
public class App_Hystrix_Dashboard_9001 {
	public static void main(String[] args) {
		SpringApplication.run(App_Hystrix_Dashboard_9001.class, args);
	}
}
