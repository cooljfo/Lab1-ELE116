import java.awt.Graphics2D;


public class Rectangle extends Forme {

	private int x1, y1, x2, y2;
	
	public Rectangle(int[] coords) {
		x1 = coords[0];
		y1 = coords[1];
		x2 = coords[2];
		y2 = coords[3];
	}
	
	@Override
	public void draw(Graphics2D g) {
		g.drawRect(x1, y1, x2, y2);
	}

}
