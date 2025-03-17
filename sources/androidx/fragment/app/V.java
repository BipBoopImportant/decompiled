package androidx.fragment.app;

import P4.e;
import P4.f;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.A;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.X;
import androidx.lifecycle.a0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import l3.a;
import l3.d;

class V implements C5212o, f, k0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5187o f21980a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f21981b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f21982c;

    /* renamed from: d  reason: collision with root package name */
    private i0.c f21983d;

    /* renamed from: e  reason: collision with root package name */
    private A f21984e = null;

    /* renamed from: f  reason: collision with root package name */
    private e f21985f = null;

    V(C5187o oVar, j0 j0Var, Runnable runnable) {
        this.f21980a = oVar;
        this.f21981b = j0Var;
        this.f21982c = runnable;
    }

    /* access modifiers changed from: package-private */
    public void a(r.a aVar) {
        this.f21984e.l(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f21984e == null) {
            this.f21984e = new A(this);
            e a10 = e.a(this);
            this.f21985f = a10;
            a10.c();
            this.f21982c.run();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f21984e != null;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f21985f.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f21985f.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(r.b bVar) {
        this.f21984e.q(bVar);
    }

    public a getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f21980a.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        d dVar = new d();
        if (application != null) {
            dVar.c(i0.a.f22296h, application);
        }
        dVar.c(X.f22221a, this.f21980a);
        dVar.c(X.f22222b, this);
        if (this.f21980a.getArguments() != null) {
            dVar.c(X.f22223c, this.f21980a.getArguments());
        }
        return dVar;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        Application application;
        i0.c defaultViewModelProviderFactory = this.f21980a.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f21980a.mDefaultFactory)) {
            this.f21983d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f21983d == null) {
            Context applicationContext = this.f21980a.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            C5187o oVar = this.f21980a;
            this.f21983d = new a0(application, oVar, oVar.getArguments());
        }
        return this.f21983d;
    }

    public r getLifecycle() {
        b();
        return this.f21984e;
    }

    public P4.d getSavedStateRegistry() {
        b();
        return this.f21985f.b();
    }

    public j0 getViewModelStore() {
        b();
        return this.f21981b;
    }
}
