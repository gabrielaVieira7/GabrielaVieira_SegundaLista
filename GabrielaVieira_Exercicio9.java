/*Recebe dois números e identifica se é igual ou maior ou menor
Autora: Gabriela
Data: 24/05/2023
 */

import java.util.Scanner;
public class GabrielaVieira_Exercicio9 {
    public static void main (String [] args) {
        Scanner leitor = new Scanner (System.in);

        //Cria as variáveis
        int num;
        int nois;

        //Inicalização das variáveis
        num = 0;
        nois = 0;

        System.out.println ("Digite dois números");

        //Lê as variáveis
        num = leitor.nextInt();
        nois = leitor.nextInt();

        if (num == nois)
        System.out.println("Os números são iguais");

        else if (num > nois)
        System.out.println("O primeiro número é o maior");

        else
        System.out.println("O segundo número é o maior");

        leitor.close();

    }
    
}