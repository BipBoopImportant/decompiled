package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.K0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class I0<T extends K0<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final I0 f49208d = new I0(true);

    /* renamed from: a  reason: collision with root package name */
    final W1<T, Object> f49209a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f49210b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f49211c;

    private I0() {
        this.f49209a = W1.b(16);
    }

    static int a(B2 b22, int i10, Object obj) {
        int g02 = C7547x0.g0(i10);
        if (b22 == B2.GROUP) {
            U0.g((A1) obj);
            g02 <<= 1;
        }
        return g02 + b(b22, obj);
    }

    private static int b(B2 b22, Object obj) {
        switch (H0.f49207b[b22.ordinal()]) {
            case 1:
                return C7547x0.z(((Double) obj).doubleValue());
            case 2:
                return C7547x0.A(((Float) obj).floatValue());
            case 3:
                return C7547x0.d0(((Long) obj).longValue());
            case 4:
                return C7547x0.i0(((Long) obj).longValue());
            case 5:
                return C7547x0.k0(((Integer) obj).intValue());
            case 6:
                return C7547x0.r0(((Long) obj).longValue());
            case 7:
                return C7547x0.w0(((Integer) obj).intValue());
            case 8:
                return C7547x0.L(((Boolean) obj).booleanValue());
            case 9:
                return C7547x0.V((A1) obj);
            case 10:
                return obj instanceof C7482e1 ? C7547x0.d((C7482e1) obj) : C7547x0.J((A1) obj);
            case 11:
                return obj instanceof C7497i0 ? C7547x0.I((C7497i0) obj) : C7547x0.K((String) obj);
            case 12:
                return obj instanceof C7497i0 ? C7547x0.I((C7497i0) obj) : C7547x0.M((byte[]) obj);
            case 13:
                return C7547x0.o0(((Integer) obj).intValue());
            case 14:
                return C7547x0.z0(((Integer) obj).intValue());
            case 15:
                return C7547x0.v0(((Long) obj).longValue());
            case 16:
                return C7547x0.s0(((Integer) obj).intValue());
            case 17:
                return C7547x0.n0(((Long) obj).longValue());
            case 18:
                return obj instanceof T0 ? C7547x0.B0(((T0) obj).zza()) : C7547x0.B0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static <T extends K0<T>> I0<T> c() {
        return f49208d;
    }

    private static Object e(Object obj) {
        if (obj instanceof I1) {
            return ((I1) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static <T extends K0<T>> boolean h(Map.Entry<T, Object> entry) {
        K0 k02 = (K0) entry.getKey();
        if (k02.zzc() == E2.MESSAGE) {
            if (k02.zzd()) {
                for (A1 a10 : (List) entry.getValue()) {
                    if (!a10.a()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof A1) {
                    if (!((A1) value).a()) {
                        return false;
                    }
                } else if (value instanceof C7482e1) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    private final void k(Map.Entry<T, Object> entry) {
        K0 k02 = (K0) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C7482e1) {
            value = C7482e1.e();
        }
        if (k02.zzd()) {
            Object d10 = d(k02);
            if (d10 == null) {
                d10 = new ArrayList();
            }
            for (Object e10 : (List) value) {
                ((List) d10).add(e(e10));
            }
            this.f49209a.put(k02, d10);
        } else if (k02.zzc() == E2.MESSAGE) {
            Object d11 = d(k02);
            if (d11 == null) {
                this.f49209a.put(k02, e(value));
            } else {
                this.f49209a.put(k02, d11 instanceof I1 ? k02.q((I1) d11, (I1) value) : k02.A(((A1) d11).j(), (A1) value).i());
            }
        } else {
            this.f49209a.put(k02, e(value));
        }
    }

    public static int l(K0<?> k02, Object obj) {
        B2 zzb = k02.zzb();
        int zza = k02.zza();
        if (!k02.zzd()) {
            return a(zzb, zza, obj);
        }
        int i10 = 0;
        if (k02.h()) {
            for (Object b10 : (List) obj) {
                i10 += b(zzb, b10);
            }
            return C7547x0.g0(zza) + i10 + C7547x0.D0(i10);
        }
        for (Object a10 : (List) obj) {
            i10 += a(zzb, zza, a10);
        }
        return i10;
    }

    private static int m(Map.Entry<T, Object> entry) {
        K0 k02 = (K0) entry.getKey();
        Object value = entry.getValue();
        return (k02.zzc() != E2.MESSAGE || k02.zzd() || k02.h()) ? l(k02, value) : value instanceof C7482e1 ? C7547x0.D(((K0) entry.getKey()).zza(), (C7482e1) value) : C7547x0.E(((K0) entry.getKey()).zza(), (A1) value);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r4 instanceof com.google.android.gms.internal.vision.T0) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r4 instanceof com.google.android.gms.internal.vision.C7482e1) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void p(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.vision.B2 r0 = r3.zzb()
            com.google.android.gms.internal.vision.U0.d(r4)
            int[] r1 = com.google.android.gms.internal.vision.H0.f49206a
            com.google.android.gms.internal.vision.E2 r0 = r0.a()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0041;
                case 3: goto L_0x003e;
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x0035;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = r2
            goto L_0x0046
        L_0x001a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.A1
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.C7482e1
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0023:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.T0
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x002c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.vision.C7497i0
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0035:
            boolean r1 = r4 instanceof java.lang.String
            goto L_0x0046
        L_0x0038:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L_0x0046
        L_0x003b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L_0x0046
        L_0x003e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L_0x0046
        L_0x0041:
            boolean r1 = r4 instanceof java.lang.Long
            goto L_0x0046
        L_0x0044:
            boolean r1 = r4 instanceof java.lang.Integer
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.vision.B2 r3 = r3.zzb()
            com.google.android.gms.internal.vision.E2 r3 = r3.a()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.I0.p(com.google.android.gms.internal.vision.K0, java.lang.Object):void");
    }

    public final /* synthetic */ Object clone() {
        I0 i02 = new I0();
        for (int i10 = 0; i10 < this.f49209a.m(); i10++) {
            Map.Entry<T, Object> k10 = this.f49209a.k(i10);
            i02.g((K0) k10.getKey(), k10.getValue());
        }
        for (Map.Entry next : this.f49209a.p()) {
            i02.g((K0) next.getKey(), next.getValue());
        }
        i02.f49211c = this.f49211c;
        return i02;
    }

    public final Object d(T t10) {
        Object obj = this.f49209a.get(t10);
        return obj instanceof C7482e1 ? C7482e1.e() : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I0)) {
            return false;
        }
        return this.f49209a.equals(((I0) obj).f49209a);
    }

    public final void f(I0<T> i02) {
        for (int i10 = 0; i10 < i02.f49209a.m(); i10++) {
            k(i02.f49209a.k(i10));
        }
        for (Map.Entry<T, Object> k10 : i02.f49209a.p()) {
            k(k10);
        }
    }

    public final void g(T t10, Object obj) {
        if (!t10.zzd()) {
            p(t10, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                p(t10, obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C7482e1) {
            this.f49211c = true;
        }
        this.f49209a.put(t10, obj);
    }

    public final int hashCode() {
        return this.f49209a.hashCode();
    }

    public final void i() {
        if (!this.f49210b) {
            this.f49209a.f();
            this.f49210b = true;
        }
    }

    public final void j(T t10, Object obj) {
        List list;
        if (t10.zzd()) {
            p(t10, obj);
            Object d10 = d(t10);
            if (d10 == null) {
                list = new ArrayList();
                this.f49209a.put(t10, list);
            } else {
                list = (List) d10;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public final boolean n() {
        return this.f49210b;
    }

    public final Iterator<Map.Entry<T, Object>> o() {
        return this.f49211c ? new C7486f1(this.f49209a.entrySet().iterator()) : this.f49209a.entrySet().iterator();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> q() {
        return this.f49211c ? new C7486f1(this.f49209a.s().iterator()) : this.f49209a.s().iterator();
    }

    public final boolean r() {
        for (int i10 = 0; i10 < this.f49209a.m(); i10++) {
            if (!h(this.f49209a.k(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> h10 : this.f49209a.p()) {
            if (!h(h10)) {
                return false;
            }
        }
        return true;
    }

    public final int s() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f49209a.m(); i11++) {
            i10 += m(this.f49209a.k(i11));
        }
        for (Map.Entry<T, Object> m10 : this.f49209a.p()) {
            i10 += m(m10);
        }
        return i10;
    }

    private I0(boolean z10) {
        this(W1.b(0));
        i();
    }

    private I0(W1<T, Object> w12) {
        this.f49209a = w12;
        i();
    }
}
