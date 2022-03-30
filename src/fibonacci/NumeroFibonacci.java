package fibonacci;
/**
 * 
 * @author mathe
 *
 */
public class NumeroFibonacci {

	public int posicao;
	public int resultado;
	public int ultimoNumero;
	public int penultimoNumero;
/**
 * 
 * @param posicao
 * @param resultado
 * @param ultimoNumero
 * @param penultimoNumero
 */
	public NumeroFibonacci(int posicao, int resultado, int ultimoNumero, int penultimoNumero) {

		this.posicao = posicao;
		this.resultado = resultado;
		this.ultimoNumero = ultimoNumero;
		this.penultimoNumero = penultimoNumero;
		
	}
	 
	 public int ResultadoPosicao(NumeroFibonacci posicao, int valor) {
		 
		 if (valor == 1) {
			 return 0;
		 } else if (valor == 2) {
			 return 1;
		 } else {
		 
		 posicao.resultado = posicao.ultimoNumero + posicao.penultimoNumero;
		 
		 posicao.penultimoNumero = posicao.ultimoNumero;
		 posicao.ultimoNumero = posicao.resultado;
		 
		 return posicao.penultimoNumero + ResultadoPosicao(posicao, valor - 1);
		 
		 }
		 
	 }
	 
}
