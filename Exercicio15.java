import java.util.*;
public class Exercicio15 {
	public static void main (String[]args) {
		Scanner leia = new Scanner (System.in);
		int a [] = new int [10]; 
		int b [] = new int [10];
		int c [] = new int [10];
		int d=3, i=0;
		
		int comp = 0;
		int aux;
		
		for(i = 0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A:");
			a[i] = leia.nextInt();
						
		}
		
		Arrays.sort(a);
		for(i = 0;i<10 ;i++) {
			b[i ] = a[i];
			c[i] = a[i];
	}
		System.out.println("N�meros vetor B em ordem crescente:");
		for(i = 0;i<10 ;i++) {
			System.out.println("Vetor B = "+b[i]);
		
		}
		System.out.println("\nN�meros vetor C em ordem crescente:");
		for(i = 9;i>=0 ;i--) {
			System.out.println("Vetor C = "+c[i]);
		
		}
}
}