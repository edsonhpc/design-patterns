package patterns.stategy;

public class ICMS implements Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() *0.05 + 50;
	}

	@Override
	public String toString() {
		return "Calculo ICMS: ";
	}
}
