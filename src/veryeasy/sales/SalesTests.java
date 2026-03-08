package veryeasy.sales;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SalesTests {
    @Test
    public void test01() {
        assertEquals(25, Sales.discount(100, 75), 5);
    }

    @Test
    public void test02() {
        assertEquals(105.5, Sales.discount(211, 50), 5);
    }

    @Test
    public void test03() {
        assertEquals(231.27, Sales.discount(593, 61), 5);
    }

    @Test
    public void test04() {
        assertEquals(338.6, Sales.discount(1693, 80), 5);
    }

    @Test
    public void test05() {
        assertEquals(630, Sales.discount(700, 10), 5);
    }
}