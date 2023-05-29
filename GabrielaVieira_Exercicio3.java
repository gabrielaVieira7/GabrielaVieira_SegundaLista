/*Calcule a área do triângulo
Autora: Gabriela
Data: 17/05/2023
 */

 import java.util.Scanner;
public class GabrielaVieira_Exercicio3 {
    public static void main (String args[]){
        Scanner leitor = new Scanner (System.in);

        //Cria as variáveis
        int n1, n2, ar;

        //Incialização das variáveis
        n1 = n2 = ar = 0;

        System.out.println("Insira dois números");

        //Lê as varíaveis
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();

        //Faz o calculo do triângulo
        ar = (n1 * n2) /2;

        System.out.println("O valor da área é " + ar);

        leitor.close();

    }
    
}