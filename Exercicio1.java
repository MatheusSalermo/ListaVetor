import java.util.*;
class Exercicio1{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int a[] = new int[20];
		int b[] = new int[20];
		int i=0,j=0,l=19;
		while(j<20){
			System.out.println("Digite o "+ (j+1)+ "º  valor do vetor:");
			a[i] = entrada.nextInt();
			if(a[i]%2 ==0){
				b[i] = a[i];
				i++;
			}
			else{
				b[l] = a[i];
				l--;
			}
			j++;
		}
		i=0;
		while(i<20){
			System.out.print(b[i]+" ");
			i++;
		}
	}
}