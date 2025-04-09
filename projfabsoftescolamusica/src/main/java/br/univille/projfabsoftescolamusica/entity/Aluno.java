package br.univille.projfabsoftescolamusica.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //é bom tipificar os campos
    @Column(length = 1000,nullable = false)
    private String nome;
    @Column(length = 1000,nullable = false)
    private String endereco;
    @Column(nullable = false)
    private int telefone;
    private String email;
    private int dataNascimento;
    private int cpf;
    private String sexo;

    // Getters e Setters
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
}