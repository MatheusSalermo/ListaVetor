import java.util.*;
class Exercicio12{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		int a[] = new int[11];
		int i=0,j=9,k=0,l=0;
		while(i<10){
			System.out.println("Entre com o "+(i+1)+"º valor do vetor");
			a[i] = entrada.nextInt();
			i++;
		}
		i=0;
		System.out.println("");
		while(l<5){
			if(a[i] == a[j]){		
				k++;	
				System.out.println(k);
			}
			i++;
			j--;
			l++;
		}
		if(k == 5){
			System.out.println("O numero digitado é um palíndromo");
		}
		else{
			System.out.println("O numero digitado não é um palíndromo");
		}
	}
}