/**
 * Created by Travis Brindley on 7/17/2017.
 */
public class MagicUsingCharacter extends GameCharacter{
    int magicalEnergy;

    public MagicUsingCharacter(String name, int strength, int intelligence, int magicalEnergy) {
        super(name, strength, intelligence);
        this.magicalEnergy = magicalEnergy;
    }

    public int getMagicalEnergy() {
        return magicalEnergy;
    }

    public void setMagicalEnergy(int magicalEnergy) {
        this.magicalEnergy = magicalEnergy;
    }


    public String Play(){
        return "Name: " + this.getName() + "\nStrength: " + this.getStrength() + "\nIntelligence: " + this.getIntelligence() +"\nMagical Energy: " + this.getMagicalEnergy() +
                "\n";
    }
}
