/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo.demo.lunedi;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Classe che si occupa del salvataggio su file esterno , perlopiù dei casi in TXT. il file una volta finita l'esecuzione di trova nella cartella del progetto
 * @author Aimen
 */
public class Salvataggio {
    /**
     * Metodo che se richiamato permette si stampare il resoconto del torneo in un file txt esterno
     * @param list
     * @throws IOException 
     */
	public static void printToFile(ArrayList<GestioneGiocatori> list) throws IOException {
		FileWriter fwriter = new FileWriter("Resoconto.txt");
		int count = 1;
		for (GestioneGiocatori data : list) {
			fwriter.write("Round "+count+" - ");
			fwriter.write(data.toString());
			fwriter.write("\n");
			count++;
		}
		fwriter.close();
	}

}
