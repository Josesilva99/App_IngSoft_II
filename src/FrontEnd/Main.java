package FrontEnd;

import java.util.ArrayList;
import BackEnd.*;

public class Main {
	// Variable which charges our rdf file
	public static void main(String[]args) {
		
		Interface interfaz = new Interface("Aplicaci�n de reservas",1080,720);
		
		Franquicia listaMarcas = new Franquicia();

		interfaz.init(listaMarcas.getListaFranquicias());
        interfaz.setResizable(false);
        interfaz.setVisible(true);    
        
      
        
	}	

}
