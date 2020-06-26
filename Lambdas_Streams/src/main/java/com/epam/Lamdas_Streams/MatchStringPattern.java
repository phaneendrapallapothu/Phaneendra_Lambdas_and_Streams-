package com.epam.Lamdas_Streams;
import java.util.*;
import java.util.stream.Collectors;
public class MatchStringPattern {

	public List<String> patternMatch(List <String> list)
	{
		return list.stream().filter(string -> (string.charAt(0)=='a' && string.length()==3))
				.collect(Collectors.toList());
	}
}
