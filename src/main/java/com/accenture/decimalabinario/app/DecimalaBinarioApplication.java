package com.accenture.decimalabinario.app;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecimalaBinarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecimalaBinarioApplication.class, args);
		 Scanner scanner= new Scanner (System.in);
	        
	       System.out.println("Ingrese numero: ");
	        int decimal=scanner.nextInt();
	        int cociente=decimal;
	        int digito;
	        String binario="";
	        while (cociente>1){
	            digito=cociente%2;
	            cociente=cociente/2;
	            binario=digito+binario;
	        }
	        binario=cociente+binario;
	        System.out.println("El numero " +decimal+ " en binario es: " +binario );
	}

}
