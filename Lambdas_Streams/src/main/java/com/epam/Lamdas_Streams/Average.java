package com.epam.Lamdas_Streams;
import java.util.*;
import java.util.stream.Collectors;
public class Average {
	
	public double avgList(List <Integer> list)
	{
		return list.stream().mapToDouble(value -> value).average().orElse(0.0);
	}
}