package patterns.stategy.task;

/**
 * - O padrão Strategy é muito útil quando temos um conjunto de algoritmos similares, e precisamos alternar entre eles em diferentes pedaços da aplicação.
 * - No exemplo da aula temos diferentes maneiras de calcular o imposto, e precisamos alternar entre elas.
 * - Ele define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis, o Strategy deixa o algoritmo variar independente dos cliente que utilizam.
 */
public class TesteCalculoDeInvestimento {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.deposita(100);
		
		Investimento conservador = new Conservador();
		Investimento moderado = new Moderado();
		Investimento arrojado = new Arrojado();
		
		RealizadorDeInvestimento realizador = new RealizadorDeInvestimento();
		realizador.efetuarCalculo(conta, conservador);
		realizador.efetuarCalculo(conta, moderado);
		realizador.efetuarCalculo(conta, arrojado);
		
		
	}
}
