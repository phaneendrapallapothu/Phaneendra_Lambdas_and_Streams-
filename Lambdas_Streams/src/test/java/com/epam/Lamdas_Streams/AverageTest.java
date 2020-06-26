package com.epam.Lamdas_Streams;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

public class AverageTest {

	Average avgObj=new Average();
	List <Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	List <Integer> list2=Arrays.asList(0,1);
	@Test
	public void testAvgList() {
		assertEquals(5.5,avgObj.avgList(list1),0);
		assertEquals(0.5,avgObj.avgList(list2),0);
	}

}
