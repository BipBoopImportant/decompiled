package jH;

import android.app.Application;
import android.content.Context;
import gH.C17265a;
import mH.C17599b;
import mH.C17601d;

/* renamed from: jH.e  reason: case insensitive filesystem */
public final class C17408e {
    public static Object a(Context context) {
        Application a10 = C17265a.a(context.getApplicationContext());
        C17601d.a(a10 instanceof C17599b, "Hilt BroadcastReceiver must be attached to an @HiltAndroidApp Application. Found: %s", a10.getClass());
        return ((C17599b) a10).g0();
    }
}
