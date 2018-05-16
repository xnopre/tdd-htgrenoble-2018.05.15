package xnopre;

public class PriceCalculator {
    public String calculate(int quantity, double unitPrice, int tax) {
        double totalPrice = quantity * unitPrice;
        double totalPriceWithTax = totalPrice * (1 + tax / 100.0);
        double totalPriceRounded = ((int) (totalPriceWithTax * 100 + 0.5)) / 100.0;
        return totalPriceRounded +" €";
    }
}
