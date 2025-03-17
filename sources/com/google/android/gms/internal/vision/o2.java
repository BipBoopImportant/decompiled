package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class o2 extends AbstractList<String> implements C7506k1, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C7506k1 f49362a;

    public o2(C7506k1 k1Var) {
        this.f49362a = k1Var;
    }

    public final void M2(C7497i0 i0Var) {
        throw new UnsupportedOperationException();
    }

    public final Object d(int i10) {
        return this.f49362a.d(i10);
    }

    public final /* synthetic */ Object get(int i10) {
        return (String) this.f49362a.get(i10);
    }

    public final C7506k1 h() {
        return this;
    }

    public final Iterator<String> iterator() {
        return new r2(this);
    }

    public final ListIterator<String> listIterator(int i10) {
        return new C7519n2(this, i10);
    }

    public final int size() {
        return this.f49362a.size();
    }

    public final List<?> zzd() {
        return this.f49362a.zzd();
    }
}
