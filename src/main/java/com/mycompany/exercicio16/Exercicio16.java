/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.exercicio16;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Exercicio16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Resultado da adição: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 4.");
        }
        scanner.close();
    }
}