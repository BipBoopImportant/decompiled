package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.e2  reason: case insensitive filesystem */
final class C7483e2 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private int f49314a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f49315b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator f49316c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ W1 f49317d;

    private C7483e2(W1 w12) {
        this.f49317d = w12;
        this.f49314a = -1;
    }

    private final Iterator a() {
        if (this.f49316c == null) {
            this.f49316c = this.f49317d.f49283c.entrySet().iterator();
        }
        return this.f49316c;
    }

    public final boolean hasNext() {
        return this.f49314a + 1 < this.f49317d.f49282b.size() || (!this.f49317d.f49283c.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f49315b = true;
        int i10 = this.f49314a + 1;
        this.f49314a = i10;
        return i10 < this.f49317d.f49282b.size() ? (Map.Entry) this.f49317d.f49282b.get(this.f49314a) : (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f49315b) {
            this.f49315b = false;
            this.f49317d.t();
            if (this.f49314a < this.f49317d.f49282b.size()) {
                W1 w12 = this.f49317d;
                int i10 = this.f49314a;
                this.f49314a = i10 - 1;
                Object unused = w12.n(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    /* synthetic */ C7483e2(W1 w12, V1 v12) {
        this(w12);
    }
}
