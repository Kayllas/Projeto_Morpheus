package br.edu.castro.projeto_morpheus.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.castro.projeto_morpheus.domain.Usuarios;

@SpringBootTest
public class UsuariosRepositoryTests {
	@Autowired
	private UsuariosRepository usuariosRepository;
		
	@Test
	public void inserir() {
		Usuarios p1 = new Usuarios(
		);
		
		Usuarios p2 = new Usuarios(
		);
	
		usuariosRepository.save(p1);
		usuariosRepository.save(p2);
	}
}
