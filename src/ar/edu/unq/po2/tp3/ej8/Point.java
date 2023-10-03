package ar.edu.unq.po2.tp3.ej8;

public class Point {

	private int x;
	private int y;

	public Point() {
		setXY(0, 0);
	}

	public Point(int x, int y) {
		setXY(x,y);
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}
	
	private void setXY(int x, int y) {
		setX(x);
		setY(y);
	}

	public void movePoint(int x, int y) {
		setXY(x, y);
	}
	
	public void addPoint(int x, int y) {
		setXY(getX() + x, getY() + y);
	}

}
