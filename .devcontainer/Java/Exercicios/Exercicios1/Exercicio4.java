package Exercicios1;
import java.util.Scanner;
// Exercício 4: Variáveis e Entrada/Saída Básica (faça esse em Java)
// Descrição: Crie um programa que solicite ao usuário seu nome, idade e altura. Em seguida, exiba uma mensagem com essas informações formatadas.

public class Exercicio4 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        int idade;
        float altura;
    
        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        while (!sc.hasNextInt()) { 
            System.out.println(RED +"Entrada inválida! Digite um número" + RESET);
            sc.next(); 
            System.out.print("Digite sua idade: ");
        }
        idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        while (!sc.hasNextFloat()) { 
            System.out.println(RED +"Entrada inválida! Digite um número" + RESET);
            sc.next(); 
            System.out.print("Digite sua altura: ");
        }
        altura = sc.nextFloat();
        
        System.out.printf("Nome: %s | Idade: %d anos | Altura: %.2f metros%n", nome, idade, altura);
        sc.close();

    }
}
