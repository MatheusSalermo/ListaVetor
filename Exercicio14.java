import java.util.*;
public class Exercicio14 {
	public static void main(String args[]){
			Scanner entrada = new Scanner(System.in);
			int a[] = new int[10];
			int b[] = new int[10];
			int c[] = new int[10];
			int i=0;
			for(i=0;i<10;i++){
				System.out.println("Essa com o "+(i+1)+" valor do vetor a");
				a[i] = entrada.nextInt();
				System.out.println("Essa com o "+(i+1)+" valor do vetor b");
				b[i] = entrada.nextInt();
				if(a[i] >b[i]){
					c[i] = 1;
				}
				else if(a[i] == b[i]){
					c[i] = 0;
				}
				else if(a[i] <b[i]){
					c[i] = -1;
				}
				
			}
			i=0;
			System.out.println();
			System.out.println("A ordem ficou:");
			for(i=0;i<10;i++) {
				System.out.println(c[i]);
				
			}
		}
	}

