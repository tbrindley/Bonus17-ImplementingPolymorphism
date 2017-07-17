import java.util.ArrayList;
/**
 * Created by Travis Brindley on 7/17/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<GameCharacter> characterList = ListOfCharacters.GetCharacters();

        for(int i=0; i<characterList.size(); i++){
            System.out.println(characterList.get(i).Play());

        }
    }
}
