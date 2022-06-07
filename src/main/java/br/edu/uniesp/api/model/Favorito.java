package br.edu.uniesp.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Favorito {
    @Id
    @GeneratedValue
    private Integer id;

    private String nome;

}