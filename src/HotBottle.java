public class HotBottle extends Product{
    private int temperature;
    private double volume;

    public HotBottle(String name, double price, double volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume + "л, temperature: " + temperature + "°C";
    }
}
