package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import entita.Autore;
import entita.Libro;
import repository.AutoreRepository;
import repository.LibroRepository;

@Service
public class LibroService {
	@Autowired
	private LibroRepository libroRepo;
	@Autowired
	private AutoreService autoservice;

	public Libro findLibro(Long id) {
		return libroRepo.findById(id).get();
	}

	public void deleteLibro(Long id) {
		libroRepo.deleteById(id);
	}

	public Libro save(Libro libro) {
		return libroRepo.save(libro);
	}

	public Libro edit(Libro libro) {

		if (!libroRepo.existsById(libro.getId())) {
			throw new RuntimeException("Il libro inserito non esiste!");
		}
		Libro lib = libroRepo.getReferenceById(libro.getId());
		lib.setTitolo(libro.getTitolo());
		lib.setAutori(libro.getAutori());
		lib.setISBN(libro.getISBN());
		lib.setAnnoPubblicazione(libro.getAnnoPubblicazione());
		lib.setEditore(libro.getEditore());

		return libroRepo.save(lib);
		// return libro; DA TESTARE
	}

	public List<Libro> findAll() {

		return libroRepo.findAll();
	}

//	public List<Libro> findAllautore(Autore autore) {
//		List<Libro> test= libroRepo.findAll();
//		return test.stream().filter(c -> c.getAutori().contains(autore)).collect(Collectors.toList());
//
//	}
	public List<Libro> findbyAutore(Autore autore) {
		// List<Libro> libro=autore.getLibri();
		// return libro;
		Autore aut = autoservice.findAutore(autore.getId());
		return aut.getLibri();
	}

//	public List<Libro> find1(Date annoPubblicazione){	
//		List<Libro> test= libroRepo.findAll();
//		return test.stream().filter(c -> c.getAnnoPubblicazione().equals(annoPubblicazione)).collect(Collectors.toList());
//	}
	public List<Libro> findbyAnno(Date annoPubblicazione) {
		List<Libro> test = libroRepo.findAll();
		List<Libro> libriperanno = new ArrayList<>();
		for (Libro libro : test) {
			if (libro.getAnnoPubblicazione().equals(annoPubblicazione)) {
				libriperanno.add(libro);
			}

		}
		return libriperanno;
	}

}
