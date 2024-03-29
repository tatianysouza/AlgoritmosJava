package model;

import model.Funcionario;

import java.time.LocalDate;

public class Tecnico extends Funcionario {
    private String setor;

    public Tecnico(String cpf, String nome, int matricula, LocalDate nascimento,
                   float salario, String setor) {
        super(nome, cpf, nascimento, matricula, salario);
        this.setor = setor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public float calcularPagamento(){
        if(setor == "Laboratório de Química"){
            return salario+500;
        }
        return salario;
    }

}