package com.cyberfend.cyfsecurity;

import android.util.Pair;
import java.util.ArrayList;

public final class SensorDataBuilder {

    /* renamed from: a  reason: collision with root package name */
    private static final SensorDataBuilder f47779a = new SensorDataBuilder();

    /* renamed from: b  reason: collision with root package name */
    public static boolean f47780b;

    class a implements Runnable {
        a() {
        }

        public final void run() {
            if (!SensorDataBuilder.f47780b) {
                SensorDataBuilder.this.initializeKeyN();
            }
        }
    }

    static {
        f47780b = false;
        try {
            System.loadLibrary("akamaibmp");
        } catch (UnsatisfiedLinkError unused) {
            f47780b = true;
        } catch (Exception unused2) {
            f47780b = true;
        }
    }

    SensorDataBuilder() {
    }

    public static SensorDataBuilder a() {
        return f47779a;
    }

    public final native synchronized String buildN(ArrayList<Pair<String, String>> arrayList);

    public final native synchronized void initializeKeyN();
}
