
public class User implements Observer{

	private String nombre;
	
	public User(String nombre) {
		this.nombre = nombre;
	}
	
	public void update() {
		System.out.println(this.nombre + " - Compró Red Dress");
	}

}
