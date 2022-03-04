package curs3.mostenire;

public class Angajat {

	
	private String name;
	private String email;
	
	//click dreapta source generate getters and setters bifat ambele name si email
	//metode ca sa ti protejezi variabilele in a fi schimbate direct
	//daca e publica poate fi schimbata si o pui private (encapsulate)
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
