public class Automovel {
    /*
     * - Construtores (padrão e inicialização)
     * - toString
     * - Equals/Hashcode
     */

    // Atributos:
    // - modelo
    // - cor
    // - combustível

    // Métodos:
    // - Construtor que inicializa os valores dos atributos do automovel.
    // - get e set para cada atributo do objeto automovel de acordo com as
    // necessidades de encapsulamento da Orientação a Objetos.
    // - que retorna o preço do automóvel de acordo com o tipo de combustível:
    // gasolina 20.000,00 – álcool 17.000,00 – diesel 25.000,00 – gás 30.000,00

    private String modelo;
    private String cor;
    private String combustivel;
    private double preco;

    public Automovel() {
        modelo = "padrão";
        cor = "cinza";
        combustivel = "vazio";
    }

    public Automovel(String modeloNovo, String corNova, String combustivelNovo) {
        this.modelo = modeloNovo;
        this.cor = corNova;
        this.combustivel = combustivelNovo;
    }

    public void setModelo(String modelo) {

    }
    
    public String getModelo() {
        return modelo;
    }

    public void setCor(String corNova) {

    }

    public String getCor() {
        return cor;
    }

    public void setCombustivel(String combustivel) {
        switch (combustivel) {
            case "gasolina":
                preco = 20.0000;
                break;
            case "álcool": 
                preco = 17.000;
                break;
            case "diesel":
                preco = 25.000;
                break;
            case "gás":
                preco = 30.000;
                break;
        }
    }

    public String getCombustivel() {
        return combustivel;
    }
}
