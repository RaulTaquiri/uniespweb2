package br.edu.uniesp.api.model;
import javax.persistence.*;
import java.io.Serializable;

@Entity

@Table


public class FilmeJava implements Serializable {

    @Id
    @GeneratedValue

    private Integer id;

    private String titulo;

    @ManyToOne
    private Genero genero;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
