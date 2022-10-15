public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calculator = new CalculadoraCientifica();

        byte a = 3, b = -1;

        System.out.println(calculator.raiz(4.4));
        System.out.println(calculator.raiz("4"));
        System.out.println(calculator.raiz(100));

        System.out.println(calculator.potencia("2", "2"));
        System.out.println(calculator.potencia(5, 0.5));
        System.out.println(calculator.potencia(a,b));
    }
}
