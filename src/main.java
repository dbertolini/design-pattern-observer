
public class main {

	public static void main(String[] args) {

		Observable redDress = new RedDress();
		
		Observer user1 = new User("Maria");
		Observer user2 = new User("Jose");
		
		redDress.addObserver(user1);
		redDress.addObserver(user2);
		
		redDress.notifyObserver();
	}

}
