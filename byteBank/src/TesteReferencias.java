
public class TesteReferencias {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;

		System.out.println("saldo da primeira conta: " + primeiraConta.saldo + " reais");

		Conta segundaConda = primeiraConta;
		primeiraConta.saldo = 200;

		System.out.println("saldo da segunda conta: " + segundaConda.saldo);
	}
}
