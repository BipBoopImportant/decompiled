package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.u0  reason: case insensitive filesystem */
public final class C7227u0 extends C7223t<String> implements C7230v0, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final C7227u0 f48489c;

    /* renamed from: d  reason: collision with root package name */
    private static final C7230v0 f48490d;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f48491b;

    static {
        C7227u0 u0Var = new C7227u0();
        f48489c = u0Var;
        u0Var.zzv();
        f48490d = u0Var;
    }

    public C7227u0() {
        this(10);
    }

    private static String i(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof A ? ((A) obj).y() : C7192i0.h((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ boolean N() {
        return super.N();
    }

    public final /* synthetic */ C7201l0 R0(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f48491b);
            return new C7227u0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final List<?> U1() {
        return Collections.unmodifiableList(this.f48491b);
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f48491b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof C7230v0) {
            collection = ((C7230v0) collection).U1();
        }
        boolean addAll = this.f48491b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        b();
        this.f48491b.clear();
        this.modCount++;
    }

    public final C7230v0 d3() {
        return N() ? new C7243z1(this) : this;
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i10) {
        Object obj = this.f48491b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof A) {
            A a10 = (A) obj;
            String y10 = a10.y();
            if (a10.m()) {
                this.f48491b.set(i10, y10);
            }
            return y10;
        }
        byte[] bArr = (byte[]) obj;
        String h10 = C7192i0.h(bArr);
        if (C7192i0.g(bArr)) {
            this.f48491b.set(i10, h10);
        }
        return h10;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final Object n(int i10) {
        return this.f48491b.get(i10);
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        Object remove = this.f48491b.remove(i10);
        this.modCount++;
        return i(remove);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        b();
        return i(this.f48491b.set(i10, (String) obj));
    }

    public final int size() {
        return this.f48491b.size();
    }

    public C7227u0(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C7227u0(ArrayList<Object> arrayList) {
        this.f48491b = arrayList;
    }
}
