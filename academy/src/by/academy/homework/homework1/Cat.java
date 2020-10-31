package by.academy.homework.homework1;

public class Cat {
int age;
String nickname;

public void grow(){
	age=age+1;
	}
public void sleep(){
	System.out.println("Cat sleep");
	}
public void eat(){
	System.out.println("Cat eat");
	}
public void walk(){
	System.out.println("Cat walk");
	}
public Cat(){
		}
public Cat(String nickname, int age){
	this.nickname=nickname;
	this.age=age;
	}
}



