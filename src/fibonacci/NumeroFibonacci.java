package fibonacci;
/**
 * 
 * Classe respons�vel por declarar vari�veis e os m�todos
 * @author: Matheus Lima
 * @version: 2.0.2
 * @since: 30 de mar�o de 2022
 *
 */
public class NumeroFibonacci {

	public int posicao;
	public int resultado;
	public int ultimoNumero;
	public int penultimoNumero;
/**
 * 
 * M�todo construtor do objeto
 * 
 * @param posicao Atributo para receber a posi��o desejada
 * @param resultado Atributo para receber o valor resultante da soma dos dois �ltimos n�meros da sequ�ncia
 * @param ultimoNumero �ltimo n�mero na sequ�ncia (inicialmente, recebe 1)
 * @param penultimoNumero Pen�ltimo n�mero na sequ�ncia (inicialmente, recebe 0)
 * 
 */
	public NumeroFibonacci(int posicao, int resultado, int ultimoNumero, int penultimoNumero) {

		this.posicao = posicao;
		this.resultado = resultado;
		this.ultimoNumero = ultimoNumero;
		this.penultimoNumero = penultimoNumero;
		
	}
/**
 * 
 * M�todo para o c�lculo do valor da posi��o
 * 
 * @param posicao Usando os atributos do objeto
 * @param valor Vari�vel que recebe o valor de p.posicao
 * @return Uma vari�vel inteira com o valor referente a posi��o selecionada
 */
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
