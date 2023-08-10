public class Veiculo {

    private String cor;
    private String marca;
    private int ano;
    private Modelo modelo;
    private String placa;
    // O metodo "SET" é para setar algum dado.
    // O metodo "GET" é para pegar ou receber algum dado.
   
   
       public String getCor() {
        return cor;
    }

    public void setCor(String newCor) {
        this.cor = newCor;
    }
        
    public String getMarca() {
        return marca;
    }

    public void setMarca(String newMarca) {
        this.marca = newMarca;
    }
    public int getAno() {
        return ano;
    }

    public void setAno(int newAno) {
        this.ano = newAno;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String newPlaca) {
        this.placa = newPlaca;
    }
}