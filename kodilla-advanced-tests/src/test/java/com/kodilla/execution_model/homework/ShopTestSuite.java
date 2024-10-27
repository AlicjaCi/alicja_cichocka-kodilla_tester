package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class ShopTestSuite {
    private Shop shop;

    @BeforeEach
    void init() {
        shop = new Shop();
        shop.addOrders(new Order(150.0, LocalDate.of(2022, 9, 1), "user1"));
        shop.addOrders(new Order(200.0, LocalDate.of(2023, 10, 10), "user2"));
        shop.addOrders(new Order(350.0, LocalDate.of(2024, 5, 27), "user3"));
    }

    @Test
    void shouldAddNewOrder() {
        Order newOrder = new Order(150.0, LocalDate.of(2023, 7, 31), "user4");
        shop.addOrders(newOrder);
        assertEquals(4, shop.getSize());
    }

    @Test
    void shouldReturnOrdersWithinDateRange() {
        List<Order> orders = shop.getOrdersFromTwoYears(LocalDate.of(2022, 10, 19));
        assertEquals(2, orders.size());
    }

    @Test
    void shouldReturnOrdersWithinValueRange() {
        List<Order> orders = shop.getOrdersByValueRange(199.0, 400.0);
        assertEquals(2, orders.size());
    }

    @Test
    void shouldReturnOrderCount() {
        assertEquals(3, shop.getSize());
    }

    @Test
    void shouldReturnTotalValueOfOrders() {
        assertEquals(700.0, shop.sumOfAllOrders());
    }
}
