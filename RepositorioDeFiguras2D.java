package FigurasGeometricas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RepositorioDeFiguras2D {
    private List<FigurasGeométricas2d> figuras;

    public RepositorioDeFiguras2D(){
        this.figuras = new ArrayList<>();
    }
    public class FiguraNaoEncontradaException extends RuntimeException {
        public FiguraNaoEncontradaException(String mensagem) {
            super(mensagem);
        }
    }
    public  void adicionarFigura(FigurasGeométricas2d figura){
        try {

            figuras.add(figura);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void remover(int index){
        try {
            figuras.remove(index-1);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    public double obterArea(int index){
        return figuras.get(index).calcularea();
    }
    public double obterPerimetro(int index){
        return figuras.get(index).calcularPerimetro();
    }
    public String obterTipo(int index){
        return figuras.get(index).gettipo();
    }
    public void ordenarPorArea() {
        Collections.sort(figuras);
    }
}
