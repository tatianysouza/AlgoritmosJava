public class Moto extends Veiculo {
    private int cilindradas;

    public Moto (int cilindradas, int renavan, String placa, String modelo, int ano){
        super(renavan, placa, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getcilindradas() {
        return cilindradas;
    }

    public void setcilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
