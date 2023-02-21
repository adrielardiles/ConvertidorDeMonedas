import javax.swing.JOptionPane;

public class General {

	
	
	
	public static void main(String[] args) {
		
		
		//CONVERTIDOR DE MONEDA O TEMPERATURA
		
		
		//DEFINIR OPCIONES
		Object[] opciones = { "convertidor de monedas", "convertidor de temperatura"};
		String[] opcionesdemoneda = {"De Soles a Dolar", "De Soles a Euro", "De Soles a Libras", "De Soles a Yen", "De Soles a Won Coreano", "De Dolares a Soles", "De Euro a soles", "De Libras a Soles"};
		
		
		//VALOR DE 1 SOL EN DISTINTAS MONEDAS
		double Dolar = 0.26;
		double Euro = 0.24;
		double Libras = 0.22;
		double Yen = 35.07;
		double Won_coreano=  338.33;
		
		//Valor DE 1 DE ESTAS MONEDAS EN SOLES
		double rDolar = 3.83;
		double rEuro = 4.09;
		double rLibras = 4.61;
		
		
		
		//Ventana de eleccion CONVERTIDOR
		
		
		
		boolean ciclo = true;
		
		while(ciclo) {
		
		String opcionSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null,opciones,opciones[0]);
		
		

		
		if (opcionSeleccionada == opciones[0]) {
		
			//CONVERTIDOR DE MONEDAS
			String userinput = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir");
			double amount = Double.parseDouble(userinput);
		
			String opcionSeleccionada2 = (String) JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null,opcionesdemoneda,opcionesdemoneda[0]);
			
			double valornuevo = 0;

			double[] valoresDeConversion = {Dolar, Euro, Libras, Yen, Won_coreano, rDolar, rEuro, rLibras};
			String[] monedas = {"Dolares", "Euro", "Libras", "Yen", "Won_coreano", "Soles", "Soles", "Soles"};
			for (int i = 0; i < opcionesdemoneda.length; i++) {
			    if (opcionSeleccionada2.equals(opcionesdemoneda[i])) {
			        valornuevo = amount * valoresDeConversion[i];
			        JOptionPane.showMessageDialog(null, "Tienes $" + valornuevo + " " + monedas[i], "Mensaje", JOptionPane.INFORMATION_MESSAGE);
			        break;
			    }
			}
			
		}

		int respuesta = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea continuar?", "Confirmación", JOptionPane.YES_NO_OPTION);
		
		
		if (respuesta == JOptionPane.NO_OPTION) {
		    ciclo = false;    
		} 
		
		
		

			
	}
		
		
		 
		

  }
	
}

