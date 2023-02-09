public class PoliceCruiser extends Vehicle{
    public PoliceCruiser(int distanceTraveled) {
        super(distanceTraveled);
        calculateToll();
    }
    @Override
    public void calculateToll() {
        setToll(0);
    }
    @Override
    public String toString() {
        return "PoliceCruiser " + getDistanceTraveled() + " " + " $ " + getToll();
    }
}
