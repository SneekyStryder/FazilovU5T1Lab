public class Dice {
    private int diceSides;
    private int recentRoll;
    private int numRolls;

    public Dice(int diceSides) {
        this.diceSides = diceSides;
    }

    public void DiceRoll() {
        recentRoll = (int) ((Math.random() * diceSides - 1) + 1);
        numRolls++;
    }

    public int getDiceSides() {
        return diceSides;
    }

    public int getRecentRoll() {
        return recentRoll;
    }

    public int getNumRolls() {
        return numRolls;
    }

    public void setDiceSides(int diceSides) {
        this.diceSides = diceSides;
    }
}
