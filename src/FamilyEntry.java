public class FamilyEntry extends Tickets {

    public FamilyEntry(double price, String movieName, boolean subtitled, int numberOfTickets) {

        super(price, movieName, subtitled, numberOfTickets);
    }

    @Override
    public double getTotalPrice () {
        double discount = 1;
        if (super.getNumberOfTickets() > 3) {
            discount = 0.95;
        }
        return super.getTotalPrice() * discount;
    }
}
