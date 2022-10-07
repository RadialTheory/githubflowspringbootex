package com.radialtheory.acme;

import lombok.NonNull;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class WidgetAPI {

    private final WidgetFactory widgetFactory;

    WidgetAPI(@NonNull WidgetFactory widgetFactory) {
        this.widgetFactory = widgetFactory;
    }

    @GetMapping("/widgets")
    public ResponseEntity<List<Widget>> getAllWidgets() {
        return ResponseEntity.ok(widgetFactory.getAllWidgets());
    }

    @PostMapping("/widgets")
    public ResponseEntity<Widget> createWidget(@RequestBody Widget widget) {
        try {
            return ResponseEntity.ok(widgetFactory.createWidget(widget.name(), widget.color()));
        } catch (WidgetExistsException e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(widgetFactory.getWidget(widget.name()).orElseThrow());
        }
    }
}
