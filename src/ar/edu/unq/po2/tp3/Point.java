package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point() {
		this.setX(0);
		this.setY(0);
	}
	
	public void moverPunto(int newX, int newY) {
		this.setX(newX);
		this.setY(newY);
	}
	
	public Point sumarCon(int x, int y) {
		int newX = this.getX() + x;
		int newY = this.getX() + y;
		Point newPoint = new Point(newX, newY);
		return newPoint;
	}
	
	// Getters y Setters

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
