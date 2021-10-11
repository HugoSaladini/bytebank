package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando coleções em Java", "Paulo Silveira");

		// unmodifiable não permite que seha adicionado, pois o retorno esta apenas para
		// visualizar.
		// javaColecoes.getAulas().add(new Aula("Dominando array e list", 21));

		javaColecoes.adiciona(new Aula("Dominando array e list", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando Coleçoes", 22));

		List<Aula> aulas = javaColecoes.getAulas();

		System.out.println(javaColecoes.getAulas());

	}

}
