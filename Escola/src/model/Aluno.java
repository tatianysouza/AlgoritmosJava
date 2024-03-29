package model;

import model.Pessoa;

import java.time.LocalDate;
public class Aluno extends Pessoa {
    private String curso;
    private int periodo;

    public Aluno(int matricula, String nome, String cpf, String curso,
                 int periodo, LocalDate nascimento){
        super(nome, cpf, nascimento, matricula);
        this.curso = curso;
        this.periodo = periodo;
    }

    public String getCurso(){
        return curso;
    }

    public int getPeriodo(){
        return periodo;
    }


    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setPeriodo(int periodo){
        this.periodo = periodo;
    }

}