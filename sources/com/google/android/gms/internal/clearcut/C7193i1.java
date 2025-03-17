package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.i1  reason: case insensitive filesystem */
final class C7193i1 implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private int f48413a;

    /* renamed from: b  reason: collision with root package name */
    private Iterator f48414b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ C7187g1 f48415c;

    private C7193i1(C7187g1 g1Var) {
        this.f48415c = g1Var;
        this.f48413a = g1Var.f48396b.size();
    }

    private final Iterator a() {
        if (this.f48414b == null) {
            this.f48414b = this.f48415c.f48400f.entrySet().iterator();
        }
        return this.f48414b;
    }

    public final boolean hasNext() {
        int i10 = this.f48413a;
        return (i10 > 0 && i10 <= this.f48415c.f48396b.size()) || a().hasNext();
    }

    public final /* synthetic */ Object next() {
        Object obj;
        if (a().hasNext()) {
            obj = a().next();
        } else {
            List l10 = this.f48415c.f48396b;
            int i10 = this.f48413a - 1;
            this.f48413a = i10;
            obj = l10.get(i10);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ C7193i1(C7187g1 g1Var, C7190h1 h1Var) {
        this(g1Var);
    }
}
