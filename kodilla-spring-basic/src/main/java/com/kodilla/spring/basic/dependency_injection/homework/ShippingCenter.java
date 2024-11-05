package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private Delivery deliveryService;
    private Notification notificationService;

    public ShippingCenter(Delivery deliveryService, Notification notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
