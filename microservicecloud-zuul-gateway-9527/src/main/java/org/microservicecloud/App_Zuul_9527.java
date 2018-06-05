package org.microservicecloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class App_Zuul_9527 {

	public static void main(String[] args) {
		SpringApplication.run(App_Zuul_9527.class, args);
	}

}
