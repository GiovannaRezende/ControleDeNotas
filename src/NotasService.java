public class NotasService {
    
    public static String verificarAprovacao(double nota, int nAulas, int nFaltas) {
        double limiteFaltas;
        limiteFaltas = nAulas * 25 / 100;
        if (nota < 6 || nFaltas > limiteFaltas) {
            return "reprovado";
        } else {
            return "aprovado";
        }
    }
} //Só são aprovados alunos que tiverem nota igual ou maior que 6

