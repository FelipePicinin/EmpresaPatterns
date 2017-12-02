package HierarquiaCompositeStrategy;

//No enum passara os Cargos que contém a empresa, e seus expectativos calculos, podendo futuramente adicionar mais cargos

public enum TipoCargos {

	PRESIDENCIA(new CalculoSalarioPreLabore()) ,
	DIRETOR_COMERCIAL(new CalculoSalarioComComissao()),
	DIRETOS_PRODUCAO(new CalculoSalarioSemComissao()),
	VENDEDOR(new CalculoSalarioComComissao()),
	DESENVOLVEDOR(new CalculoSalarioSemComissao() );
	
	private ICalculadorDeSalarios calculadorDeSalarios;
	
	private TipoCargos(ICalculadorDeSalarios calculadorDeSalarios) {
		this.calculadorDeSalarios = calculadorDeSalarios;
	}
	
	public ICalculadorDeSalarios getCalculadorDeSalarios() {
		return calculadorDeSalarios;
	}
	
}
