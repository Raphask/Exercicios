package streams.exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProdutoTeste {
public static void main(String[] args) {
	
	Produto prod1 = new Produto("Geladeira", 4300.00, 0.3);
	Produto prod2 = new Produto("Notebook", 5600.00, 0.1);
	Produto prod3 = new Produto("TV", 3000.00, 0.2);
	Produto prod4 = new Produto("Fogão", 500.00,0.4 );
	Produto prod5 = new Produto("Impressora", 1200.00, 0.65);
	Produto prod6 = new Produto("Celular", 1500.00, 0.23);
	
	List<Produto> produtos = Arrays.asList(prod1,prod2,prod3,prod4,prod5,prod6);
			
	Predicate<Produto> precoMaior = pM -> pM.precoProduto >= 1000;
	Predicate<Produto> desconto = d -> d.desconto >= 0.30;
	Predicate<Produto> frete = f -> f.precoProduto >= 1200;
	 BinaryOperator<Double> soma = (a, b) -> a + b;
	 Function<Produto, Double> chamada = ch -> ch.precoProduto;
	
	produtos.stream().filter(precoMaior).filter(desconto).filter(frete).map(chamada)
	.reduce(soma).ifPresent(System.out::println);
	
     
	 } 
}



