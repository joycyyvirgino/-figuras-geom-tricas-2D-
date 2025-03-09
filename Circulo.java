package FigurasGeometricas;

public class Circulo implements FigurasGeométricas2d {
    private  double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio  ;
    }

    @Override
    public String gettipo() {
        return "Circulo";
    }
}
