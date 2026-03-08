package sales;

public class Sales {
    // price = 1500 percentage = 50 Comments
    public static double discount(int price, int percentage) {
        // we created a new variable this is comments it can't be seen by compiler
        int reductionPrice = price*percentage/100;
        return price-reductionPrice;
    }
}
