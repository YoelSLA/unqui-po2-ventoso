package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	 ArrayList<Integer> integers = new ArrayList<Integer>();
	 
		public void addInteger(int integer) {
			integers.add(integer); 
		}
		
		public int multiplyOfIntegers() {
			return integers.stream().mapToInt(integer -> integer.intValue()).reduce(1, (x,y) -> x * y);
		}
		
		public int subtractOfIntegers() {
			return integers.stream().mapToInt(integer -> integer.intValue()).reduce(0, (x,y) -> x - y);
		}
		
		public int sumOfIntegers() {
			return integers.stream().mapToInt(integer -> integer.intValue()).sum();
		}
		

		


		
}
	
