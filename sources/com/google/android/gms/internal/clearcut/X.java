package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7166a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class X<FieldDescriptorType extends C7166a0<FieldDescriptorType>> {

    /* renamed from: d  reason: collision with root package name */
    private static final X f48277d = new X(true);

    /* renamed from: a  reason: collision with root package name */
    private final C7187g1<FieldDescriptorType, Object> f48278a = C7187g1.h(16);

    /* renamed from: b  reason: collision with root package name */
    private boolean f48279b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f48280c = false;

    private X() {
    }

    static int f(K1 k12, int i10, Object obj) {
        int B02 = M.B0(i10);
        if (k12 == K1.GROUP) {
            C7192i0.i((M0) obj);
            B02 <<= 1;
        }
        return B02 + o(k12, obj);
    }

    private final Object g(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f48278a.get(fielddescriptortype);
        return obj instanceof C7213p0 ? C7213p0.e() : obj;
    }

    private final void i(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.p()) {
            j(fielddescriptortype.t(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                j(fielddescriptortype.t(), obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C7213p0) {
            this.f48280c = true;
        }
        this.f48278a.put(fielddescriptortype, obj);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.C7213p0) == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if ((r3 instanceof com.google.android.gms.internal.clearcut.C7195j0) == false) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void j(com.google.android.gms.internal.clearcut.K1 r2, java.lang.Object r3) {
        /*
            com.google.android.gms.internal.clearcut.C7192i0.a(r3)
            int[] r0 = com.google.android.gms.internal.clearcut.Y.f48282a
            com.google.android.gms.internal.clearcut.P1 r2 = r2.a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0042;
                case 2: goto L_0x003f;
                case 3: goto L_0x003c;
                case 4: goto L_0x0039;
                case 5: goto L_0x0036;
                case 6: goto L_0x0033;
                case 7: goto L_0x002a;
                case 8: goto L_0x001e;
                case 9: goto L_0x0015;
                default: goto L_0x0014;
            }
        L_0x0014:
            goto L_0x0045
        L_0x0015:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.M0
            if (r2 != 0) goto L_0x0028
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C7213p0
            if (r2 == 0) goto L_0x0027
            goto L_0x0028
        L_0x001e:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0028
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.C7195j0
            if (r2 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r1
        L_0x0028:
            r1 = r0
            goto L_0x0045
        L_0x002a:
            boolean r2 = r3 instanceof com.google.android.gms.internal.clearcut.A
            if (r2 != 0) goto L_0x0028
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0033:
            boolean r0 = r3 instanceof java.lang.String
            goto L_0x0028
        L_0x0036:
            boolean r0 = r3 instanceof java.lang.Boolean
            goto L_0x0028
        L_0x0039:
            boolean r0 = r3 instanceof java.lang.Double
            goto L_0x0028
        L_0x003c:
            boolean r0 = r3 instanceof java.lang.Float
            goto L_0x0028
        L_0x003f:
            boolean r0 = r3 instanceof java.lang.Long
            goto L_0x0028
        L_0x0042:
            boolean r0 = r3 instanceof java.lang.Integer
            goto L_0x0028
        L_0x0045:
            if (r1 == 0) goto L_0x0048
            return
        L_0x0048:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.X.j(com.google.android.gms.internal.clearcut.K1, java.lang.Object):void");
    }

    public static <T extends C7166a0<T>> X<T> k() {
        return f48277d;
    }

    private static int n(C7166a0<?> a0Var, Object obj) {
        K1 t10 = a0Var.t();
        int zzc = a0Var.zzc();
        if (!a0Var.p()) {
            return f(t10, zzc, obj);
        }
        int i10 = 0;
        List<Object> list = (List) obj;
        if (a0Var.k()) {
            for (Object o10 : list) {
                i10 += o(t10, o10);
            }
            return M.B0(zzc) + i10 + M.J0(i10);
        }
        for (Object f10 : list) {
            i10 += f(t10, zzc, f10);
        }
        return i10;
    }

    private static int o(K1 k12, Object obj) {
        switch (Y.f48283b[k12.ordinal()]) {
            case 1:
                return M.w(((Double) obj).doubleValue());
            case 2:
                return M.x(((Float) obj).floatValue());
            case 3:
                return M.e0(((Long) obj).longValue());
            case 4:
                return M.h0(((Long) obj).longValue());
            case 5:
                return M.C0(((Integer) obj).intValue());
            case 6:
                return M.p0(((Long) obj).longValue());
            case 7:
                return M.F0(((Integer) obj).intValue());
            case 8:
                return M.F(((Boolean) obj).booleanValue());
            case 9:
                return M.Z((M0) obj);
            case 10:
                return obj instanceof C7213p0 ? M.e((C7213p0) obj) : M.R((M0) obj);
            case 11:
                return obj instanceof A ? M.D((A) obj) : M.q0((String) obj);
            case 12:
                return obj instanceof A ? M.D((A) obj) : M.a0((byte[]) obj);
            case 13:
                return M.D0(((Integer) obj).intValue());
            case 14:
                return M.G0(((Integer) obj).intValue());
            case 15:
                return M.s0(((Long) obj).longValue());
            case 16:
                return M.E0(((Integer) obj).intValue());
            case 17:
                return M.l0(((Long) obj).longValue());
            case 18:
                return obj instanceof C7195j0 ? M.H0(((C7195j0) obj).zzc()) : M.H0(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean p(Map.Entry<FieldDescriptorType, Object> entry) {
        C7166a0 a0Var = (C7166a0) entry.getKey();
        if (a0Var.l() == P1.MESSAGE) {
            boolean p10 = a0Var.p();
            Object value = entry.getValue();
            if (p10) {
                for (M0 isInitialized : (List) value) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else if (value instanceof M0) {
                if (!((M0) value).isInitialized()) {
                    return false;
                }
            } else if (value instanceof C7213p0) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    private final void q(Map.Entry<FieldDescriptorType, Object> entry) {
        C7166a0 a0Var = (C7166a0) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C7213p0) {
            value = C7213p0.e();
        }
        if (a0Var.p()) {
            Object g10 = g(a0Var);
            if (g10 == null) {
                g10 = new ArrayList();
            }
            for (Object s10 : (List) value) {
                ((List) g10).add(s(s10));
            }
            this.f48278a.put(a0Var, g10);
        } else if (a0Var.l() == P1.MESSAGE) {
            Object g11 = g(a0Var);
            if (g11 == null) {
                this.f48278a.put(a0Var, s(value));
            } else {
                this.f48278a.put(a0Var, g11 instanceof S0 ? a0Var.u((S0) g11, (S0) value) : a0Var.x(((M0) g11).v(), (M0) value).x());
            }
        } else {
            this.f48278a.put(a0Var, s(value));
        }
    }

    private static int r(Map.Entry<FieldDescriptorType, Object> entry) {
        C7166a0 a0Var = (C7166a0) entry.getKey();
        Object value = entry.getValue();
        if (a0Var.l() != P1.MESSAGE || a0Var.p() || a0Var.k()) {
            return n(a0Var, value);
        }
        boolean z10 = value instanceof C7213p0;
        int zzc = ((C7166a0) entry.getKey()).zzc();
        return z10 ? M.A(zzc, (C7213p0) value) : M.Y(zzc, (M0) value);
    }

    private static Object s(Object obj) {
        if (obj instanceof S0) {
            return ((S0) obj).G2();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<FieldDescriptorType, Object>> a() {
        return this.f48280c ? new C7221s0(this.f48278a.q().iterator()) : this.f48278a.q().iterator();
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.f48278a.isEmpty();
    }

    public final boolean c() {
        return this.f48279b;
    }

    public final /* synthetic */ Object clone() {
        X x10 = new X();
        for (int i10 = 0; i10 < this.f48278a.o(); i10++) {
            Map.Entry<FieldDescriptorType, Object> i11 = this.f48278a.i(i10);
            x10.i((C7166a0) i11.getKey(), i11.getValue());
        }
        for (Map.Entry next : this.f48278a.p()) {
            x10.i((C7166a0) next.getKey(), next.getValue());
        }
        x10.f48280c = this.f48280c;
        return x10;
    }

    public final boolean d() {
        for (int i10 = 0; i10 < this.f48278a.o(); i10++) {
            if (!p(this.f48278a.i(i10))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> p10 : this.f48278a.p()) {
            if (!p(p10)) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> e() {
        return this.f48280c ? new C7221s0(this.f48278a.entrySet().iterator()) : this.f48278a.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        return this.f48278a.equals(((X) obj).f48278a);
    }

    public final void h(X<FieldDescriptorType> x10) {
        for (int i10 = 0; i10 < x10.f48278a.o(); i10++) {
            q(x10.f48278a.i(i10));
        }
        for (Map.Entry<FieldDescriptorType, Object> q10 : x10.f48278a.p()) {
            q(q10);
        }
    }

    public final int hashCode() {
        return this.f48278a.hashCode();
    }

    public final int l() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48278a.o(); i11++) {
            Map.Entry<FieldDescriptorType, Object> i12 = this.f48278a.i(i11);
            i10 += n((C7166a0) i12.getKey(), i12.getValue());
        }
        for (Map.Entry next : this.f48278a.p()) {
            i10 += n((C7166a0) next.getKey(), next.getValue());
        }
        return i10;
    }

    public final int m() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.f48278a.o(); i11++) {
            i10 += r(this.f48278a.i(i11));
        }
        for (Map.Entry<FieldDescriptorType, Object> r10 : this.f48278a.p()) {
            i10 += r(r10);
        }
        return i10;
    }

    public final void t() {
        if (!this.f48279b) {
            this.f48278a.u();
            this.f48279b = true;
        }
    }

    private X(boolean z10) {
        t();
    }
}
