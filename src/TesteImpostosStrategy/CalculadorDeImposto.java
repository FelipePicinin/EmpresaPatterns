package TesteImpostosStrategy;

public class CalculadorDeImposto {

	//Método para realizar o calculo do Imposto de qualquer imposto
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
	
		//Calcula vem da interface Imposto
	double imposto = impostoQualquer.calcula(orcamento);
	System.out.println(imposto);
		
	}
	
	
	
	
}
