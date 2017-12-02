package MainHierarquiaCompositeStrategy;

import HierarquiaCompositeStrategy.Empresa;
import HierarquiaCompositeStrategy.TipoCargos;

//Execução do projeto passando todos os dados dos funcionarios da empresa
public class Main {

	public static void main(String[] args) {
		// Criando todos os objetos de funcionarios da empresa

		Empresa presidente = new Empresa("Felipe Picinin", 10500.00, null , TipoCargos.PRESIDENCIA, null);
		Empresa diretorComercial = new Empresa("Lucas Pedro", 7000.00, 20.00, TipoCargos.DIRETOR_COMERCIAL, 4000.00);
		Empresa diretorProducao = new Empresa("Bruno Severino", 7000.00, null, TipoCargos.DIRETOS_PRODUCAO, null);
		
		Empresa vendedor = new Empresa("Rafael Garcia", 3500.00, 8.00, TipoCargos.VENDEDOR, 1200.00);
		Empresa diretorComercial2 = new Empresa("Carlos Silva", 4000.00, 10.00, TipoCargos.DIRETOR_COMERCIAL, 2500.00);
		
		Empresa desenvolvedor1 = new Empresa("Bruno Henrique", 4000.00, null, TipoCargos.DESENVOLVEDOR, null);
		Empresa desenvolvedor2 = new Empresa("Cralos Henrique", 4000.00, null, TipoCargos.DESENVOLVEDOR, null);
		Empresa desenvolvedor3 = new Empresa("Luiz Felipe", 4000.00, null, TipoCargos.DESENVOLVEDOR, null);
		
		//Incluindo os sobordinados de cada setor da empresa
		presidente.incluirSobordinados(diretorComercial);
		presidente.incluirSobordinados(diretorProducao);
		
		diretorComercial.incluirSobordinados(vendedor);
		diretorComercial.incluirSobordinados(diretorComercial2);
		
		diretorProducao.incluirSobordinados(desenvolvedor1);
		diretorProducao.incluirSobordinados(desenvolvedor2);
		diretorProducao.incluirSobordinados(desenvolvedor3);
		
		//Valor recebido por cada setor
		System.out.println("Salario Final do Presidente: " + presidente.receberPagamento());
		System.out.println("Salario Final do Diretor Comercial Chefe: " + diretorComercial.receberPagamento());
		System.out.println("Salario Final do Diretor de Produção: " + diretorProducao.receberPagamento());
		
		System.out.println("Salario Final do Vendedor: " + vendedor.receberPagamento());
		System.out.println("Salario Final do Diretor Comercial: " + diretorComercial2.receberPagamento());
		
		System.out.println("Salario Final do Diretor Desenvolvedor 1: " + desenvolvedor1.receberPagamento());
		System.out.println("Salario Final do Diretor Desenvolvedor 2: " + desenvolvedor2.receberPagamento());
		System.out.println("Salario Final do Diretor Desenvolvedor 2: " + desenvolvedor3.receberPagamento());
		
	}

}
