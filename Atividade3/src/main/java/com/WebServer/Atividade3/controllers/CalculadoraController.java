package com.WebServer.Atividade3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {
	@GetMapping(path = "/somar/{a}/{b}")
public int somar(@PathVariable int a,@PathVariable int b) {
	return a+b;
	}
	@GetMapping(path="subtrair")
public int subtrair(@RequestParam(name="a", required =true) int a,@RequestParam(name="b") int b ){
	return a-b;
	
}
}
