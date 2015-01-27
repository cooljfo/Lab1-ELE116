import java.awt.Graphics2D;


public abstract class Forme {
	
	private int[] coords;

	public Forme() {
		
	}
	
	public abstract void draw(Graphics2D g);
	
}
