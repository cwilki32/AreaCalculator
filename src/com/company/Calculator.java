package com.company;

public class Calculator {
//Create a new Java class file (File -> New -> Java Class) named Calculator
//Your Calculator should have (2) properties: width and height (with assessor methods)
//Your calculator should have a method named calculateArea() which:
//Accepts width and height parameters
//Calculates the area of the rectangle
//Returns the area
//modify your program so that your calculator has a shape property, and modify CalaculateArea() to accept shape,
// width, and height. Your method should then calculate the area of the shape depending on whether the shape parameter
// is “triangle” or “rectangle”, and should return the area

    //properties
    private double calcWidth;
    private double calcHeight;
    private String shapeType;

    //assessor methods - width
    public void setCalcWidth(double width) {
        calcWidth = width;

    }
    // assessor method - height
    public void setCalcHeight(double height) {
        calcHeight = height;
    }

    //setter method - shape
    public void setShapeType(String shape) {
        shapeType = shape;
    }

    //get assessor method
    public double getCalcWidth() {

        return calcWidth;
    }

    //get assessor method for height
    public double getCalcHeight() {

        return calcHeight;
    }

    //get assessor method for shape
    public String getShapeType() {
        return shapeType;
    }

    //create a method named calculateArea() which accepts width and height parameters and calculates area

    public double calculateArea() {
    return calcHeight*calcWidth;
    }
}
