package br.com.jonathan.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Async
@FeignClient("service")
@FunctionalInterface
public interface FactorialConsumer {

	@Async
	@RequestMapping("/calculate/{value}")
	public double calculate(@PathVariable("value") double value);

}