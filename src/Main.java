import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuMoedas menu = new MenuMoedas();
        Conversor conversor = new Conversor();
        Scanner sc = new Scanner(System.in);

        String resposta;

        do {
            System.out.println("Escolha a moeda de ORIGEM:");
            menu.exbirMenu();
            int escolhaOrigem = sc.nextInt();
            Moeda moedaOrigem = menu.buscarMoeda(escolhaOrigem);

            System.out.println("Escolha a moeda de DESTINO:");
            menu.exbirMenu();
            int escolhaDestino = sc.nextInt();
            Moeda moedaDestino = menu.buscarMoeda(escolhaDestino);

            System.out.println("Digite o valor a converter:");
            double valor = sc.nextDouble();

            double resultado = conversor.converter(moedaOrigem, moedaDestino, valor);
            System.out.println(valor + " " + moedaOrigem.getSigla() + " = " + resultado + " " + moedaDestino.getSigla());

            System.out.println("Deseja converter novamente? (S/N)");
            resposta = sc.next();

        } while (resposta.equalsIgnoreCase("S"));

        System.out.println("Encerrando...");
        sc.close();
    }
}