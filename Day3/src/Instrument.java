
public abstract class Instrument {
	
	public abstract void play();
	
}

class Piano extends Instrument{
		public void play() {
		System.out.println("tan tan tan tan");
	}
}

class Flute extends Instrument{
	public void play() {
		System.out.println("toot toot toot toot");
	}
	
}

class Guitar extends Instrument{
	
	public void play() {
		System.out.println("tin tin tin tin");
	}
}