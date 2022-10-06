package com.radialtheory.acme;

public class WidgetFactory {

    public Widget createWidget(String name, Color color) {
        return new Widget(name, color);
    }
}
