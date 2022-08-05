package br.edu.castro.projeto_morpheus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.castro.projeto_morpheus.domain.Usuarios;
import br.edu.castro.projeto_morpheus.repository.UsuariosRepository;

@Service
public class UsuariosServiceImpl implements UsuariosService {

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@Override
	public Usuarios saveUsuarios(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return usuariosRepository.save(usuarios);
	}

	@Override
	public List<Usuarios> getAllUsuarios() {
		// TODO Auto-generated method stub
		return usuariosRepository.findAll();
	}
	
}
