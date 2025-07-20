public class HalfEntry extends Tickets {

    public HalfEntry(double price, String movieName, boolean subtitled, int numberOfTickets) {

        super(price, movieName, subtitled, numberOfTickets);

    }

    @Override
    public double getTotalPrice() {
        double precoBaseUnitario = super.getPrice();

        double precoMeiaUnitario = precoBaseUnitario / 2;

        return precoMeiaUnitario * getNumberOfTickets();
    }
}
