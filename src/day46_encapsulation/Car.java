package day46_encapsulation;

public class Car {
    //encapsulated/hidden instance variable
    private String model;
    private int year;
    private int mileage;

    //setter method for model: setter method always void no return
    public void setModel(String carModel){
        model = carModel;
    }

    //getter method for model: getter method usually we use return type
    public String getModel(){
      return model;
    }

    //setter for year
    public void setYear(int year){
        //year = carYear;
        this.year = year;
        //year = year; if you have same will have the problem, java will think it same name
        // so we have to type this.year
        //Ex: this.year = year; then java will store number in parameter in to year up there where we are declare in private
        //this.year => this referring to the instance variable name
        //year => mean parameter that we assigned the number to.
    }

    public int getYear(){
        return year;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public int getMileage(){
        return this.mileage;//this is work too
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
