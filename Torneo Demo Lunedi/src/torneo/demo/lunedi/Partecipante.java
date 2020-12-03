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
public class Partecipante {
	private String fName;
	private String sName;
	
	public Partecipante(String fName, String sName) {
		super();
		this.fName = fName;
		this.sName = sName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	@Override
	public String toString() {
		return this.fName +" " +this.sName;
	}
	

}
