package eJ;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: eJ.n  reason: case insensitive filesystem */
public class C17203n extends AbstractList<String> implements RandomAccess, C17204o {

    /* renamed from: b  reason: collision with root package name */
    public static final C17204o f143079b = new C17203n().w();

    /* renamed from: a  reason: collision with root package name */
    private final List<Object> f143080a;

    public C17203n() {
        this.f143080a = new ArrayList();
    }

    private static C17193d i(Object obj) {
        return obj instanceof C17193d ? (C17193d) obj : obj instanceof String ? C17193d.p((String) obj) : C17193d.k((byte[]) obj);
    }

    private static String j(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C17193d ? ((C17193d) obj).H() : C17199j.b((byte[]) obj);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public void add(int i10, String str) {
        this.f143080a.add(i10, str);
        this.modCount++;
    }

    public C17193d b1(int i10) {
        Object obj = this.f143080a.get(i10);
        C17193d i11 = i(obj);
        if (i11 != obj) {
            this.f143080a.set(i10, i11);
        }
        return i11;
    }

    public void clear() {
        this.f143080a.clear();
        this.modCount++;
    }

    public void h1(C17193d dVar) {
        this.f143080a.add(dVar);
        this.modCount++;
    }

    /* renamed from: k */
    public String get(int i10) {
        Object obj = this.f143080a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C17193d) {
            C17193d dVar = (C17193d) obj;
            String H10 = dVar.H();
            if (dVar.x()) {
                this.f143080a.set(i10, H10);
            }
            return H10;
        }
        byte[] bArr = (byte[]) obj;
        String b10 = C17199j.b(bArr);
        if (C17199j.a(bArr)) {
            this.f143080a.set(i10, b10);
        }
        return b10;
    }

    public List<?> l() {
        return Collections.unmodifiableList(this.f143080a);
    }

    /* renamed from: m */
    public String remove(int i10) {
        Object remove = this.f143080a.remove(i10);
        this.modCount++;
        return j(remove);
    }

    /* renamed from: p */
    public String set(int i10, String str) {
        return j(this.f143080a.set(i10, str));
    }

    public int size() {
        return this.f143080a.size();
    }

    public C17204o w() {
        return new C17213x(this);
    }

    public boolean addAll(int i10, Collection<? extends String> collection) {
        if (collection instanceof C17204o) {
            collection = ((C17204o) collection).l();
        }
        boolean addAll = this.f143080a.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public C17203n(C17204o oVar) {
        this.f143080a = new ArrayList(oVar.size());
        addAll(oVar);
    }
}
