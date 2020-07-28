package patterns.stategy;

public class TesteCalculadorDeImpostos {

	public static void main(String[] args) {

		Imposto icms = new ICMS();
		Imposto iss = new ISS();
		Imposto iccc = new ICCC();

		Orcamento orcamento = new Orcamento(2000);
		
		CalculadorDeImpostos calculador = new CalculadorDeImpostos();
		
		calculador.realizaCalculo(orcamento, icms);
		calculador.realizaCalculo(orcamento, iss);
		calculador.realizaCalculo(orcamento, iccc);
		
		
		
	}
}
