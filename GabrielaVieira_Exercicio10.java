/* Verificagem de valores
Autora: Gabriela
Data: 23/05/2023
 */

 import java.util.Scanner;
public class GabrielaVieira_Exercicio10 {
    
    
    public static void main(String [] args){
        
        Scanner leitor = new Scanner (System.in);

        //Criando a variável
        int num;

        // Iniciandoa a variável
        num = 0;

        System.out.println("Digite um número");

        //Leia a variável
        num = leitor.nextInt();

        //Mostre se é ímpar ou par
        if (num % 2 == 0)
            System.out.println("O número " + num + " é par.");
        else 
            System.out.println("O número " + num + " é ímpar.");

            leitor.close();
    }

}
