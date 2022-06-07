package br.edu.uniesp.api.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Getter
@Setter
public class C_credito {
    @Id
    @GeneratedValue
    private Integer id;
    @NotEmpty
    private String nomeT;
    private String cpf;
    private String numeroCartao;
    private Date datadValidade;
    private String codigoDoCartao;


}