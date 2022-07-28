
public class TestaGetESet {

	public static void main(String[] args) {

		Conta conta = new Conta(1, 2);

		System.out.println(conta.getNumero());

		Cliente paulo = new Cliente();

		conta.setTitular(paulo);

		paulo.setNome("Paulo Silveira");

		System.out.println(paulo.getNome());

		conta.getTitular().setNome("Jessé");

		System.out.println(conta.getTitular().getNome());

	}
}
