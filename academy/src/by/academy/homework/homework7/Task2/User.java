package by.academy.homework.homework7.Task2;

public class User extends Person {
	public String login;
	private String password;
	protected String email;

	public User(String login, String password, String email) {
		super();
		this.login = login;
		this.password = password;
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	void printUserInfo() {
		System.out.println("Print user info!");
	}

}
