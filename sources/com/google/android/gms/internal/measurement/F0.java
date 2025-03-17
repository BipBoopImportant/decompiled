package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

public abstract class F0 {

    /* renamed from: a  reason: collision with root package name */
    private static F0 f48651a = new D0();

    public static synchronized F0 a() {
        F0 f02;
        synchronized (F0.class) {
            f02 = f48651a;
        }
        return f02;
    }

    public abstract URLConnection b(URL url, String str);
}
