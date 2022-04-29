package problem1;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal("Barsik", 2, "woof");
		Animal b = new Animal(); 
		System.out.println(a.showInfo());
		System.out.println(b.showInfo());
		Dog c = new Dog("Sharik", 4, "gav", "Labrador Retriever");
		System.out.println(c);
		Dog d = new Dog();
		System.out.println(d.toString(true));
	}

}
