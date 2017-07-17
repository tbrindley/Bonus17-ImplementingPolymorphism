/**
 * Created by Travis Brindley on 7/17/2017.
 */
public class Wizard extends MagicUsingCharacter {
    int spellNumber;

    public Wizard(String name, int strength, int intelligence, int magicalEnergy, int spellNumber) {
        super(name, strength, intelligence, magicalEnergy);
        this.spellNumber = spellNumber;
    }

    public int getSpellNumber() {
        return spellNumber;
    }

    public void setSpellNumber(int spellNumber) {
        this.spellNumber = spellNumber;
    }

    public String Play(){
        return "Name: " + this.getName() + "\nStrength: " + this.getStrength() +
                "\nIntelligence: " + this.getIntelligence() +"\nMagical Energy: " +
                this.getMagicalEnergy() + "\nSpell Number: " + this.getSpellNumber() +
                "\n";
    }
}
