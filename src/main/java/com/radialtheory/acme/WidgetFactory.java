package com.radialtheory.acme;

import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class WidgetFactory {

    private final Map<String, Widget> allWidgets = new HashMap<>();

    public Widget createWidget(String name, Color color) throws WidgetExistsException {
        if (allWidgets.containsKey(name)) {
            throw new WidgetExistsException(name);
        }
        Widget widget = new Widget(name, color);
        allWidgets.put(name, widget);
        return widget;
    }

    public List<Widget> getAllWidgets() {
        return new ArrayList<>(allWidgets.values());
    }

    public Optional<Widget> getWidget(@NonNull String name) {
        return Optional.ofNullable(allWidgets.get(name));
    }
}
