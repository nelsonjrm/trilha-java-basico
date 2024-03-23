//Controle de Fluxo: --- For---
/*No parâmetro for() -> temos o primeiro bloco de declaração da variável -
 * O segundo bloco é o de validação - (carneirinhos <= 20)
 * O terceiro bloco nesse caso é de incrementação (carneirinhos++) 
*/
public class ExemploFor {
    public static void main(String[] args) {
        for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println("Contando carneirinhos " + carneirinhos + " Carneirinho(s)");
		}

        System.out.println("O garoto acabou dormindo zzzzz");
    }
}
