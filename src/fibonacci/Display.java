package fibonacci;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Display {

	public static void main(String[] args) {

		System.out.println("-".repeat(28));
		System.out.println("   Sequ�ncia de Fibonacci   ");
		System.out.println("-".repeat(28));

		Scanner entrada = new Scanner(System.in);

		String o = "s";

		while (o.equalsIgnoreCase("s")) {

			try {
				
				NumeroFibonacci p = new NumeroFibonacci(1, 0, 0, 1);

				System.out.println("\n\nVoc� quer saber o valor de qual posi��o da sequ�ncia? ");

				p.posicao = entrada.nextInt();
				entrada.nextLine();

				System.out.println(p.posicao > 0 && p.posicao < 48 ? "\nO valor da posi��o " + p.posicao + " �: " + p.ResultadoPosicao(p, p.posicao) : "\n! Por favor, tente novamente digitando um n�mero entre 1 e 47. !");

				System.out.println("\n\n- Para tentar novamente ou saber outro valor digite 's'. Para sair, digite qualquer outro caractere. - ");

				o = entrada.next();

			} catch (InputMismatchException exception) {

				System.out.println("\n!!! Entrada inv�lida, por favor, execute o programa novamente. !!!\n");

				break;

			}

		}
		
		entrada.close();
		
		System.out.println("\n\n\nPrograma finalizado.");
		
	}
}
