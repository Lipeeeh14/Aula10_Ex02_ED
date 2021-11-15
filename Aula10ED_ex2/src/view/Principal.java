package view;

import java.util.LinkedList;

import controller.FuncoesListaDuplaController;

public class Principal {

	public static void main(String[] args) {
		FuncoesListaDuplaController f = new FuncoesListaDuplaController();
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l1.add(1);
		l2.add(2);
		l1.add(3);
		l2.add(4);
		l1.add(5);
		l2.add(6);
		l1.add(7);
		//f.intercalaListas(l1, l2);
		
		l1.add(10);
		l1.add(11);
		f.divideLista(l1, 2);
	}

}
