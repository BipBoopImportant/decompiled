package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

public final class g<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<Comparable> f69133i = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Comparator<? super K> f69134a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f69135b;

    /* renamed from: c  reason: collision with root package name */
    e<K, V> f69136c;

    /* renamed from: d  reason: collision with root package name */
    int f69137d;

    /* renamed from: e  reason: collision with root package name */
    int f69138e;

    /* renamed from: f  reason: collision with root package name */
    final e<K, V> f69139f;

    /* renamed from: g  reason: collision with root package name */
    private g<K, V>.defpackage.b f69140g;

    /* renamed from: h  reason: collision with root package name */
    private g<K, V>.defpackage.c f69141h;

    class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    class b extends AbstractSet<Map.Entry<K, V>> {

        class a extends g<K, V>.defpackage.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && g.this.c((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            e c10;
            if (!(obj instanceof Map.Entry) || (c10 = g.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            g.this.h(c10, true);
            return true;
        }

        public int size() {
            return g.this.f69137d;
        }
    }

    final class c extends AbstractSet<K> {

        class a extends g<K, V>.defpackage.d<K> {
            a() {
                super();
            }

            public K next() {
                return a().f69155f;
            }
        }

        c() {
        }

        public void clear() {
            g.this.clear();
        }

        public boolean contains(Object obj) {
            return g.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return g.this.i(obj) != null;
        }

        public int size() {
            return g.this.f69137d;
        }
    }

    private abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f69146a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f69147b = null;

        /* renamed from: c  reason: collision with root package name */
        int f69148c;

        d() {
            this.f69146a = g.this.f69139f.f69153d;
            this.f69148c = g.this.f69138e;
        }

        /* access modifiers changed from: package-private */
        public final e<K, V> a() {
            e<K, V> eVar = this.f69146a;
            g gVar = g.this;
            if (eVar == gVar.f69139f) {
                throw new NoSuchElementException();
            } else if (gVar.f69138e == this.f69148c) {
                this.f69146a = eVar.f69153d;
                this.f69147b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f69146a != g.this.f69139f;
        }

        public final void remove() {
            e<K, V> eVar = this.f69147b;
            if (eVar != null) {
                g.this.h(eVar, true);
                this.f69147b = null;
                this.f69148c = g.this.f69138e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    public g() {
        this(f69133i, true);
    }

    private static boolean a(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    private void f(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f69151b;
            e<K, V> eVar3 = eVar.f69152c;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f69158i : 0;
            int i12 = eVar3 != null ? eVar3.f69158i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f69151b;
                e<K, V> eVar5 = eVar3.f69152c;
                int i14 = eVar5 != null ? eVar5.f69158i : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f69158i;
                }
                int i15 = i10 - i14;
                if (i15 == -1 || (i15 == 0 && !z10)) {
                    l(eVar);
                } else {
                    m(eVar3);
                    l(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f69151b;
                e<K, V> eVar7 = eVar2.f69152c;
                int i16 = eVar7 != null ? eVar7.f69158i : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f69158i;
                }
                int i17 = i10 - i16;
                if (i17 == 1 || (i17 == 0 && !z10)) {
                    m(eVar);
                } else {
                    l(eVar2);
                    m(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f69158i = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f69158i = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f69150a;
        }
    }

    private void k(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f69150a;
        eVar.f69150a = null;
        if (eVar2 != null) {
            eVar2.f69150a = eVar3;
        }
        if (eVar3 == null) {
            this.f69136c = eVar2;
        } else if (eVar3.f69151b == eVar) {
            eVar3.f69151b = eVar2;
        } else {
            eVar3.f69152c = eVar2;
        }
    }

    private void l(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f69151b;
        e<K, V> eVar3 = eVar.f69152c;
        e<K, V> eVar4 = eVar3.f69151b;
        e<K, V> eVar5 = eVar3.f69152c;
        eVar.f69152c = eVar4;
        if (eVar4 != null) {
            eVar4.f69150a = eVar;
        }
        k(eVar, eVar3);
        eVar3.f69151b = eVar;
        eVar.f69150a = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f69158i : 0, eVar4 != null ? eVar4.f69158i : 0) + 1;
        eVar.f69158i = max;
        if (eVar5 != null) {
            i10 = eVar5.f69158i;
        }
        eVar3.f69158i = Math.max(max, i10) + 1;
    }

    private void m(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f69151b;
        e<K, V> eVar3 = eVar.f69152c;
        e<K, V> eVar4 = eVar2.f69151b;
        e<K, V> eVar5 = eVar2.f69152c;
        eVar.f69151b = eVar5;
        if (eVar5 != null) {
            eVar5.f69150a = eVar;
        }
        k(eVar, eVar2);
        eVar2.f69152c = eVar;
        eVar.f69150a = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f69158i : 0, eVar5 != null ? eVar5.f69158i : 0) + 1;
        eVar.f69158i = max;
        if (eVar4 != null) {
            i10 = eVar4.f69158i;
        }
        eVar2.f69158i = Math.max(max, i10) + 1;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> b(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f69134a;
        e<K, V> eVar2 = this.f69136c;
        if (eVar2 != null) {
            Comparable comparable = comparator == f69133i ? (Comparable) k10 : null;
            while (true) {
                i10 = comparable != null ? comparable.compareTo(eVar2.f69155f) : comparator.compare(k10, eVar2.f69155f);
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f69151b : eVar2.f69152c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f69139f;
        if (eVar2 != null) {
            eVar = new e<>(this.f69135b, eVar2, k10, eVar4, eVar4.f69154e);
            if (i10 < 0) {
                eVar2.f69151b = eVar;
            } else {
                eVar2.f69152c = eVar;
            }
            f(eVar2, true);
        } else if (comparator != f69133i || (k10 instanceof Comparable)) {
            eVar = new e<>(this.f69135b, eVar2, k10, eVar4, eVar4.f69154e);
            this.f69136c = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        this.f69137d++;
        this.f69138e++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d10 = d(entry.getKey());
        if (d10 == null || !a(d10.f69157h, entry.getValue())) {
            return null;
        }
        return d10;
    }

    public void clear() {
        this.f69136c = null;
        this.f69137d = 0;
        this.f69138e++;
        e<K, V> eVar = this.f69139f;
        eVar.f69154e = eVar;
        eVar.f69153d = eVar;
    }

    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public e<K, V> d(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        g<K, V>.defpackage.b bVar = this.f69140g;
        if (bVar != null) {
            return bVar;
        }
        g<K, V>.defpackage.b bVar2 = new b();
        this.f69140g = bVar2;
        return bVar2;
    }

    public V get(Object obj) {
        e d10 = d(obj);
        if (d10 != null) {
            return d10.f69157h;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void h(e<K, V> eVar, boolean z10) {
        int i10;
        if (z10) {
            e<K, V> eVar2 = eVar.f69154e;
            eVar2.f69153d = eVar.f69153d;
            eVar.f69153d.f69154e = eVar2;
        }
        e<K, V> eVar3 = eVar.f69151b;
        e<K, V> eVar4 = eVar.f69152c;
        e<K, V> eVar5 = eVar.f69150a;
        int i11 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                k(eVar, eVar3);
                eVar.f69151b = null;
            } else if (eVar4 != null) {
                k(eVar, eVar4);
                eVar.f69152c = null;
            } else {
                k(eVar, (e<K, V>) null);
            }
            f(eVar5, false);
            this.f69137d--;
            this.f69138e++;
            return;
        }
        e<K, V> b10 = eVar3.f69158i > eVar4.f69158i ? eVar3.b() : eVar4.a();
        h(b10, false);
        e<K, V> eVar6 = eVar.f69151b;
        if (eVar6 != null) {
            i10 = eVar6.f69158i;
            b10.f69151b = eVar6;
            eVar6.f69150a = b10;
            eVar.f69151b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar7 = eVar.f69152c;
        if (eVar7 != null) {
            i11 = eVar7.f69158i;
            b10.f69152c = eVar7;
            eVar7.f69150a = b10;
            eVar.f69152c = null;
        }
        b10.f69158i = Math.max(i10, i11) + 1;
        k(eVar, b10);
    }

    /* access modifiers changed from: package-private */
    public e<K, V> i(Object obj) {
        e<K, V> d10 = d(obj);
        if (d10 != null) {
            h(d10, true);
        }
        return d10;
    }

    public Set<K> keySet() {
        g<K, V>.defpackage.c cVar = this.f69141h;
        if (cVar != null) {
            return cVar;
        }
        g<K, V>.defpackage.c cVar2 = new c();
        this.f69141h = cVar2;
        return cVar2;
    }

    public V put(K k10, V v10) {
        if (k10 == null) {
            throw new NullPointerException("key == null");
        } else if (v10 != null || this.f69135b) {
            e b10 = b(k10, true);
            V v11 = b10.f69157h;
            b10.f69157h = v10;
            return v11;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public V remove(Object obj) {
        e i10 = i(obj);
        if (i10 != null) {
            return i10.f69157h;
        }
        return null;
    }

    public int size() {
        return this.f69137d;
    }

    public g(boolean z10) {
        this(f69133i, z10);
    }

    public g(Comparator<? super K> comparator, boolean z10) {
        this.f69137d = 0;
        this.f69138e = 0;
        this.f69134a = comparator == null ? f69133i : comparator;
        this.f69135b = z10;
        this.f69139f = new e<>(z10);
    }

    static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        e<K, V> f69150a;

        /* renamed from: b  reason: collision with root package name */
        e<K, V> f69151b;

        /* renamed from: c  reason: collision with root package name */
        e<K, V> f69152c;

        /* renamed from: d  reason: collision with root package name */
        e<K, V> f69153d;

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f69154e;

        /* renamed from: f  reason: collision with root package name */
        final K f69155f;

        /* renamed from: g  reason: collision with root package name */
        final boolean f69156g;

        /* renamed from: h  reason: collision with root package name */
        V f69157h;

        /* renamed from: i  reason: collision with root package name */
        int f69158i;

        e(boolean z10) {
            this.f69155f = null;
            this.f69156g = z10;
            this.f69154e = this;
            this.f69153d = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f69151b; eVar2 != null; eVar2 = eVar2.f69151b) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f69152c; eVar2 != null; eVar2 = eVar2.f69152c) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f69155f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f69157h
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.g.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f69155f;
        }

        public V getValue() {
            return this.f69157h;
        }

        public int hashCode() {
            K k10 = this.f69155f;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f69157h;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            if (v10 != null || this.f69156g) {
                V v11 = this.f69157h;
                this.f69157h = v10;
                return v11;
            }
            throw new NullPointerException("value == null");
        }

        public String toString() {
            return this.f69155f + "=" + this.f69157h;
        }

        e(boolean z10, e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f69150a = eVar;
            this.f69155f = k10;
            this.f69156g = z10;
            this.f69158i = 1;
            this.f69153d = eVar2;
            this.f69154e = eVar3;
            eVar3.f69153d = this;
            eVar2.f69154e = this;
        }
    }
}
