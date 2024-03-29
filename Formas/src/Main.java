public class Main {
    public static void main(String[] args) {
        Formas forma1 = new Quadrado(2);
        Formas forma2 = new Circulo(3);
        Formas forma3 = new Retangulo(2,5);

        System.out.println("Áreas das formas geométricas:");
        System.out.println("Quadrado: " + forma1.calcularArea());
        System.out.println("Circulo: " + forma2.calcularArea());
        System.out.println("Retangulo: " + forma3.calcularArea());

    }
}