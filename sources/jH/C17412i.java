package jH;

import android.app.Application;
import android.app.Service;
import cH.C17062a;
import hH.C17325d;
import mH.C17599b;
import mH.C17601d;

/* renamed from: jH.i  reason: case insensitive filesystem */
public final class C17412i implements C17599b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Service f143965a;

    /* renamed from: b  reason: collision with root package name */
    private Object f143966b;

    /* renamed from: jH.i$a */
    public interface a {
        C17325d a();
    }

    public C17412i(Service service) {
        this.f143965a = service;
    }

    private Object a() {
        Application application = this.f143965a.getApplication();
        C17601d.d(application instanceof C17599b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) C17062a.a(application, a.class)).a().a(this.f143965a).g();
    }

    public Object g0() {
        if (this.f143966b == null) {
            this.f143966b = a();
        }
        return this.f143966b;
    }
}
