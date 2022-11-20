public class Hotdrink extends Product{
    Double volume;
    Double temperature;
    public Hotdrink(String name, Double cost, Double volume, Double temperature) {
        super(name, cost);
        this.volume=volume;
        this.temperature=temperature;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + super.getName() + '\'' +
                ", volume=" + volume + '\'' +
                ", temperature=" + temperature + '\'' +
                '}';
    }
}
