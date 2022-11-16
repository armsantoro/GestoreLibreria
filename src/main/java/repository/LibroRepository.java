package repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entita.Autore;
import entita.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {


}
