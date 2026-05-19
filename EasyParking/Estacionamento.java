import java.util.ArrayList;

public class Estacionamento {

    ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionar(Veiculo v) {
        veiculos.add(v);
    }

    public void listar() {

        for (Veiculo v : veiculos) {
            System.out.println(v);
            System.out.println("Valor: R$" + v.calcularValor());
            System.out.println("----------------");
        }
    }
}