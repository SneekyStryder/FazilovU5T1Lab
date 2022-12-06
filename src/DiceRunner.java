public class DiceRunner {
    public static void main(String[] args) {
        Dice someDice = new Dice(6);

        someDice.DiceRoll();
        System.out.println(someDice.getDiceSides());
        System.out.println(someDice.getNumRolls());
        System.out.println(someDice.getRecentRoll());
        someDice.setDiceSides(17);
        System.out.println(someDice.getDiceSides());
    }
}
