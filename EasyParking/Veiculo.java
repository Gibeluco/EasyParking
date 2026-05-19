public abstract class Veiculo {

    protected String placa;
    protected String modelo;
    protected int horas;

    public Veiculo(String placa, String modelo, int horas) {
        this.placa = placa;
        this.modelo = modelo;
        this.horas = horas;
    }

    public abstract double calcularValor();

    @Override
    public String toString() {
        return placa + " - " + modelo + " - " + horas + "h";
    }
}