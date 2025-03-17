package a9;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.g1  reason: case insensitive filesystem */
public final class C6831g1 implements C5221y {

    /* renamed from: a  reason: collision with root package name */
    public boolean f42569a;

    /* renamed from: b  reason: collision with root package name */
    public final A f42570b;

    /* renamed from: a9.g1$a */
    public static final class a extends C6961w4 {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C6831g1 f42571a;

        public a(C6831g1 g1Var) {
            this.f42571a = g1Var;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C17542s.j(activity, "activity");
            C6831g1 g1Var = this.f42571a;
            if (!g1Var.f42569a) {
                A a10 = g1Var.f42570b;
                if (a10 == null) {
                    C17542s.z("registry");
                    a10 = null;
                }
                a10.l(r.a.ON_CREATE);
                this.f42571a.f42569a = true;
            }
        }
    }

    public C6831g1(Context context) {
        C17542s.j(context, "context");
        a aVar = new a(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(aVar);
        }
        A a10 = new A(this);
        C17542s.j(a10, "<set-?>");
        this.f42570b = a10;
    }

    public final r getLifecycle() {
        A a10 = this.f42570b;
        if (a10 != null) {
            return a10;
        }
        C17542s.z("registry");
        return null;
    }
}
