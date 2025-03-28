//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0 ; i < vetor.length; i ++){
            vetor[i] = (int)(Math.random() * vetor.length);

        }
        System.out.println("Vetor desordenado: ");
        for (int i = 0 ; i < vetor.length; i ++){
            System.out.println(vetor[i]);
        }

        int aux, j;
        for (int i = 0 ; i < vetor.length; i ++){
            aux = vetor[i];
            j = i-1;
            while (j >=0 && vetor[j]> aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }
        System.out.println("Vetor ordenado: ");
        for (int i = 0 ; i < vetor.length; i ++){
            System.out.println(vetor[i]);
        }

    }
}