public class Parser {
	String form;
	int donne1;
	int donne2;
	int donne3;
	int donne4;
	String nom;
	int[] coords;

	public void separateur(String dimensions) {
		String parts[] = dimensions.split("\\s+");
		this.form = parts[1];
		if ("<CERCLE>".equals(this.form)) {
			this.donne1 = Integer.parseInt(parts[2]);
			this.donne2 = Integer.parseInt(parts[3]);
			this.donne3 = Integer.parseInt(parts[4]);
			this.donne4 = Integer.parseInt(parts[4]);
//			this.coords[0] = Integer.parseInt(parts[2]);
//			this.coords[1] = Integer.parseInt(parts[3]);
//			this.coords[2] = Integer.parseInt(parts[4]);
//			this.coords[3] = Integer.parseInt(parts[4]);			
		} else {
			this.donne1 = Integer.parseInt(parts[2]);
			this.donne2 = Integer.parseInt(parts[3]);
			this.donne3 = Integer.parseInt(parts[4]);
			this.donne4 = Integer.parseInt(parts[5]);
//			this.coords[0] = Integer.parseInt(parts[2]);
//			this.coords[1] = Integer.parseInt(parts[3]);
//			this.coords[2] = Integer.parseInt(parts[4]);
//			this.coords[3] = Integer.parseInt(parts[5]);

		}
	}
}
