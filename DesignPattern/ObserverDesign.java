package DesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesign {
    public static void main(String[] args) {
        YoutubeChannel channel = new YoutubeChannel("Tech Channel");
        Observer user1 = new Users("Alice");
        Observer user2 = new Users("Bob");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.uploadVideo("How to code");
    }
}
interface Observer {
    void update(String message);
}

class Users implements Observer {
    private String name;

    public Users(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

class YoutubeChannel {
    private String name;
    private List<Observer> subscribers;

    public YoutubeChannel(String name) {
        this.name = name;
        this.subscribers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer observer : subscribers) {
            observer.update(name + ": " + message);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println(name + " uploaded a new video: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}

