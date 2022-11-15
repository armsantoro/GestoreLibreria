package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entita.Autore;
import entita.Libro;
import repository.LibroRepository;

@Service
public class LibroService {
   @Autowired
   private LibroRepository libroRepo;



public Libro findLibro(Long id) {
	// TODO Auto-generated method stub
	return null;
}



public void deleteLibro(Long id) {
	// TODO Auto-generated method stub
	
}



public Libro save(Libro libro) {
	return libro;
	// TODO Auto-generated method stub
	
}



public Libro edit(Libro libro) {
	// TODO Auto-generated method stub
	return null;
}



public List<Libro> findAll() {
	// TODO Auto-generated method stub
	return null;
}



public List<Libro> findAllautore(Autore autore) {
	// TODO Auto-generated method stub
	return null;
}
}
