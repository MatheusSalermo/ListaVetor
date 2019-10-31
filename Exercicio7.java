import java.util.Scanner;
public class Exercicio7{
	public static void main(String[]args) {
		int fat,j=0,i;
		int a[] = new int[15];
		int b[] = new int[15];
		Scanner ler = new Scanner(System.in);
	      for (i=0; i<15; i++) {
			  System.out.println("Digite o " +(i+1)+"º valor:");
	        a[i] = ler.nextInt();
	      }

	      for (i=0; i<15; i++) {
	        fat = 1;
	        for (j=1; j<=a[i]; j++) {
	          fat = fat * j;
	        }
	        b[i] = fat;

	        System.out.println(a[i]+"! = "+ b[i]+"\n");
			}
			
			
	}
	
}
