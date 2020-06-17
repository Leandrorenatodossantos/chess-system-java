package bordgame;

public class Piece {
	//peça que tem posição simples de matriz, não sendo visivel no programa
	protected Position position;
	private Bord bord;
	
	
	public Piece( Bord bord) {
		this.bord = bord;
	}
	protected Bord getBord() {
		return bord;
	}

	
}
