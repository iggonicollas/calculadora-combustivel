package CalculadoraCombustivel;

import CalculadoraCombustivel.carro.Carro;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Combustível, selecione a opção desejada: \nDigite: \n|  1  | para informar quantidade combustível \n|  2  | para informar Km da jornada\n|  3  | para trajeto fixo em múltiplos dias");
        int selecao = scanner.nextInt();

// Selecao 1
        if (selecao == 1) {
            System.out.println("Digite a quantidade de litros: ");
            double combustivel = scanner.nextDouble();

            Carro carro = new Carro();
            carro.setCombustivel(combustivel);

            double autonomia = carro.calcularAutonomiaPorLitro();
            double valor = carro.calcularValor();

            System.out.printf("A autonomia do carro é: %.2f Km, você precisará de R$ %.2f reais\n", autonomia, valor);
        }

// Selecao 2
        else if (selecao == 2) {
            System.out.println("Digite a quantidade de Km total: ");
            double Km = scanner.nextDouble();

            Carro carro = new Carro();
            carro.setKm(Km);
            carro.setCombustivel(34);

            double autonomia = carro.calcularAutonomiaPorKm();
            double valor = carro.calcularValor();

            System.out.printf("Para andar %.2f Km, precisa de %.2f litros e você precisará de R$%.2f%n", Km, autonomia, valor);
        }

// Selecao 3
        else if (selecao == 3) {
            System.out.println("Digite a quantidade de dias que o trajeto se repete: ");
            int keyboardDias = scanner.nextInt();

            System.out.println("Digite a distância de ida até o destino: ");
            double keyboardKmIda = scanner.nextDouble();

            Carro carro = new Carro();
            carro.setQtdDias(keyboardDias);
            carro.setKm(keyboardKmIda);

            double calculoDias = carro.trajetoDias();
            double totalDinheiro = carro.totalGasto();

            System.out.printf("Você percorrerá %.2f Km e o valor total será de R$ %.2f\n", calculoDias, totalDinheiro);
        }

        scanner.close();
    }
}