package br.com.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Usuario;
import br.com.projetofinal.dao.UsuarioDAO;

@CrossOrigin("*")
@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioDAO dao;
	
	@GetMapping("/usuarios")
	public ResponseEntity<ArrayList<Usuario>> getAll() {
		ArrayList<Usuario> lista = (ArrayList<Usuario>) dao.findAll();
		return lista.size() == 0 ? ResponseEntity.status(404).build() : ResponseEntity.ok(lista);
	}
	
	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> getById(@PathVariable int id) {
		Usuario resposta = dao.findById(id).orElse(null);
		return resposta == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(resposta);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario usuario) {
		Usuario resposta = dao.findByEmailAndSenha(usuario.getEmail(), usuario.getSenha());
		return resposta == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(resposta); 
	}
}
