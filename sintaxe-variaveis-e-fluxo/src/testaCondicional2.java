
public class testaCondicional2 {

	public static void main(String[] args) {
		System.out.println("testando condicionais");
		int idade = 16;
		int quantidadePessoas = 3;

		boolean acompanhado = (quantidadePessoas >= 2 ? true : false);

		if (idade >= 18 || quantidadePessoas >= 2) {

			System.out.println("seja bem vindo" + acompanhado);
		} else {
			System.out.println("infelizmente você não pode entrar");
		}
	}
}
