package stars1.zerg;

import stars1.Behavior;

public abstract class Zerg implements Behavior{
	// �����Ӱ� ���� ġ��� �����佺 ���� �����̱� ������ �߻� Ŭ������ �ٷ� ������ش�

	public void move() {
		System.out.println("�̵�");
	}

	public void repair() {
		System.out.println("�ڿ� ġ��");
	}

	// ������ �ٰŸ� ���Ÿ� �� �ٸ��⶧���� �߻� �޼���θ� ����
	// public abstract void attack();

	public static void upgrade() {
		Hydra.attack++;
		Ultra.attack++;
		System.out.println("�����佺 ���׷��̵� �Ϸ�");
	}

}