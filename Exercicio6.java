import java.util.Scanner;
public class Exercicio6 {
	 public static void main(String[] args) {
	      int n = 11;
	      int i, potencia = 1, a[] = new int[n];

	      for (i=0; i<n; i++) {
	        a[i] = potencia;
	        System.out.println("2 elevado a "+i+" = "+ a[i]);

	        potencia = potencia * 2;
	      }
	    }

	}


