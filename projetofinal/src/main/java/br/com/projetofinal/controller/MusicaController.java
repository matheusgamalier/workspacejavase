package br.com.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Musica;
import br.com.projetofinal.dao.MusicaDAO;

@RestController
public class MusicaController {
	@Autowired
	private MusicaDAO dao;
	
	@PostMapping("/musica/add")
	public ResponseEntity<Musica> add(@RequestBody Musica musica) {
		try {
			dao.save(musica);
			return ResponseEntity.ok(musica);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(403).build();		}
	}
	
	@GetMapping("/musicas")
	public ResponseEntity<ArrayList<Musica>> getAll() {
		ArrayList<Musica> lista = (ArrayList<Musica>) dao.findAll();
		return lista.size() == 0 ? ResponseEntity.status(404).build() : ResponseEntity.ok(lista);
	}
	
	@GetMapping("/musica/{id}")
	public ResponseEntity<Musica> getById(@PathVariable int id) {
		Musica resposta = dao.findById(id).orElse(null);
		return resposta == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(resposta);
	}

}
