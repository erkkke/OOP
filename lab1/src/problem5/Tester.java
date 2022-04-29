package problem5;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DragonLaunch launch = new DragonLaunch();
		
		launch.kidnap(new Person(Gender.GIRL));
		launch.kidnap(new Person(Gender.BOY));
		launch.kidnap(new Person(Gender.GIRL));
		launch.kidnap(new Person(Gender.BOY));
		
		System.out.print(!launch.willDragonEatOrNot() ? "Launch" : "No launch");
			
		
	}

}
