package mercado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Caixa {
@SuppressWarnings("unused")
public static void main(String[] args) {
	
   
	ArrayList<String> nomeFiscal= new ArrayList<>();
	ArrayList<Double> valorFiscal= new ArrayList<>();
	ArrayList<Double> totalFiscal= new ArrayList<>();
	Scanner entrada = new Scanner(System.in);
    Registro reg1 = new Registro();
    
    String codigo = "";
    double total = 0;
    double valorTotal = 0;
    double valor = 0;
     
    while (codigo != "Fim") {
      System.out.println("Digite seu código");
      codigo = entrada.next();
    	 
       if (codigo.equalsIgnoreCase("Fim")) {
			System.out.printf("Total: \n %.2f \n" , total);
			System.out.println("Quer a nota?");
			codigo = entrada.next();
			
			if (codigo.equalsIgnoreCase("Sim")) {
			    System.out.println("Descrição            UN              Vl Total");
			    int i = 0;
			    for (String nome : nomeFiscal) {
			        System.out.printf("%-20s%.1f%20.2f\n",
			                nome,
			                valorFiscal.get(i),
			                totalFiscal.get(i));
			        i++;
			    }
			    break;
			}
	   break;
            }
	    
     
		try {
			System.out.println(reg1.registro.get(codigo).nome);
			System.out.println(reg1.registro.get(codigo).preco);
			 nomeFiscal.add(reg1.registro.get(codigo).nome);
			valorTotal = reg1.registro.get(codigo).preco * valor;
		} catch (NullPointerException e) {
		System.out.println("Código incorreto, reinicie por favor");
		break;
		} catch (Exception e) {
		 System.out.println("Quantidade incorreta, reinicie por favor");
	    } 
	   
		
	   
	  
	    System.out.println("Digite a quantidade");
	     try {
			valor =  entrada.nextInt();
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
		System.out.println("Dígito inválido");
		break;
		}
		 valorFiscal.add(valor);
	   
	    
	    String simbolo = entrada.next();
	    codigo = entrada.next();
	    
	    valorTotal = reg1.registro.get(codigo).preco * valor;
	    totalFiscal.add(valorTotal);
        total += valorTotal; 
        System.out.printf("%.2f \n", total);
	              
    
    }
}
}