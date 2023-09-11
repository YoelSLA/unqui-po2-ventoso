package ar.edu.unq.po2.tp3;

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
