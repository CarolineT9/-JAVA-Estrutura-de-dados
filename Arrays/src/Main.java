import java.awt.desktop.SystemEventListener;

public class Main {
    public static void main(String[] args) {
        Vetor meuVetor = new Vetor(5);

        meuVetor.adicionar("Maça");
        meuVetor.adicionar("Banana");
        meuVetor.adicionar("Laranja");

        meuVetor.imprimir();

        System.out.println("\nTamanho atual: " + meuVetor.getTamanho());
        System.out.println("Elemento na posicao 1: " + meuVetor.obter(1));
    }
}