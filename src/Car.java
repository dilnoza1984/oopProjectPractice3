public class Car extends Vehicle{
    private boolean hasTrailer;
    private boolean isHOVPlus3On;
    public Car(int distanceTraveled, boolean hasTrailer, boolean isHOVPlus3On) {
        super(distanceTraveled);
        this.hasTrailer = hasTrailer;
        this.isHOVPlus3On = isHOVPlus3On;
        calculateToll();
    }
    public boolean isHasTrailer() {
        return hasTrailer;
    }
    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }
    public boolean isHOVPlus3On() {
        return isHOVPlus3On;
    }
    public void setHOVPlus3On(boolean isHOVPlus3On) {
        this.isHOVPlus3On = isHOVPlus3On;
    }
    @Override
    public void calculateToll() {
        if (isHOVPlus3On) {
            setToll(0.0);
        } else if (hasTrailer) {
            setToll(0.020 * getDistanceTraveled());
        } else {
            setToll(0.010 * getDistanceTraveled());
        }
    }
    @Override
    public String toString() {
        return "Car " + getDistanceTraveled() + " "  + " $ " + getToll();
    }
}




