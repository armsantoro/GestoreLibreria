package controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import entita.Autore;
import entita.Libro;
import service.LibroService;

@Controller
public class LibroController {
	@Autowired 
	private LibroService libroService;
	
	@GetMapping(name="/libro/{id}")
	public Libro getLibro(@PathVariable Long id) {
	  return libroService.findLibro(id);
	}
	@DeleteMapping("libro/{id}")
	public void deleteLibro(@PathVariable Long id) {
		libroService.deleteLibro(id);
	}
    @PostMapping("/libro")
    public Libro inserisciLibro(@RequestBody Libro libro) {
      return libroService.save(libro);
    }
    @PutMapping("/libro")
    public Libro editLibro(@RequestBody Libro libro) {
    	return libroService.edit(libro);
    }
    @GetMapping("/tuttilibri")
    public List<Libro> lista(){
    	return libroService.findAll();
    }
    @GetMapping("/tuttilibriautore")
    public List<Libro> lista2(Autore Autore){
    	return libroService.findAllautore(Autore);
    }
    @GetMapping("/tuttilibrianno")
    public List<Libro> lista3(Date date)	{
    	return libroService.find1(date);
    }
    }


