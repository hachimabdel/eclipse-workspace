package clasefile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FlujoCaracteres1 {

	public static void main(String[] args) {
		// Nombre del archivo donde se escribirá
		String nF = "hola_mundo.txt";

		try {
			// Crear el objeto FileWriter que permite escribir en el archivo
			FileWriter fw = new FileWriter(nF);
			BufferedWriter br = new BufferedWriter(fw);

			// Escribir "Hola Mundo" en el archivo
			br.write("Hola Mundo");
			fw.write("Hola Mundo ");

			// Cerrar el FileWriter para liberar recursos
			br.close();
			fw.close();
			
			//Confirmacion de la escritura
			System.out.println("Se ha escrito 'Hola Mundo' en el archivo: " + nF);

		} catch (IOException e) {
			System.out.println("Error al escribir en el archivo.");
			e.printStackTrace();
		}

	}

}
