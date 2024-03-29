import java.time.LocalDate;

public class Comissionado extends Funcionario{
    private double vendas;
    private double comissao;

    public Comissionado (int CPF, String nome, LocalDate nascimento, double vendas, double comissao){
        super(CPF,nome, nascimento);
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularPagamento(){
        return vendas * (comissao/100);
    }
}
