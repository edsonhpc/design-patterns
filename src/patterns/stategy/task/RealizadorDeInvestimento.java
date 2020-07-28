package patterns.stategy.task;

public class RealizadorDeInvestimento {

	public void efetuarCalculo (Conta conta, Investimento investimento) {
		
		double resultado = investimento.calcula(conta);
		conta.deposita(resultado * 0.75);
		
		System.out.println("Novo saldo:" + conta.getSaldo());
	}
}
