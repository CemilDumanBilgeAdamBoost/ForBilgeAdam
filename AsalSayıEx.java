package com.BilgeAdam.cemil.Example;
import java.util.Scanner;
public class AsalSayıEx {


public static void main(String[] args) {
	System.out.println("=================================== ");
	System.out.println("Welcome to the ASALİNATÖR:) ");
	System.out.println("===================================\n ");
	Scanner klavye = new Scanner(System.in);

	System.out.print("Lütfen sayıyı giriniz: ");
	double inp = klavye.nextDouble();
	double sayac = 0;
	while (inp<=0) {
	System.out.print("Lütfen 0'dan büyük bir sayı giriniz: ");
	inp = klavye.nextDouble();
	}
	if (inp == 2 ) {
	System.out.println("Congratulations, Sayı tam bir asalet örneği");
	} else if(inp==1){
	System.out.println("Hüüü :(( Sayınız asal değildir. Sorry not sorry!!");
	} else {
	
	for (double i =inp -1; i>1; i--) {
		
		if ( inp%i == 0){
			sayac ++;
	}
	}
	if (sayac == 0) {
		System.out.println("Congratulations, Sayı tam bir asalet örneği");	
	} else {
		System.out.println("Hüüü :(( Sayınız asal değildir. Sorry not sorry!!");
	}
	}
	
	
}

}
