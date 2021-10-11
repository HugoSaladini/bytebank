package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando cole��es em Java", "Paulo Silveira");

		// unmodifiable n�o permite que seha adicionado, pois o retorno esta apenas para
		// visualizar.
		// javaColecoes.getAulas().add(new Aula("Dominando array e list", 21));

		javaColecoes.adiciona(new Aula("Dominando array e list", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Cole�oes", 22));

		List<Aula> aulas = javaColecoes.getAulas();

		System.out.println(javaColecoes.getAulas());

	}

}
