package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class Q5 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private int f48791a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator f48792b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ O5 f48793c;

    private final Iterator a() {
        if (this.f48792b == null) {
            this.f48792b = this.f48793c.f48776f.entrySet().iterator();
        }
        return this.f48792b;
    }

    public final boolean hasNext() {
        int i10 = this.f48791a;
        return (i10 > 0 && i10 <= this.f48793c.f48772b) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        Object[] s10 = this.f48793c.f48771a;
        int i10 = this.f48791a - 1;
        this.f48791a = i10;
        return (S5) s10[i10];
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private Q5(O5 o52) {
        this.f48793c = o52;
        this.f48791a = o52.f48772b;
    }
}
