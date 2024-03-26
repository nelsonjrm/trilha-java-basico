public class Excecao {
    public static void main(String[] args) {
        int[] numeros = new int[] { 10, 20, 30, 100 }; //0,1,2,3
        int[] peso = new int[] { 2, 0, 4 };//0,1,2
        try {
            for (int i = 0; i < 4; i++) {
                /*
                 * 10 / 2
                 * 20 / 3
                 * 30 / 4
                 * 100 / 20 -> esse cara aqui vai dispar uma EXCEÇÃO
                 */
                int resultados = numeros[i] / peso[i];
                System.out.printf("%d / %d = %d \n", numeros[i], peso[i], resultados);
                /* 10 / 2= 5 */
            }
            /*
             * System.out.println("Número: ");
             * System.out.println(numeros[5]);
             */
            System.out.println("Mensagem pós exceção");
        } catch (Exception error) {
            System.out.println("Erro da exceção: "+ error.getMessage());
        }
        System.out.println("Mensagem fianl ");
    }
}