package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import entita.autore;
import service.AutoreService;

@RestController
public class AutoreController {
	@Autowired
	private AutoreService autoreService;

	@GetMapping("/autore/{id}")
	public autore getAutore(@PathVariable Long id) {
		return autoreService.findAutore(id);
	}
	
	@DeleteMapping("/autore/{id}")
	public void deleteAutore(@PathVariable Long id) {
		autoreService.deleteById(id);
	}
	
	@PostMapping("/autore")
	public autore postAutore(@RequestBody autore a) {
		autoreService.saveAutore(a);
		return a;
	}
	
	@PutMapping("/autore")
	public autore putAutore(@RequestBody autore a) {
		return autoreService.editAutore(a);
	}
}
