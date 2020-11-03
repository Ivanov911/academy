package by.academy.homework.homework1;

import java.util.Scanner;

public class Cat {
int age;
String nickname;
int money;
String initials;
String isHomeAnimal;

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
public Cat(String nickname){
	this.age=3;
	this.nickname=nickname;
		}
public void setMoney(int money){
	this.money=money;
}

public int getMoney() {
	return money;
}

public void setInitials(){
	initials= nickname.substring(0,1);
}

public String getInitials() {
	return initials;
}

/*
public String getInitials1() {
return initials=nickname.substring(0,1);
}
*/

public void setIsHomeAnimal(String isHomeAnimal){
	this.isHomeAnimal= isHomeAnimal;
}

public String isHomeAnimal() {
	return isHomeAnimal;
}

/*public void setIsHomeAnimal1(){
	System.out.println("кот домашний?");
	Scanner sc=new Scanner(System.in);
	if (!sc.hasNextInt()){
	isHomeAnimal= sc.nextLine();
	sc.close();
	}*/

}






