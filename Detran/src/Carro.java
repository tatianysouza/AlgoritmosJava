public class Carro extends Veiculo{
    private int passageiros;

    public Carro (int passageiros, int renavan, String placa, String modelo, int ano){
        super(renavan, placa, modelo, ano);
        this.passageiros = passageiros;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }
}
