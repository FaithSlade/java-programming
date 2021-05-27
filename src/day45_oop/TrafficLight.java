package day45_oop;
//this is just template not do thing
public class TrafficLight {
    String color;
    //this is read only method, displays value of color variable
    public void showColor() {
        System.out.println("current color = " + color);
    }
    //this method updates the value of color variable
    public void changeColor(String newColor) {
        System.out.println("changing color to " + newColor);
        color = newColor;
    }
}
