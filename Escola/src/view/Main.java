package view;

import model.Funcionario;
import model.Professor;
import model.Tecnico;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Professor(123, "João",
                "222.222.222-02", LocalDate.of(2000,1,1),
                2000, "Mestrado");

        Funcionario funcionario1 = new Tecnico("333.333.333-03", "Maria",
                321, LocalDate.of(2000,1,1),
                2000, "Almoxarifado");

        System.out.println(funcionario.calcularPagamento());
        System.out.println(funcionario1.calcularPagamento());

    }
}