import java.util.List;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {

        //Giving the path for the csv and loading it
        String filename = "src/players.csv";
        List<Player> players = PlayerCSVLoader.loadPlayersFromCSV(filename);

        //Printing out original player list
        System.out.println("Original Player List:");
        displayPlayers(players);

        //Adding new player
        Player newPlayer = new Player("KLC",700000);
        players.add(newPlayer);

        //Sorting the players again now that one was added
        Collections.sort(players);

        //Removing the lowest score
        players.remove(players.size()-1);

        //Printing out the updated player list
        System.out.println("\nUpdated Player List:");
        displayPlayers(players);

    }

    //Method for displaying the players and their scores
    public static void displayPlayers(List<Player> players)
    {
        int rank = 1;
        for (Player p : players)
        {
            System.out.printf("#%d   %s%n", rank++, p);
        }
    }
}