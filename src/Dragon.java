
public class Dragon {
	private boolean isEvil = false;

	//
	public String gameOutcome() {
		if (this.isEvil) {
			return "You approach the cave, and a sense of dread creeps into the back of your mind."
					+ "\nWhat you're doing here, you don't even remember."
					+ "\nThe stirrings of a large beast echo around the walls as you continue to walk forward."
					+ "\nAnd suddenly you find yourself looking straight into the maw of the dragon."
					+ "\nThe great dragon gets its first meal of the day...";
		} else {
			return "You approach the cave, and a sense of relief flows over your body."
					+ "\nThe scent of cinnamon apple candles wafts around the corner as you reach the main room."
					+ "\nThe great dragon inside beckons you closer with a flick of its tail."
					+ "\nYou bow in greeting, and are given five gems of different colors."
					+ "\nIn a different universe, Thanos awakens...";
		}
	}

	// Get and set for isEvil
	public boolean getIsEvil() {
		return this.isEvil;
	}

	public void setEvil(boolean isEvil) {
		this.isEvil = isEvil;
	}

}
