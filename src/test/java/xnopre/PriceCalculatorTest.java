package xnopre;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PriceCalculatorTest {

    @Test
    public void should_calculate_price_tax_free() {
        PriceCalculator priceCalulator = new PriceCalculator();

        String totalPrice = priceCalulator.calculate(3, 1.21, 0);

        assertThat(totalPrice).isEqualTo("3.63 €");
    }

    @Test
    public void should_calculate_price_with_tax_5() {
        PriceCalculator priceCalulator = new PriceCalculator();

        String totalPrice = priceCalulator.calculate(3, 1.21, 5);

        assertThat(totalPrice).isEqualTo("3.81 €");
    }

    @Test
    public void should_calculate_price_with_tax_20() {
        PriceCalculator priceCalulator = new PriceCalculator();

        String totalPrice = priceCalulator.calculate(3, 1.21, 20);

        assertThat(totalPrice).isEqualTo("4.36 €");
    }
}
