package org.maplibre.android;

public class d extends RuntimeException {
    d(String str) {
        super(String.format("Map detected an error that would fail silently otherwise: %s", new Object[]{str}));
    }
}
