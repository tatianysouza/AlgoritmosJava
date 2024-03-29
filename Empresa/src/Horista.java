import java.time.LocalDate;

public class Horista extends Funcionario{
    private double horas;
    private double valorHora;

    public Horista(int CPF, String nome, LocalDate nascimento, double horas, double valorHora){
        super(CPF,nome, nascimento);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento(){
        return horas * valorHora;
    }
}
