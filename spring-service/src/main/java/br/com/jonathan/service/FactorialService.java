package br.com.jonathan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import br.com.jonathan.consumer.FactorialConsumer;

@Service
public class FactorialService {

	@Autowired
	private FactorialConsumer consumer;

	@HystrixCommand
	public double calculate(double value) {
		return value > 1 ? value * consumer.calculate(value - 1) : value;
	}

}