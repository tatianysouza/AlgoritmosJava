import java.time.LocalDate;

public class Assalariado extends Funcionario{

    private double salario;

    public Assalariado (int CPF, String nome, LocalDate nascimento, double salario){
        super(CPF,nome, nascimento);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularPagamento(){
        return salario;
    }
}
