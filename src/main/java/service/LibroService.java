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

		libroRepo.save(lib);
		return libro;
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
