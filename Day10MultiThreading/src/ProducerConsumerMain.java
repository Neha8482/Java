
public class ProducerConsumerMain {
public static void main(String[] args) {
	Demo demo = new Demo();
	new Producer(demo);
	new Consumer(demo);
	
}
}


