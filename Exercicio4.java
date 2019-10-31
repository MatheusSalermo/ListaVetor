import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args) {
	      int i, j;
	     int a[] = new int[10];
	      Scanner ler = new Scanner(System.in);
	      for (i=0; i<10; i++) {
	    	  System.out.println("Entre com o "+(i+1)+"º valor");
	        a[i] = ler.nextInt();
	      }
	      System.out.println("{ = Número digitado \n -- = Relação");
	      for (i=0; i<10; i++) {
	   
	        System.out.println("\n{ "+ a[i]);

	    
	        for (j=0; j<=a[i]; j=j+2) { 
	          if (j == 0) {
	             System.out.println("-- " +j);
	          }
	          else {
	        	  System.out.println("-- " + j);
	          }
	          }
	        }

	    
	      }
	    }

	
