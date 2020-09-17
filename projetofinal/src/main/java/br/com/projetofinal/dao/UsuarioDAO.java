package br.com.projetofinal.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projetofinal.beans.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
// DAO -> Data Access Object é um Design Pattern, que sugestiona a criação do CRUD dentro desta classe
	
	Usuario findByEmailAndSenha(String email, String senha);
}
