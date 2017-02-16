package br.com.jonathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

import com.github.vanroy.cloud.dashboard.config.EnableCloudDashboard;

@SpringBootApplication
@EnableEurekaServer
@EnableCloudDashboard
@EnableDiscoveryClient
@EnableCircuitBreaker
@ComponentScan("br.com.jonathan")
public class EurekaStartUp {

	public static void main(String[] args) {
		SpringApplication.run(EurekaStartUp.class, args);
	}

}