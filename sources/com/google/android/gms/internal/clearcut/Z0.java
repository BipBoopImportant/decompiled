package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

final class Z0<E> extends C7223t<E> {

    /* renamed from: c  reason: collision with root package name */
    private static final Z0<Object> f48288c;

    /* renamed from: b  reason: collision with root package name */
    private final List<E> f48289b;

    static {
        Z0<Object> z02 = new Z0<>();
        f48288c = z02;
        z02.zzv();
    }

    Z0() {
        this(new ArrayList(10));
    }

    public static <E> Z0<E> i() {
        return f48288c;
    }

    public final /* synthetic */ C7201l0 R0(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f48289b);
            return new Z0(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void add(int i10, E e10) {
        b();
        this.f48289b.add(i10, e10);
        this.modCount++;
    }

    public final E get(int i10) {
        return this.f48289b.get(i10);
    }

    public final E remove(int i10) {
        b();
        E remove = this.f48289b.remove(i10);
        this.modCount++;
        return remove;
    }

    public final E set(int i10, E e10) {
        b();
        E e11 = this.f48289b.set(i10, e10);
        this.modCount++;
        return e11;
    }

    public final int size() {
        return this.f48289b.size();
    }

    private Z0(List<E> list) {
        this.f48289b = list;
    }
}
