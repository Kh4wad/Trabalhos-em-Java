package fag;

import java.util.ArrayList;
import java.util.Scanner;
import Objeto.fag.Quarto;
import Objeto.reservas.Reservas;

public class AtividadeDecadastros {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Quarto> cadastro = new ArrayList<>();
    private static ArrayList<Reservas> reservas = new ArrayList<>();

    public static void main(String[] args) {
        cadastrarQuartos();
        registrarReservas();
        exibirOcupacao();
        gerarHistoricoReservas();
        menuGerenciamento();
    }

    public static void cadastrarQuartos() {
        System.out.println("Quantos quartos deseja cadastrar?");
        int n = scanner.nextInt();
        scanner.nextLine().trim();

        for (int i = 1; i <= n; i++) {
            System.out.print("Número do quarto\n");
            String numero = scanner.nextLine().trim();

            System.out.print("Tipo de quarto (solteiro, casal, suite)\n");
            String tipo = scanner.nextLine().trim();

            System.out.print("Preço diário\n");
            float preco = scanner.nextFloat();
            scanner.nextLine(); 

            System.out.print("Disponibilidade (ocupado/disponível)\n");
            String disponibilidade = scanner.nextLine().trim();

            Quarto quarto = new Quarto(numero, tipo, preco, disponibilidade);
            cadastro.add(quarto);
        }
    }


    public static void registrarReservas() {
        System.out.println("Quantas reservas deseja cadastrar?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Nome do hóspede\n");
            String nome = scanner.nextLine().trim();

            System.out.print("Data de check-in\n");
            String dataDeInicio = scanner.nextLine().trim();

            System.out.print("Data de check-out\n");
            String dataDeFim = scanner.nextLine().trim();

            System.out.print("Quantidade de quartos reservados\n");
            int quantidade = scanner.nextInt();
            scanner.nextLine().trim(); 

            System.out.print("Tipo de quarto reservado (solteiro, casal, suite)\n");
            String tipo = scanner.nextLine().trim();

            Reservas reserva = new Reservas(nome, dataDeInicio, dataDeFim, quantidade, tipo);
            reservas.add(reserva);

        
            for (Quarto q : cadastro) {
                if (q.getTipo().trim().equalsIgnoreCase(tipo) && (q.getDisponibilidade().trim().equalsIgnoreCase("disponível"))||q.getDisponibilidade().trim().equalsIgnoreCase("disponivel")) {
                    q.setDisponibilidade("Ocupado");
                    System.out.println("Quarto" + q.getNúmero() + "reservado.");
                    break;
                }
            }
        }
    }

    
    public static void exibirOcupacao() {
        System.out.println("\nRelatório de Ocupação de Quartos\n");
        for (Quarto q : cadastro) {
            if (q.getDisponibilidade().trim().equalsIgnoreCase("ocupado")) {
                System.out.println("Quarto Número:" + q.getNúmero() + ",Tipo:" + q.getTipo() + ",Disponibilidade: Ocupado");
            }
        }
    }


    public static void gerarHistoricoReservas() {
        System.out.println("\nHistórico de Reservas\n");
        for (Reservas r : reservas) {
            System.out.println("Hóspede:" + r.getNome() + ", Check-in: " + r.getDatadeinicio() + ", Check-out: " + r.getDatadefim() + ", Quartos Reservados: " + r.getQuantidade() + ", Tipo de Quarto: " + r.getTipe());
        }
    }

    public static void menuGerenciamento() {
        while (true) {
        	int i = 0;
        	if(i == 0) {
        	System.out.println("\n");
            System.out.println("Gerenciamento de Check-in/Check-out");
            System.out.println("1. Realizar Check-in");
            System.out.println("2. Realizar Check-out");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            i = scanner.nextInt();
            scanner.nextLine().trim(); 
        	}
            if (i == 1) {
                    realizarCheckIn();
                i = 0;
                    
            }else if (i == 2) {
                    realizarCheckOut();
              i = 0;
            }else if(i == 3) {
                    System.out.println("\nVocê saiu do sistema.");
                    return;
            }else{
                    System.out.println("\nNão existe esta opção. Tente novamente.");
           i = 0;

            }
        }
    }


    public static void realizarCheckIn() {
        System.out.print("\nNúmero do quarto para Check-in");
        String numero = scanner.nextLine().trim();

        for (Quarto q : cadastro) {
            if (q.getNúmero().trim().equalsIgnoreCase(numero) && (q.getDisponibilidade().trim().equalsIgnoreCase("disponível"))||q.getDisponibilidade().trim().equalsIgnoreCase("disponivel")) {
                q.setDisponibilidade("Ocupado");
                System.out.println("Check-in realizado para o quarto " + numero+"\n");
                return;
            }
        }
        System.out.println("\nQuarto não disponível ou não existe este quarto.");
    }

    public static void realizarCheckOut() {
        System.out.print("Número do quarto para Check-out\n");
        String numero = scanner.nextLine();

        for (Quarto q : cadastro) {
            if (q.getNúmero().equalsIgnoreCase(numero) && q.getDisponibilidade().equalsIgnoreCase("ocupado")) {
                q.setDisponibilidade("disponível");
                System.out.println("Check-out realizado para o quarto " + numero+"\n");
                return;
            }
        }
        System.out.println("Não existe este quarto ou já esta disponível.\n");
    }
}
