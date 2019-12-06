package com.revature.eval.java.exercisemain;

import com.revature.eval.java.core.EvaluationService;

public class Main {
	public static void main(String[] args) {
		
		System.out.println(EvaluationService.reverse("example"));
		System.out.println(EvaluationService.acronym("Complementary metal-oxide semiconductor"));
		System.out.println(EvaluationService.getScrabbleScore("StReEt"));
		System.out.println("Phone number string:" + EvaluationService.cleanPhoneNumber("1(206)383-0194"));
		System.out.println(EvaluationService.wordCount("olly olly in come free"));
		System.out.println(EvaluationService.toPigLatin("quick fast run"));
		System.out.println(EvaluationService.isArmstrongNumber(153));
		System.out.println(EvaluationService.checkisprime(13));
		//System.out.println("is 1 prime?: " + EvaluationService.checkisprime(1));
		//System.out.println(EvaluationService.calculatePrimeFactorsOf(875));
		System.out.println(EvaluationService.calculateNthPrime(104743));
	}
}
