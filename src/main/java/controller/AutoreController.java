package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entita.Autore;
import service.AutoreService;

@RestController
public class AutoreController {
	@Autowired
	private AutoreService autoreService;

	@GetMapping("/autore/{id}")
	public Autore getAutore(@PathVariable Long id) {
		return autoreService.findAutore(id);
	}
	
	@DeleteMapping("/autore/{id}")
	public void deleteAutore(@PathVariable Long id) {
		autoreService.deleteById(id);
	}
	
	@PostMapping("/autore")
	public Autore postAutore(@RequestBody Autore a) {
		autoreService.saveAutore(a);
		return a;
	}
	
	@PutMapping("/autore")
	public Autore putAutore(@RequestBody Autore a) {
		return autoreService.editAutore(a);
	}
}
