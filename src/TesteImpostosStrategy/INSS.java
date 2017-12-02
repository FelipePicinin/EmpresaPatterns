package TesteImpostosStrategy;

public class INSS implements Imposto{
	
	
	//Contrato da Interface Imposto
	@Override
	public double calcula(Orcamento orcamento) {
		//Calcula 11% encima do valor
		
				return orcamento.getValor() * 0.11;
	}

}
