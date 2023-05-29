/*Informações de alguma pessoa
Autora: Gabriela
Data:24/05/2023
 */

import java.util.Scanner;

public class GabrielaVieira_Exercicio8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);

        // Cria as variáveis
        int id;
        double alt;
        String nome;
        char gen;

        // Lê as informações da

        System.out.print("Escreva seu nome: ");
        nome = leitor.nextLine();

        System.out.print("Escreva sua idade: ");
        id = leitor.nextInt();

        System.out.print("Escreva sua altura: ");
        alt = leitor.nextDouble();

        System.out.print("Escreva seu gênero (M/F): ");
        gen = leitor.next().charAt(0);

        
        if (id < 0) {
            System.out.println("Isso não é uma idade, escreva direito!");
        } else if (id < 18) {
            System.out.println(nome + ", delicadamente você ainda é dependente.");
        } else if (id < 60) {
            System.out.println(nome + ", delicadamente você já pode ter mais responsabilidade.");
        } else {
            System.out.println(nome + ", delicadamente você poderá ser dependente de novo.");
        }

        // Exemplo de utilização das outras variáveis
        System.out.println("Altura: " + alt);
        System.out.println("Gênero: " + gen);

        leitor.close();
    }
}

    

