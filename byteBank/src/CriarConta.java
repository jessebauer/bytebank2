
public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);

		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);

		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		System.out.println(segundaConta.saldo);

		System.out.println("primeira conte tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);

		System.out.println(primeiraConta.agencia); // é igual a zero ou
		// a ser definido na classe Conta, pois nao foi definido
	}
}
