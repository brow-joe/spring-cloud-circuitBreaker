package br.com.jonathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

//https://github.com/VanRoy/spring-cloud-dashboard/issues/8
@EnableAutoConfiguration
@ComponentScan("br.com.jonathan")
@EnableFeignClients
@EnableEurekaClient
@EnableCircuitBreaker
public class ServiceStartUp {

	public static void main(String[] args) {
		SpringApplication.run(ServiceStartUp.class, args);
	}

}