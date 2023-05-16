package streams.exercicios;;

public class Media {
private int quantidade;
private double valor;
double total;
public Media media (double valor) {
	 total += valor;
	quantidade++;
    return this;
}

public double getValor() {
	double media = total / quantidade;
	return media;
}


}
