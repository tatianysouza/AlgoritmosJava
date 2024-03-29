import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Assalariado(123456789, "Lucas", LocalDate.of(2000,1,1), 3000);
        Funcionario funcionario2 = new Horista(987654321, "Pedro", LocalDate.of(2002,2,2), 40, 100);
        Funcionario funcionario3 = new Comissionado(123456789, "José", LocalDate.of(2000,1,1), 80000, 4);

        System.out.println("Salários dos funcionários:");
        System.out.println("Assalariado: " + funcionario1.calcularPagamento());
        System.out.println("Horista: " + funcionario2.calcularPagamento());
        System.out.println("Commisionado: " + funcionario3.calcularPagamento());
    }
}