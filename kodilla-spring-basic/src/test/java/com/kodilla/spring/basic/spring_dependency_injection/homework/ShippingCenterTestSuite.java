package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldReturnTrueIfSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService beanDelivery = context.getBean(DeliveryService.class);
        boolean message = beanDelivery.deliverPackage("Warsaw", 25.5);
        Assertions.assertTrue(message);
    }
    @Test
    public void shouldReturnFalseIfFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        DeliveryService beanDelivery = context.getBean(DeliveryService.class);
        boolean message = beanDelivery.deliverPackage("Warsaw", 35.5);
        Assertions.assertFalse(message);
    }


}
