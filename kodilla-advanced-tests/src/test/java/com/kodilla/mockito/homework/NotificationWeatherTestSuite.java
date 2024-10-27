package com.kodilla.mockito.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationWeatherTestSuite {
    private NotificationWeather service;
    private Person person1;
    private Person person2;
    private String locationWarsaw;
    private String locationCracow;

    @BeforeEach
    public void beforeEachTest() {
        service = new NotificationWeather();
        person1 = Mockito.mock(Person.class);
        person2 = Mockito.mock(Person.class);
        locationWarsaw = "Warsaw";
        locationCracow = "Cracow";
    }

    @Test
    public void shouldSubscribePersonToTheLocation() {
        Notification notification = person -> person.receive("Alert");
        service.subscribe(locationWarsaw,person1);
        service.subscribe(locationWarsaw, message -> System.out.println("Person 1 received: " + message));
        service.notifyLocation(locationWarsaw, notification);
        Mockito.verify(person1).receive("Alert");
    }

    @Test
    public void shouldNotSendNotificationUnsubscribedPerson() {
        Notification notification = person -> person.receive("Alert");
        service.subscribe(locationWarsaw, person1);
        service.unsubscribe(locationWarsaw, person1);
        service.notifyLocation(locationWarsaw, notification);
        Mockito.verify(person1, Mockito.never()).receive("Alert");
    }

    @Test
    public void shouldSendNotificationToAllPersons() {
        Notification notification = person -> person.receive("Alert");
        service.subscribe(locationWarsaw, person1);
        service.subscribe(locationWarsaw, person2);
        service.subscribe(locationWarsaw, message -> System.out.println("Person 1 received: " + message));
        service.subscribe(locationCracow, message -> System.out.println("Person 2 received: " + message));
        service.notifyAll(notification);
        Mockito.verify(person1).receive("Alert");
        Mockito.verify(person2).receive("Alert");
    }

    @Test
    public void shouldSendNotificationToOnlySubscribersOfSpecificLocation() {
        Notification notification = person -> person.receive("Alert");
        service.subscribe(locationWarsaw, person1);
        service.subscribe(locationCracow, person2);
        service.subscribe(locationWarsaw, message -> System.out.println("Person 1 received: " + message));
        service.subscribe(locationCracow, message -> System.out.println("Person 2 received: " + message));
        service.notifyLocation(locationWarsaw, notification);
        service.notifyLocation(locationCracow, notification);
        Mockito.verify(person1).receive("Alert");
        Mockito.verify(person2).receive("Alert");
    }

    @Test
    public void shouldRemoveLocationAndNotSendNotificationToAnyone() {
        Notification notification = person -> person.receive("Alert");
        service.subscribe(locationWarsaw, message -> System.out.println("Person 1 received: " + message));
        service.removeLocation(locationWarsaw);
        service.notifyLocation(locationWarsaw, notification);
        Mockito.verify(person1, Mockito.never()).receive("Alert");
    }

    @Test
    public void shouldUnsubscribePersonFromAllLocations() {
        Notification notification = person -> person.receive("Alert");
        service.subscribe(locationWarsaw, message -> System.out.println("Person 1 received: " + message));
        service.subscribe(locationCracow, message -> System.out.println("Person 2 received: " + message));
        service.unsubscribeFromAll(person1);
        service.notifyAll(notification);
        Mockito.verify(person1, Mockito.never()).receive("Alert");
    }
}
