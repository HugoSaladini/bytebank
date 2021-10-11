package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) throws SaldoInsuficienteException{
		
		Conta conta = new ContaCorrente(123, 321);
		
		conta.deposita(100.0);
		System.out.println(conta.getSaldo());
		conta.saca(200.0);
		System.out.println("Saldo: " + conta.getSaldo());
		
	}

}
