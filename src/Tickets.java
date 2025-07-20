public class Tickets {
    private double price;
    private String movieName;
    private boolean subtitled;
    private int numberOfTickets;

    public Tickets(double price, String movieName, boolean subtitled, int numberOfTickets) {
        this.price = price;
        this.movieName = movieName;
        this.subtitled = subtitled;
        this.numberOfTickets = numberOfTickets;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public boolean isSubtitled() {
        return subtitled;
    }

    public void setSubtitled(boolean subtitled) {
        this.subtitled = subtitled;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return this.price * this.numberOfTickets;
    }

}
