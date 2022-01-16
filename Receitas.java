import java.time.LocalDate;
import java.util.ArrayList;

public class Receitas {
	private ArrayList<Receitas> receitas = new ArrayList<>();
	private double valor;
	private LocalDate dataRecebimento;
	private LocalDate dataRecebimentoEsperado;
	private String descricao;
	private String tipoReceita;
	private double somaReceitas = 0;
	public double somaTotalReceitas = 0;
	
	public Receitas(double valor, LocalDate dataRecebimento, LocalDate dataRecebimentoEsperado, String descricao, String tipoReceita) {
		this.valor = valor;
		this.dataRecebimento = dataRecebimento;
		this.dataRecebimentoEsperado = dataRecebimentoEsperado;
		this.descricao = descricao;
		this.tipoReceita = tipoReceita;
	}
	
	public double getValorRecita() {
		return valor;
	}

	public void setValorReceita(double valor, double somaReceitas) {
		if(valor >= 0) {
			this.valor = valor;
			somaReceitas = somaReceitas + this.valor;
		} else
			throw new IllegalArgumentException("Valor Invalido");
	}

	public LocalDate getDataRecebimento() {
		return dataRecebimento;
	}

	public void setDataRecebimento(LocalDate dataRecebimento) {
		if (dataRecebimento == null) {
			throw new IllegalArgumentException("Data de recebimento não pode ser nula!");
		}else 
			this.dataRecebimento = dataRecebimento;
	}

	public LocalDate getDataRecebimentoEsperado() {
		return dataRecebimentoEsperado;
	}

	public void setDataRecebimentoEsperado(LocalDate dataRecebimentoEsperado) {
		if (dataRecebimentoEsperado == null) {
			throw new IllegalArgumentException("Data de recebimento esperado não pode ser nula!");
		}else 
			this.dataRecebimentoEsperado = dataRecebimentoEsperado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		if(descricao == null) {
			throw new IllegalArgumentException("A descricao da receita nao pode ser nula");
		}
		this.descricao = descricao;
	}

	public String getTipoReceita() {
		return tipoReceita;
	}

	public void setTipoReceita(String tipoReceita) {
		this.tipoReceita = tipoReceita;
	}
	
	public void listarReceitas() {
		System.out.println(receitas);
	}
	
	public void removerReceitas() {
	}
	
	public double listarTotalDeReceitas(double somaReceitas, double somaTotalReceitas) {
		somaTotalReceitas = somaReceitas;
		if(somaTotalReceitas >= 0) {
			return somaTotalReceitas;
		}else
			return 0;
	}
}
