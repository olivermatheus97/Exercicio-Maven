package versaoDefinitiva;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SaidaMain {

	public static void main(String[] args) {
		List<Conta> contaBanco = Arrays.asList(

				new Conta(124125, 2, 55.5, new Titular("Matheus", "726.296.230-25"), new Banco("Itau", 3303),
						TiposDeContas.CORRENTE),
				new Conta(543123, 3, 00.0, new Titular("Junantan", "384.539.760-82"), new Banco("Nubank", 1001),
						TiposDeContas.POUPANCA),
				new Conta(987789, 4, 1000000.0, new Titular("Biella", "007.251.770-04"), new Banco("Caixa", 2002),
						TiposDeContas.SALARIO));
		// 3.1
//		try {
//			buscaContaPorCpf(contaBanco, "726.296.230-25").forEach(System.out::println);
//		} catch (ContaNaoEncontradaException e) {
//			e.printStackTrace();
//		}

		// 3.2
//		try {
//			System.out.println(consultaConta(contaBanco, "Nubank", 543123, 3));
//		} catch (ContaNaoEncontradaException e) {
//			e.printStackTrace();
//		}
		// 3.3

	}

	private static List<Conta> buscaContaPorCpf(List<Conta> contas, String cpf) throws ContaNaoEncontradaException {
		List<Conta> contasFiltradas = contas.stream().filter(conta -> conta.getTitular().getCpf().equals(cpf))
				.collect(Collectors.toList());
		if (contasFiltradas.isEmpty()) {
			throw new ContaNaoEncontradaException("Conta não encontrada.");
		} else {
			return contasFiltradas;
		}
	}

	public static Conta consultaConta(List<Conta> contas, String banco, Integer agencia, Integer numConta)
			throws ContaNaoEncontradaException {
		Optional<Conta> contaEncontrada = Optional
				.of(contas.stream().filter(conta -> conta.getBanco().getNome().equals(banco))
						.filter(conta -> conta.getAgencia().equals(agencia))
						.filter(conta -> conta.getNumConta().equals(numConta)).findFirst()
						.orElseThrow(() -> new ContaNaoEncontradaException("A conta não foi encontrada.")));
		return contaEncontrada.get();

	}

//	public static Double saqueConta(List<Conta> contas, String banco, Integer agencia, Integer numConta, Double saldo)
//			throws SaldoInsuficienteException {
//		contas.stream()
//		.map(Conta::getSaldo)
//		.reduce(0.0, Double::sum);
//		return null;
//	}
}
