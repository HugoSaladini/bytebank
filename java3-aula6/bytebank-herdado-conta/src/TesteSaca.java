import java.io.ObjectInputStream.GetField;

public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(250.0);
		System.out.println(conta.getSaldo());
		conta.saca(200.0);
		System.out.println("Saldo: " + conta.getSaldo());
		
	}

}
