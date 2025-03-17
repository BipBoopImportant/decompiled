package A2;

import android.location.LocationManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final WeakHashMap<Object, WeakReference<Object>> f4457a = new WeakHashMap<>();

    private static class a {
        static boolean a(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    public static boolean a(LocationManager locationManager) {
        return Build.VERSION.SDK_INT >= 28 ? a.a(locationManager) : locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }
}
