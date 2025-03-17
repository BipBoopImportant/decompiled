package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

final class D0 extends F0 {
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }

    private D0() {
    }
}
