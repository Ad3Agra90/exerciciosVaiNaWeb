package br.com.vainaweb.backend.exercicio_sorteio_mega;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class sorteioMegaSena {
	
	public static void main(String[] args) {
		int a,b, num=0;
		int[]sorteio = {101,102,103,104,105,106,107};
		int []aposta = {101,102,103,104,105,106,107};
		int contador=0, i, j;
	    
		System.out.println("Bem-vindo a loteria VaiNaWeb, fa�a sua aposta e boa sorte!\n");
		
		apostaMega(aposta);  //cliente faz sua aposta
		
		System.out.println("\n\nSorteio da Mega: "); 
		for(a = 0;a < sorteio.length;a++) {
			sorteioNum(a,num,sorteio); //n�meros s�o sorteados e verificados para n�o repetir
			
		}
		for(a=0; a<sorteio.length;a++) {  //n�meros sorteados s�o organizados
		for(b=a+1; b<sorteio.length;b++) {
			if(sorteio[a]>sorteio[b]) {
				num = sorteio[a];
				sorteio[a] = sorteio[b];
				sorteio[b] = num;
			}
		}
	}
			
		    for (a=0;a<sorteio.length;a++) {
		System.out.print(" [" +sorteio[a]+"] "); //n�meros sorteados aparecem na tela
	   }
			
		    for(i=0;i<sorteio.length;i++) {  //comparando a aposta com o sorteio
				for(j=0;j<aposta.length;j++) {
					if(sorteio[i]==aposta[j]) {
						contador++;
					}else {}
					
				}
			
			}
			if(contador==5) {    //Resultados da compara��o
				System.out.println("Parab�ns! Voc� acertou "+contador+" n�meros e acaba de ganhar 10 MIL REAIS!!!");
			} else if(contador==6) {
				System.out.println("Parab�ns! Voc� acertou "+contador+" n�meros e acaba de ganhar 50 MIL REAIS!!!");
			} else if(contador==7) {
				System.out.println("Parab�ns! Voc� acertou "+contador+" n�meros e acaba de ganhar 200 MIL REAIS!!!");
			} else if(contador==1) {
				System.out.println("\n\nInfelizmente n�o foi dessa vez, voc� acertou "+contador+" n�mero");
			} else if(contador==0) {
				System.out.println("\n\nInfelizmente n�o foi dessa vez, voc� n�o acertou nenhum n�mero");
			} else {
			    System.out.println("\n\nInfelizmente n�o foi dessa vez, voc� acertou "+contador+" n�meros");}
			
   }
	public static void sorteioNum(int a,int num,int sorteio[]){
		Random r = new Random();
		num = r.nextInt(101);
		if(num==sorteio[0]) {
			sorteioNum(a,num,sorteio);
		} else if(num==sorteio[1]) {
			sorteioNum(a,num,sorteio);
		} else if(num==sorteio[2]) {
			sorteioNum(a,num,sorteio);
		} else if(num==sorteio[3]) {
			sorteioNum(a,num,sorteio);
		} else if(num==sorteio[4]) {
			sorteioNum(a,num,sorteio);
		} else if(num==sorteio[5]) {
			sorteioNum(a,num,sorteio);
		} else if(num==sorteio[6]) {
			sorteioNum(a,num,sorteio);
		} else {
		sorteio[a]=num;
		}
	}
	public static void apostaMega(int aposta[]) {
		int i,num,j;
		
		Scanner palpite = new Scanner(System.in);
		
		try {
			for (i = 0; i < aposta.length; i++) {
	            System.out.print("Digite o  " + (i + 1) + "� n�mero da aposta: ");
	            num = palpite.nextInt();
	            for(j=0;j<aposta.length;j++) {
	            if(num<0||num>100) {
	            	System.out.print("Escolha um n�mero de 0 a 100\nDigite o  " + (i + 1) + "� n�mero da aposta: ");
    	            num = palpite.nextInt();
    	            j--;
	            }else 
	            	if(num==aposta[j]&&j!=i) {
	            			System.out.print("Esse n�mero j� foi digitado\nDigite o  " + (i + 1) + "� n�mero da aposta: ");
	        	            num = palpite.nextInt();
	        	            j--;
	            	} else { aposta[i]=num;}     
	            		}
	            	}
			}catch (InputMismatchException e) { 
			  System.out.println("Escolha um n�mero de 0 a 100\nVamos come�ar novamente!");
			  apostaMega(aposta);
		  }
			
			System.out.println("\n\nSua aposta �: ");
			for(i=0; i<aposta.length;i++) { //organiza os n�meros da aposta
				for(j=i+1; j<aposta.length;j++) {
					if(aposta[i]>aposta[j]) {
						num = aposta[i];
						aposta[i] = aposta[j];
						aposta[j] = num;
					}
				}
			}
			for (i=0;i<aposta.length;i++) {  //printa a aposta na tela
				System.out.print(" [" + aposta[i] + "] ");
			}
			
			palpite.close();
		}
}
