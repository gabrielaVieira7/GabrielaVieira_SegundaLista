/* Calcule o valor total de uma venda de picolé
Autora: Gabriela
Data: 23/05/2023
 */

 import java.util.Scanner;
 public class GabrielaVieira_Exercicio6 {
    public static void main (String [] args) { 
        Scanner leitor = new Scanner (System.in);

        //Criando as varíais
        int kiwi, laranja, roma;
        double res;

        //Inicialização das variáveis
        kiwi = 0;
        laranja = 0;
        roma = 0;
        res =0.0;

        //Lê as variáveis
        System.out.println("Digite a quantidade de kiwi");
        kiwi = leitor.nextInt();

        System.out.println("Digite a quantidade de laranja");
        laranja = leitor.nextInt();

        System.out.println("Digite a quantidade de roma");
        roma = leitor.nextInt();

        //Calcule o valor da venda

        res = (kiwi * 3.20) + (laranja * 2.39) + (roma * 7.99);

        System.out.println("O valor da venda é R$" + res);
        leitor.close();


       

    }
 }