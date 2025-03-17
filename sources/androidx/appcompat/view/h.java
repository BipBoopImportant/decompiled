package androidx.appcompat.view;

import I2.C4618k0;
import I2.C4620l0;
import I2.C4622m0;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    /* renamed from: a  reason: collision with root package name */
    final ArrayList<C4618k0> f15703a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private long f15704b = -1;

    /* renamed from: c  reason: collision with root package name */
    private Interpolator f15705c;

    /* renamed from: d  reason: collision with root package name */
    C4620l0 f15706d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f15707e;

    /* renamed from: f  reason: collision with root package name */
    private final C4622m0 f15708f = new a();

    class a extends C4622m0 {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15709a = false;

        /* renamed from: b  reason: collision with root package name */
        private int f15710b = 0;

        a() {
        }

        public void b(View view) {
            int i10 = this.f15710b + 1;
            this.f15710b = i10;
            if (i10 == h.this.f15703a.size()) {
                C4620l0 l0Var = h.this.f15706d;
                if (l0Var != null) {
                    l0Var.b((View) null);
                }
                d();
            }
        }

        public void c(View view) {
            if (!this.f15709a) {
                this.f15709a = true;
                C4620l0 l0Var = h.this.f15706d;
                if (l0Var != null) {
                    l0Var.c((View) null);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f15710b = 0;
            this.f15709a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f15707e) {
            Iterator<C4618k0> it = this.f15703a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f15707e = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f15707e = false;
    }

    public h c(C4618k0 k0Var) {
        if (!this.f15707e) {
            this.f15703a.add(k0Var);
        }
        return this;
    }

    public h d(C4618k0 k0Var, C4618k0 k0Var2) {
        this.f15703a.add(k0Var);
        k0Var2.j(k0Var.d());
        this.f15703a.add(k0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f15707e) {
            this.f15704b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f15707e) {
            this.f15705c = interpolator;
        }
        return this;
    }

    public h g(C4620l0 l0Var) {
        if (!this.f15707e) {
            this.f15706d = l0Var;
        }
        return this;
    }

    public void h() {
        if (!this.f15707e) {
            Iterator<C4618k0> it = this.f15703a.iterator();
            while (it.hasNext()) {
                C4618k0 next = it.next();
                long j10 = this.f15704b;
                if (j10 >= 0) {
                    next.f(j10);
                }
                Interpolator interpolator = this.f15705c;
                if (interpolator != null) {
                    next.g(interpolator);
                }
                if (this.f15706d != null) {
                    next.h(this.f15708f);
                }
                next.l();
            }
            this.f15707e = true;
        }
    }
}
