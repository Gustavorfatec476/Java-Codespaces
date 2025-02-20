package Exercicios1;
import java.util.Scanner;
//Estruturas de Repetição com for (faça esse em Java)
// Descrição: Crie um programa que exiba uma tabuada de um número que será informado pelo usuário (de 1 a 10).

public class Exercicio3 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;
    
        do {
            System.out.print("Digite uma número entre 1 e 10: ");
            while (!sc.hasNextFloat()) { 
                System.out.println(RED +"Entrada inválida! Digite um número" + RESET);
                sc.next(); 
                System.out.print("Digite uma número entre 1 e 10: ");
            }
            numero = sc.nextFloat();
    
            if (numero < 1 || numero > 10) {
                System.out.println(RED +"Número inválida! Digite uma número entre 1 e 10." + RESET);
            }
        } while (numero < 1 || numero > 10); 

        for(int i = 1; i <+ 10; i++){
            System.out.printf("%.2f x %d = %.2f%n", numero, i, numero * i);
        }
        sc.close();

    }

}
