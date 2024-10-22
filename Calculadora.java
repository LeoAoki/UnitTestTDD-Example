public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }

    public int diferenca(int a, int b) {
        return a - b;
    }

    public int produto(int a, int b) {
        return a * b;
    }

    public int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não permitida");
        }
        return a / b;
    }
}
