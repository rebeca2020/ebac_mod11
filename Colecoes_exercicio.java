package br.com.exercicio;

import java.util.ArrayList;
import java.util.List;

//Programa que leia um nome e o sexo; 
//Separar em grupos. Masculino e feminino.
//dica: split - quebra os números separado por virgula em um array. 

public class Colecoes_exercicio {

	public static void main(String[] args) {

		leituraNome();
		leituraDosGrupos();

	}

	private static void leituraNome() {

		System.out.println("****Lista dos nomes e sexo****");

		List<Persona> lista = new ArrayList<Persona>();

		Persona a = new Persona("Adriano Souza", "Masculino");
		Persona b = new Persona("Andre Rizo", "Masculino");
		Persona c = new Persona("João Santos", "Masculino");
		Persona d = new Persona("Renata Mendes", "Feminino");
		Persona e = new Persona("Sarah Silva", "Feminino");

		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);

		System.out.println(lista);

		System.out.println();


	}

	private static void leituraDosGrupos() {

		System.out.println("****Lista dos grupos Feminino e Masculino****");

		List<Persona> pessoas = new ArrayList<Persona>();

		Persona a = new Persona("Adriano Souza", "Masculino");
		Persona b = new Persona("Andre Rizo", "Masculino");
		Persona c = new Persona("João Santos", "Masculino");
		Persona d = new Persona("Renata Mendes", "Feminino");
		Persona e = new Persona("Sarah Silva", "Feminino");

		pessoas.add(a);
		pessoas.add(b);
		pessoas.add(c);
		pessoas.add(d);
		pessoas.add(e);

		// System.out.println(pessoas);

		List<Persona> sexoFeminino = new ArrayList<Persona>();
		List<Persona> sexoMasculino = new ArrayList<Persona>();

		for (int i = 0; i < pessoas.size(); i++) {
			Persona element = pessoas.get(i);

			if ("Feminino".equals(element.getSexo())) {
				sexoFeminino.add(element);

			} else {

				sexoMasculino.add(element);

			}

		}

		System.out.println("SEXO MASCULINO " + sexoMasculino);
		System.out.println("SEXO FEMININO " + sexoFeminino);

	}

}
