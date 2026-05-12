public class Conversor {
    public double converter(Moeda moedaOrigem, Moeda moedaDestino,double valor){
        double valorEmReal = valor * moedaOrigem.getTaxaParaReal();
        double resultado = valorEmReal / moedaDestino.getTaxaParaReal();
        return resultado;
    }
}
