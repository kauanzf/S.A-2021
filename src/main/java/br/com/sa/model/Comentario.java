package br.com.sa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Size(max = 20)
    @NotNull
    private String titulo;

    @Size(max=30)
    @NotNull
    private String nome;

    @Size(max = 120)
    @NotNull
    private String opiniao;

    @Size(max = 120)
    @NotNull
    private String dia;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(String opiniao) {
        this.opiniao = opiniao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", nome='" + nome + '\'' +
                ", opiniao='" + opiniao + '\'' +
                ", dia='" + dia + '\'' +
                '}';
    }
}
