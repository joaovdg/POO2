public class Cliente {

    private String nomeCli;
    private String cpf;
    // O metodo "SET" é para setar algum dado.
    // O metodo "GET" é para pegar ou receber algum dado.
    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String newNome) {
        this.nomeCli = newNomeCli;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String newCpf) {
        this.cpf = newCpf;
    }
}