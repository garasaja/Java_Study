package 쌤스타.terran;

import 쌤스타.Behavior;

public class Tank extends Terran { 
	private String name;
	private int hp;
	public static int attack = 30;
	
	public Tank(String name) {
		this.name = name;
		this.hp = 100;
	}

	@Override
	public void attack(Behavior unit) {
		System.out.println("원거리 대포 공격");
	}	
}
