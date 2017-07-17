/**
 * Created by Travis Brindley on 7/17/2017.
 */
public class Warrior extends GameCharacter {
    private String weaponType;

    public Warrior(String name, int strength, int intelligence, String weaponType) {
        super(name, strength, intelligence);
        this.weaponType = weaponType;
    }

    public String getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }
    public String Play(){
        return "Name: " + this.getName() + "\nStrength: " + this.getStrength()
                + "\nIntelligence: " + this.getIntelligence()
                +"\nWeapon Type: " + this.getWeaponType() +
                "\n";
    }
}
