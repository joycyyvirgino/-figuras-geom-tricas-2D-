package FigurasGeometricas;

public class Maim {
    public static void main(String[] args) {
        RepositorioDeFiguras2D repositorio = new RepositorioDeFiguras2D();

        //criar figuras
        try {
            Circulo circulo = new Circulo(5);

        Quadrado quadrado = new Quadrado(4);

        //Adicionar
        repositorio.adicionarFigura(circulo);
        repositorio.adicionarFigura(quadrado);

        //Informação
        System.out.println("Área do primeiro elemento: " + repositorio.obterArea(0));
        System.out.println("Perímetro do segundo elemento: " + repositorio.obterPerimetro(1));
        System.out.println("Tipo do segundo elemento: " + repositorio.obterTipo(1));

        //Remover
        repositorio.remover(1);
        System.out.println("Área do primeiro elemento após remoção: " + repositorio.obterArea(0));
        } catch (RepositorioDeFiguras2D.FiguraNaoEncontradaException e) {
        System.out.println("Erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
        System.out.println("Erro ao adicionar figura: " + e.getMessage());
        } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
        }

    }

}
