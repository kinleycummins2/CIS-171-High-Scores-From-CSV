import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class PlayerCSVLoader {
    public static List<Player> loadPlayersFromCSV(String filename)
    {
        List<Player> players = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename)))
        {
            String line;

            //Skipping header
            reader.readLine();

            //Read each line from the file
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split(",");
                String initials = parts[0];
                int score = Integer.parseInt(parts[1]);

                Player player = new Player(initials,score);

                players.add(player);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        return players;
    }
}
