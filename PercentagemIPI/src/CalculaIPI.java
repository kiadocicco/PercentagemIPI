import java.util.Scanner;

public class CalculaIPI {

	public static void main(String[] args) {
		/*Calcula IPI*/
		
		Scanner teclado=new Scanner (System.in);
		
		System.out.println("Entre com o valor do IPI");
		float IPI=teclado.nextFloat();
		System.out.println("Entre com o ID da peça 1");
		int ID1=teclado.nextInt();
		System.out.println("Entre com o ID da peça 2");
		int ID2=teclado.nextInt();
		System.out.println("Entre com o valor da peça 1");
		float valorp1=teclado.nextInt();
		System.out.println("Entre com o valor da peça 2");
		float valorp2=teclado.nextInt();
		System.out.println("Entre com a quantidade da peça 1");
		float quantp1=teclado.nextInt();
		System.out.println("Entre com a quantidade da peça 2");
		float quantp2=teclado.nextInt();
		
		float total=(valorp1*quantp1+valorp2*quantp2)*((IPI/100)+1);
		
		System.out.println("O valor total dos produtos é: "+ "R$ "+total);

	}

}
