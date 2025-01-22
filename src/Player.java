public class Player implements Comparable<Player>{

    private String initials;
    private int score;

    //Constructor
    public Player(String initials, int score)
    {
        this.initials = initials;
        this.score = score;
    }

    //Getter method for initials
    public String getInitials()
    {
        return initials;
    }

    //Setter method for initials
    public void setInitials(String initials)
    {
        this.initials = initials;
    }

    //Getter method for score
    public int getScore()
    {
        return score;
    }

    //Setter method for score
    public void setScore(int score)
    {
        this.score = score;
    }

    //Override ToString method for formatted output
    @Override
    public String toString()
    {
        return String.format("%-6s %,d", initials, score);
    }

    //Sorting logic by score in descending order
    @Override
    public int compareTo(Player other)
    {
        return Integer.compare(other.score, this.score);
    }
}
