package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

final class R5 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private int f48801a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f48802b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator f48803c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ O5 f48804d;

    private final Iterator a() {
        if (this.f48803c == null) {
            this.f48803c = this.f48804d.f48773c.entrySet().iterator();
        }
        return this.f48803c;
    }

    public final boolean hasNext() {
        return this.f48801a + 1 < this.f48804d.f48772b || (!this.f48804d.f48773c.isEmpty() && a().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.f48802b = true;
        int i10 = this.f48801a + 1;
        this.f48801a = i10;
        return i10 < this.f48804d.f48772b ? (S5) this.f48804d.f48771a[this.f48801a] : (Map.Entry) a().next();
    }

    public final void remove() {
        if (this.f48802b) {
            this.f48802b = false;
            this.f48804d.u();
            if (this.f48801a < this.f48804d.f48772b) {
                O5 o52 = this.f48804d;
                int i10 = this.f48801a;
                this.f48801a = i10 - 1;
                Object unused = o52.k(i10);
                return;
            }
            a().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private R5(O5 o52) {
        this.f48804d = o52;
        this.f48801a = -1;
    }
}
