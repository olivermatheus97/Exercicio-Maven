package versaoDefinitiva;

public class Banco {

	private String nome;
	private Integer codigo;

	public Banco(String nome, Integer codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String toString() {
		return "\nNome: " + getNome() + "\nCodigo: " + getCodigo();
	}
}
