public class DvdVerleih {
    public double getRentForDays(int daysRented) {
        double price = 0.0;

        if (daysRented > 0) {
            if (daysRented <= 2) {
                price = 2.0;
            } else {
                price = 2 + ((daysRented - 2) * 1.75);
            }
        }
        return price;
    }
}
