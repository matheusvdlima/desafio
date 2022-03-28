package fibonacci;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Posicao {

	public static void main(String[] args) {

		Locale localeBR = new Locale("pt", "BR");

		System.out.println("-".repeat(28));
		System.out.println("   Sequência de Fibonacci   ");
		System.out.println("-".repeat(28));

		Scanner entrada = new Scanner(System.in);
		String opcao = "s";

		do {

			try {

				System.out.println("\n\nVocê quer saber o valor de qual posição da sequência? ");

				int posicao = entrada.nextInt();
				entrada.nextLine();
				int contador = 2;
				double valor = 0;
				double na1 = 0; // número antecessor
				double na2 = 1; // número anteantecessor

				if (posicao == 1) {

					valor = 0;

				} else if (posicao == 2) {

					valor = 1;

				} else if (posicao > 2 && posicao < 80) {

					while (contador != posicao) {

						valor = na1 + na2;

						na1 = na2;
						na2 = valor;

						contador++;

					}

				} else {

					System.out.println("\n! Por favor, tente novamente digitando um número entre 1 e 79. !\n");
					// obs: após essa posição, os valores calculados ficam imprecisos (n com 17 dígitos) - (BigDecimal)

				}
				
				NumberFormat valorformatado = NumberFormat.getNumberInstance(localeBR);
				System.out.println(posicao > 0 && posicao < 80 ? "\nO valor da posição " + posicao + " é: " + valorformatado.format(valor) : "");
				
				System.out.print(
						"\n\n- Para tentar novamente ou saber outro valor digite 's'. Para sair, digite qualquer outro caractere. - ");

				opcao = entrada.nextLine();

			} catch (InputMismatchException exception) {

				System.out.println("\n!!! Entrada inválida, por favor, execute o programa novamente. !!!\n");

				break;

			}

		} while (opcao.equalsIgnoreCase("s"));

		System.out.println("\n\n\nPrograma finalizado.");

		entrada.close();

	}
}
