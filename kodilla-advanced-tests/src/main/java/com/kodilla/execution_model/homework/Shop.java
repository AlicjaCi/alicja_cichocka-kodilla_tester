package com.kodilla.execution_model.homework;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private  List<Order> orders = new ArrayList<>();

    public  List<Order> getOrders() {
        return orders;
    }

    public void addOrders(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersFromTwoYears(LocalDate startDate) {
        LocalDate endDate = startDate.plusYears(2);
        return orders.stream()
                .filter(order -> !order.getDate().isBefore(startDate) && !order.getDate().isAfter(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersByValueRange(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getPrice() >= minValue && order.getPrice() <= maxValue)
                .collect(Collectors.toList());
    }

    public int getSize() {
        return this.orders.size();
    }

    public  double sumOfAllOrders() {
        double result = 0.0;
        for (Order order : getOrders()) {
            double price = order.getPrice();
            result += price;
        }
        double sum = result;
        return sum;
    }
}
