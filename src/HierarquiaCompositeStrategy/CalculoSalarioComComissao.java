package HierarquiaCompositeStrategy;


//Calculo de salarios sem comiss�o, descontando os Impostos de Taxa do governo e INSS e com a comiss�o de vendas
public class CalculoSalarioComComissao implements ICalculadorDeSalarios {

	@Override
	public Double calcular(Empresa funcionarios) {
		//Desconta 6% de taxa do governo e depois desconta 11% do INSS adiconado a comiss�o de venda do funcionario
				return (funcionarios.getSalarios() * 0.94 * 0.89) + (funcionarios.getValorVendas() * funcionarios.getComissao()/100);
	}

	
	
}
