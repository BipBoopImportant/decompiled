package com.squareup.moshi;

import com.squareup.moshi.k;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class o extends k {

    /* renamed from: h  reason: collision with root package name */
    private static final Object f122380h = new Object();

    /* renamed from: g  reason: collision with root package name */
    private Object[] f122381g;

    static final class a implements Iterator<Object>, Cloneable {

        /* renamed from: a  reason: collision with root package name */
        final k.b f122382a;

        /* renamed from: b  reason: collision with root package name */
        final Object[] f122383b;

        /* renamed from: c  reason: collision with root package name */
        int f122384c;

        a(k.b bVar, Object[] objArr, int i10) {
            this.f122382a = bVar;
            this.f122383b = objArr;
            this.f122384c = i10;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public a clone() {
            return new a(this.f122382a, this.f122383b, this.f122384c);
        }

        public boolean hasNext() {
            return this.f122384c < this.f122383b.length;
        }

        public Object next() {
            Object[] objArr = this.f122383b;
            int i10 = this.f122384c;
            this.f122384c = i10 + 1;
            return objArr[i10];
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    o(Object obj) {
        int[] iArr = this.f122358b;
        int i10 = this.f122357a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f122381g = objArr;
        this.f122357a = i10 + 1;
        objArr[i10] = obj;
    }

    private void B(Object obj) {
        int i10 = this.f122357a;
        if (i10 == this.f122381g.length) {
            if (i10 != 256) {
                int[] iArr = this.f122358b;
                this.f122358b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f122359c;
                this.f122359c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f122360d;
                this.f122360d = Arrays.copyOf(iArr2, iArr2.length * 2);
                Object[] objArr = this.f122381g;
                this.f122381g = Arrays.copyOf(objArr, objArr.length * 2);
            } else {
                throw new h("Nesting too deep at " + m());
            }
        }
        Object[] objArr2 = this.f122381g;
        int i11 = this.f122357a;
        this.f122357a = i11 + 1;
        objArr2[i11] = obj;
    }

    private void F() {
        int i10 = this.f122357a;
        int i11 = i10 - 1;
        this.f122357a = i11;
        Object[] objArr = this.f122381g;
        objArr[i11] = null;
        this.f122358b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f122360d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    B(it.next());
                }
            }
        }
    }

    private <T> T J(Class<T> cls, k.b bVar) {
        int i10 = this.f122357a;
        Object obj = i10 != 0 ? this.f122381g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && bVar == k.b.NULL) {
            return null;
        }
        if (obj == f122380h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw z(obj, bVar);
    }

    private String N(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw z(key, k.b.NAME);
    }

    public String B0() {
        Map.Entry entry = (Map.Entry) J(Map.Entry.class, k.b.NAME);
        String N10 = N(entry);
        this.f122381g[this.f122357a - 1] = entry.getValue();
        this.f122359c[this.f122357a - 2] = N10;
        return N10;
    }

    public String C1() {
        int i10 = this.f122357a;
        String str = i10 != 0 ? this.f122381g[i10 - 1] : null;
        if (str instanceof String) {
            F();
            return str;
        } else if (str instanceof Number) {
            F();
            return str.toString();
        } else if (str == f122380h) {
            throw new IllegalStateException("JsonReader is closed");
        } else {
            throw z(str, k.b.STRING);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw z(r1, com.squareup.moshi.k.b.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r1).intValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int G0() {
        /*
            r3 = this;
            com.squareup.moshi.k$b r0 = com.squareup.moshi.k.b.NUMBER
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r1 = r3.J(r1, r0)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0013
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            goto L_0x002b
        L_0x0013:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0036
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x001f }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            int r0 = r0.intValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.F()
            return r0
        L_0x002f:
            com.squareup.moshi.k$b r0 = com.squareup.moshi.k.b.NUMBER
            com.squareup.moshi.h r0 = r3.z(r1, r0)
            throw r0
        L_0x0036:
            com.squareup.moshi.h r0 = r3.z(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.o.G0():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        throw z(r1, com.squareup.moshi.k.b.NUMBER);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r0 = new java.math.BigDecimal((java.lang.String) r1).longValueExact();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long U2() {
        /*
            r3 = this;
            com.squareup.moshi.k$b r0 = com.squareup.moshi.k.b.NUMBER
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r1 = r3.J(r1, r0)
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto L_0x0013
            java.lang.Number r1 = (java.lang.Number) r1
            long r0 = r1.longValue()
            goto L_0x002b
        L_0x0013:
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L_0x0036
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NumberFormatException -> 0x001f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x001f }
            goto L_0x002b
        L_0x001f:
            java.math.BigDecimal r0 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x002f }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x002f }
            r0.<init>(r2)     // Catch:{ NumberFormatException -> 0x002f }
            long r0 = r0.longValueExact()     // Catch:{ NumberFormatException -> 0x002f }
        L_0x002b:
            r3.F()
            return r0
        L_0x002f:
            com.squareup.moshi.k$b r0 = com.squareup.moshi.k.b.NUMBER
            com.squareup.moshi.h r0 = r3.z(r1, r0)
            throw r0
        L_0x0036:
            com.squareup.moshi.h r0 = r3.z(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.o.U2():long");
    }

    public void a0() {
        if (!this.f122362f) {
            int i10 = this.f122357a;
            if (i10 > 1) {
                this.f122359c[i10 - 2] = "null";
            }
            Object obj = i10 != 0 ? this.f122381g[i10 - 1] : null;
            if (obj instanceof a) {
                throw new h("Expected a value but was " + n() + " at path " + m());
            } else if (obj instanceof Map.Entry) {
                Object[] objArr = this.f122381g;
                objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
            } else if (i10 > 0) {
                F();
            } else {
                throw new h("Expected a value but was " + n() + " at path " + m());
            }
        } else {
            throw new h("Cannot skip unexpected " + n() + " at " + m());
        }
    }

    public void c() {
        List list = (List) J(List.class, k.b.BEGIN_ARRAY);
        a aVar = new a(k.b.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f122381g;
        int i10 = this.f122357a;
        objArr[i10 - 1] = aVar;
        this.f122358b[i10 - 1] = 1;
        this.f122360d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            B(aVar.next());
        }
    }

    public void close() {
        Arrays.fill(this.f122381g, 0, this.f122357a, (Object) null);
        this.f122381g[0] = f122380h;
        this.f122358b[0] = 8;
        this.f122357a = 1;
    }

    public void d() {
        Map map = (Map) J(Map.class, k.b.BEGIN_OBJECT);
        a aVar = new a(k.b.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f122381g;
        int i10 = this.f122357a;
        objArr[i10 - 1] = aVar;
        this.f122358b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            B(aVar.next());
        }
    }

    public double d2() {
        double d10;
        k.b bVar = k.b.NUMBER;
        Object J10 = J(Object.class, bVar);
        if (J10 instanceof Number) {
            d10 = ((Number) J10).doubleValue();
        } else if (J10 instanceof String) {
            try {
                d10 = Double.parseDouble((String) J10);
            } catch (NumberFormatException unused) {
                throw z(J10, k.b.NUMBER);
            }
        } else {
            throw z(J10, bVar);
        }
        if (this.f122361e || (!Double.isNaN(d10) && !Double.isInfinite(d10))) {
            F();
            return d10;
        }
        throw new i("JSON forbids NaN and infinities: " + d10 + " at path " + m());
    }

    public void e() {
        k.b bVar = k.b.END_ARRAY;
        a aVar = (a) J(a.class, bVar);
        if (aVar.f122382a != bVar || aVar.hasNext()) {
            throw z(aVar, bVar);
        }
        F();
    }

    public void f() {
        k.b bVar = k.b.END_OBJECT;
        a aVar = (a) J(a.class, bVar);
        if (aVar.f122382a != bVar || aVar.hasNext()) {
            throw z(aVar, bVar);
        }
        this.f122359c[this.f122357a - 1] = null;
        F();
    }

    public boolean hasNext() {
        int i10 = this.f122357a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f122381g[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    public <T> T i() {
        J(Void.class, k.b.NULL);
        F();
        return null;
    }

    public k.b n() {
        int i10 = this.f122357a;
        if (i10 == 0) {
            return k.b.END_DOCUMENT;
        }
        Object obj = this.f122381g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f122382a;
        }
        if (obj instanceof List) {
            return k.b.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return k.b.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return k.b.NAME;
        }
        if (obj instanceof String) {
            return k.b.STRING;
        }
        if (obj instanceof Boolean) {
            return k.b.BOOLEAN;
        }
        if (obj instanceof Number) {
            return k.b.NUMBER;
        }
        if (obj == null) {
            return k.b.NULL;
        }
        if (obj == f122380h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw z(obj, "a JSON value");
    }

    public void o() {
        if (hasNext()) {
            B(B0());
        }
    }

    public int s(k.a aVar) {
        Map.Entry entry = (Map.Entry) J(Map.Entry.class, k.b.NAME);
        String N10 = N(entry);
        int length = aVar.f122363a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (aVar.f122363a[i10].equals(N10)) {
                this.f122381g[this.f122357a - 1] = entry.getValue();
                this.f122359c[this.f122357a - 2] = N10;
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int t(com.squareup.moshi.k.a r6) {
        /*
            r5 = this;
            int r0 = r5.f122357a
            if (r0 == 0) goto L_0x000b
            java.lang.Object[] r1 = r5.f122381g
            int r0 = r0 + -1
            r0 = r1[r0]
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            boolean r1 = r0 instanceof java.lang.String
            r2 = -1
            if (r1 != 0) goto L_0x001e
            java.lang.Object r6 = f122380h
            if (r0 == r6) goto L_0x0016
            return r2
        L_0x0016:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "JsonReader is closed"
            r6.<init>(r0)
            throw r6
        L_0x001e:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String[] r1 = r6.f122363a
            int r1 = r1.length
            r3 = 0
        L_0x0024:
            if (r3 >= r1) goto L_0x0037
            java.lang.String[] r4 = r6.f122363a
            r4 = r4[r3]
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0034
            r5.F()
            return r3
        L_0x0034:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0037:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.o.t(com.squareup.moshi.k$a):int");
    }

    public void w() {
        if (!this.f122362f) {
            this.f122381g[this.f122357a - 1] = ((Map.Entry) J(Map.Entry.class, k.b.NAME)).getValue();
            this.f122359c[this.f122357a - 2] = "null";
            return;
        }
        k.b n10 = n();
        B0();
        throw new h("Cannot skip unexpected " + n10 + " at " + m());
    }

    public boolean w1() {
        F();
        return ((Boolean) J(Boolean.class, k.b.BOOLEAN)).booleanValue();
    }
}
