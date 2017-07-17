import java.util.ArrayList;
/**
 * Created by Travis Brindley on 7/17/2017.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<GameCharacter> gameCharacters = ListOfCharacters.GetCharacters();

        for(int i=0; i<gameCharacters.size(); i++){
            System.out.println(gameCharacters.get(i).Play());

        }
    }
}
