package week7;

public class PetEx {

	public static void main(String[] args) {
		
		Pet puppy = new Pet("강아지", 8);
		System.out.println(puppy.type + "는 " + puppy.age + "개월입니다.");
		
		Pet kitty = new Pet("고양이", 13);
		System.out.println(kitty.type + "는 " + kitty.age + "개월입니다.");
		
		Pet bird = new Pet("새", 6);
		System.out.println(bird.type + "는 " + bird.age + "개월입니다.");
		
		System.out.println();
		
		puppy.leg = 4;
		kitty.leg = 4;
		bird.leg = 2;  // leg에 대한 것은 생성자에 안 들어가 잇으니까 직접 해 줌
		
		System.out.println(puppy.type + " 다리는 " + puppy.leg + "개입니다.");
		System.out.println(kitty.type + " 다리는 " + kitty.leg + "개입니다.");
		System.out.println(bird.type + " 다리는 " + bird.leg + "개입니다.");
		
		
	}

}
