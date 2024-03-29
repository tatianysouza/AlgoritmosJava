package model;

import java.time.LocalDate;

public abstract class Funcionario extends Pessoa {

    protected float salario;

    public Funcionario(String nome, String cpf, LocalDate nascimento,
                       int matricula, float salario){
        super(nome, cpf, nascimento, matricula);
        this.salario = salario;
    }

    public float getSalario(){
        return salario;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public abstract float calcularPagamento();

}