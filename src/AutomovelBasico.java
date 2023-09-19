public class AutomovelBasico extends Automovel{
    // Atributos:
    // - Se o carro tem ou não retrovisor do lado do passageiro
    // - Se o carro tem ou não limpador do vidro traseiro
    // - Se o carro tem ou não rádio AM/FM

    // Métodos:
    // - Construtor que inicializa os valores dos atributos do automóvel basico.
    // - Método que inicializa os valores dos atributos do objeto automovel básico
    // de acordo com os valores passados como parâmetro
    // - Método que retorna o preço do automóvel básico
    // gasolina 20.000,00 – álcool 17.000,00 – diesel 25.000,00 – gás 30.000,00
    // retrovisor do lado do passageiro (tem, +100,00)
    // limpador do vidro traseiro (tem, +250,00)
    // rádio AM/FM (tem, +300,00)

    private boolean temRetrovisorPassageiro;
    private boolean temLimpadorTraseiro;
    private boolean temRadioFM;
    
    public boolean isTemRetrovisorPassageiro() {
        return temRetrovisorPassageiro;
    }
    public void setTemRetrovisorPassageiro(boolean temRetrovisorPassageiro) {
        this.temRetrovisorPassageiro = temRetrovisorPassageiro;
    }
    public boolean isTemLimpadorTraseiro() {
        return temLimpadorTraseiro;
    }
    public void setTemLimpadorTraseiro(boolean temLimpadorTraseiro) {
        this.temLimpadorTraseiro = temLimpadorTraseiro;
    }
    public boolean isTemRadioFM() {
        return temRadioFM;
    }
    public void setTemRadioFM(boolean temRadioFM) {
        this.temRadioFM = temRadioFM;
    }

    

}