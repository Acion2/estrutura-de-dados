package Exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class IniciaImprimeMatriz {

	public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o Tamanho da Matriz !");
			System.out.println("Quantas linhas ?");
		int linhas = entrada.nextInt();
		System.out.println("Quantas colunas ?");
		int colunas = entrada.nextInt();
		
		int[][] matriz = new int [linhas][colunas];
		for (int l = 0;l <linhas; l++) {
			for (int c = 0; c<colunas; c++) {
				System.out.printf("informe os numeros da matriz de forma crescente :");
				matriz[l][c]= entrada.nextInt();
			}
		}
		for (int[] imprime: matriz) {
			System.out.println(Arrays.toString(imprime));
		}
		entrada.close();
	}

}
