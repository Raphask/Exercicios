package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
public class Map {
public static void main(String[] args) {
	
	List<Integer> lista = Arrays.asList(1, 2, 3, 5, 6);
	
	Consumer<Integer> print = System.out::println;
	
	lista.stream().map(n -> n*2).forEach(print);

}
}
