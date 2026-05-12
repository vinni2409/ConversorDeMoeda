public class Moeda {
    private String name;
    private String sigla;
    private Float taxaParaReal;

    public Moeda(String name, String sigla, Float taxaParaReal){
        this.name = name;
        this.sigla = sigla;
        this.taxaParaReal = taxaParaReal;
    }

    public String getName() {
        return name;
    }

    public String getSigla(){
        return sigla;
    }

    public Float getTaxaParaReal() {
        return taxaParaReal;
    }
}
