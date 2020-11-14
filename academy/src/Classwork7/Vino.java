package Classwork7;


public class Vino extends Product {                                                                         
String color;                                                                                           

public Vino(String color, String type, int quantity, String tipe, double price, String name) {          
super(price, type, name, quantity);                                                                 
this.color = color;                                                                                 
}                                                                                                       

protected double calcDiscont() {                                                                        
if (quantity > 10) {                                                                           
return 0.85;                                                                                     
}                                                                                                   
return 1;                                                                                           
}                                                                                                       


}                                                                                                           