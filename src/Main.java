class GamesCollection
{
    private String gameName;
    private String company;
    private double price;
    private int MetaCriticScore;
    private String ESRB_Rating;
    public GamesCollection(String gameName, String company, double price, int MC_Score, String ESRB_Rating)
    {
        this.gameName = gameName;
        this.company = company;
        this.price = price;
        this.MetaCriticScore = MC_Score;
        this.ESRB_Rating = ESRB_Rating;
    }

    public void setGameName(String gameName)
    {
        this.gameName = gameName;
    }

    public void setCompany(String company)
    {
            this.company = company;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setMetaCriticScore(int MetaCriticScore)
    {
        MetaCriticScore = MetaCriticScore;
    }

    public void setESRB_Rating(String ESRB_Rating)
    {
        this.ESRB_Rating = ESRB_Rating;
    }

    public String getGameName()
    {
        return gameName;
    }

    public String getCompany()
    {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public int getMetaCriticScore()
    {
        return MetaCriticScore;
    }

    public String getESRB_Rating()
    {
        return ESRB_Rating;
    }

    public void printFullInfo()
    {
        System.out.println("Name of the game: " + getGameName());
        System.out.println("Made by : " + getCompany());
        System.out.println("Made by : " + getPrice() + "$");
        System.out.println("MetaCritic Score: " + getMetaCriticScore() + "/100");
        System.out.println("ESRB age rating : " + getESRB_Rating());
    }
}
public class Main {
    public static void main(String[] args)
    {
        System.out.println("Game 1:\n");
        GamesCollection game1 = new GamesCollection("Call of Duty: Black Ops 3", "Activision", 39.99, 83, "M(Mature)");
        game1.setGameName(game1.getGameName());
        game1.setCompany(game1.getCompany());
        game1.setPrice(game1.getPrice());
        game1.setMetaCriticScore(game1.getMetaCriticScore());
        game1.setESRB_Rating(game1.getESRB_Rating());
        game1.printFullInfo();
        System.out.println("Game 2:\n");
        GamesCollection game2 = new GamesCollection("Sonic Frontiers","SEGA",59.99,71,"E10(Everyone 10+)");
        game2.setGameName(game2.getGameName());
        game2.setCompany(game2.getCompany());
        game2.setPrice(game2.getPrice());
        game2.setMetaCriticScore(game2.getMetaCriticScore());
        game2.setESRB_Rating(game2.getESRB_Rating());
        game2.printFullInfo();
    }
}