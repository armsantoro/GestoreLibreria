package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entita.libro;

@Repository
public interface LibroRepository extends JpaRepository<libro, Long> {
	

}
