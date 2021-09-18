package com.BilgeAdam.cemil.Example;

import java.util.Scanner;

public class LeFactoriél {


public static void main(String[] args) {
Scanner klavye = new Scanner(System.in);

 System.out.print("Lütfen sayıyı giriniz: ");
 int inp = klavye.nextInt();
 int fact = 1;

 if (inp == 0) {
	 fact = 1;
 }	 while (inp<0) {
	 System.out.print("Yanlış sayı girdiniz. Lütfen başka sayı giriniz: ");
	 inp = klavye.nextInt();
 }
	for (int i = 1; i <= inp; i++) {
	fact *= i;
	}
	System.out.println("Faktöriyel Sonucu: " + fact);
	
	 }
}


