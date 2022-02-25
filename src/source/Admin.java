package source;

public class Admin {
	private final String name;
	private final String surname;
	private final String username;
	private final String password;
	private final Role role;
	
	public Admin(String name, String surname, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.role = Role.ADMIN;
	}
	

	
	
	
	
}
