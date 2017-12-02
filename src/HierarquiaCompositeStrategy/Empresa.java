package HierarquiaCompositeStrategy;


import java.util.ArrayList;
import java.util.List;

//Classe filha da interface IEmpresa, onde contém os metodos e dados dos funcionarios da empresa.

public class Empresa implements IEmpresa {

	private String nome;
	private Double salarios;
	private Double comissao;
	private TipoCargos tipoCargos;
	private Double valorVendas;
	private List<IEmpresa> Funcionarios = new ArrayList<>();
	
	public Empresa(String nome, Double salarios, Double comissao, TipoCargos tipoCargos, Double valorVendas) {
		
		this.nome = nome;
		this.salarios = salarios;
		this.comissao = comissao;
		this.tipoCargos = tipoCargos;
		this.valorVendas = valorVendas;
		
	}

	/*
	@Override
	public String detalharEmpresa() {
		// TODO Auto-generated method stub
		return null;
	} */

	//Passar os dados de pagamentos de cada funcionario de acordo com seus cargos
	@Override
	public Double receberPagamento() {
		
		Double salarios = tipoCargos.getCalculadorDeSalarios().calcular(this);
		return salarios;
	}
	
	//Método que adiciona um objetos sobordinado a um atual
	public void incluirSobordinados(IEmpresa funcionarios) {
		this.Funcionarios.add(funcionarios);
	}


	
	
	//gets and sets
	
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getSalarios() {
			return salarios;
		}

		public void setSalarios(Double salarios) {
			this.salarios = salarios;
		}

		public Double getComissao() {
			return comissao;
		}

		public void setComissao(Double comissao) {
			this.comissao = comissao;
		}

		public TipoCargos getTipoCargos() {
			return tipoCargos;
		}

		public void setTipoCargos(TipoCargos tipoCargos) {
			this.tipoCargos = tipoCargos;
		}

		public Double getValorVendas() {
			return valorVendas;
		}

		public void setValorVendas(Double valorVendas) {
			this.valorVendas = valorVendas;
		}

		public List<IEmpresa> getFuncionarios() {
			return Funcionarios;
		}

		public void setFuncionarios(List<IEmpresa> funcionarios) {
			Funcionarios = funcionarios;
		}
	
	
}
