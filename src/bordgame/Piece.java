package bordgame;

public class Piece {
	//pe�a que tem posi��o simples de matriz, n�o sendo visivel no programa
	protected Position position;
	private Bord bord;
	
	
	public Piece( Bord bord) {
		this.bord = bord;
	}
	protected Bord getBord() {
		return bord;
	}

	
}
