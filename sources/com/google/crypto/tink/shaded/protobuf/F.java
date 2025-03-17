package com.google.crypto.tink.shaded.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class F extends C9520c<String> implements G, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final F f67922c;

    /* renamed from: d  reason: collision with root package name */
    public static final G f67923d;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f67924b;

    static {
        F f10 = new F();
        f67922c = f10;
        f10.o();
        f67923d = f10;
    }

    public F() {
        this(10);
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C9525h ? ((C9525h) obj).I() : A.j((byte[]) obj);
    }

    public void O2(C9525h hVar) {
        b();
        this.f67924b.add(hVar);
        this.modCount++;
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        b();
        this.f67924b.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public void add(int i10, String str) {
        b();
        this.f67924b.add(i10, str);
        this.modCount++;
    }

    /* renamed from: k */
    public String get(int i10) {
        Object obj = this.f67924b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C9525h) {
            C9525h hVar = (C9525h) obj;
            String I10 = hVar.I();
            if (hVar.t()) {
                this.f67924b.set(i10, I10);
            }
            return I10;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = A.j(bArr);
        if (A.g(bArr)) {
            this.f67924b.set(i10, j10);
        }
        return j10;
    }

    public List<?> l() {
        return Collections.unmodifiableList(this.f67924b);
    }

    /* renamed from: m */
    public F f(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f67924b);
            return new F((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Object n(int i10) {
        return this.f67924b.get(i10);
    }

    /* renamed from: p */
    public String remove(int i10) {
        b();
        Object remove = this.f67924b.remove(i10);
        this.modCount++;
        return j(remove);
    }

    /* renamed from: q */
    public String set(int i10, String str) {
        b();
        return j(this.f67924b.set(i10, str));
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f67924b.size();
    }

    public /* bridge */ /* synthetic */ boolean u() {
        return super.u();
    }

    public G w() {
        return u() ? new r0(this) : this;
    }

    public F(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof G) {
            collection = ((G) collection).l();
        }
        boolean addAll = this.f67924b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private F(ArrayList<Object> arrayList) {
        this.f67924b = arrayList;
    }
}
