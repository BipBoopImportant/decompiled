package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import u2.e;

class w {

    /* renamed from: d  reason: collision with root package name */
    private static w f15594d;

    /* renamed from: a  reason: collision with root package name */
    private final Context f15595a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f15596b;

    /* renamed from: c  reason: collision with root package name */
    private final a f15597c = new a();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        boolean f15598a;

        /* renamed from: b  reason: collision with root package name */
        long f15599b;

        a() {
        }
    }

    w(Context context, LocationManager locationManager) {
        this.f15595a = context;
        this.f15596b = locationManager;
    }

    static w a(Context context) {
        if (f15594d == null) {
            Context applicationContext = context.getApplicationContext();
            f15594d = new w(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f15594d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c10 = e.c(this.f15595a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        if (e.c(this.f15595a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = c("gps");
        }
        return (location == null || c10 == null) ? location != null ? location : c10 : location.getTime() > c10.getTime() ? location : c10;
    }

    private Location c(String str) {
        try {
            if (this.f15596b.isProviderEnabled(str)) {
                return this.f15596b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d("TwilightManager", "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f15597c.f15599b > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j10;
        a aVar = this.f15597c;
        long currentTimeMillis = System.currentTimeMillis();
        v b10 = v.b();
        v vVar = b10;
        vVar.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        vVar.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = true;
        if (b10.f15593c != 1) {
            z10 = false;
        }
        boolean z11 = z10;
        long j11 = b10.f15592b;
        long j12 = b10.f15591a;
        long j13 = j11;
        b10.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j14 = b10.f15592b;
        if (j13 == -1 || j12 == -1) {
            j10 = currentTimeMillis + 43200000;
        } else {
            if (currentTimeMillis <= j12) {
                j14 = currentTimeMillis > j13 ? j12 : j13;
            }
            j10 = j14 + 60000;
        }
        aVar.f15598a = z11;
        aVar.f15599b = j10;
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        a aVar = this.f15597c;
        if (e()) {
            return aVar.f15598a;
        }
        Location b10 = b();
        if (b10 != null) {
            f(b10);
            return aVar.f15598a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
