package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {

	private ArrayList<Integer> numbers = new ArrayList<>();

	public ArrayList<Integer> getNumbers() {
		return numbers;
	}

	public void addNumber(int number) {
		numbers.add(number);
	}

	public int getEvenNumbers() {
		return (int) numbers.stream().filter(number -> number % 2 == 0).count();
	}

	public int getOddNumbers() {
		return (int) numbers.stream().filter(number -> number % 2 != 0).count();
	}

	public int getMultipliersOf(int numberMultiply) {
		return (int) numbers.stream().filter(number -> number % numberMultiply == 0).count();
	}

	public int getNumberWithMoreEvenDigitsOf(int[] numbers) {
		int elderNumber = 0;
		int elderEvenDigits = 0;

		for (int numero : numbers) {
			if (getEvenDigitsOf(numero) > elderEvenDigits) {
				elderEvenDigits = getEvenDigitsOf(numero);
				elderNumber = numero;
			}
		}
		return elderNumber;
	}

	private int getEvenDigitsOf(int number) {
		int accountant = 0;
		if (number == 0) {
			return 1;
		}
		while (number != 0) {
			int digit = number % 10;
			if (digit % 2 == 0) {
				number++;
			}
			number = number / 10;
		}
		return accountant;
	}
	
	public int findCommonMulticipyBetween(int x, int y) {
        for (int i = 1000; i >= 0; i--) {
            if (i % x == 0 && i % y == 0) {
                return i;
            }
        }
        return -1;
    }

}
