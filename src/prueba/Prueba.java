package prueba;

import java.util.logging.Logger;
import java.util.logging.Level;

public class Prueba {
	
	public static void main(String[] args){
		Logger logger = Logger.getLogger(Prueba.class.getName());
		String ingredientePrincipal = args[0];
		
		switch(ingredientePrincipal){
			case "tomate":				
				logger.log(Level.INFO, "picar");
				logger.log(Level.INFO, "picar");
				break;
			case "huevo":
				logger.log(Level.INFO, "freir");
				break;			
			default:
				logger.log(Level.INFO, "abrir");			
		}
				
	}

}
