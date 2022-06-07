package br.edu.uniesp.api.repository;


import br.edu.uniesp.api.model.C_credito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface C_creditoRepository extends JpaRepository<C_credito,Integer> {
}
