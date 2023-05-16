package streams.exercicios;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercicio2 {
public static void main(String[] args) {
	
	List<String> nomes = Arrays.asList("Aline", "Carlos", "Elaine", "Donna", "Gui", "Ada");

     Predicate<String> nomesMaiores = nM -> nM.length() >= 5;
     Function<String, String> nomesMaiusculos = nomM -> nomM.toUpperCase();
   
    nomes.stream().sorted().filter(nomesMaiores).map(nomesMaiusculos)
    .forEach(System.out::println);
}
}
