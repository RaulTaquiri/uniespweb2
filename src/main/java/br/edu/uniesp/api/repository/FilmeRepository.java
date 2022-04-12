package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.FilmeJava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;


@Repository
public interface FilmeRepository extends JpaRepository<FilmeJava,Integer> {
}
