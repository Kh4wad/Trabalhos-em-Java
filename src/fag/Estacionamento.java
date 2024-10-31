package fag;

import java.util.ArrayList;
import java.util.Scanner;

import fag.Car.Car;
import fag.objeto.Vagas;

public class Estacionamento {

    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Vagas> Vg = new ArrayList<Vagas>();
    private static ArrayList<Car> Carros = new ArrayList<Car>();
    private static String Tam;
    private static String Modelo;
    private static Car Auto;
    private static int He;

    public static void main(String[] args) {
        int k = 1;

        while (k > 0) {
            System.out.println("O que gostaria? 1 - Colocar vagas, 2 - Número de vagas disponíveis, 3 - Cadastrar o carro, 4 - Adicionar na vaga, 5 - Retirar carro");
            k = scanner.nextInt();

            if (k == 1) {
                infomarVaga();
            } else if (k == 2) {
                NumeroDevagas();
            } else if (k == 3) {
                Carross();
            } else if (k == 4) {
                AddCarro();
            } else if (k == 5) {
                Back();
                k = 0;
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
        }
    }

    public static void infomarVaga() {
        System.out.println("Quantas vagas gostaria de colocar?");
        int Ve = scanner.nextInt();

        for (int i = 0; i < Ve; i++) {
            System.out.println("Diga o número da vaga:");
            int N = scanner.nextInt();

            System.out.println("Diga o tamanho da vaga (pequeno, médio, grande):");
            String Tamanho = scanner.next();

            System.out.println("Diga se a vaga está disponível ou ocupada:");
            String disponibilidade = scanner.next();

            Vagas Estacion = new Vagas(N, Tamanho, disponibilidade);
            Vg.add(Estacion);
        }
    }

    public static void NumeroDevagas() {
        for (Vagas RL : Vg) {
            System.out.println("Número da vaga: " + RL.getNumero() + " | Tamanho: " + RL.getTamanho() + " | Disponibilidade: " + RL.getDisponibilidade());
        }
    }

    public static void Carross() {
        System.out.println("Coloque a placa do carro:");
        String Placa = scanner.next();

        System.out.println("Coloque o modelo do carro:");
        Modelo = scanner.next();

        System.out.println("Coloque o tamanho do carro (pequeno, médio, grande):");
        Tam = scanner.next();

        System.out.println("Coloque o tempo de entrada ex:(1h,2h,3h):");
        He = scanner.nextInt();

        Auto = new Car(Placa, Modelo, Tam, He);
    }

    public static void AddCarro() {
        boolean vagaEncontrada = false;

        for (Vagas Lis : Vg) {
            if (Lis.getDisponibilidade().equalsIgnoreCase("Disponível") && Lis.getTamanho().equalsIgnoreCase(Tam)) {
                Lis.setDisponibilidade("Ocupado");
                Lis.setHorarioEntrada(He);
                Carros.add(Auto);
                System.out.println("Carro: " + Auto.getModelo() + " adicionado na vaga " + Lis.getNumero());
                vagaEncontrada = true;
                break;
            }
        }

        if (!vagaEncontrada) {
            System.out.println("Não há vagas disponíveis ou o tamanho da vaga não corresponde ao do carro.");
        }
    }

    public static void Back() {
        System.out.println("Saída do carro, digite o número da vaga e o horário de saída:");

        System.out.println("Escreva o número da vaga:");
        int P = scanner.nextInt();

        System.out.println("Escreva o horário de saída:");
        int Hs = scanner.nextInt();

        for (Vagas s : Vg) {
            if (s.getNumero() == P && s.getDisponibilidade().equalsIgnoreCase("Ocupado")) {
                int He = s.getHorarioEntrada();
                int Ht = Hs - He;
                int tarifa;

                if (Ht <= 1) {
                    tarifa = 5;
                } else if (Ht <= 3) {
                    tarifa = 10;
                } else {
                    tarifa = 15;
                }

                s.setDisponibilidade("Disponível");
                System.out.println("O valor que você deve pagar é: " + tarifa + " Reais.");
                return;
            }
        }

        System.out.println("Vaga não encontrada ou já está disponível.");
    }
}
