package OOP_sem1_3;

public class HotDrink extends BottleOfWatter{
    private double temperature;
    public HotDrink(String name, double cost, double volume, double temperature){
        super(name, cost, volume);
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name = "+super.getName() + "; "+
                "temperature = " + temperature +
                "cost = "+super.getCost()+
                "volume= "+ super.getVolume()+
                '}';
    }
}
