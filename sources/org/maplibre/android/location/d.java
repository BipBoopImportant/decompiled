package org.maplibre.android.location;

final class d extends RuntimeException {
    d() {
        super("The LocationComponent has to be activated with one of the LocationComponent#activateLocationComponent overloads before any other methods are invoked.");
    }
}
