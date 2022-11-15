package com.WebServer.Atividade3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.WebServer.Atividade3.models.entities.Cliente;
@RestController
@RequestMapping(path="/cliente")
public class ClienteController {
	@GetMapping(path="/cliente")
public Cliente obterCliente(){
	return new Cliente (28,"Pedro","123");
	}
	@GetMapping("/{id}")
	public Cliente obterClientePorId (@PathVariable int id) {
		return new Cliente(id, "maria", "998");
	}
	@GetMapping
	public Cliente obterClientePorId2 (@RequestParam(name="id", defaultValue = "1") int id) {
		return new Cliente(id,"joao", "111");
	}
}
