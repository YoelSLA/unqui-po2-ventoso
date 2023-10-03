package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class CashRegister {

	private List<Collectible> collectibles;

	public CashRegister() {
		this.collectibles = new ArrayList<Collectible>();
	}

	public double totalAmountToPay() {
		return collectibles.stream().mapToDouble(Collectible::getPrice).sum();
	}

	public List<Collectible> collectibles() {
		return collectibles;
	}



}
