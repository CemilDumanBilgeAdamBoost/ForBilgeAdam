package com.BilgeAdam.cemil.Example;

import java.util.Scanner;

public class LeFactoriél {


public static void main(String[] args) {
	System.out.println("=================================== ");
	System.out.println("Welcome to the LePetitéFactoriél :) ");
	System.out.println("===================================\n ");
Scanner klavye = new Scanner(System.in);

 System.out.print("Lütfen sayıyı giriniz: ");
 double inp = klavye.nextDouble();
 double fact = 1;

 if (inp == 0) {
	 fact = 1;
 }	 while (inp<0) {
	 System.out.print("\nDoğal sayı girmediniz. \n**Ya da ben yanlış görüyorum.** \nLütfen doğal sayı giriniz: ");
	 inp = klavye.nextDouble();
 }
 while (inp >= 170 ) {
	 System.out.print("\nNe yazık ki Java 170 üstünde patlıyor, sonuç infinity :(( \n\nİsterseniz 170 ve altındaki sayıları deneyebilirsiniz: ");
	 inp = klavye.nextDouble();
 }
	for (double i = 1; i <= inp; i++) {
	fact *= i;
	}
	System.out.println("\nGirilen sayının **FAKTÖRİYEL** Sonucu: " + (int) fact);
	
	 }
}


