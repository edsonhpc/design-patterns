package patterns.stategy;

// Qualquer imposto dever� implementar essa interface, sendo ela a ser utilizada no strategy
public interface Imposto {

	double calcula(Orcamento orcamento);
}
