/* Receb dois valores e troque-os
Autora: Gabriela
Data: 17/05/2023
 */

 import java.util.Scanner;
 public class GabrielaVieira_Exercicio4 {
     public static void main (String args []){
         Scanner leitor = new Scanner (System.in);
 
         //Cria as variáveis 
         Double var1, var2, var3;
 
         //Inicialização das variáveis 
         var1 = var2 = var3 = 0.0;
 
         System.out.println("Insira dois valores");
 
         //Lê as variáveis
         var1 = leitor.nextDouble();
         var2 = leitor.nextDouble();
 
         //Troque os valores
         var3 = var1;
         var1 = var2;
         var2 = var3;

         System.out.println ("A inversão dos números fica " + var1 + " e " + var2);
 
         leitor.close();
 
 
     }
     
 }