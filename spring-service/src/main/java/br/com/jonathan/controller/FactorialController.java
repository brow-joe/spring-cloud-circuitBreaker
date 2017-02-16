package br.com.jonathan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.service.FactorialService;

@RestController
public class FactorialController {

	@Autowired
	private FactorialService service;

	@RequestMapping("/calculate/{value}")
	public double calculate(@PathVariable("value") double value) {
		return service.calculate(value);
	}

}