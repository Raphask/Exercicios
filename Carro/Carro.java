package praticas.desafio;

public class Carro {
private int velocidadeAtual = 0;
public final int velocidadeMaxima;
protected int delta = 5;
 protected Carro(int velocidadeMaxima) {
	this.velocidadeMaxima = velocidadeMaxima;
    
 }

 protected void acelerar() {
	velocidadeAtual += delta;
	if (velocidadeAtual + delta >= velocidadeMaxima) {
		System.out.println(velocidadeMaxima);
	}
	else {
		
	System.out.println(velocidadeAtual);
	}
	
}
 public void frear() {
	if (velocidadeAtual <= delta) {
	velocidadeAtual = 0;
	System.out.println(velocidadeAtual);
	}
	else {
	 velocidadeAtual-= delta;
     System.out.println(velocidadeAtual);

}
}
}
