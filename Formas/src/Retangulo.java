public class Retangulo extends Formas{
    private double ladoA;
    private double ladoB;

    public Retangulo(double ladoA, double ladoB){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea(){
        return ladoA*ladoB;
    }
}
