package week7;

public class PetEx {

	public static void main(String[] args) {
		
		Pet puppy = new Pet("������", 8);
		System.out.println(puppy.type + "�� " + puppy.age + "�����Դϴ�.");
		
		Pet kitty = new Pet("�����", 13);
		System.out.println(kitty.type + "�� " + kitty.age + "�����Դϴ�.");
		
		Pet bird = new Pet("��", 6);
		System.out.println(bird.type + "�� " + bird.age + "�����Դϴ�.");
		
		System.out.println();
		
		puppy.leg = 4;
		kitty.leg = 4;
		bird.leg = 2;  // leg�� ���� ���� �����ڿ� �� �� �����ϱ� ���� �� ��
		
		System.out.println(puppy.type + " �ٸ��� " + puppy.leg + "���Դϴ�.");
		System.out.println(kitty.type + " �ٸ��� " + kitty.leg + "���Դϴ�.");
		System.out.println(bird.type + " �ٸ��� " + bird.leg + "���Դϴ�.");
		
		
	}

}
