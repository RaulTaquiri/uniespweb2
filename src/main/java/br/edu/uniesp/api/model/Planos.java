package br.edu.uniesp.api.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@Entity
public class Planos {
    @Id
    private Integer id;

    @NotEmpty
    private String nome;

    private Float preco;

    private String superplano;
}
