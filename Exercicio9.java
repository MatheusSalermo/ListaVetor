import java.util.*;
class Exercicio9{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		int i=0,j=0;
		while(i<10){
			System.out.println("Entre com o "+(i+1)+"� valor do vetor a");
			a[i] = entrada.nextInt();
			System.out.println("Entre com o "+(i+1)+"� valor do vetor b");
			b[i] = entrada.nextInt();
			if(a[i] == b[i]){
				c[j] = a[i];
				j++;
			}
			i++;
		}
		i=0;
		System.out.println("Essa � a intersec��o do seus numeros");
		while(i<j){
			System.out.println(c[i]);
			i++;
		}
	}
}