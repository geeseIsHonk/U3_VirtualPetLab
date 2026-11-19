// Part B

public class Game {


    private String name;

    public Game(String name, int happinessIncr, int weightDecr) {
        this.name = name;
        this.happinessIncr = happinessIncr;
        this.weightDecr = weightDecr;
    }

    private int happinessIncr;
    private int weightDecr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHappinessIncr() {
        return happinessIncr;
    }

    public void setHappinessIncr(int happinessIncr) {
        this.happinessIncr = happinessIncr;
    }

    public int getWeightDecr() {
        return weightDecr;
    }

    public void setWeightDecr(int weightDecr) {
        this.weightDecr = weightDecr;
    }


    public boolean isWinner(){

    }


}
