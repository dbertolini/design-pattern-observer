import java.util.ArrayList;

public class RedDress implements Observable{
	private ArrayList<Observer> users = new ArrayList<Observer>(); 
	
	public void addObserver(Observer o) {
		this.users.add(o);
	}

	public void removeObserver(Observer o) {
		this.users.remove(o);
	}

	public void notifyObserver() {
		for(Observer user :users) {
			user.update();
		}
	}
}
