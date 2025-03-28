import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int[] vetor = new int[8];
        for(int i = 0; i < vetor.length; i ++){
            // preencher valores aleatórios
            vetor[i] = (int)(Math.random() * 10);
            System.out.println(vetor[i]);
        }
        System.out.println("Qual valor voce quer buscar");
        Scanner leitor = new Scanner(System.in);

        int buscado = leitor.nextInt();

        boolean achou =  false;

        for(int i = 0; i < vetor.length; i++){
            if(buscado == vetor[i]){
                achou = true;
                break;
            }
        }if(achou){
            System.out.println("Achou!");
        }else{
            System.out.println("Não achou!");
        }

    }
}