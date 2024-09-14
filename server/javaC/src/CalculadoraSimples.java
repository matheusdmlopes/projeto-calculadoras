package javaC.src;

import java.util.Scanner;

public class CalculadoraSimples {

    public static double soma(double a, double b) {
        return a + b;
    }

    public static double subtracao(double a, double b) {
        return a - b;
    }

    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    public static double divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        System.out.println("Digite o valor 1: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o valor 2: ");
        double valor2 = scanner.nextDouble();

        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = soma(valor1, valor2);
                break;
            case '-':
                resultado = subtracao(valor1, valor2);
                break;
            case '*':
                resultado = multiplicacao(valor1, valor2);
                break;
            case '/':
                resultado = divisao(valor1, valor2);
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

        System.out.printf("O resultado de %.2f %c %.2f é: %.2f\n", valor1, operacao, valor2, resultado);

        scanner.close();

    }
}