import java.awt.Graphics2D;


public class Ovale extends Forme {

	private int x, y;
	private int width, height;
	
	public Ovale(int[] coords) {
		x = coords[0];
		y = coords[1];
		width = coords[2];
		height = coords[3];
	}
	
	@Override
	public void draw(Graphics2D g) {
		g.drawOval(x, y, width, height);
	}

}
