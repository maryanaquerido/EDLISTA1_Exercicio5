package controller;

public class ControllerSomatoria {
	
	public ControllerSomatoria() {
		super();
	}
	
	public double Somatoria (double num) {
		if (num > 1) { // CONDIÇÃO DE PARADA: QUANDO NUM FOR IGUAL A UM, A RECURSIVA ACABA E DEVE RETORNAR 1 QUE É O VALOR INICIAL DA SÉRIE.
			double soma = 1/num + Somatoria (num-1);
			return soma;
		}
		else
			return 1; 
	}
}

//RELAÇÃO DE CHAMADA DE PASSOS:
//NUM = 3 
//1. SOMATORIA(3) 
//2. DENTRO DE SOMATORIA(3), SOMATORIANUM-1). 
//3. DENTRO DE SOMATORIA(2), SOMATORIA(NUM-1). 
//4. DENTRO DE SOMATORIA(1), SOMATORIA(NUM-1). 
//5. SOMATORIA(0) -> NUM NÃO É >1, VAI PARA O ELSE E RETORNA 1, ENCERRA A RECURSÃO. 

//6. SOMATORIA(1) RETORNA 1 
//7. SOMATORIA(2) RETORNA 1/2 + 1 = 1,5
//8. SOMATORIA(3) RETORNA 1/3 + 1,5 = 1,8333...
//9. SOMA = 1,8333...

