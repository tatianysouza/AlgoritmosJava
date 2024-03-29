public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Moto(250, 123, "tcz1259", "Fan", 2012);
        Veiculo veiculo1 = new Carro(5, 123, "tcz1259", "Fan", 2012);
        
        // System.out.println(veiculo.getClass());

        if (veiculo.getClass() == Carro.class){
            System.out.println("É um carro");
        }
        else{
            System.out.println("É uma moto");
        }
    }
}