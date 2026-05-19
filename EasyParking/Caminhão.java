public class Caminhão extends Veiculo {

    public Caminhão(String placa, String modelo, int horas) {
        super(placa, modelo, horas);
    }

    @Override
    public double calcularValor() {
        return horas * 10;
    }
}