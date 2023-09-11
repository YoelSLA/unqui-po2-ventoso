package ar.edu.unq.po2.tp3;

public class Rectangle {

	private Point point;
	private int width;
	private int height;

	public Rectangle(Point point, int width, int height) {
		setPoint(point);
		setWidth(width);
		setHeight(height);
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getArea() {
		return getHeight() * getWidth();
	}

	public int getPerimeter() {
		return (getHeight() + getWidth()) * 2;
	}
	
	public boolean isVertical() {
		return getHeight() > getWidth();
	}
	
	public boolean isHorizontal() {
		return getWidth() > getHeight();
	}
}
