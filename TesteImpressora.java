public class TesteImpressora {
    public static void main(String[] args) {
        Impressora print = new Impressora();

        print.exibir(2.5f);
        print.exibir(2.5f,2.6f);
        print.exibir(2.5f,"4");
        print.exibir("6", 4.8f);
        print.exibir("4","3","5");
        print.exibir(4,2,"9");
    }
}
