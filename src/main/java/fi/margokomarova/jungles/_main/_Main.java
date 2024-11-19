package fi.margokomarova.jungles._main;

import fi.margokomarova.jungles.entity.Tiger;
import fi.margokomarova.jungles.util.EventProducer;

public class _Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        EventProducer eventProducer = new EventProducer();
        eventProducer.activateEvent(tiger);
    }
}
