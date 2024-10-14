package com.kodilla.stream.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WarehouseTest {
    @Test
    public void testGetOrder_WithException()  {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("10"));
        warehouse.addOrder(new Order("11"));
        warehouse.addOrder(new Order("12"));
        assertThrows(OrderDoesntExistException.class, () -> {warehouse.getOrder("20");});
    }


}