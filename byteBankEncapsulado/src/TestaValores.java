
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);

		conta.setAgencia(-50);
		conta.setNumero(-330);

		System.out.println(conta.getNumero());

		Conta conta2 = new Conta(1337, 16539);
		Conta conta3 = new Conta(1537, 56539);

		System.out.println(Conta.getTotal());

		System.out.println(conta2.getAgencia() + conta3.getAgencia());
	}
}
