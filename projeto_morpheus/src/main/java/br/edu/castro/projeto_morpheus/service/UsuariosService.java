package br.edu.castro.projeto_morpheus.service;

import java.util.List;

import br.edu.castro.projeto_morpheus.domain.Usuarios;

public interface UsuariosService {
	public Usuarios saveUsuarios(Usuarios usuarios);

	public List<Usuarios> getAllUsuarios(); 
}
