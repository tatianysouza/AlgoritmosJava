public class Quadrado extends Formas{
    private float lado;

    public Quadrado (float lado){
        this.lado = lado;
    }

    public float getlado() {
        return lado;
    }

    public void setlado(float lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
}
