package br.com.projetofinal.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetofinal.beans.Artista;
import br.com.projetofinal.dao.ArtistaDAO;

@RestController
public class ArtistaController {
	
	@Autowired
	private ArtistaDAO dao;
	
	@GetMapping("/artistas")
	public ResponseEntity<ArrayList<Artista>> getAll() {
		ArrayList<Artista> lista = (ArrayList<Artista>) dao.findAll();
		return lista.size() == 0 ? ResponseEntity.status(404).build() : ResponseEntity.ok(lista);
	}
	
	@GetMapping("/artista/{id}")
	public ResponseEntity<Artista> getById(@PathVariable int id) {
		Artista resposta = dao.findById(id).orElse(null);
		return resposta == null ? ResponseEntity.status(404).build() : ResponseEntity.ok(resposta);
	}
	
	@GetMapping("/artistas/nacionalidade/{nacionalidade}")
	public ResponseEntity<ArrayList<Artista>> getByNacionalidade(@PathVariable String nacionalidade) {
		ArrayList<Artista> lista = dao.findByNacionalidade(nacionalidade);
		return lista.size() == 0 ? ResponseEntity.status(404).build() : ResponseEntity.ok(lista);
	}
	
	@PostMapping("/artista/add")
	public ResponseEntity<String> add(@RequestBody Artista artista) {
		dao.save(artista);
		return ResponseEntity.ok("Salvo");
	}

}
