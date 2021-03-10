package it.polito.tdp.parole.model;

import java.util.*;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Parole {
	
	//private List<String> parole;
	private TreeMap<String, String> paroleOrdinate;
		
	public Parole() {
		//parole = new LinkedList<String>(); 
		this.paroleOrdinate = new TreeMap<String, String>();
	}
	
	public void addParola(String p) {
		//parole.add(p);
		this.paroleOrdinate.put(p, p);
	}
	
	public List<String> getElenco() {
		
		LinkedList<String> pll = new LinkedList<String>(this.paroleOrdinate.keySet());
		return pll;
	}
	
	public void reset() {
		//parole.clear();
		this.paroleOrdinate.clear();
	}
	
	
	public void eliminaParola(String s)  {
		
	//	int index =0;
		
	//	LinkedList<String> pll = new LinkedList<String>(this.paroleOrdinate.keySet());
		
	//	for(int i =0; i<pll.size(); i++)
	//		if(pll.get(i).equals(s))
	//			index = i;
		
	//	pll.remove(s);
		this.paroleOrdinate.remove(s);		
	}

}
