package chat;

interface StarUnit {
	
}

abstract class Protoss implements StarUnit{
	abstract int getSh();
}

abstract class Zerg implements StarUnit{
	
}

class Zealot extends Protoss {
	int sh =100;
	@Override
	public int getSh() {
		return sh;
	}
}

class Ultra extends Zerg {
	
	}




public class FinallyEx01 {

	static void check(StarUnit unit) {
		Zealot z = (Zealot)unit;
		System.out.println("���� ����� : " +z.getSh());
	}
	
	public static void main(String[] args) {
		check(new Zealot());
		check(new Ultra());

	}

}
