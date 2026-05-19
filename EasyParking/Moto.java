public class Moto extends Veiculo {

    public Moto(String placa, String modelo, int horas) {
        super(placa, modelo, horas);
    }

    @Override
    public double calcularValor() {
        return horas * 3;
    }
}