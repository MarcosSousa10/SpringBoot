package com.WebServer.Atividade3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@GetMapping(path="/")
 public String ola() {
	 return "Ola";
 }
}
