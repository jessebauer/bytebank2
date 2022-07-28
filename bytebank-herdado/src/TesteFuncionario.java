
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente nico = new Gerente();
		nico.setNome("Nico Streppat");
		nico.setCpf("126546234");
		nico.setSalario(2500);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}
}
