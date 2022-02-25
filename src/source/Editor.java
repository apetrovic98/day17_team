package source;

import java.util.ArrayList;
import java.util.List;

public class Editor {
	static List<Editor> editors = new ArrayList<>();
	private final String name;
	private final String surname;
	private final String username;
	private final String password;
	private final Role role;
	
	
	
	public Editor(String name, String surname, String username, String password) {
		super();
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
		this.role = Role.EDITOR;
	}
	
	public void add(Editor editor) {
		editors.add(editor);
	}
	
	public void print() {
	
	}
	public void printAll() {
		
	}
	
	public void delete() {
		
	}

	public List<Editor> getEditors(){
		return editors;
	}
}
