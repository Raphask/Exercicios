package streams.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioMap {
public static void main(String[] args) {
	List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

	 Consumer<Object> printar = System.out::println;
	 Function<Integer, String> numsNovos = nN -> Integer.toBinaryString(nN);
     nums.stream().map(numsNovos).forEach(printar);
    
  

   UnaryOperator<String> Reverse = rV -> new StringBuilder(rV).reverse().toString();
    nums.stream().map(numsNovos).map(Reverse).forEach(printar);
   
   
   Function<String,Integer> numsDeVolta = nDV -> Integer.parseInt(nDV, 2);
   nums.stream().map(numsNovos).map(numsDeVolta).forEach(printar);

  

}
}
