package com.company;

public class Main {
//Create a new Java class file (File -> New -> Java Class) named Calculator
//Your Calculator should have (2) properties: width and height (with assessor methods)
//Your calculator should have a method named calculateArea() which:
//Accepts width and height parameters
//Calculates the area of the rectangle
//Returns the area
//In your Main class, create and instance of Calculator and test your calculateArea() method
//Bonus: modify your program so that your calculator has a shape property, and modify CalaculateArea() to accept shape,
// width, and height. Your method should then calculate the area of the shape depending on whether the shape parameter
// is “triangle” or “rectangle”, and should return the area
    public static void main(String[] args) {
	// need to invoke a new shape calculator

        Calculator myShape1 = new Calculator();
        Calculator myShape2 = new Calculator();

        //set each instance variable and get their values
        myShape1.setShapeType("Triangle"); //setting first shape
        myShape1.setCalcWidth(75); // setting shape height
        myShape1.setCalcHeight(100); //setting shape height

        myShape2.setShapeType("Rectangle"); // setting second shape
        myShape2.setCalcHeight(5); //setting second height
        myShape2.setCalcWidth(11); //setting second height

        System.out.println("The area of a " + myShape1.getShapeType() + " is " + myShape1.calculateArea());
        System.out.println("The area of a " + myShape2.getShapeType() + " is " + myShape2.calculateArea());
    }
}
