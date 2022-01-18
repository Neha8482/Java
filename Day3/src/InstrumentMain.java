
public class InstrumentMain {
	
	public static void main(String[] args) {
		Instrument[] instrument;
		instrument = new Piano[2];
		instrument[0]=new Piano();
		instrument[0].play();
		instrument[1]=new Piano();
		instrument[1].play();
		
		instrument = new Flute[5];
		instrument[0]=new Flute();
		instrument[0].play();
		instrument[1]=new Flute();
		instrument[1].play();
		instrument[2]=new Flute();
		instrument[2].play();
		instrument[3]=new Flute();
		instrument[3].play();
		instrument[4]=new Flute();
		instrument[4].play();
		
		instrument = new Guitar[3];
		instrument[0]=new Guitar();
		instrument[0].play();
		instrument[1]=new Guitar();
		instrument[1].play();
		instrument[2]=new Guitar();
		instrument[2].play();
	}

}
