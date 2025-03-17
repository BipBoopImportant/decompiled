package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class Y1 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private int f49290a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator f49291b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ W1 f49292c;

    private Y1(W1 w12) {
        this.f49292c = w12;
        this.f49290a = w12.f49282b.size();
    }

    private final Iterator a() {
        if (this.f49291b == null) {
            this.f49291b = this.f49292c.f49286f.entrySet().iterator();
        }
        return this.f49291b;
    }

    public final boolean hasNext() {
        int i10 = this.f49290a;
        return (i10 > 0 && i10 <= this.f49292c.f49282b.size()) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List i10 = this.f49292c.f49282b;
        int i11 = this.f49290a - 1;
        this.f49290a = i11;
        return (Map.Entry) i10.get(i11);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ Y1(W1 w12, V1 v12) {
        this(w12);
    }
}
