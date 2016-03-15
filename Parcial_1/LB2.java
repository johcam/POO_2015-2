import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int b=1; b<=n; b++){
			 
		int c, j;
		c=sc.nextInt();
		j= sc.nextInt();
		int[] mazo = new int[c];
		int[] puntos= new int[j];
		for(int i=0; i<c; i++){
			mazo[i]=sc.nextInt();
		}
		 int cj=0;
		 int ct=0;
		 int ch=c-1;
		for(int i=0; i<c; i++){
			
			if(mazo[ch]>=mazo[ct]){
				puntos[cj]=puntos[cj]+mazo[ch];
				ch--;
			}else{
				puntos[cj]=puntos[cj]+mazo[ct];
				ct++;
			}
			cj++;
			if(cj>=j){
				cj=0;
			};
			if(ch<ct){
				break;
			}
		}
		int max=0;
		for(int i=0; i<j; i++){
			if(puntos[i]>max){
				max=puntos[i];
			}
		}
		
		System.out.println("Caso #"+b+":");
		int m=1;
		for(int k=0; k<j; k++){
			if(puntos[k]==max){
				System.out.print(m+" ");
			}
			m++;
		}
		System.out.println();
		
		

	}
	}

}
