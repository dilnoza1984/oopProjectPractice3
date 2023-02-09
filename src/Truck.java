public class Truck extends Vehicle{
    private int noOfAxles;
    public Truck(int distanceTraveled, int noOfAxles) {
        super(distanceTraveled);
        this.noOfAxles = noOfAxles;
        calculateToll();
    }
    public int getNoOfAxles() {
        return noOfAxles;
    }
    public void setNoOfAxles(int noOfAxles) {
        this.noOfAxles = noOfAxles;
    }
    @Override
    public void calculateToll() {
        if (noOfAxles == 4) {
            setToll(0.040 * getDistanceTraveled());
        } else if (noOfAxles == 6) {
            setToll(0.045 * getDistanceTraveled());
        } else if (noOfAxles == 8) {
            setToll(0.048 * getDistanceTraveled());
        } else if (noOfAxles > 8) {
            setToll(0.048 * getDistanceTraveled() + 5 * (noOfAxles - 8));
        }
    }
    @Override
    public String toString() {
        return "Truck " + getDistanceTraveled() + " " + getToll();
    }

}
