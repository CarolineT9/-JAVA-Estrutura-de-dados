//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println("Tamanho: " + lista.getTamanho());

        lista.adicionar("Acre");
        lista.adicionar("Bahia");
        lista.adicionar("Ceará");
        lista.adicionar("Distrito Federal");
        System.out.println("=================================");
        System.out.println("Lista encadeada: ");
        for(int i=0; i < lista.getTamanho(); i ++){
            System.out.println(lista.get(i).getValor());
        }
        System.out.println("=================================");
        //remover estado ceara
        System.out.println("Removendo estado: ");
        lista.remover("Ceará");
//        lista.remover("Distrito Federal");
//        lista.remover("Acre");
//        lista.remover("Bahia");


        for(int i=0; i < lista.getTamanho(); i ++){
            System.out.println(lista.get(i).getValor());
        }

    }
}