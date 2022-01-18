public abstract class DesertItem {

	public abstract int getCost();
}

class Candy extends DesertItem{

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 60;
	}
	
}
class Cookie extends DesertItem{

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 70;
	}
	
}
class IceCream extends DesertItem{

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}