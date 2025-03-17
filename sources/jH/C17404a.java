package jH;

import android.app.Activity;
import android.app.Application;
import androidx.activity.j;
import cH.C17062a;
import eH.C17180b;
import hH.C17322a;
import mH.C17599b;

/* renamed from: jH.a  reason: case insensitive filesystem */
public class C17404a implements C17599b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f143944a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f143945b = new Object();

    /* renamed from: c  reason: collision with root package name */
    protected final Activity f143946c;

    /* renamed from: d  reason: collision with root package name */
    private final C17599b<C17180b> f143947d;

    /* renamed from: jH.a$a  reason: collision with other inner class name */
    public interface C3515a {
        C17322a a();
    }

    public C17404a(Activity activity) {
        this.f143946c = activity;
        this.f143947d = new C17405b((j) activity);
    }

    /* access modifiers changed from: protected */
    public Object a() {
        String str;
        if (this.f143946c.getApplication() instanceof C17599b) {
            return ((C3515a) C17062a.a(this.f143947d, C3515a.class)).a().a(this.f143946c).g();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f143946c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f143946c.getApplication().getClass();
        }
        sb2.append(str);
        throw new IllegalStateException(sb2.toString());
    }

    public final C17411h b() {
        return ((C17405b) this.f143947d).c();
    }

    public Object g0() {
        if (this.f143944a == null) {
            synchronized (this.f143945b) {
                try {
                    if (this.f143944a == null) {
                        this.f143944a = a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f143944a;
    }
}
