public class Carro extends Veiculo {

    public Carro(String placa, String modelo, int horas) {
        super(placa, modelo, horas);
    }

    @Override
    public double calcularValor() {
        return horas * 5;
    }
}