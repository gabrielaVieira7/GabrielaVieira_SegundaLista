/*Recebe um número, seu antecessor e o seu sucessor
Autora: Gabriela
Data: 23/05/2023
*/

import java.util.Scanner;

public class GabrielaVieira_Exercicio5 {
    public static void main (String [] args) {

        Scanner leitor = new Scanner (System.in);

        //Criando a variável
        int num;

        //Inicialização da variável
        num = 0;

        System.out.println("Digite um número ");

        //Lê a variável
        num = leitor.nextInt();

        System.out.println("O número é " +num);
        System.out.println("O sucessor é " +(+num+1) );
        System.out.println("O antecessor é " + (+num-1));

        leitor.close();

    }
    
}
