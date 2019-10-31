import java.util.Scanner;
public class Exercicio3 {
public static void main(String[] args) {
	      
	      int i, div, qtdiv; 
	     int a[] = new int[10];
	     Scanner ler = new Scanner(System.in);
	      for (i=0; i<10; i++) {
	    	  System.out.println("Entre com o "+(i+1)+"º valor");
	    	  a[i] = ler.nextInt();
	      }

	      for (i=0; i<10; i++) {
	    
	        qtdiv = 0;

	    
	        for (div=1; div<=a[i]; div++) {
	          if ((a[i] % div) == 0)
	             qtdiv = qtdiv + 1;
	        }

	    
	        if (qtdiv == 2) {
	        	System.out.println(a[i]+" é primo");
	        }
	           
	        else {
	        	System.out.println(a[i]+" não é primo");
	        }
	      }

	    }

	}