public class Spinner {
    private int numSections;
    private int spinValue;
    private int numSpins;
    private int sumSpins;
    private double averageSpin;

    public Spinner(int numSections) {
        this.numSections = numSections;
    }

    public void Spin() {
        int randomNum = (int) ((Math.random() * numSections - 1) + 1);
        spinValue = randomNum;
        numSpins++;
        sumSpins += spinValue;
        updateAverageSpin();
    }

    public void updateAverageSpin() {
        averageSpin = (double) sumSpins / numSpins;
    }

    public int getSpinValue() {
        return spinValue;
    }

    public int getNumSpins() {
        return numSpins;
    }

    public int getSumSpins() {
        return sumSpins;
    }

    public double getAverageSpin() {
        return averageSpin;
    }
}
