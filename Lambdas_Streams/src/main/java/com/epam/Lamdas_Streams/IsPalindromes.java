package com.epam.Lamdas_Streams;
import java.util.*;
import java.util.stream.Collectors;
public class IsPalindromes {

	public List<String> pickupPalindromiStrings(List <String> list)
	{
	  return list.stream().filter(value -> isItAPalindrome(value)).collect(Collectors.toList());
	  
	}
	
	static boolean isItAPalindrome(String string)
	{
		int length=string.length();
		boolean flag=true;
		for(int i=0;i<length/2;i++)
		{
			if(string.charAt(i)!=string.charAt(length-i-1))
			{
				flag=false;
				break;
			}
		}
		return flag;
	} 
}
