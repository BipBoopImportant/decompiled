package Mc;

import XH.C16807N;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\rR(\u0010\u001b\u001a\u00020\u00138\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R.\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"LMc/H;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "Landroid/app/Activity;", "activity", "LXH/N;", "onActivityResumed", "(Landroid/app/Activity;)V", "onActivityPaused", "Landroid/os/Bundle;", "savedInstanceState", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "onActivityStopped", "onActivityDestroyed", "outState", "onActivitySaveInstanceState", "", "b", "Z", "getHasPendingForeground$com_google_firebase_firebase_sessions", "()Z", "setHasPendingForeground$com_google_firebase_firebase_sessions", "(Z)V", "getHasPendingForeground$com_google_firebase_firebase_sessions$annotations", "hasPendingForeground", "LMc/D;", "lifecycleClient", "c", "LMc/D;", "getLifecycleClient", "()LMc/D;", "a", "(LMc/D;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class H implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public static final H f61755a = new H();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f61756b;

    /* renamed from: c  reason: collision with root package name */
    private static D f61757c;

    private H() {
    }

    public final void a(D d10) {
        f61757c = d10;
        if (d10 != null && f61756b) {
            f61756b = false;
            d10.k();
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        C17542s.j(activity, "activity");
        D d10 = f61757c;
        if (d10 != null) {
            d10.h();
        }
    }

    public void onActivityResumed(Activity activity) {
        C16807N n10;
        C17542s.j(activity, "activity");
        D d10 = f61757c;
        if (d10 != null) {
            d10.k();
            n10 = C16807N.f139792a;
        } else {
            n10 = null;
        }
        if (n10 == null) {
            f61756b = true;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C17542s.j(activity, "activity");
        C17542s.j(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        C17542s.j(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        C17542s.j(activity, "activity");
    }
}
