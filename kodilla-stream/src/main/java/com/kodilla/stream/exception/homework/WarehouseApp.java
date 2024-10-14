package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("11"));
        warehouse.addOrder(new Order("12"));
        warehouse.addOrder(new Order("13"));
        warehouse.addOrder(new Order("14"));
        warehouse.addOrder(new Order("15"));
        try {
            Order order = warehouse.getOrder("20");
            System.out.println("Order found: " + order.getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Order with this number doesn't exist.");
        }
    }
}
