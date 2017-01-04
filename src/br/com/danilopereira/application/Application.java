package br.com.danilopereira.application;

import java.util.Arrays;
import java.util.List;

import br.com.danilopereira.application.classic.FilterStringList;

public class Application {

	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "danilopereira");
		
		//Normal Java example to filter a List
		List<String> result = FilterStringList.getFilterOutputClassic(lines, "danilopereira");
		for(String temp : result){
			System.out.println(temp);
		}
		
		//The equivalent example in Java 8, using stream.filter() to filter a List, and collect() to convert a stream.
		FilterStringList.getFilterOutputStream(lines, "danilopereira").forEach(System.out::println);

	}

	

}
