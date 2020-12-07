/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo.demo.lunedi;

/**
 *
 * @author Aimen
 */
import java.util.ArrayList;
import java.util.*;


public class Tabellone {
	protected static int count = 0;
	
	public static GestioneGiocatori Tournament(GestioneGiocatori obj) {
		
		ArrayList<Partecipante> list = obj.getList();
		GestioneGiocatori toReturn = new GestioneGiocatori();
		Scanner input = new Scanner(System.in);
		int length = list.size();
		int j = (int) Math.floor((int)(Math.log(length) / Math.log(2)));
		j = (int) Math.pow(2, j);
		j = j - 1;
		int i =0;
		int s = j;

                  while(i < j) {
			System.out.println("Match numero "+(count+1)+"  "+list.get(i) +" e " +list.get(j));
			System.out.println("Inserisci Risultato per "+list.get(i)+" : ");
			int s1 = input.nextInt();
			System.out.println("Inserisci risultato per "+list.get(j)+" : ");
			int s2 = input.nextInt();
			if(s1 > s2) {
				System.out.println("Il vincitore è : "+list.get(i));
				System.out.println();
				toReturn.addParticepant(list.get(i));
			}else {
				System.out.println("Il vincitore è : "+list.get(j));
				System.out.println();
				toReturn.addParticepant(list.get(j));
			}
			i++;
			j--;
			count++;
		}	
		
		for(int i1 = s+1 ; i1 < list.size() ; i1++) {
			toReturn.addParticepant(list.get(i1));
		}
                
              
                       
		
		return toReturn;
	}





        }