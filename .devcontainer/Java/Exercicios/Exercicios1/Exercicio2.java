package Exercicios1;
import java.util.Scanner;

// Exercício 2: Estruturas de Decisão (faça esse em Java)
// Descrição: Crie um programa que solicite ao usuário uma nota (0-10) e exiba uma mensagem indicando se ele foi aprovado (nota >= 7), está de recuperação (nota entre 5 e 6.9) ou foi reprovado (nota < 5).

public class Exercicio2 {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m"; 
    public static final String YELLOW = "\u001B[33m"; 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float nota;
        String cor;
        String status;

        do {
            System.out.print("Digite uma nota entre 0 e 10: ");
            while (!sc.hasNextFloat()) { 
                System.out.println(RED +"Entrada inválida! Digite um número" + RESET);
                sc.next(); 
                System.out.println("Digite uma nota entre 0 e 10: ");
            }
            nota = sc.nextFloat();

            if (nota < 0 || nota > 10) {
                System.out.println(RED +"Nota inválida! Digite uma nota entre 0 e 10." + RESET);
            }
        } while (nota < 0 || nota > 10);

        if(nota >= 7){
            cor = GREEN;
            status = "APROVADO";
        } else if(nota >= 5){
            cor = YELLOW;
            status = "RECUPERAÇÃO";
        } else{
            cor = RED;
            status = "REPROVADO";
        }
        System.out.printf("Situação: %s%s%s%n", cor, status, RESET);
        sc.close();
    }
}