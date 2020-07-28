package patterns.stategy;

// Qualquer imposto deverá implementar essa interface, sendo ela a ser utilizada no strategy
public interface Imposto {

	double calcula(Orcamento orcamento);
}
