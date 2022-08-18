package versaoDefinitiva;

import utilitarios.Utils;

public class Conta {

	private Integer agencia;
	private Integer numConta;
	private Double saldo;
	private TiposDeContas tiposDeContas;
	private Titular titular;
	private Banco banco;

	public Conta(Integer agencia, Integer numConta, Double saldo, Titular titular, Banco banco,
			TiposDeContas tiposDeContas) {
		super();
		this.agencia = agencia;
		this.numConta = numConta;
		this.saldo = saldo;
		this.titular = titular;
		this.banco = banco;
		this.tiposDeContas = tiposDeContas;

	}

	public Integer getAgencia() {
		return agencia;
	}

	public void setAgencia(Integer agencia) {
		this.agencia = agencia;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Titular getTitular() {
		return titular;
	}

	public void setTitular(Titular titular) {
		this.titular = titular;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public TiposDeContas getTiposDeContas() {
		return tiposDeContas;
	}

	public void setTiposDeContas(TiposDeContas tiposDeContas) {
		this.tiposDeContas = tiposDeContas;
	}

	public String toString() {
		return "\nAgencia: " + this.getAgencia() + "\nNumero da conta: " + this.getNumConta() + "\nSaldo: "
				+ Utils.doubleToString(this.getSaldo()) + "\nTipos de Conta: " + tiposDeContas + "\nBanco" + banco
				+ "\n";
	}
}