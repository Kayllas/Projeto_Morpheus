package br.edu.castro.projeto_morpheus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.castro.projeto_morpheus.domain.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios,Integer>{

}
