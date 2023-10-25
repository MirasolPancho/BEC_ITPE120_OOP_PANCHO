public class MainAct2{
    public static void main(String[] args){
        Car myCar = new Car("Ford","T","Black and White");
        
        myCar.startEngine(); /* Call the overriden method*/
        myCar.honkHorn(); /*Call the car class method*/
        myCar.stopEngine(); /*Call the base class method*/
        
        System.out.println("My car is "+myCar.brand+".");
        System.out.println("The model is "+myCar.model+".");
        System.out.println("The color is "+myCar.color+".");
        
    }
}