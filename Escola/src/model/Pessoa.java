package model;

import java.time.LocalDate;

public abstract class Pessoa {

    private String nome;
    private String cpf;
    private LocalDate nascimento;
    private int matricula;

    public Pessoa(String nome, String cpf, LocalDate nascimento, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}