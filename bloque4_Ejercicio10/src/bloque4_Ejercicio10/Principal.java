package bloque4_Ejercicio10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		String numInverso;
		Scanner sc=new Scanner(System.in);
		
		do
		{
			System.out.println("Introduzca un n�mero entero >0 para invertirlo");
			num=sc.nextInt();
		}
		while (num<1);
		
		numInverso=numeroInverso(num);
		
		System.out.println("El n�mero inverso a "+num+" es: "+numInverso);
		// A�ado comentario para commit
	}
	
	public static String numeroInverso(int num)
	{
		String numInverso="";
		int cifra;
		
		while (num>0)
		{
			cifra=num%10;
			numInverso=numInverso+cifra;
			num/=10;
		}
		
		return numInverso;
	}
}
