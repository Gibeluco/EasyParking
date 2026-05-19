import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento();

        int opcao;

        do {

            System.out.println("=== EASY PARKING ===");
            System.out.println("1 - Cadastrar Carro");
            System.out.println("2 - Cadastrar Moto");
            System.out.println("3 - Cadastrar Caminhao");
            System.out.println("4 - Listar");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            sc.nextLine();

            switch (opcao) {

                case 1:

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Horas: ");
                    int horas = sc.nextInt();

                    Carro carro = new Carro(placa, modelo, horas);

                    estacionamento.adicionar(carro);

                    Arquivotxt.salvar(carro);

                    break;

                case 2:

                    System.out.print("Placa: ");
                    placa = sc.nextLine();

                    System.out.print("Modelo: ");
                    modelo = sc.nextLine();

                    System.out.print("Horas: ");
                    horas = sc.nextInt();

                    Moto moto = new Moto(placa, modelo, horas);

                    estacionamento.adicionar(moto);

                    Arquivotxt.salvar(moto);

                    break;

                case 3:

                    System.out.print("Placa: ");
                    placa = sc.nextLine();

                    System.out.print("Modelo: ");
                    modelo = sc.nextLine();

                    System.out.print("Horas: ");
                    horas = sc.nextInt();

                    Caminhão caminhao = new Caminhão(placa, modelo, horas);

                    estacionamento.adicionar(caminhao);

                    Arquivotxt.salvar(caminhao);

                    break;

                case 4:

                    estacionamento.listar();

                    break;

                case 0:

                    System.out.println("Encerrando sistema...");
                    break;

                default:

                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}