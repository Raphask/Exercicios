package mercado;

import java.util.HashMap;

public class Registro {
HashMap<String, Produto> registro = new HashMap<String, Produto>();
     
 
      Registro() {
	 this.registro.put("2300f", new Produto("Banana", 2.6));
	 this.registro.put("3400d", new Produto("Mamão", 4.6));
	 this.registro.put("5600a", new Produto("Alecrim", 1.5));
      }
}
