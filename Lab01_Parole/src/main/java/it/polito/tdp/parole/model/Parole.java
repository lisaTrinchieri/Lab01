package it.polito.tdp.parole.model;

import java.util.*;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Parole implements Comparable<String>{   
	
/*	private TreeMap<String, String> paroleOrdinate;
		
	public Parole() {
		this.paroleOrdinate = new TreeMap<String, String>();
	}
	
	public void addParola(String p) {
		this.paroleOrdinate.put(p, p);
	}
	
	public List<String> getElenco() {
		
		LinkedList<String> pll = new LinkedList<String>(this.paroleOrdinate.keySet());
		return pll;
	}
	
	public void reset() {
		this.paroleOrdinate.clear();
	}
	
	
	public void eliminaParola(String s)  {
		
		this.paroleOrdinate.remove(s);		
	}    */ 
	
	private List<String> parole;
	
    public Parole() {
		parole = new LinkedList<String>();
	}
	
	public void addParola(String p) {
		parole.add(p);
	}
	
	public List<String> getElenco() {
		
		Collections.sort(this.parole);
		
		return this.parole;
	}
	
	public void reset() {
		this.parole.clear();
	}
	
	
	public void eliminaParola(String s)  {
		
		int index =0;
		
		for(int i =0; i<parole.size(); i++)
			if(parole.get(i).equals(s))
				index = i;
		
		parole.remove(index);
		
	}

	@Override
	public int compareTo(String str) {
		return this.compareTo(str);
	}
	
	

}
