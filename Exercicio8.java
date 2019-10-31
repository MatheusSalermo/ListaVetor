
	import java.util.Scanner;

	public class Exercicio8 {

	    public static void main(String[] args) {
	      Scanner ler = new Scanner(System.in);

	      
	      int a[] = new int[10];
	      int b[] = new int[10];
	      int i, j, sm;

	      for (i=0; i<10; i++) {
	        System.out.println("Informe o valor "+ (i+1)+":");
	        a[i] = ler.nextInt();
	      }

	      for (i=0; i<10; i++) {
	        sm = 0;
	        for (j=i; j<10; j++) {
	          sm = sm + a[j];
	        }
	        b[i] = sm;
	      }
	      System.out.println("A somatória é:");

	      for (i=0; i<10; i++) {
	        System.out.println(b[i]);
	      }


	    }

	}
