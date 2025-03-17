package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.vision.h1  reason: case insensitive filesystem */
public final class C7494h1 extends C7469b0<String> implements C7506k1, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final C7494h1 f49331c;

    /* renamed from: d  reason: collision with root package name */
    private static final C7506k1 f49332d;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f49333b;

    static {
        C7494h1 h1Var = new C7494h1();
        f49331c = h1Var;
        h1Var.zzb();
        f49332d = h1Var;
    }

    public C7494h1() {
        this(10);
    }

    private static String i(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C7497i0 ? ((C7497i0) obj).A() : U0.i((byte[]) obj);
    }

    public final void M2(C7497i0 i0Var) {
        b();
        this.f49333b.add(i0Var);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i10, Object obj) {
        b();
        this.f49333b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final /* synthetic */ C7466a1 c(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f49333b);
            return new C7494h1((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final void clear() {
        b();
        this.f49333b.clear();
        this.modCount++;
    }

    public final Object d(int i10) {
        return this.f49333b.get(i10);
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i10) {
        Object obj = this.f49333b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C7497i0) {
            C7497i0 i0Var = (C7497i0) obj;
            String A10 = i0Var.A();
            if (i0Var.zzc()) {
                this.f49333b.set(i10, A10);
            }
            return A10;
        }
        byte[] bArr = (byte[]) obj;
        String i11 = U0.i(bArr);
        if (U0.h(bArr)) {
            this.f49333b.set(i10, i11);
        }
        return i11;
    }

    public final C7506k1 h() {
        return zza() ? new o2(this) : this;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* synthetic */ Object set(int i10, Object obj) {
        b();
        return i(this.f49333b.set(i10, (String) obj));
    }

    public final int size() {
        return this.f49333b.size();
    }

    public final /* bridge */ /* synthetic */ boolean zza() {
        return super.zza();
    }

    public final List<?> zzd() {
        return Collections.unmodifiableList(this.f49333b);
    }

    public C7494h1(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof C7506k1) {
            collection = ((C7506k1) collection).zzd();
        }
        boolean addAll = this.f49333b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i10) {
        b();
        Object remove = this.f49333b.remove(i10);
        this.modCount++;
        return i(remove);
    }

    private C7494h1(ArrayList<Object> arrayList) {
        this.f49333b = arrayList;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }
}
