public class Seguro {

    private float valor;
    private boolean vigencia;
    private Veiculo veiculo;
    private Cliente proprietario;
    private Cliente[] assegurados;

    // O metodo "SET" é para setar algum dado.
    // O metodo "GET" é para pegar ou receber algum dado.
    public float getValor() {
        return valor;
    }

    public void setValor(float newValor) {
        this.valor = newValor;
    }

    public boolean getVigencia() {
        return vigencia;
    }

    public void setVigencia(boolean newVigencia) {
        this.vigencia = newVigencia;
    }
}