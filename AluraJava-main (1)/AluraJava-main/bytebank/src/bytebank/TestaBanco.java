package bytebank;

public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Silveira";
		paulo.cpf = "000.000.000-00";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposito(100);
		
		contaDoPaulo.titular = paulo;
		
		System.out.println(contaDoPaulo.titular.nome);
	}

}
