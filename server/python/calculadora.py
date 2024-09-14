def soma(a, b):
    return a + b


def subtracao(a, b):
    return a - b


def multiplicacao(a, b):
    return a * b


def divisao(a, b):
    if b == 0:
        return "Erro: divisão por zero"
    return a / b


def main():
    operacao = input("Escolha a operação (+, -, *, /): ")

    a = float(input("Digite o valor 1: "))
    b = float(input("Digite o valor 2: "))

    if operacao == "+":
        print(f"Resultado: {soma(a,b)}")
    elif operacao == "-":
        print(f"Resultado: {soma(a,b)}")
    elif operacao == "*":
        print(f"Resultado: {soma(a,b)}")
    elif operacao == "/":
        resultado = divisao(a, b)
        if isinstance(resultado, str):
            print(resultado)
        else:
            print(f"Resultado: {resultado:.2f}")
    else:
        print("Operação inválida!")


if __name__ == "__main__":
    main()
