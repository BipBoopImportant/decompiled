package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.o1  reason: case insensitive filesystem */
final class C7211o1 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private int f48463a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f48464b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator f48465c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7187g1 f48466d;

    private C7211o1(C7187g1 g1Var) {
        this.f48466d = g1Var;
        this.f48463a = -1;
    }

    private final Iterator a() {
        if (this.f48465c == null) {
            this.f48465c = this.f48466d.f48397c.entrySet().iterator();
        }
        return this.f48465c;
    }

    public final boolean hasNext() {
        return this.f48463a + 1 < this.f48466d.f48396b.size() || (!this.f48466d.f48397c.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f48464b = true;
        int i10 = this.f48463a + 1;
        this.f48463a = i10;
        return (Map.Entry) (i10 < this.f48466d.f48396b.size() ? this.f48466d.f48396b.get(this.f48463a) : a().next());
    }

    public final void remove() {
        if (this.f48464b) {
            this.f48464b = false;
            this.f48466d.s();
            if (this.f48463a < this.f48466d.f48396b.size()) {
                C7187g1 g1Var = this.f48466d;
                int i10 = this.f48463a;
                this.f48463a = i10 - 1;
                Object unused = g1Var.k(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ C7211o1(C7187g1 g1Var, C7190h1 h1Var) {
        this(g1Var);
    }
}
