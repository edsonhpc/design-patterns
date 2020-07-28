package patterns.stategy;

public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	@Override
	public String toString() {
		return "Calculo ISS: ";
	}
}
