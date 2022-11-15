package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entita.Autore;

@Repository
public interface AutoreRepository extends JpaRepository<Autore, Long> {

}
