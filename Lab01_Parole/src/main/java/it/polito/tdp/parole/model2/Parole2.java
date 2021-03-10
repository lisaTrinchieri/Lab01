package it.polito.tdp.parole.model2;


import java.util.*;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Parole2 implements Comparable<String> {
		
	    private List<String> parole;
		
	     public Parole2() {
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

