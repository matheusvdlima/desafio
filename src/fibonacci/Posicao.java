package fibonacci;

public class Posicao {

	int posicao;
	int resultado;
	int ultimoNumero;
	int penultimoNumero;

	Posicao(int posicao, int resultado, int ultimoNumero, int penultimoNumero) {

		this.posicao = posicao;
		this.resultado = resultado;
		this.ultimoNumero = ultimoNumero;
		this.penultimoNumero = penultimoNumero;
		
	}

	void CalcularPosicao(Posicao posicao, int contador) {
		
		posicao.resultado = 0;
		posicao.ultimoNumero = 0;
		posicao.penultimoNumero = 1;
		
		if (posicao.posicao == 1) {

			posicao.resultado = 0;

		} else if (posicao.posicao == 2) {

			posicao.resultado = 1;

		} else if (posicao.posicao > 2 && posicao.posicao < 48) {

			while (contador != posicao.posicao) {

				posicao.resultado = posicao.ultimoNumero + posicao.penultimoNumero;

				posicao.penultimoNumero = posicao.ultimoNumero;
				posicao.ultimoNumero = posicao.resultado;

				contador++;

			}

		}

	}
}
