package Classwork9;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User user = new User("Username", "123456");
user.createQwerty();
User.Query query = user.new Query();
query.printTolog();

	}

}
