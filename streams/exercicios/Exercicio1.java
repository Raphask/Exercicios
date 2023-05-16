package streams.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Exercicio1 {
public static void main(String[] args) {
	
	List<Integer> lista = Arrays.asList(2, 4, 8, 9 ,11, 33, 65, 43);
  
	Predicate<Integer> numerosPares = nP -> nP %2 == 0;
    Function<Integer, Double> mapeador = mP -> Math.pow(mP, 2);
	BinaryOperator<Double> redutor = (a, b) -> a + b; 
   System.out.println( lista.stream().filter(numerosPares)
		   .map(mapeador).reduce(redutor).get());
}
}
