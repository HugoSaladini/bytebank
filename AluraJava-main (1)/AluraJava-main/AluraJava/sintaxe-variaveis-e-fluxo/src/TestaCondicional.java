
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando Condicional");
		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Maio de Idade!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não é de maior, mas esta acompanhado!");
			} else {
				System.out.println("Menor de Idade!");
			}

		}

	}

}
