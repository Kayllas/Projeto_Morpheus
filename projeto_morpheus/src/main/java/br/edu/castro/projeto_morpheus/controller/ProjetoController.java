package br.edu.castro.projeto_morpheus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.castro.projeto_morpheus.domain.Usuarios;
import br.edu.castro.projeto_morpheus.service.UsuariosService;

import java.util.List;

@RestController
@RequestMapping("/projeto_morpheus")
@CrossOrigin
public class ProjetoController {
	@Autowired
	private UsuariosService usuariosService;
	
	@PostMapping("/add")
	public String add(@RequestBody Usuarios usuarios) {
		usuariosService.saveUsuarios(usuarios);
		return "Novo usuário cadastrado";
	}
	
	@GetMapping("/getAll")
	public List<Usuarios> getAllUsuarios(){
		return usuariosService.getAllUsuarios();
	}
}
