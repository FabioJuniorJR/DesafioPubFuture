import java.time.LocalDate;
import java.util.ArrayList;

public class Despesas {
	private ArrayList<Despesas> despesas = new ArrayList<>();
	private double valor;
	private LocalDate dataPagamento;
	private LocalDate dataPagamentoEsperado;
	private String tipoDespesa;
	private double somaDespesas = 0;
	public double somaTotalDespesas = 0;
	
	public Despesas(double valor, LocalDate dataPagamento, LocalDate dataPagamentoEsperado, String tipoDespesa) {
		this.valor = valor;
		this.dataPagamento = dataPagamento;
		this.dataPagamentoEsperado = dataPagamentoEsperado;
		this.tipoDespesa = tipoDespesa;
	}
	
	public double getValorDespesa() {
		return valor;
	}

	public void setValorDespesa(double valor) {
		if(valor < 0) {
			throw new IllegalArgumentException("O valor da Despesa deve ser maior ou igual a zero");
		}else 
			this.valor = valor;
		somaDespesas = somaDespesas + this.valor;
	}

	public LocalDate getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDate dataPagamento) {
		if (dataPagamento == null) {
			throw new IllegalArgumentException("Data de pagamento não pode ser nula!");
		}else 
			this.dataPagamento = dataPagamento;
	}

	public LocalDate getDataPagamentoEsperado() {
		return dataPagamentoEsperado;
	}

	public void setDataPagamentoEsperado(LocalDate dataPagamentoEsperado) {
		if(dataPagamentoEsperado ==  null) {
			throw new IllegalArgumentException("Dta de pagamento esperado nao pode ser nula");
		}else
			this.dataPagamentoEsperado = dataPagamentoEsperado;
	}

	public String getTipoDespesa() {
		return tipoDespesa;
	}

	public void setTipoDespesa(String tipoDespesa) {
		this.tipoDespesa = tipoDespesa;
	}
	
	public void listarDespesas() {
		System.out.println(despesas);
	}

	public void removerDespesas() {
		
	}
	
	public double listarTotalDeDespesas(double somaDespesas, double somaTotalDespesas) {
		somaTotalDespesas = somaDespesas;
		if(somaTotalDespesas >= 0) {
			return somaTotalDespesas;
		}else
			return 0;
	}
}
