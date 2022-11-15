package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entita.autore;

@Repository
public interface AutoreRepository extends JpaRepository<autore, Long> {

}
