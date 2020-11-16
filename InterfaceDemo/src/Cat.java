
public class Cat implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating canned food today");
	}

	@Override
	public String home() {
		// TODO Auto-generated method stub
		return "Jeff's house";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running across the room");
	}

}
