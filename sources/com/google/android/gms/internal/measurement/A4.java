package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class A4<T extends C4<T>> {

    /* renamed from: d  reason: collision with root package name */
    private static final A4<?> f48532d = new A4<>(true);

    /* renamed from: a  reason: collision with root package name */
    final O5<T, Object> f48533a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f48534b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f48535c;

    private A4() {
        this.f48533a = new N5();
    }

    public static int b(C4<?> c42, Object obj) {
        C7359m6 zzb = c42.zzb();
        int zza = c42.zza();
        if (!c42.h()) {
            return c(zzb, zza, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!c42.zzd()) {
            int i11 = 0;
            while (i10 < size) {
                i11 += c(zzb, zza, list.get(i10));
                i10++;
            }
            return i11;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            int i12 = 0;
            while (i10 < size) {
                i12 += d(zzb, list.get(i10));
                i10++;
            }
            return C7405s4.k0(zza) + i12 + C7405s4.o0(i12);
        }
    }

    static int c(C7359m6 m6Var, int i10, Object obj) {
        int k02 = C7405s4.k0(i10);
        if (m6Var == C7359m6.GROUP) {
            O4.g((C7406s5) obj);
            k02 <<= 1;
        }
        return k02 + d(m6Var, obj);
    }

    private static int d(C7359m6 m6Var, Object obj) {
        switch (D4.f48641b[m6Var.ordinal()]) {
            case 1:
                return C7405s4.c(((Double) obj).doubleValue());
            case 2:
                return C7405s4.d(((Float) obj).floatValue());
            case 3:
                return C7405s4.F(((Long) obj).longValue());
            case 4:
                return C7405s4.j0(((Long) obj).longValue());
            case 5:
                return C7405s4.T(((Integer) obj).intValue());
            case 6:
                return C7405s4.p(((Long) obj).longValue());
            case 7:
                return C7405s4.z(((Integer) obj).intValue());
            case 8:
                return C7405s4.v(((Boolean) obj).booleanValue());
            case 9:
                return C7405s4.s((C7406s5) obj);
            case 10:
                return obj instanceof V4 ? C7405s4.r((V4) obj) : C7405s4.G((C7406s5) obj);
            case 11:
                return obj instanceof C7276d4 ? C7405s4.q((C7276d4) obj) : C7405s4.u((String) obj);
            case 12:
                return obj instanceof C7276d4 ? C7405s4.q((C7276d4) obj) : C7405s4.w((byte[]) obj);
            case 13:
                return C7405s4.o0(((Integer) obj).intValue());
            case 14:
                return C7405s4.b0(((Integer) obj).intValue());
            case 15:
                return C7405s4.W(((Long) obj).longValue());
            case 16:
                return C7405s4.g0(((Integer) obj).intValue());
            case 17:
                return C7405s4.e0(((Long) obj).longValue());
            case 18:
                return obj instanceof N4 ? C7405s4.e(((N4) obj).zza()) : C7405s4.e(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static int e(Map.Entry<T, Object> entry) {
        C4 c42 = (C4) entry.getKey();
        Object value = entry.getValue();
        return (c42.zzc() != C7384p6.MESSAGE || c42.h() || c42.zzd()) ? b(c42, value) : value instanceof V4 ? C7405s4.k(((C4) entry.getKey()).zza(), (V4) value) : C7405s4.l(((C4) entry.getKey()).zza(), (C7406s5) value);
    }

    private final Object f(T t10) {
        Object obj = this.f48533a.get(t10);
        if (!(obj instanceof V4)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    private static Object g(Object obj) {
        if (obj instanceof A5) {
            return ((A5) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static <T extends C4<T>> A4<T> i() {
        return f48532d;
    }

    private final void j(T t10, Object obj) {
        if (!t10.h()) {
            n(t10, obj);
        } else if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                n(t10, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof V4) {
            this.f48535c = true;
        }
        this.f48533a.put(t10, obj);
    }

    private final void k(Map.Entry<T, Object> entry) {
        C4 c42 = (C4) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof V4;
        if (c42.h()) {
            if (!z10) {
                Object f10 = f(c42);
                List list = (List) value;
                int size = list.size();
                if (f10 == null) {
                    f10 = new ArrayList(size);
                }
                List list2 = (List) f10;
                for (int i10 = 0; i10 < size; i10++) {
                    list2.add(g(list.get(i10)));
                }
                this.f48533a.put(c42, f10);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (c42.zzc() == C7384p6.MESSAGE) {
            Object f11 = f(c42);
            if (f11 == null) {
                this.f48533a.put(c42, g(value));
                if (z10) {
                    this.f48535c = true;
                }
            } else if (!z10) {
                this.f48533a.put(c42, f11 instanceof A5 ? c42.r((A5) f11, (A5) value) : c42.y(((C7406s5) f11).b(), (C7406s5) value).s());
            } else {
                throw new NoSuchMethodError();
            }
        } else if (!z10) {
            this.f48533a.put(c42, g(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private static boolean l(Object obj) {
        if (obj instanceof C7422u5) {
            return ((C7422u5) obj).e();
        }
        if (obj instanceof V4) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.N4) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.V4) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void n(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.m6 r0 = r3.zzb()
            com.google.android.gms.internal.measurement.O4.e(r4)
            int[] r1 = com.google.android.gms.internal.measurement.D4.f48640a
            com.google.android.gms.internal.measurement.p6 r0 = r0.a()
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
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.C7406s5
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.V4
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0023:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.N4
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x002c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.C7276d4
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
            com.google.android.gms.internal.measurement.m6 r3 = r3.zzb()
            com.google.android.gms.internal.measurement.p6 r3 = r3.a()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.A4.n(com.google.android.gms.internal.measurement.C4, java.lang.Object):void");
    }

    private static <T extends C4<T>> boolean o(Map.Entry<T, Object> entry) {
        C4 c42 = (C4) entry.getKey();
        if (c42.zzc() != C7384p6.MESSAGE) {
            return true;
        }
        if (!c42.h()) {
            return l(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!l(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int a() {
        int i10 = this.f48533a.i();
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += e(this.f48533a.f(i12));
        }
        for (Map.Entry<T, Object> e10 : this.f48533a.m()) {
            i11 += e(e10);
        }
        return i11;
    }

    public final /* synthetic */ Object clone() {
        A4 a42 = new A4();
        int i10 = this.f48533a.i();
        for (int i11 = 0; i11 < i10; i11++) {
            Map.Entry<T, Object> f10 = this.f48533a.f(i11);
            a42.j((C4) f10.getKey(), f10.getValue());
        }
        for (Map.Entry next : this.f48533a.m()) {
            a42.j((C4) next.getKey(), next.getValue());
        }
        a42.f48535c = this.f48535c;
        return a42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A4)) {
            return false;
        }
        return this.f48533a.equals(((A4) obj).f48533a);
    }

    public final void h(A4<T> a42) {
        int i10 = a42.f48533a.i();
        for (int i11 = 0; i11 < i10; i11++) {
            k(a42.f48533a.f(i11));
        }
        for (Map.Entry<T, Object> k10 : a42.f48533a.m()) {
            k(k10);
        }
    }

    public final int hashCode() {
        return this.f48533a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> m() {
        return this.f48533a.isEmpty() ? Collections.emptyIterator() : this.f48535c ? new X4(this.f48533a.o().iterator()) : this.f48533a.o().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> p() {
        return this.f48533a.isEmpty() ? Collections.emptyIterator() : this.f48535c ? new X4(this.f48533a.entrySet().iterator()) : this.f48533a.entrySet().iterator();
    }

    public final void q() {
        if (!this.f48534b) {
            int i10 = this.f48533a.i();
            for (int i11 = 0; i11 < i10; i11++) {
                Object value = this.f48533a.f(i11).getValue();
                if (value instanceof L4) {
                    ((L4) value).G();
                }
            }
            for (Map.Entry<T, Object> value2 : this.f48533a.m()) {
                Object value3 = value2.getValue();
                if (value3 instanceof L4) {
                    ((L4) value3).G();
                }
            }
            this.f48533a.h();
            this.f48534b = true;
        }
    }

    public final boolean r() {
        return this.f48534b;
    }

    public final boolean s() {
        int i10 = this.f48533a.i();
        for (int i11 = 0; i11 < i10; i11++) {
            if (!o(this.f48533a.f(i11))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> o10 : this.f48533a.m()) {
            if (!o(o10)) {
                return false;
            }
        }
        return true;
    }

    private A4(O5<T, Object> o52) {
        this.f48533a = o52;
        q();
    }

    private A4(boolean z10) {
        this(new N5());
        q();
    }
}
