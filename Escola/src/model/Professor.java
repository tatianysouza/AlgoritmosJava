package model;

import model.Funcionario;

import java.time.LocalDate;

public class Professor extends Funcionario {
    private String titulacao;

    public Professor(int matricula, String nome, String cpf,
                     LocalDate nascimento, float salario, String titulacao){
        super(nome, cpf, nascimento, matricula, salario);
        this.titulacao = titulacao;
    }
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public float calcularPagamento(){
        if(titulacao == "Mestrado"){
            return salario+1000;
        }
        return salario;
    }

}