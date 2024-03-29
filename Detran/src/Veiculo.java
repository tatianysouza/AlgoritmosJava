public class Veiculo {
    private int renavan;
    private String placa;
    private String modelo;
    private int ano;

    public Veiculo (int renavan, String placa, String modelo, int ano){
        this.ano = ano;
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getRenavan() {
        return renavan;
    }

    public void setRenavan(int renavan) {
        this.renavan = renavan;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
