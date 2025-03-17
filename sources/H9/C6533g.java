package H9;

import K9.C6620s;
import android.app.Activity;
import androidx.fragment.app.C5191t;

/* renamed from: H9.g  reason: case insensitive filesystem */
public class C6533g {

    /* renamed from: a  reason: collision with root package name */
    private final Object f36578a;

    public C6533g(Activity activity) {
        C6620s.m(activity, "Activity must not be null");
        this.f36578a = activity;
    }

    public final Activity a() {
        return (Activity) this.f36578a;
    }

    public final C5191t b() {
        return (C5191t) this.f36578a;
    }

    public final boolean c() {
        return this.f36578a instanceof Activity;
    }

    public final boolean d() {
        return this.f36578a instanceof C5191t;
    }
}
