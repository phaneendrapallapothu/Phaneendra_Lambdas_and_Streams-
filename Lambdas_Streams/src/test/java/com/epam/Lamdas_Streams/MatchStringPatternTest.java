package com.epam.Lamdas_Streams;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class MatchStringPatternTest {

	List<String> testList=new ArrayList<String>(){
		{
			add("add");
			add("dont");
			add("lie");
			add("ant");
			add("air");
			add("apple");
		}
	};
	List<String> result=new ArrayList<String>(){
		{
			add("add");
			add("ant");
			add("air");
		}
	};
	MatchStringPattern objMSP=new MatchStringPattern();
	@Test
	public void test() {
		assertEquals(result,objMSP.patternMatch(testList));
	}

}
