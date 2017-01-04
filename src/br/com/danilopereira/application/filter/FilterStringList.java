package br.com.danilopereira.application.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStringList {
	
	public static List<String> getFilterOutputClassic(List<String> lines, String filter) {
		List<String> result = new ArrayList<>();
		for(String line : lines){
			if(!filter.equals(line)){
				result.add(line);
			}
		}
		return result;
	}
	
	public static List<String> getFilterOutputStream(List<String> lines, String filter){
		return lines.stream().filter(line-> !filter.equals(line)).collect(Collectors.toList());
	}
}
