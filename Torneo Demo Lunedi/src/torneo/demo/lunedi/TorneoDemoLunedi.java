/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo.demo.lunedi;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aimen
 */
public class TorneoDemoLunedi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        ArrayList<InserimentoGiocatori> listaPlayer = new ArrayList<InserimentoGiocatori>();
            Scanner in = new Scanner (System.in);
            System.out.println("In che lingua vuoi utilizzare il programma?\n 1 per Italiano 2 per Inglese");
            int selezionelingua = in.nextInt();

            if(selezionelingua==1){
                InserimentoGiocatori obj = new InserimentoGiocatori();
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il numero di giocatori : ");
		int players = input.nextInt();
                
		for (int i =0;i < players; i++) {
			System.out.println("Inserisci i seguenti dati del partecipante ["+(i+1)+"] : ");
			System.out.print("Nome : ");
			String fname = input.next();
			System.out.print("Cognome: ");
			String sname = input.next();
                        obj.addParticepant(new Partecipante(fname,sname));  
		}
                
                
                
                
                System.out.println("Vuoi salvare i giocatori?\n 1 - si 0 - no");
                int save = input.nextInt();
                if(save==1){
                    try {
                FileOutputStream fileOut = new FileOutputStream("Salvataggio.txt");
                ObjectOutputStream out = new ObjectOutputStream (fileOut);
                
                out.writeObject(obj);
                out.close();
                fileOut.close();
                System.out.println("Salvataggio in corso dei giocatori");
                
                } catch(IOException i){              
                }
                }
                        
                
                
                
		listaPlayer.add(obj);
		InserimentoGiocatori res = obj;
                
                if(players <= 1){
                    System.out.println("Non si può svolgere un torneo con una sola persona");
                    
                }
                
		while(players > 1) {
			System.out.println();
			
			if(res.getList().size() == 4) {
				System.out.println("Semifinale");
			}else if(res.getList().size() == 2) {
				System.out.println("Finale");
			}else if(res.getList().size() == 8) {
				System.out.println("Quarti di finale");
			}else {
				System.out.println("Round of "+res.getList().size()+" Partecipanti");	
			}
			
			System.out.println();
			res = Tabellone.Tournament(res);
			listaPlayer.add(res);
			System.out.println();
			System.out.println();
			players = res.getList().size();
		}
		
		Salvataggio.printToFile(listaPlayer);
                
            }
            else if(selezionelingua==2){
                InserimentoGiocatori obj = new InserimentoGiocatori();
		Scanner input = new Scanner(System.in);
                
		System.out.println("Please put the number of challengers : ");
		int players = input.nextInt();
                
		for (int i =0;i < players; i++) {
			System.out.println("Please put the following data for the challenger  ["+(i+1)+"] : ");
			System.out.print("Nome : ");
			String fname = input.next();
			System.out.print("Cognome: ");
			String sname = input.next();
			obj.addParticepant(new Partecipante(fname,sname));
		}
		listaPlayer.add(obj);
		InserimentoGiocatori res = obj;
                
                if(players <= 1){
                    System.out.println("The tournament can't start with only one person");
                }
                
		while(players > 1) {
			System.out.println();
			
			if(res.getList().size() == 4) {
				System.out.println("Semi-final");
			}else if(res.getList().size() == 2) {
				System.out.println("Final");
			}else if(res.getList().size() == 8) {
				System.out.println("Quarter Final");
			}else {
				System.out.println("Round of "+res.getList().size() );	
			}
			
			System.out.println();
			res = Tabellone.Tournament(res);
			listaPlayer.add(res);
			System.out.println();
			System.out.println();
			players = res.getList().size();
		}
		
		Salvataggio.printToFile(listaPlayer);
            }
    }
    
}
