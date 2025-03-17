package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.z1  reason: case insensitive filesystem */
public final class C7243z1 extends AbstractList<String> implements C7230v0, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C7230v0 f48527a;

    public C7243z1(C7230v0 v0Var) {
        this.f48527a = v0Var;
    }

    public final List<?> U1() {
        return this.f48527a.U1();
    }

    public final C7230v0 d3() {
        return this;
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.f48527a.get(i10);
    }

    public final Iterator<String> iterator() {
        return new B1(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new A1(this, i10);
    }

    public final Object n(int i10) {
        return this.f48527a.n(i10);
    }

    public final int size() {
        return this.f48527a.size();
    }
}
