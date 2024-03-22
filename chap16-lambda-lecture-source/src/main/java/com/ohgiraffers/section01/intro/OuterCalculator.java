package com.ohgiraffers.section01.intro;

public interface OuterCalculator {
	
	@FunctionalInterface
	public interface Addition {
		int addTwoNumber(int a, int b);
	}
	
	@FunctionalInterface
	public interface Substraction {
		int subtractTwoNumber(int a, int b);
	}
	
	@FunctionalInterface
	public interface Multiplication {
		int multiplyTwoNumber(int a, int b);
	}
	
	@FunctionalInterface
	public interface Division {
		int divideTwoNumber(int a, int b);
	}
}
