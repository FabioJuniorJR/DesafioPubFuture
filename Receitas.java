import java.time.LocalDate;
import java.util.ArrayList;

public class Receitas {
	private ArrayList<Receitas> receitas = new ArrayList<>();
	private double valor;
	private LocalDate dataRecebimento;
	private LocalDate dataRecebimentoEsperado;
	private String descricao;
	//private String conta;      * Vai estar em uma conta * qual ? *
	private String tipoReceita;
	
	public Receitas(double valor, LocalDate dataRecebimento, LocalDate dataRecebimentoEsperado, String descricao, String tipoReceita) {
		this.valor = valor;
		this.dataRecebimento = dataRecebimento;
		this.dataRecebimentoEsperado = dataRecebimentoEsperado;
		this.descricao = descricao;
		this.tipoReceita = tipoReceita;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(LocalDate dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}

	public LocalDate getDataRecebimentoEsperado() {
		return dataRecebimentoEsperado;
	}

	public void setDataRecebimentoEsperado(LocalDate dataRecebimentoEsperado) {
		this.dataRecebimentoEsperado = dataRecebimentoEsperado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}

	public void cadastrarReceitas() {
		
	}
	
	public void editarReceitas() {
		
	}
	
	public void removerReceitas() {
		
	}
	
	public void listarTotalDeRceitas() {
		
	}
}
