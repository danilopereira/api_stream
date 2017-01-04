package br.com.danilopereira.application.filter;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import br.com.danilopereira.model.Person;

public class FilterPerson {

	public static Person getPersonByNameClassic(List<Person> persons, String name) {
		Person result = null;

		for (Person person : persons) {
			if (name.equals(person.getName())) {
				result = person;
			}
		}

		return result;
	}

	public static Person getPersonByNameStream(List<Person> persons, String name) {
		return persons.stream().filter(person -> name.equals(person.getName())).findAny().orElse(null);
	}

	public static Person getPersonByNameAndAgeClassic(List<Person> persons, String name, int age) {
		Person result = null;

		for (Person person : persons) {
			if (name.equals(person.getName()) && age == person.getAge()) {
				result = person;
			}
		}

		return result;
	}

	public static Person getPersonByNameAndAgeStream(List<Person> persons, String name, int age) {
		return persons.stream().filter(person -> name.equals(person.getName()) && age == person.getAge()).findAny().orElse(null);
	}
	
	public static String getNameOfPersonByName(List<Person> persons, String name){
		return persons.stream().filter(person -> name.equals(person.getName())).map(Person::getName).findAny().orElse("");
	}
	
	public static List<Person> orderListByAge(List<Person> persons){
		return persons.stream().sorted(compareByAge).collect(Collectors.toList());
	}
	
	static Comparator<Person> compareByAge = (e1, e2) -> Integer.compare(e1.getAge(), e2.getAge());

}
