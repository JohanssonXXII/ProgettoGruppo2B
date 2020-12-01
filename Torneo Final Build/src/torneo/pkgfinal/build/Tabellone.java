package torneo.pkgfinal.build;

import java.util.ArrayList;
import java.util.*;


public class Tabellone {
	protected static int count = 0;
	
	public static InserimentoGiocatori Tournament(InserimentoGiocatori obj) {
		
		ArrayList<Partecipante> list = obj.getList();
		InserimentoGiocatori toReturn = new InserimentoGiocatori();
		Scanner input = new Scanner(System.in);
		int length = list.size();
		int j = (int) Math.floor((int)(Math.log(length) / Math.log(2)));
		j = (int) Math.pow(2, j);
		j = j - 1;
		int i =0;
		int s = j;
