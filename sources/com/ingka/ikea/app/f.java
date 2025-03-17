package com.ingka.ikea.app;

import android.app.Application;
import jH.C17407d;
import jH.C17409f;
import kH.C17498a;
import mH.C17600c;
import mH.C17602e;

public abstract class f extends Application implements C17600c {

    /* renamed from: a  reason: collision with root package name */
    private boolean f71890a = false;

    /* renamed from: b  reason: collision with root package name */
    private final C17407d f71891b = new C17407d(new a());

    class a implements C17409f {
        a() {
        }

        public Object get() {
            return c.a().a(new C17498a(f.this)).b();
        }
    }

    public final C17407d c() {
        return this.f71891b;
    }

    /* access modifiers changed from: protected */
    public void d() {
        if (!this.f71890a) {
            this.f71890a = true;
            ((h) g0()).f((IkeaApplication) C17602e.a(this));
        }
    }

    public final Object g0() {
        return c().g0();
    }

    public void onCreate() {
        d();
        super.onCreate();
    }
}
