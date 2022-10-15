public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calculator = new CalculadoraCientifica();

        byte a = 0, b = 1;

        calculator.raiz(2.0);
        calculator.raiz("9");
        calculator.raiz(100);

        calculator.potencia("2", "2");
        calculator.potencia(5, 8.9);
        calculator.potencia(a,b);
    }
}
