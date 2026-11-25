package br.com.agenda_facil.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ContatoController {

@GetMapping ("/")
public String listar() {
    return "contatos";
}

@GetMapping ("/contatos/novo")
public String novo() {
    return "formulario";
}
}
