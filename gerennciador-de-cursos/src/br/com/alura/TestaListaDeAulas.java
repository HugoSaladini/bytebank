package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListaDeAulas {
	
	public static void main(String[] args) {
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Lista de objetos", 20);
		Aula a3 = new Aula("Relacionamentos de Lista e Objetos", 15);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		// Ordena de forma alfabetica a lista, necessário import na classe Aula
		// Para conseguir utilizar as declarações da classe mae
		
		System.out.println(aulas);
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		//Ordena a lista pelo tempo de cada aula
		Collections.sort(aulas, java.util.Comparator.comparing(Aula::getTempo));
		
		System.out.println(aulas);
		
		
				
		
	}

}
