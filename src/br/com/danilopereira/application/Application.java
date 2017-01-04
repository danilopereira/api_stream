package br.com.danilopereira.application;

import java.util.Arrays;
import java.util.List;

import br.com.danilopereira.application.filter.FilterPerson;
import br.com.danilopereira.application.filter.FilterStringList;
import br.com.danilopereira.model.Person;

public class Application {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "danilopereira");
		List<Person> persons = Arrays.asList(new Person("danilo", 23), new Person("jose", 44), new Person("maria", 33));
		Person person =  null;
		
		//Normal Java example to filter a List
		List<String> result = FilterStringList.getFilterOutputClassic(lines, "danilopereira");
		for(String temp : result){
			System.out.println(temp);
		}
		
		//The equivalent example in Java 8, using stream.filter() to filter a List, and collect() to convert a stream.
		FilterStringList.getFilterOutputStream(lines, "danilopereira").forEach(System.out::println);
		
		person = FilterPerson.getPersonByNameAndAgeClassic(persons, "danilo", 23);
		
		System.out.println(person);
		
		person = FilterPerson.getPersonByNameStream(persons, "danilo");
		
		System.out.println(person);
		
		List<Person> personsSorted = FilterPerson.orderListByAge(persons);
		
		personsSorted.forEach(System.out::println);

	}

	

}
