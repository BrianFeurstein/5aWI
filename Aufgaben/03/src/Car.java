public class Car {
    public int fuelConsumption;
    public int fuelAmount;
    public String brand;
    public String serialNumber;
    private String color;


    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void vBreak(){
        System.out.println("Ich bremse");
    }

    public void turboBoost(){
        if(this.fuelAmount > this.fuelAmount*0.1){
            System.out.println("SuperBoostMode");
        }
        else{
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk(int amountOfRepetitions){
        for(int i = 0; i < amountOfRepetitions;i++){
            System.out.println("TUUUUT");
        }


    }

    public void getRemainingRange(){
        int range = this.fuelAmount/this.fuelConsumption;
        System.out.println("range: ");
        System.out.print(range);

    }
}
