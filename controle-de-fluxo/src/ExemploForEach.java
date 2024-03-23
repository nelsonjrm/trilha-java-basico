//Também usamos o controle de fluxo for each(), para interagir sobre arrays e coleções:
public class ExemploForEach {
    public static void main(String[] args) {
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        for(String aluno : alunos){
            System.out.println("Nome do aluno é " + aluno);
        }
	
    }
}
