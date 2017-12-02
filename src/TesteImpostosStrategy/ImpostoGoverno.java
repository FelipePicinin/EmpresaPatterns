package TesteImpostosStrategy;

public class ImpostoGoverno implements Imposto{

		
 
	//Contrato da Interface Impsoto

	@Override
	public double calcula(Orcamento orcamento) {
		//Calcula 6% encima do valor
		
				return orcamento.getValor() * 0.06;
				
	}
	
}
