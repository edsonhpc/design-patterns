package patterns.stategy;

// Recebendo a estrategia a ser aplicada
public class CalculadorDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto estrategiaDeImposto) {

		double resultado = estrategiaDeImposto.calcula(orcamento);
		System.out.println(estrategiaDeImposto.toString() + resultado);

	}

}
