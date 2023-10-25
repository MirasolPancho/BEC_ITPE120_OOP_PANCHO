class Vehicle{
    String brand;
    String model;

    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;

        }
        public void startEngine(){
            System.out.println("The " +brand+ " " +model+ " engine's starting.");
    
        }
        public void stopEngine(){
            System.out.println("The " +brand+ " " +model+ " engine's stop.");
    }
}