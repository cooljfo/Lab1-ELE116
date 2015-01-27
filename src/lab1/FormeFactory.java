
public class FormeFactory {

	public static Forme createForme(String nom, int[] coords) {
		if(nom.equals("<RECTANGLE>") || nom.equals("<CARRE>")){
			return new Rectangle(coords);
		}
		else if(nom.equals("<RECTANGLE>") || nom.equals("<CARRE>")){
			return new Ovale(coords);
		}
		else if(nom.equals("<LINE>")){
			return new Line(coords);
		}
		else return null;
	}
}
