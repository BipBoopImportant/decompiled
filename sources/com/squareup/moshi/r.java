package com.squareup.moshi;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

final class r<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<Comparable> f122396i = new a();

    /* renamed from: a  reason: collision with root package name */
    final Comparator<? super K> f122397a;

    /* renamed from: b  reason: collision with root package name */
    g<K, V>[] f122398b;

    /* renamed from: c  reason: collision with root package name */
    final g<K, V> f122399c;

    /* renamed from: d  reason: collision with root package name */
    int f122400d;

    /* renamed from: e  reason: collision with root package name */
    int f122401e;

    /* renamed from: f  reason: collision with root package name */
    int f122402f;

    /* renamed from: g  reason: collision with root package name */
    private r<K, V>.defpackage.d f122403g;

    /* renamed from: h  reason: collision with root package name */
    private r<K, V>.defpackage.e f122404h;

    class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private g<K, V> f122405a;

        /* renamed from: b  reason: collision with root package name */
        private int f122406b;

        /* renamed from: c  reason: collision with root package name */
        private int f122407c;

        /* renamed from: d  reason: collision with root package name */
        private int f122408d;

        b() {
        }

        /* access modifiers changed from: package-private */
        public void a(g<K, V> gVar) {
            gVar.f122420c = null;
            gVar.f122418a = null;
            gVar.f122419b = null;
            gVar.f122426i = 1;
            int i10 = this.f122406b;
            if (i10 > 0) {
                int i11 = this.f122408d;
                if ((i11 & 1) == 0) {
                    this.f122408d = i11 + 1;
                    this.f122406b = i10 - 1;
                    this.f122407c++;
                }
            }
            gVar.f122418a = this.f122405a;
            this.f122405a = gVar;
            int i12 = this.f122408d;
            int i13 = i12 + 1;
            this.f122408d = i13;
            int i14 = this.f122406b;
            if (i14 > 0 && (i13 & 1) == 0) {
                this.f122408d = i12 + 2;
                this.f122406b = i14 - 1;
                this.f122407c++;
            }
            int i15 = 4;
            while (true) {
                int i16 = i15 - 1;
                if ((this.f122408d & i16) == i16) {
                    int i17 = this.f122407c;
                    if (i17 == 0) {
                        g<K, V> gVar2 = this.f122405a;
                        g<K, V> gVar3 = gVar2.f122418a;
                        g<K, V> gVar4 = gVar3.f122418a;
                        gVar3.f122418a = gVar4.f122418a;
                        this.f122405a = gVar3;
                        gVar3.f122419b = gVar4;
                        gVar3.f122420c = gVar2;
                        gVar3.f122426i = gVar2.f122426i + 1;
                        gVar4.f122418a = gVar3;
                        gVar2.f122418a = gVar3;
                    } else if (i17 == 1) {
                        g<K, V> gVar5 = this.f122405a;
                        g<K, V> gVar6 = gVar5.f122418a;
                        this.f122405a = gVar6;
                        gVar6.f122420c = gVar5;
                        gVar6.f122426i = gVar5.f122426i + 1;
                        gVar5.f122418a = gVar6;
                        this.f122407c = 0;
                    } else if (i17 == 2) {
                        this.f122407c = 0;
                    }
                    i15 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(int i10) {
            this.f122406b = ((Integer.highestOneBit(i10) * 2) - 1) - i10;
            this.f122408d = 0;
            this.f122407c = 0;
            this.f122405a = null;
        }

        /* access modifiers changed from: package-private */
        public g<K, V> c() {
            g<K, V> gVar = this.f122405a;
            if (gVar.f122418a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    static class c<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private g<K, V> f122409a;

        c() {
        }

        public g<K, V> a() {
            g<K, V> gVar = this.f122409a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f122418a;
            gVar.f122418a = null;
            g<K, V> gVar3 = gVar.f122420c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f122418a = gVar5;
                    gVar3 = gVar2.f122419b;
                } else {
                    this.f122409a = gVar5;
                    return gVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f122418a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f122419b;
            }
            this.f122409a = gVar2;
        }
    }

    final class d extends AbstractSet<Map.Entry<K, V>> {

        class a extends r<K, V>.defpackage.f<Map.Entry<K, V>> {
            a() {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        d() {
        }

        public void clear() {
            r.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && r.this.f((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            g f10;
            if (!(obj instanceof Map.Entry) || (f10 = r.this.f((Map.Entry) obj)) == null) {
                return false;
            }
            r.this.k(f10, true);
            return true;
        }

        public int size() {
            return r.this.f122400d;
        }
    }

    final class e extends AbstractSet<K> {

        class a extends r<K, V>.defpackage.f<K> {
            a() {
                super();
            }

            public K next() {
                return a().f122423f;
            }
        }

        e() {
        }

        public void clear() {
            r.this.clear();
        }

        public boolean contains(Object obj) {
            return r.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new a();
        }

        public boolean remove(Object obj) {
            return r.this.l(obj) != null;
        }

        public int size() {
            return r.this.f122400d;
        }
    }

    abstract class f<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        g<K, V> f122414a;

        /* renamed from: b  reason: collision with root package name */
        g<K, V> f122415b = null;

        /* renamed from: c  reason: collision with root package name */
        int f122416c;

        f() {
            this.f122414a = r.this.f122399c.f122421d;
            this.f122416c = r.this.f122401e;
        }

        /* access modifiers changed from: package-private */
        public final g<K, V> a() {
            g<K, V> gVar = this.f122414a;
            r rVar = r.this;
            if (gVar == rVar.f122399c) {
                throw new NoSuchElementException();
            } else if (rVar.f122401e == this.f122416c) {
                this.f122414a = gVar.f122421d;
                this.f122415b = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f122414a != r.this.f122399c;
        }

        public final void remove() {
            g<K, V> gVar = this.f122415b;
            if (gVar != null) {
                r.this.k(gVar, true);
                this.f122415b = null;
                this.f122416c = r.this.f122401e;
                return;
            }
            throw new IllegalStateException();
        }
    }

    r() {
        this((Comparator) null);
    }

    private void a() {
        g<K, V>[] b10 = b(this.f122398b);
        this.f122398b = b10;
        this.f122402f = (b10.length / 2) + (b10.length / 4);
    }

    static <K, V> g<K, V>[] b(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[(length * 2)];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i10 = 0; i10 < length; i10++) {
            g<K, V> gVar = gVarArr[i10];
            if (gVar != null) {
                cVar.b(gVar);
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    g a10 = cVar.a();
                    if (a10 == null) {
                        break;
                    } else if ((a10.f122424g & length) == 0) {
                        i11++;
                    } else {
                        i12++;
                    }
                }
                bVar.b(i11);
                bVar2.b(i12);
                cVar.b(gVar);
                while (true) {
                    g a11 = cVar.a();
                    if (a11 == null) {
                        break;
                    } else if ((a11.f122424g & length) == 0) {
                        bVar.a(a11);
                    } else {
                        bVar2.a(a11);
                    }
                }
                g<K, V> gVar2 = null;
                gVarArr2[i10] = i11 > 0 ? bVar.c() : null;
                int i13 = i10 + length;
                if (i12 > 0) {
                    gVar2 = bVar2.c();
                }
                gVarArr2[i13] = gVar2;
            }
        }
        return gVarArr2;
    }

    private boolean c(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void i(g<K, V> gVar, boolean z10) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f122419b;
            g<K, V> gVar3 = gVar.f122420c;
            int i10 = 0;
            int i11 = gVar2 != null ? gVar2.f122426i : 0;
            int i12 = gVar3 != null ? gVar3.f122426i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                g<K, V> gVar4 = gVar3.f122419b;
                g<K, V> gVar5 = gVar3.f122420c;
                int i14 = gVar5 != null ? gVar5.f122426i : 0;
                if (gVar4 != null) {
                    i10 = gVar4.f122426i;
                }
                int i15 = i10 - i14;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    o(gVar3);
                }
                n(gVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                g<K, V> gVar6 = gVar2.f122419b;
                g<K, V> gVar7 = gVar2.f122420c;
                int i16 = gVar7 != null ? gVar7.f122426i : 0;
                if (gVar6 != null) {
                    i10 = gVar6.f122426i;
                }
                int i17 = i10 - i16;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    n(gVar2);
                }
                o(gVar);
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                gVar.f122426i = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                gVar.f122426i = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            gVar = gVar.f122418a;
        }
    }

    private void m(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f122418a;
        gVar.f122418a = null;
        if (gVar2 != null) {
            gVar2.f122418a = gVar3;
        }
        if (gVar3 == null) {
            int i10 = gVar.f122424g;
            g<K, V>[] gVarArr = this.f122398b;
            gVarArr[i10 & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f122419b == gVar) {
            gVar3.f122419b = gVar2;
        } else {
            gVar3.f122420c = gVar2;
        }
    }

    private void n(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f122419b;
        g<K, V> gVar3 = gVar.f122420c;
        g<K, V> gVar4 = gVar3.f122419b;
        g<K, V> gVar5 = gVar3.f122420c;
        gVar.f122420c = gVar4;
        if (gVar4 != null) {
            gVar4.f122418a = gVar;
        }
        m(gVar, gVar3);
        gVar3.f122419b = gVar;
        gVar.f122418a = gVar3;
        int i10 = 0;
        int max = Math.max(gVar2 != null ? gVar2.f122426i : 0, gVar4 != null ? gVar4.f122426i : 0) + 1;
        gVar.f122426i = max;
        if (gVar5 != null) {
            i10 = gVar5.f122426i;
        }
        gVar3.f122426i = Math.max(max, i10) + 1;
    }

    private void o(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f122419b;
        g<K, V> gVar3 = gVar.f122420c;
        g<K, V> gVar4 = gVar2.f122419b;
        g<K, V> gVar5 = gVar2.f122420c;
        gVar.f122419b = gVar5;
        if (gVar5 != null) {
            gVar5.f122418a = gVar;
        }
        m(gVar, gVar2);
        gVar2.f122420c = gVar;
        gVar.f122418a = gVar2;
        int i10 = 0;
        int max = Math.max(gVar3 != null ? gVar3.f122426i : 0, gVar5 != null ? gVar5.f122426i : 0) + 1;
        gVar.f122426i = max;
        if (gVar4 != null) {
            i10 = gVar4.f122426i;
        }
        gVar2.f122426i = Math.max(max, i10) + 1;
    }

    private static int p(int i10) {
        int i11 = i10 ^ ((i10 >>> 20) ^ (i10 >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public void clear() {
        Arrays.fill(this.f122398b, (Object) null);
        this.f122400d = 0;
        this.f122401e++;
        g<K, V> gVar = this.f122399c;
        g<K, V> gVar2 = gVar.f122421d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f122421d;
            gVar2.f122422e = null;
            gVar2.f122421d = null;
            gVar2 = gVar3;
        }
        gVar.f122422e = gVar;
        gVar.f122421d = gVar;
    }

    public boolean containsKey(Object obj) {
        return h(obj) != null;
    }

    /* access modifiers changed from: package-private */
    public g<K, V> d(K k10, boolean z10) {
        int i10;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f122397a;
        g<K, V>[] gVarArr = this.f122398b;
        int p10 = p(k10.hashCode());
        int length = (gVarArr.length - 1) & p10;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f122396i ? (Comparable) k10 : null;
            while (true) {
                i10 = comparable != null ? comparable.compareTo(gVar2.f122423f) : comparator.compare(k10, gVar2.f122423f);
                if (i10 == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = i10 < 0 ? gVar2.f122419b : gVar2.f122420c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            i10 = 0;
        }
        g<K, V> gVar4 = gVar2;
        int i11 = i10;
        if (!z10) {
            return null;
        }
        g<K, V> gVar5 = this.f122399c;
        if (gVar4 != null) {
            gVar = new g<>(gVar4, k10, p10, gVar5, gVar5.f122422e);
            if (i11 < 0) {
                gVar4.f122419b = gVar;
            } else {
                gVar4.f122420c = gVar;
            }
            i(gVar4, true);
        } else if (comparator != f122396i || (k10 instanceof Comparable)) {
            gVar = new g<>(gVar4, k10, p10, gVar5, gVar5.f122422e);
            gVarArr[length] = gVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        int i12 = this.f122400d;
        this.f122400d = i12 + 1;
        if (i12 > this.f122402f) {
            a();
        }
        this.f122401e++;
        return gVar;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        r<K, V>.defpackage.d dVar = this.f122403g;
        if (dVar != null) {
            return dVar;
        }
        r<K, V>.defpackage.d dVar2 = new d();
        this.f122403g = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    public g<K, V> f(Map.Entry<?, ?> entry) {
        g<K, V> h10 = h(entry.getKey());
        if (h10 == null || !c(h10.f122425h, entry.getValue())) {
            return null;
        }
        return h10;
    }

    public V get(Object obj) {
        g h10 = h(obj);
        if (h10 != null) {
            return h10.f122425h;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public g<K, V> h(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return d(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void k(g<K, V> gVar, boolean z10) {
        int i10;
        if (z10) {
            g<K, V> gVar2 = gVar.f122422e;
            gVar2.f122421d = gVar.f122421d;
            gVar.f122421d.f122422e = gVar2;
            gVar.f122422e = null;
            gVar.f122421d = null;
        }
        g<K, V> gVar3 = gVar.f122419b;
        g<K, V> gVar4 = gVar.f122420c;
        g<K, V> gVar5 = gVar.f122418a;
        int i11 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m(gVar, gVar3);
                gVar.f122419b = null;
            } else if (gVar4 != null) {
                m(gVar, gVar4);
                gVar.f122420c = null;
            } else {
                m(gVar, (g<K, V>) null);
            }
            i(gVar5, false);
            this.f122400d--;
            this.f122401e++;
            return;
        }
        g<K, V> b10 = gVar3.f122426i > gVar4.f122426i ? gVar3.b() : gVar4.a();
        k(b10, false);
        g<K, V> gVar6 = gVar.f122419b;
        if (gVar6 != null) {
            i10 = gVar6.f122426i;
            b10.f122419b = gVar6;
            gVar6.f122418a = b10;
            gVar.f122419b = null;
        } else {
            i10 = 0;
        }
        g<K, V> gVar7 = gVar.f122420c;
        if (gVar7 != null) {
            i11 = gVar7.f122426i;
            b10.f122420c = gVar7;
            gVar7.f122418a = b10;
            gVar.f122420c = null;
        }
        b10.f122426i = Math.max(i10, i11) + 1;
        m(gVar, b10);
    }

    public Set<K> keySet() {
        r<K, V>.defpackage.e eVar = this.f122404h;
        if (eVar != null) {
            return eVar;
        }
        r<K, V>.defpackage.e eVar2 = new e();
        this.f122404h = eVar2;
        return eVar2;
    }

    /* access modifiers changed from: package-private */
    public g<K, V> l(Object obj) {
        g<K, V> h10 = h(obj);
        if (h10 != null) {
            k(h10, true);
        }
        return h10;
    }

    public V put(K k10, V v10) {
        if (k10 != null) {
            g d10 = d(k10, true);
            V v11 = d10.f122425h;
            d10.f122425h = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        g l10 = l(obj);
        if (l10 != null) {
            return l10.f122425h;
        }
        return null;
    }

    public int size() {
        return this.f122400d;
    }

    r(Comparator<? super K> comparator) {
        this.f122400d = 0;
        this.f122401e = 0;
        this.f122397a = comparator == null ? f122396i : comparator;
        this.f122399c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f122398b = gVarArr;
        this.f122402f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        g<K, V> f122418a;

        /* renamed from: b  reason: collision with root package name */
        g<K, V> f122419b;

        /* renamed from: c  reason: collision with root package name */
        g<K, V> f122420c;

        /* renamed from: d  reason: collision with root package name */
        g<K, V> f122421d;

        /* renamed from: e  reason: collision with root package name */
        g<K, V> f122422e;

        /* renamed from: f  reason: collision with root package name */
        final K f122423f;

        /* renamed from: g  reason: collision with root package name */
        final int f122424g;

        /* renamed from: h  reason: collision with root package name */
        V f122425h;

        /* renamed from: i  reason: collision with root package name */
        int f122426i;

        g() {
            this.f122423f = null;
            this.f122424g = -1;
            this.f122422e = this;
            this.f122421d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f122419b; gVar2 != null; gVar2 = gVar2.f122419b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f122420c; gVar2 != null; gVar2 = gVar2.f122420c) {
                gVar = gVar2;
            }
            return gVar;
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
                K r0 = r3.f122423f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f122425h
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
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.r.g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f122423f;
        }

        public V getValue() {
            return this.f122425h;
        }

        public int hashCode() {
            K k10 = this.f122423f;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f122425h;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            V v11 = this.f122425h;
            this.f122425h = v10;
            return v11;
        }

        public String toString() {
            return this.f122423f + "=" + this.f122425h;
        }

        g(g<K, V> gVar, K k10, int i10, g<K, V> gVar2, g<K, V> gVar3) {
            this.f122418a = gVar;
            this.f122423f = k10;
            this.f122424g = i10;
            this.f122426i = 1;
            this.f122421d = gVar2;
            this.f122422e = gVar3;
            gVar3.f122421d = this;
            gVar2.f122422e = this;
        }
    }
}
