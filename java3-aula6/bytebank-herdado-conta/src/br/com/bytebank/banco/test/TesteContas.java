package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException{
		
		ContaCorrente cc = new ContaCorrente(111, 222);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(90.0, cp);
		
		System.out.println("CC: R$" + cc.getSaldo());
		System.out.println("CP: R$" + cp.getSaldo());
		
	}

}
