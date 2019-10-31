import java.util.Scanner;
public class Exercicio5 {
	 public static void main(String[] args) {
	      
	      int a[] = new int[10], i, div;
	      Scanner ler = new Scanner(System.in);
	      for (i=0; i<10; i++) {
	    	  System.out.println("Entre com o "+(i+1)+"º valor");
	        a[i] = ler.nextInt();
	      }

	     
	      for (i=0; i<10; i++) {
	        System.out.println( "\n Número digitado "+a[i]);

	        for (div=1; div<=a[i]; div++) {
	          if ((a[i] % div) == 0)
	             if (div == a[i]) {
	            	 
	             
	                System.out.println("Divisor: "+ div);
	             }
	             else {
	            	 System.out.println("Divisor: "+ div);
	             }
	        }

	       
	      }
	      
	    }

	
}
