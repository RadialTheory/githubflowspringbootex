package com.radialtheory.acme;

public class WidgetExistsException extends Exception {

    public WidgetExistsException(String name) {
        super(String.format("Widgetr with name %s already exists", name));
    }
}
