package com.itf.schulung.gitintro;

import java.util.List;

public class BooleanCalculator {
	
	public boolean and(boolean one, boolean two) {
		return one && two;
	}
	
	public boolean or(boolean one, boolean two) {
		return one || two;
	}
	
	public boolean specialAnd(List<Boolean> boolList) {
		if(boolList == null) {
			return false;
		}
		
		if(boolList.size() == 1) {
			return false;
		}
		
		if(boolList.size() >= 5 && boolList.size() <= 6) {
			return false;
		}
	
		
		boolean andBool = true;
		for(boolean elemt: boolList) {
			andBool = elemt && andBool;
		}
		return andBool;
	}
}
