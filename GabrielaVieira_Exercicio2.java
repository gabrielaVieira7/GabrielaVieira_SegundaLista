/*Recebe 3 números e mostre qual o maior
Autora: Gabriela
Data: 17/05/2023
 */

 import java.util.Scanner;

public class GabrielaVieira_Exercicio2 {
    public static void main(String args[]){
        Scanner leitor = new Scanner (System.in);

        //Cria as variáveis
        int n1, n2, n3;

        //Inicialiazação das variáveis
        n1 = 0;
        n2 = 0;
        n3 = 0;

        System.out.println("Digite 3 números");

        //Lê as variáveis
        n1 = leitor.nextInt();
        n2 = leitor.nextInt();
        n3 = leitor.nextInt();

        
        if (n1 > n2)
            System.out.println(n1 + " é o maior número");

        else if (n2 > n3)
            System.out.println(n2 + " é o maior número");

        else if (n3> n1)
            System.out.println(n3 + " é maior número");

            leitor.close();


    }
}