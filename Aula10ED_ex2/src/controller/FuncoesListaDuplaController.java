package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class FuncoesListaDuplaController {

	public FuncoesListaDuplaController() { }
	
	public <T> void intercalaListas(LinkedList<T> l1, LinkedList<T> l2) {
		for (int i = 0; i <= l1.size(); i++) {
			if (i % 2 != 0 && !l2.isEmpty())
				l1.add(i, l2.removeFirst());
		}
		
		if (!l2.isEmpty())
			l1.addAll(l2);
		
		exibeElementosLista(l1);
	}
	
	public <T> void divideLista(LinkedList<T> l1, int quantidadeListas) {
		int qtdeElementos = l1.size() / quantidadeListas;
		LinkedList<T>[] resultado = new LinkedList[quantidadeListas];
		int grupo = 0;
		
		for (int i = 0; i < l1.size(); i++) {
			if (resultado[grupo] == null)
				resultado[grupo] = new LinkedList<T>();
				
			resultado[grupo].add(l1.get(i));
			
			if ((i + 1) % qtdeElementos == 0) {
				exibeElementosLista(resultado[grupo]);
				grupo = grupo + 1;
			}
			
		}			
	}
	
	private <T> void exibeElementosLista(LinkedList<T> l1) {
		for (T valor : l1) System.out.println(valor);
	}
}
