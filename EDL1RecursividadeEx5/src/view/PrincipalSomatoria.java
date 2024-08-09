package view;
import controller.ControllerSomatoria;
public class PrincipalSomatoria {
	public static void main (String [] args) {
		
		ControllerSomatoria m = new ControllerSomatoria();
		double num = 3;
		double soma = m.Somatoria(num);
		System.out.println ("O resultado da somatória quando N = " + num + " é: " + soma);
	}

}
