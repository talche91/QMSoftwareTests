import DreamCar.DreamCarWithoutBug;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class DreamCarWithoutBugTest {

    @Test
    public void testCalculatePrice1() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.00, 3450.00, 6000.00, 1, 10.00);
        double result = dc.calculatePrice();
        double expected = 27450.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCalculatePrice2() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.00, 3450.00, 6000.00, 3, 10.00);
        double result = dc.calculatePrice();
        double expected = 26850.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCalculatePrice3() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.00, 3450.00, 6000.00, 20, 10.00);
        double result = dc.calculatePrice();
        double expected = 26550.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCalculatePrice4() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(-1, 3450.00, 6000.00, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    //    notvalid
    @Test
    public void testCalculatePrice5() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(Double.parseDouble("abc"), 3450.00, 6000.00, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    @Test
    public void testCalculatePrice6() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, -1.0, 6000.0, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    //    notvalid
    @Test
    public void testCalculatePrice7() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, Double.parseDouble("abc"), 6000.0, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    @Test
    public void testCalculatePrice8() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, 3450.0, -1.0, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    //    notvalid
    @Test
    public void testCalculatePrice9() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, 3450.0, Double.parseDouble("abc"), 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    //    notvalid
    @Test
    public void testCalculatePrice10() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, 3450.0, 6000.0, -1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    @Test
    public void testCalculatePrice11() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, 3450.0, 6000.0, Integer.parseInt("abc"), 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    @Test
    public void testCalculatePrice12() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, 3450.0, 6000.0, 1, -1.0);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    @Test
    public void testCalculatePrice13() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, 3450.0, 6000.0, 1, 101.0);
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    //    notvalid
    @Test
    public void testCalculatePrice14() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.0, 3450.0, 6000.0, 1, Double.parseDouble("abc"));
        double result = dc.calculatePrice();
        assertThat(result).isNaN();
    }

    @Test
    public void testCalculatePrice15() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(0.0, 0.0, 0.0, 0, 0);
        double result = dc.calculatePrice();
        double expected = 0.0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void testCalculatePrice16() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(0.01, 0.01, 0.01, 2, 0.1);
        double result = dc.calculatePrice();
        double expected = 0.03;
        assertThat(result).isCloseTo(expected, within(0.01));
    }

    @Test
    public void testCalculatePrice17() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(Double.MAX_VALUE - 0.01, Double.MAX_VALUE - 0.01, Double.MAX_VALUE - 0.01, 4, 99.99);
        double result = dc.calculatePrice();
        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    @Test
    public void testCalculatePrice18() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(Double.MAX_VALUE - 0.01, 3450.0, 6000.0, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    @Test
    public void testCalculatePrice19() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.00, Double.MAX_VALUE - 0.01, 6000.0, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

    @Test
    public void testCalculatePrice20() {
        DreamCarWithoutBug dc = new DreamCarWithoutBug(20000.00, 3450.0, Double.MAX_VALUE - 0.01, 1, 10.00);
        double result = dc.calculatePrice();
        assertThat(result).isGreaterThanOrEqualTo(Double.MAX_VALUE);
    }

}
