// Part A

public class VirtualPet {

    private String name;
    private int energy;
    private int happy;
    private int weight;
    private int ageY;
    private int ageM;



    public VirtualPet(String name){
        this.name = name;
        this.energy = 0;
        this.happy = 0;
        this.weight = 5;
        this.ageY = 0;
        this.ageM = 0;
    }

    public String getName() {
        return name;
    }

    public String toString(){
        String output = this.name + " 's information: \nEnergy: " + this.energy + " \n Happiness: " + this.happy;
        output += "\n Weight: " + this.weight + "\n Age: " + this.ageM + " months and " + this.ageY + " years";

        return output;
    }

    public void feed(){
        this.energy++;
        this.weight++;

        if(this.energy > 10){
            this.energy = 10;
        }
    }

    public int getEnergyLevel (){
        return this.energy;
    }

    public int getHappinessLevel (){
        return this.happy;
    }

    

}
