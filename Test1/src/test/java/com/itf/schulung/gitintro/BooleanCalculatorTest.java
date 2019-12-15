package com.itf.schulung.gitintro;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BooleanCalculatorTest {

	// TODO: Raise Boolean Calculator Test to 100% Coverage
	BooleanCalculator boolCalc = new BooleanCalculator();

	

	@Test
	
	public void andOperator() {

		assertEquals(true, boolCalc.and(true, true));
		assertEquals(false, boolCalc.and(false, false));
		assertEquals(false, boolCalc.and(false, true));
		assertEquals(false, boolCalc.and(true, false));

	}
	
	@Test
	
	public void orOperator() {
		
		assertEquals(true, boolCalc.or(true, false));
		assertEquals(true, boolCalc.or(true, true));
		assertEquals(false, boolCalc.or(false, false));
		assertEquals(true, boolCalc.or(false, true));
		
	}
	
	@Test
	
	public void specialAnd() {
		List<Boolean>booleanList=null;
		assertEquals(false, boolCalc.specialAnd(booleanList));
		
		booleanList= new ArrayList<Boolean>();
		assertEquals(true, boolCalc.specialAnd(booleanList));
		
		booleanList.add(true);
		assertEquals(false,boolCalc.specialAnd(booleanList));
		
		booleanList.add(true);
		booleanList.add(true);
		booleanList.add(true);
		assertEquals(true,boolCalc.specialAnd(booleanList));
		
		booleanList.add(true);
		assertEquals(false,boolCalc.specialAnd(booleanList));
		
		booleanList.add(true);
		assertEquals(false,boolCalc.specialAnd(booleanList));
		
		booleanList.add(true);
		assertEquals(true,boolCalc.specialAnd(booleanList));
		
		booleanList.add(false);
		assertEquals(false,boolCalc.specialAnd(booleanList));
		
		booleanList.add(true);
		assertEquals(false,boolCalc.specialAnd(booleanList));
		
	}
			
		
		
	

}
