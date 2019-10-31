import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		 int a[] = new int[5];
		 int i, j,mult;
		 Scanner ler = new Scanner(System.in);
		 for (i=0; i<5; i++) {
			 System.out.println("Entre com o "+(i+1)+"º valor");
		        a[i] = ler.nextInt();
		      }
		 for(i=0;i<5;i++) {
		System.out.println("A tabuada de "+ a[i]+" é:");
			 for(j=0;j<=10;j++) {
				mult = a[i] * j;
			 System.out.println(a[i]+"X"+j+"="+mult);
			 }
			 
		 }
	
	
	
	}
}
