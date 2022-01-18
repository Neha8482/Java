public enum Status {

	NEW(10),REJECTED(0),ACCEPTED(80),COMPLETED(100);
	
	int possibility;
	
	private Status(int possibility) {
		this.possibility=possibility;
	}
	
	public int getPossibility() {
		return this.possibility;
	}
}
