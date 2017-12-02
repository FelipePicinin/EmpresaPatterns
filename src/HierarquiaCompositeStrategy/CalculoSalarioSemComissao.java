package HierarquiaCompositeStrategy;

//Calculo de salarios sem comissão, descontando os Impostos de Taxa do governo e INSS
public class CalculoSalarioSemComissao implements ICalculadorDeSalarios{

	@Override
	public Double calcular(Empresa funcionarios) {
		//Desconta 6% de taxa do governo e depois desconta 11% do INSS
		return funcionarios.getSalarios() * 0.94 * 0.89;
	}
	
	

}
