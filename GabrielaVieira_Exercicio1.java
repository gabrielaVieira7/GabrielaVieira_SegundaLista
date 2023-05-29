/* Insira um número e receberá um desconto de 15%
Autota: Gabriela
Data: 17/05/2023
 */

 import java.util.Scanner;

 public class GabrielaVieira_Exercicio1{
    public static void main (String args []){
        
        Scanner leitor = new Scanner (System.in);

        //cria as variáveis 
        double val, des;

        //inicialização das variáveis
        val = 0.0;
        des = 0.0;

            System.out.println("Digite um número: ");

            //Lê as variáveis 
            val = leitor.nextDouble();
            
            //calcule o desconto
            des = (val/100) * 15;

            System.out.println("o valor original é: " + val);
            System.out.println("o valor com desconto é: " + des);
                leitor.close();

        }
    }