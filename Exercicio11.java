import java.util.Scanner;
public class Exercicio11 {
	public static void main(String args[]){
			Scanner ler = new Scanner(System.in);
			int a[] = new int[10];
			int i=0,n,p=1;
			while(i<10){
				System.out.println("Entre com o "+(i+1)+" valor do vetor a");
				a[i] = ler.nextInt();
				i++;
			}
			while(p == 1){
				System.out.println("Digite o numero a pesquisar ");
				n = ler.nextInt();
				i=0;
				while(i<10){
					if(n == a[i]){
						System.out.println("O numero pesquisado foi encontrado na posi��o "+(i+1));
						break;
					}
					if (n!= a[i]){
						System.out.println("N�mero n�o encontrado");
						i=11;
						
					}
				}
				
				
				System.out.println("Algum outro numero? (1-Sim 2-N�o) ");
				p = ler.nextInt();
			}
			
	}
	}

