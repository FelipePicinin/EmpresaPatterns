package TesteImpostosStrategy;

//Mostrar o valor dos impostos cobrado encima do orçamento
public class TesteImposto {



	public static void main(String[] args) {
		Imposto inss = new INSS();
		Imposto taxaGoverno = new ImpostoGoverno();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		
		CalculadorDeImposto calculador = new CalculadorDeImposto();
		
		calculador.realizaCalculo(orcamento, inss);
		calculador.realizaCalculo(orcamento, taxaGoverno);
		
		
	
		
	}
	
}
