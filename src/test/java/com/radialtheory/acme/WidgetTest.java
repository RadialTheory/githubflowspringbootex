package com.radialtheory.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WidgetTest {

    @Test
    void testWidget() {
        Widget widget = new Widget("Test", Color.BLUE);
        Assertions.assertEquals("Test", widget.name());
        Assertions.assertEquals(Color.BLUE, widget.color());
    }
}
