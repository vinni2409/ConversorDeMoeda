import java.util.ArrayList;

public class MenuMoedas {
    private ArrayList<Moeda> moedas;

    public MenuMoedas(){
        moedas = new ArrayList<>();
        moedas.add(new Moeda("Real", "BRL", 1.0));
        moedas.add(new Moeda("Dólar", "USD", 5.7));
        moedas.add(new Moeda("Euro", "EUR", 6.20));
        moedas.add(new Moeda("Libra", "GBP", 7.30));
        moedas.add(new Moeda("Peso ARG", "ARS", 0.006));
    }

    public void exbirMenu(){
        for (int i = 0; i < moedas.size(); i++) {
            System.out.println((i + 1) + ". " + moedas.get(i).getName() + " (" + moedas.get(i).getSigla() + ")");
        }
    }

    public Moeda buscarMoeda(int numero){
        return moedas.get(numero - 1);
    }
}
