package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entita.Autore;
import repository.AutoreRepository;

@Service
public class AutoreService {

	@Autowired
	private AutoreRepository autoreRepo;

	public Autore findAutore(Long id) {

		return autoreRepo.findById(id).get();
	}

	public void deleteById(Long id) {
		autoreRepo.deleteById(id);

	}

	public void saveAutore(Autore a) {
		autoreRepo.save(a);

	}

	public Autore editAutore(Autore a) {

		if (!autoreRepo.existsById(a.getId())) {
			throw new RuntimeException("L'Autore inserito non esiste!");
		}
		// Autore au=autoreRepo.getReferenceById(a.getId());
		Autore au = a;
		au.setNome(a.getNome());
		au.setAnnoMorte(a.getAnnoMorte());
		au.setAnnoNascita(a.getAnnoNascita());

		autoreRepo.save(au);
		return a;
	}

}
