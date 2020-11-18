package ChocolateFactory;

import java.awt.event.HierarchyBoundsListener;

/**
 * @author bruel (taken from Design Pattren - Head First, O'Reilly, 09/2004)
 */
public class BouilleurChocolat  {
	private boolean vide;
	private boolean bouilli;
	private static BouilleurChocolat instance = new BouilleurChocolat();

	private BouilleurChocolat() {
		vide = true;
		bouilli = false;
		instance = this;
	}

	public static BouilleurChocolat getInstance() {
		return instance;
	}

	public String remplir() {
		if (estVide()) {
			vide = false;
			bouilli = false;
			// remplir le bouilleur du mélange lait/chocolat
			return "Remplissage";
		}
		return "";
	}

	public String vider() {
		if (!estVide() && estBouilli()) {
			// vider le mélange
			vide = true;
			return "Vidage";
		}
		return "";
	}

	public String bouillir() {
		if (!estVide() && !estBouilli()) {
			// porter le contenu à ébullition
			bouilli = true;
			return "Bout";
		}
		return "";
	}

	public boolean estVide() { return vide;}

	public boolean estBouilli() { return bouilli;}
}
