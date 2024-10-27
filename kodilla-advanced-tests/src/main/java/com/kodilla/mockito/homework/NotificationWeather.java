package com.kodilla.mockito.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotificationWeather {
    private Map<String, Set<Person>> subscriptions = new HashMap<>();
    public void subscribe(String location, Person person) {
        if (!subscriptions.containsKey(location)) {
            subscriptions.put(location, new HashSet<>());
        }
        subscriptions.get(location).add(person);
    }

    public void unsubscribe(String location, Person person) {
        if (subscriptions.containsKey(location)) {
            subscriptions.get(location).remove(person);
            if (subscriptions.get(location).isEmpty()) {
                subscriptions.remove(location);
            }
        }
    }

    public void unsubscribeFromAll(Person person) {
        for (Set<Person> subscribers : subscriptions.values()) {
            subscribers.remove(person);
        }
        subscriptions.values().removeIf(Set::isEmpty);
    }

    public void notifyAll(Notification notification) {
        subscriptions.values().stream()
                .flatMap(Set::stream)
                .distinct()
                .forEach(person -> notification.send(person));
    }

    public void notifyLocation(String location, Notification notification) {
        if (subscriptions.containsKey(location)) {
            subscriptions.get(location)
                    .forEach(person -> notification.send(person));
        }
    }

    public void removeLocation(String location) {
        subscriptions.remove(location);
    }
}

