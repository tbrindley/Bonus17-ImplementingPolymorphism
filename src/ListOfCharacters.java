import java.util.ArrayList;

/**
 * Created by Travis Brindley on 7/17/2017.
 */
public class ListOfCharacters {
    public static ArrayList<GameCharacter> GetCharacters(){
        ArrayList<GameCharacter> characterList = new ArrayList();

        for(int i = 1; i <= 5; i++){
            characterList.add(ListOfCharacters(i));
        }
        return characterList;
    }

    public static GameCharacter ListOfCharacters(int index){
        switch(index){
            case 1: return new Warrior("Fred the Warrior",99,1,"Stick");
            case 2: return new Warrior("Bill the Warrior",98,2,"Sharp Stick");
            case 3: return new Wizard("Will the Wizard",1,99,34,15);
            case 4: return new Wizard("Billy-Bob McWizardstein",22,78,1,22);
            case 5: return new Wizard("Harry Potter",53,80,22,98);
            default:return null;
        }
    }
}
