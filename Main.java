import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Usuario.class;

        if (clazz.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = clazz.getAnnotation(Tabela.class);
            String nomeTabela = tabelaAnnotation.nome();
            System.out.println("Nome da tabela: " + nomeTabela);
        } else {
            System.out.println("A annotation @Tabela não está presente na classe.");
        }
    }
}
