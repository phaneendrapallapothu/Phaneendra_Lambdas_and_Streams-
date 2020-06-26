package com.epam.Lamdas_Streams;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class IsPalindromesTest {
	
	List<String> testList=new ArrayList<String>(){
		{
			add("adda");
			add("mom");
			add("isthereanyone");
			add("dad");
			add("asantaatnasa");
			add("air");
			add("apple");			
		}
	};
	List<String> result=new ArrayList<String>(){
		{
			add("adda");
			add("mom");
			add("dad");
			add("asantaatnasa");
		}
	};
	IsPalindromes objIP=new IsPalindromes();
	@Test
	public void test() {
		assertEquals(result,objIP.pickupPalindromiStrings(testList));
	}

}
