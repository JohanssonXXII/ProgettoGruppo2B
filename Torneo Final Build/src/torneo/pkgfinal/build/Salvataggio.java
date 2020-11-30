/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo.pkgfinal.build;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Salvataggio {
	public static void printToFile(ArrayList<InserimentoGiocatori> list) throws IOException {
		FileWriter fwriter = new FileWriter("Resoconto.txt");
		int count = 1;
		for (InserimentoGiocatori data : list) {
			fwriter.write("Round "+count+" - ");
			fwriter.write(data.toString());
			fwriter.write("\n");
			count++;
		}
		fwriter.close();
	}

}
    

