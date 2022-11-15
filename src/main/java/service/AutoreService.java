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
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void saveAutore(Autore a) {
		// TODO Auto-generated method stub
		
	}

	public Autore editAutore(Autore a) {
		// TODO Auto-generated method stub
		return null;
	}

}
