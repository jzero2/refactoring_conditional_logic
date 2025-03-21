package example.refactoring.conditional_logic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShippingCostCalculatorTest {

    @Test
    void testCalculateCostForHeavyWeight() {
        ConditionalLogicExistingClass calculator = new ConditionalLogicExistingClass();
        Order order = new Order(25); // Weight > 20
        double cost = calculator.calculateCost(order);
        assertEquals(25 * 1.5 + 10, cost);
    }

    @Test
    void testCalculateCostForMediumWeight() {
        ConditionalLogicExistingClass calculator = new ConditionalLogicExistingClass();
        Order order = new Order(15); // 10 < Weight <= 20
        double cost = calculator.calculateCost(order);
        assertEquals(15 * 1.2, cost);
    }

    @Test
    void testCalculateCostForLightWeight() {
        ConditionalLogicExistingClass calculator = new ConditionalLogicExistingClass();
        Order order = new Order(5); // Weight <= 10
        double cost = calculator.calculateCost(order);
        assertEquals(5 * 1.0, cost);
    }
}