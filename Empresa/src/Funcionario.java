import java.time.LocalDate;
public abstract class Funcionario {
    private int CPF;
    private String nome;
    private LocalDate nascimento;

    public Funcionario (int CPF, String nome, LocalDate nascimento){
        this.CPF = CPF;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public abstract double calcularPagamento();

}
