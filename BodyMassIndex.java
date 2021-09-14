package com.BilgeAdam.cemil;

public class BodyMassIndex {

	public static void main(String[] args) {

		double BMI; double boy; double kilo; double Ara;
		
		kilo= 70;
		boy= 1.73;
		
		Ara = kilo/boy;
		
		BMI = Ara/boy;
		
		System.out.println("Body Mass Index = " + BMI);
	}

}
