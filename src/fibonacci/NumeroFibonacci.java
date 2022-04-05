package fibonacci;
/**
 * 
 * Classe responsável por declarar variáveis e os métodos
 * @author: Matheus Lima
 * @version: 2.0.2
 * @since: 30 de março de 2022
 *
 */
public class NumeroFibonacci {

	public int posicao;
	public int resultado;
	public int ultimoNumero;
	public int penultimoNumero;
/**
 * 
 * Método construtor do objeto
 * 
 * @param posicao Atributo para receber a posição desejada
 * @param resultado Atributo para receber o valor resultante da soma dos dois últimos números da sequência
 * @param ultimoNumero Último número na sequência (inicialmente, recebe 1)
 * @param penultimoNumero Penúltimo número na sequência (inicialmente, recebe 0)
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
 * Método para o cálculo do valor da posição
 * 
 * @param posicao Usando os atributos do objeto
 * @param valor Variável que recebe o valor de p.posicao
 * @return Uma variável inteira com o valor referente a posição selecionada
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
