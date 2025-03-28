import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] vetor = new int[10000000];

        for(int i = 0; i < vetor.length; i++ ){
            //na busca binaria o vetor precisa estar ordenado...
            vetor[i] = i * 2;
//
        }
        System.out.println("Qual numero que voce busca? ");
        Scanner leitor = new Scanner(System.in);
        int buscado  = leitor.nextInt();
        int contador = 0;
        boolean achou = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;

        while (inicio <= fim){
            meio = (int) ((inicio + fim )/ 2);
            contador ++;
            if(vetor[meio] == buscado){
                achou = true;
                break;
            }else if(vetor[meio] < buscado){
                inicio = meio + 1;
            }else{
                fim = meio - 1 ;
            }
        }
        System.out.println("Quantidade de testes: " + contador);
        if(achou == true){
            System.out.println("Achou!!");
        }else{
            System.out.println("Não achou!!");
        }
    }
}