import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String myLocations = """
                lake,at the edge of Lake Bryan,E:ocean,W:forest,S:well house,N:cave
                ocean,on Bryan's beach before an angry sea,W:lake
                cave,at the mouth of Bryan's bat cave,E:ocean,W:forest,S:lake
                """;
        AdventureGame game = new AdventureGame(myLocations);
        game.play("road");

        Scanner s = new Scanner(System.in);

        while(true) {
            String direction = s.nextLine().trim().toUpperCase().substring(0, 1);
            if (direction.equals("Q")) break;
            game.move(direction);
        }

        System.out.println("-".repeat(50) +"\nThanks for playing.");
    }
}
