package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class F extends C9570c<String> implements G, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private static final F f69202c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final G f69203d;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f69204b;

    static {
        F f10 = new F(false);
        f69202c = f10;
        f69203d = f10;
    }

    private F(boolean z10) {
        super(z10);
        this.f69204b = Collections.emptyList();
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C9575h ? ((C9575h) obj).G() : C9592z.j((byte[]) obj);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public void clear() {
        b();
        this.f69204b.clear();
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f0(C9575h hVar) {
        b();
        this.f69204b.add(hVar);
        this.modCount++;
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public void add(int i10, String str) {
        b();
        this.f69204b.add(i10, str);
        this.modCount++;
    }

    /* renamed from: k */
    public String get(int i10) {
        Object obj = this.f69204b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C9575h) {
            C9575h hVar = (C9575h) obj;
            String G10 = hVar.G();
            if (hVar.s()) {
                this.f69204b.set(i10, G10);
            }
            return G10;
        }
        byte[] bArr = (byte[]) obj;
        String j10 = C9592z.j(bArr);
        if (C9592z.g(bArr)) {
            this.f69204b.set(i10, j10);
        }
        return j10;
    }

    public List<?> l() {
        return Collections.unmodifiableList(this.f69204b);
    }

    /* renamed from: m */
    public F f(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f69204b);
            return new F((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Object n(int i10) {
        return this.f69204b.get(i10);
    }

    /* renamed from: p */
    public String remove(int i10) {
        b();
        Object remove = this.f69204b.remove(i10);
        this.modCount++;
        return j(remove);
    }

    /* renamed from: q */
    public String set(int i10, String str) {
        b();
        return j(this.f69204b.set(i10, str));
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public int size() {
        return this.f69204b.size();
    }

    public /* bridge */ /* synthetic */ boolean u() {
        return super.u();
    }

    public G w() {
        return u() ? new r0(this) : this;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    public boolean addAll(int i10, Collection<? extends String> collection) {
        b();
        if (collection instanceof G) {
            collection = ((G) collection).l();
        }
        boolean addAll = this.f69204b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public F(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    private F(ArrayList<Object> arrayList) {
        this.f69204b = arrayList;
    }
}
