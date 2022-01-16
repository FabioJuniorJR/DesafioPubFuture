import java.util.ArrayList;

public class Contas {
	private ArrayList<Contas> contas = new ArrayList<>();
	private Double saldo;
	private String tipoConta;
	private String instituicaoFinanceira;
	private double saldoTotal;
	
	public Contas(Double saldo, String tipoConta, String instituicaoFinanceira) {
		this.saldo = saldo;
		this.tipoConta = tipoConta;
		this.instituicaoFinanceira = instituicaoFinanceira;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		if(tipoConta == "cateira" && tipoConta == "conta corrente" && tipoConta == "poupança") {
			this.tipoConta = tipoConta;
		}
		else 
			throw new IllegalArgumentException("Tipo de Conta Invalido");
			
	}

	public String getInstituicaoFinanceira() {
		return instituicaoFinanceira;
	}

	public void setInstituicaoFinanceira(String instituicaoFinanceira) {
		this.instituicaoFinanceira = instituicaoFinanceira;
	}
	
	public void removerConta() {
		
	}
	
	public void listarContas() {
		System.out.println(contas);
	}
	
	public void transferirSaldoEntreContas() {
		
	}
	
	public void listarSaldoTotal(double somatotalReceitas) {

	}
}
