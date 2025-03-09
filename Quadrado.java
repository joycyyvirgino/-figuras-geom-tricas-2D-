package FigurasGeometricas;

public class Quadrado  implements FigurasGeométricas2d{
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4 *lado;
    }

    @Override
    public String gettipo() {
        return "Quadrado";
    }
}
