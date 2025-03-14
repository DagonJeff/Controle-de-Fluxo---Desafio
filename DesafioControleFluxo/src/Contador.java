import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {
	
	static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
		
		if(paramUm > paramDois) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		
		int contagem = paramDois - paramUm;
		
		for(int x=1; x<= contagem; x++) System.out.println(x);
		}
		
	public static void main(String[] args) {
		
		int paramUm, paramDois;
		
		Scanner belial = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro");
		paramUm = belial.nextInt();
		
		System.out.println("Digite o primeiro parâmetro");
		paramDois = belial.nextInt();
		
		belial.close();
		
		try {
			contar(paramUm, paramDois);
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

	}

}