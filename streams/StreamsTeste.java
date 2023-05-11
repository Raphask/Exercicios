package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTeste {
public static void main(String[] args) {
	
	List<String> aprovados = Arrays.asList("Bernardo", "Alexandre", "Carlos");
	
	 System.out.println("\nUsando For" );
	for (int i = 0; i < aprovados.size(); i++) { // usando for numa List
		String listaAprovada = aprovados.get(i);
		System.out.println(listaAprovada);
	}
	 System.out.println("\nUsando Foreach" );
     for (String aprov : aprovados) { // usando foreach
		System.out.println(aprov);
	}
    System.out.println("\nUsando Iterador" );
    Iterator<String> iterator = aprovados.iterator(); // usando iterador
    while (iterator.hasNext()) {
		System.out.println( iterator.next());
	}
    System.out.println("\nUsando Stream" );
    Stream<String> stream = aprovados.stream(); // usando Stream
    stream.forEach(System.out:: println);

}
}
