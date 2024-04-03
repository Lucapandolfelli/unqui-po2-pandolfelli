package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> list = new ArrayList<Integer>();
	
	public void addNumber(int n) {
		list.add(n);
	}
	
	public int getEvenOcurrences() {
		int evenCount = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 == 0) {
				evenCount++;
			}
		}
		return evenCount;
	}
	
	public int getOddOcurrences() {
		int oddCount = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) % 2 != 0) {
				oddCount++;
			}
		}
		return oddCount;
	}

}
