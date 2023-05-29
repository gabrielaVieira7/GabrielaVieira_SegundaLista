/* Verificagem de valores
Autora: Gabriela
Data: 23/05/2023
 */

 import java.util.Scanner;
 public class GabrielaVieira_Exercicio7 {
    public static void main (String [] args){
        Scanner leitor = new Scanner (System.in);

        //Criando a variável
        int n1;

        //Inicialização a variável
        n1 = 0;

        System.out.println("Digite um número positivo");

        //Lê a variável
        n1 = leitor.nextInt();


        if (n1 >= 94 && n1<= 456)
        System.out.println("ACERTOU!");

        else
        System.out.println("TENTE DE NOVO");
        leitor.close();



    }
    
}
