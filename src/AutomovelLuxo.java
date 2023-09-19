public class AutomovelLuxo extends AutomovelBasico {
    // Atributos:
    // - Se o carro tem ou não direção hidráulica
    // - Se o carro tem ou não câmbio automático
    // - Se o carro tem ou não vidros e travas elétricos

    // Métodos:
    // - Construtor que inicializa os valores dos atributos do automóvel luxo
    // - Método que inicializa os valores dos atributos do objeto automóvel luxo de
    // acordo com os valores passados como parâmetro
    // - Método que retorna o preço do automóvel luxo
    // gasolina 20.000,00 – álcool 17.000,00 – diesel 25.000,00 – gás 30.000,00
    // retrovisor do lado do passageiro (tem, +100,00)
    // limpador do vidro traseiro (tem, +250,00)
    // rádio AM/FM (tem, +300,00)
    // direção hidráulica (tem, +4.000,00)
    // câmbio automático (tem, +7.000,00)
    // vidros e travas elétricos (tem, +3.000,00)

    private boolean temDirecaoHidraulica;
    private boolean temVidroTravasEletricos;
    private boolean temCambioAutomatico;
    
    public boolean isTemDirecaoHidraulica() {
        return temDirecaoHidraulica;
    }
    public void setTemDirecaoHidraulica(boolean temDirecaoHidraulica) {
        this.temDirecaoHidraulica = temDirecaoHidraulica;
    }
    public boolean isTemVidroTravasEletricos() {
        return temVidroTravasEletricos;
    }
    public void setTemVidroTravasEletricos(boolean temVidroTravasEletricos) {
        this.temVidroTravasEletricos = temVidroTravasEletricos;
    }
    public boolean isTemCambioAutomatico() {
        return temCambioAutomatico;
    }
    public void setTemCambioAutomatico(boolean temCambioAutomatico) {
        this.temCambioAutomatico = temCambioAutomatico;
    }

    


}
