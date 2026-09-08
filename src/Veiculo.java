public class Veiculo {

    private String modelo;
    private int dias;
    private double valorDiaria;

    public Veiculo(String modelo, int dias){
        this.modelo = modelo;
        this.dias = dias;

    }
    public String alugar(){
        double total = dias * valorDiaria;
        return " " + total;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
}