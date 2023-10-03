package ar.edu.unq.po2.tp3.ej9;

import ar.edu.unq.po2.tp3.ej8.Point;

public class Square extends Rectangle {

	public Square(Point point, int side) {
		super(new Point(0, 0), side, side);
	}

	public int getSide() {
		return super.getHeight();
	}

	public void setSide(int side) {
		super.setHeight(side);
		super.setWidth(side);
	}
}
