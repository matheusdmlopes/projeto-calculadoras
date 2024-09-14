#include <stdio.h>

double soma(double a, double b)
{
    return a + b;
}

double subtracao(double a, double b)
{
    return a - b;
}

double multiplicacao(double a, double b)
{
    return a * b;
}

double divisao(double a, double b)
{
    if (b == 0)
    {
        printf("Erro: divisão por zero");
    }
    return a / b;
}

int main()
{
    double a, b;
    char operacao;

    printf("Escolha a operação (+, -, *, /): ");
    scanf("%c", &operacao);

    printf("Digite o valor 1: ");
    scanf("%lf", &a);

    printf("Digite o valor 2: ");
    scanf("%lf", &b);

    if (operacao == '+')
    {
        printf("Resultado: %.2lf\n", soma(a, b));
    }
    else if (operacao == '-')
    {
        printf("Resultado: %.2lf\n", subtracao(a, b));
    }
    else if (operacao == '*')
    {
        printf("Resultado: %.2lf\n", multiplicacao(a, b));
    }
    else if (operacao == '/')
    {
        printf("Resultado: %.2lf\n", divisao(a, b));
    }
    else
    {
        printf("Digite um numero correto para a operacao!");
    }

    return 0;
}