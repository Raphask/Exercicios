package mercado;

import java.util.ArrayList;

import java.util.Scanner;

public class Caixa {
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
	   for (int i = 0; i < reg1.registro.size();) {
			
		   System.out.printf("%s---------------%.1f-----------------%.2f", 
				   nomeFiscal.get(i),valorFiscal.get(i), totalFiscal.get(i));
			
	   break;
			}
	   break;
			
			}
	   break;
            }
	    
        System.out.println(reg1.registro.get(codigo).nome);
	    System.out.println(reg1.registro.get(codigo).preco);
	    nomeFiscal.add(reg1.registro.get(codigo).nome);
	    
	    System.out.println("Digite a quantidade");
	    valor =  entrada.nextInt();
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