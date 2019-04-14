package lib.src.echec;
import java.util.ArrayList;


public class Pile {
	ArrayList<Undo> pile;
	int indice;
	
	public Pile() {
		this.pile = new ArrayList<Undo>();
		this.indice = -1;
	}
	
	public void addPile(String coup) {
		this.pile.add(new Undo(coup));
		this.indice++;
	}
	
	public void addPile(String coup, Piece piece) {
		this.pile.add(new Undo(coup, piece));
		this.indice++;
	}
	
	public Undo pick() {
		return pile.get(this.indice);
	}
	
	public Undo depile() {
		if (indice < 0)	return null;
		
		Undo tmp = this.pick();
		this.pile.remove(this.indice);
		indice--;
		return tmp;
	}
}