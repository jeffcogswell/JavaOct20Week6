
public class Interdemo {

	public static void test(Animal pet) {
		System.out.println(pet.home());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("hello");
		Cat fred = new Cat();
		test(fred);
	}

}
