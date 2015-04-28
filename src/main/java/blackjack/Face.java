package blackjack;

public enum Face {
	UP (true), DOWN (false);
	
	private boolean faceState;
	
	private Face(boolean faceState) {
		this.faceState = faceState;
	}

	public boolean isFaceState() {
		return faceState;
	}
	
}
