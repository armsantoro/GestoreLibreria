package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entita.autore;
import repository.AutoreRepository;

@Service
public class AutoreService {
	
	@Autowired
	private AutoreRepository autoreRepo;

	public autore findAutore(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void saveAutore(autore a) {
		// TODO Auto-generated method stub
		
	}

	public autore editAutore(autore a) {
		// TODO Auto-generated method stub
		return null;
	}

}
