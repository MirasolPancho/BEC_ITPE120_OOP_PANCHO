public class Car extends Vehicle{
    String color;

    public Car(String brand,String model, String color){
        super(brand,model);
        this.color = color;
    }

    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("The Car is ready to explore.");
    }
    public void honkHorn(){
        System.out.println("The "+color+" car is honking it's horn.");
    }
}