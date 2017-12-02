package HierarquiaCompositeStrategy;

//M�todo para calcular Salario Pr�-Labore, dando o salario liquido final
public class CalculoSalarioPreLabore implements ICalculadorDeSalarios{

	//Denconto de 2% pela taxa do governo
	
	@Override
	public Double calcular(Empresa funcionarios) {
		// TODO Auto-generated method stub
		return funcionarios.getSalarios() * 0.98;
	}

}
