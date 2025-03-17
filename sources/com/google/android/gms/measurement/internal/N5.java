package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.e;
import com.google.android.gms.internal.measurement.A2;
import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.C7297f7;
import com.google.android.gms.internal.measurement.C7388q2;
import com.google.android.gms.internal.measurement.C7403s2;
import com.google.android.gms.internal.measurement.C7411t2;
import com.google.android.gms.internal.measurement.C7419u2;
import com.google.android.gms.internal.measurement.C7427v2;
import com.google.android.gms.internal.measurement.C7430v5;
import com.google.android.gms.internal.measurement.C7443x2;
import com.google.android.gms.internal.measurement.C7445x4;
import com.google.android.gms.internal.measurement.C7459z2;
import com.google.android.gms.internal.measurement.D2;
import com.google.android.gms.internal.measurement.E2;
import com.google.android.gms.internal.measurement.F2;
import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.U1;
import com.google.android.gms.internal.measurement.V1;
import com.google.android.gms.internal.measurement.W1;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.gms.internal.measurement.n7;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import sa.H;

public final class N5 extends C7721x5 {
    N5(C7728y5 y5Var) {
        super(y5Var);
    }

    private final Bundle A(Map<String, Object> map, boolean z10) {
        Bundle bundle = new Bundle();
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj == null) {
                bundle.putString(next, (String) null);
            } else if (obj instanceof Long) {
                bundle.putLong(next, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(next, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(next, obj.toString());
            } else if (z10) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    arrayList2.add(A((Map) obj2, false));
                }
                bundle.putParcelableArray(next, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    static C7443x2 D(C7427v2 v2Var, String str) {
        for (C7443x2 next : v2Var.Y()) {
            if (next.Z().equals(str)) {
                return next;
            }
        }
        return null;
    }

    static <BuilderT extends C7430v5> BuilderT E(BuilderT buildert, byte[] bArr) {
        C7445x4 a10 = C7445x4.a();
        return a10 != null ? buildert.W1(bArr, a10) : buildert.t0(bArr);
    }

    static Object H(C7427v2 v2Var, String str, Object obj) {
        Object d02 = d0(v2Var, str);
        return d02 == null ? obj : d02;
    }

    private static String L(boolean z10, boolean z11, boolean z12) {
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append("Dynamic ");
        }
        if (z11) {
            sb2.append("Sequence ");
        }
        if (z12) {
            sb2.append("Session-Scoped ");
        }
        return sb2.toString();
    }

    static List<Long> M(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            long j10 = 0;
            for (int i11 = 0; i11 < 64; i11++) {
                int i12 = (i10 << 6) + i11;
                if (i12 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i12)) {
                    j10 |= 1 << i11;
                }
            }
            arrayList.add(Long.valueOf(j10));
        }
        return arrayList;
    }

    private static void P(Uri.Builder builder, String str, String str2, Set<String> set) {
        if (!set.contains(str) && !TextUtils.isEmpty(str2)) {
            builder.appendQueryParameter(str, str2);
        }
    }

    private static void Q(Uri.Builder builder, String[] strArr, Bundle bundle, Set<String> set) {
        for (String split : strArr) {
            String[] split2 = split.split(",");
            String str = split2[0];
            String str2 = split2[split2.length - 1];
            String string = bundle.getString(str);
            if (string != null) {
                P(builder, str2, string, set);
            }
        }
    }

    static void R(C7427v2.a aVar, String str, Object obj) {
        List<C7443x2> R10 = aVar.R();
        int i10 = 0;
        while (true) {
            if (i10 >= R10.size()) {
                i10 = -1;
                break;
            } else if (str.equals(R10.get(i10).Z())) {
                break;
            } else {
                i10++;
            }
        }
        C7443x2.a G10 = C7443x2.X().G(str);
        if (obj instanceof Long) {
            G10.C(((Long) obj).longValue());
        } else if (obj instanceof String) {
            G10.I((String) obj);
        } else if (obj instanceof Double) {
            G10.A(((Double) obj).doubleValue());
        }
        if (i10 >= 0) {
            aVar.C(i10, G10);
        } else {
            aVar.G(G10);
        }
    }

    private static void U(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("  ");
        }
    }

    private final void V(StringBuilder sb2, int i10, V1 v12) {
        if (v12 != null) {
            U(sb2, i10);
            sb2.append("filter {\n");
            if (v12.Q()) {
                Y(sb2, i10, "complement", Boolean.valueOf(v12.P()));
            }
            if (v12.S()) {
                Y(sb2, i10, "param_name", d().f(v12.O()));
            }
            if (v12.T()) {
                int i11 = i10 + 1;
                Y1 N10 = v12.N();
                if (N10 != null) {
                    U(sb2, i11);
                    sb2.append("string_filter");
                    sb2.append(" {\n");
                    if (N10.R()) {
                        Y(sb2, i11, "match_type", N10.J().name());
                    }
                    if (N10.Q()) {
                        Y(sb2, i11, "expression", N10.M());
                    }
                    if (N10.P()) {
                        Y(sb2, i11, "case_sensitive", Boolean.valueOf(N10.O()));
                    }
                    if (N10.m() > 0) {
                        U(sb2, i10 + 2);
                        sb2.append("expression_list {\n");
                        for (String append : N10.N()) {
                            U(sb2, i10 + 3);
                            sb2.append(append);
                            sb2.append("\n");
                        }
                        sb2.append("}\n");
                    }
                    U(sb2, i11);
                    sb2.append("}\n");
                }
            }
            if (v12.R()) {
                W(sb2, i10 + 1, "number_filter", v12.M());
            }
            U(sb2, i10);
            sb2.append("}\n");
        }
    }

    private static void W(StringBuilder sb2, int i10, String str, W1 w12) {
        if (w12 != null) {
            U(sb2, i10);
            sb2.append(str);
            sb2.append(" {\n");
            if (w12.Q()) {
                Y(sb2, i10, "comparison_type", w12.J().name());
            }
            if (w12.S()) {
                Y(sb2, i10, "match_as_float", Boolean.valueOf(w12.P()));
            }
            if (w12.R()) {
                Y(sb2, i10, "comparison_value", w12.M());
            }
            if (w12.U()) {
                Y(sb2, i10, "min_comparison_value", w12.O());
            }
            if (w12.T()) {
                Y(sb2, i10, "max_comparison_value", w12.N());
            }
            U(sb2, i10);
            sb2.append("}\n");
        }
    }

    private static void X(StringBuilder sb2, int i10, String str, C2 c22) {
        if (c22 != null) {
            U(sb2, 3);
            sb2.append(str);
            sb2.append(" {\n");
            if (c22.L() != 0) {
                U(sb2, 4);
                sb2.append("results: ");
                int i11 = 0;
                for (Long next : c22.Y()) {
                    int i12 = i11 + 1;
                    if (i11 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next);
                    i11 = i12;
                }
                sb2.append(10);
            }
            if (c22.R() != 0) {
                U(sb2, 4);
                sb2.append("status: ");
                int i13 = 0;
                for (Long next2 : c22.a0()) {
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next2);
                    i13 = i14;
                }
                sb2.append(10);
            }
            if (c22.m() != 0) {
                U(sb2, 4);
                sb2.append("dynamic_filter_timestamps: {");
                int i15 = 0;
                for (C7419u2 next3 : c22.X()) {
                    int i16 = i15 + 1;
                    if (i15 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next3.P() ? Integer.valueOf(next3.m()) : null);
                    sb2.append(":");
                    sb2.append(next3.O() ? Long.valueOf(next3.L()) : null);
                    i15 = i16;
                }
                sb2.append("}\n");
            }
            if (c22.O() != 0) {
                U(sb2, 4);
                sb2.append("sequence_filter_timestamps: {");
                int i17 = 0;
                for (D2 next4 : c22.Z()) {
                    int i18 = i17 + 1;
                    if (i17 != 0) {
                        sb2.append(", ");
                    }
                    sb2.append(next4.Q() ? Integer.valueOf(next4.M()) : null);
                    sb2.append(": [");
                    int i19 = 0;
                    for (Long longValue : next4.P()) {
                        long longValue2 = longValue.longValue();
                        int i20 = i19 + 1;
                        if (i19 != 0) {
                            sb2.append(", ");
                        }
                        sb2.append(longValue2);
                        i19 = i20;
                    }
                    sb2.append("]");
                    i17 = i18;
                }
                sb2.append("}\n");
            }
            U(sb2, 3);
            sb2.append("}\n");
        }
    }

    private static void Y(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj != null) {
            U(sb2, i10 + 1);
            sb2.append(str);
            sb2.append(": ");
            sb2.append(obj);
            sb2.append(10);
        }
    }

    private final void Z(StringBuilder sb2, int i10, List<C7443x2> list) {
        if (list != null) {
            int i11 = i10 + 1;
            for (C7443x2 next : list) {
                if (next != null) {
                    U(sb2, i11);
                    sb2.append("param {\n");
                    Double d10 = null;
                    Y(sb2, i11, "name", next.f0() ? d().f(next.Z()) : null);
                    Y(sb2, i11, "string_value", next.g0() ? next.a0() : null);
                    Y(sb2, i11, "int_value", next.e0() ? Long.valueOf(next.V()) : null);
                    if (next.c0()) {
                        d10 = Double.valueOf(next.J());
                    }
                    Y(sb2, i11, "double_value", d10);
                    if (next.T() > 0) {
                        Z(sb2, i11, next.b0());
                    }
                    U(sb2, i11);
                    sb2.append("}\n");
                }
            }
        }
    }

    static boolean b0(J j10, E5 e52) {
        C6620s.l(j10);
        C6620s.l(e52);
        return !TextUtils.isEmpty(e52.f49597b) || !TextUtils.isEmpty(e52.f49611p);
    }

    static boolean c0(List<Long> list, int i10) {
        if (i10 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i10 % 64)) & list.get(i10 / 64).longValue()) != 0;
    }

    static Object d0(C7427v2 v2Var, String str) {
        C7443x2 D10 = D(v2Var, str);
        if (D10 == null) {
            return null;
        }
        if (D10.g0()) {
            return D10.a0();
        }
        if (D10.e0()) {
            return Long.valueOf(D10.V());
        }
        if (D10.c0()) {
            return Double.valueOf(D10.J());
        }
        if (D10.T() > 0) {
            return g0(D10.b0());
        }
        return null;
    }

    static boolean e0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    static Bundle[] g0(List<C7443x2> list) {
        ArrayList arrayList = new ArrayList();
        for (C7443x2 next : list) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (C7443x2 next2 : next.b0()) {
                    if (next2.g0()) {
                        bundle.putString(next2.Z(), next2.a0());
                    } else if (next2.e0()) {
                        bundle.putLong(next2.Z(), next2.V());
                    } else if (next2.c0()) {
                        bundle.putDouble(next2.Z(), next2.J());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    static int w(A2.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i10 = 0; i10 < aVar.l0(); i10++) {
            if (str.equals(aVar.Y0(i10).X())) {
                return i10;
            }
        }
        return -1;
    }

    static Bundle z(List<C7443x2> list) {
        Bundle bundle = new Bundle();
        for (C7443x2 next : list) {
            String Z10 = next.Z();
            if (next.c0()) {
                bundle.putDouble(Z10, next.J());
            } else if (next.d0()) {
                bundle.putFloat(Z10, next.Q());
            } else if (next.g0()) {
                bundle.putString(Z10, next.a0());
            } else if (next.e0()) {
                bundle.putLong(Z10, next.V());
            }
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        f().E().a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T B(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.h2 r5 = r4.f()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N5.B(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: package-private */
    public final C7427v2 C(D d10) {
        C7427v2.a E10 = C7427v2.V().E(d10.f49570e);
        Iterator<String> it = d10.f49571f.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C7443x2.a G10 = C7443x2.X().G(next);
            Object t02 = d10.f49571f.t0(next);
            C6620s.l(t02);
            S(G10, t02);
            E10.G(G10);
        }
        if (!TextUtils.isEmpty(d10.f49568c) && d10.f49571f.t0("_o") == null) {
            E10.H((C7443x2) ((L4) C7443x2.X().G("_o").I(d10.f49568c).s()));
        }
        return (C7427v2) ((L4) E10.s());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r1 = r0.get("_o");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.J F(com.google.android.gms.internal.measurement.C7280e r9) {
        /*
            r8 = this;
            java.util.Map r0 = r9.g()
            r1 = 1
            android.os.Bundle r0 = r8.A(r0, r1)
            java.lang.String r1 = "_o"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L_0x001d
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = r1.toString()
        L_0x001b:
            r5 = r1
            goto L_0x0020
        L_0x001d:
            java.lang.String r1 = "app"
            goto L_0x001b
        L_0x0020:
            java.lang.String r1 = r9.e()
            java.lang.String r1 = sa.H.b(r1)
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r9.e()
        L_0x002e:
            r3 = r1
            com.google.android.gms.measurement.internal.J r1 = new com.google.android.gms.measurement.internal.J
            com.google.android.gms.measurement.internal.F r4 = new com.google.android.gms.measurement.internal.F
            r4.<init>(r0)
            long r6 = r9.a()
            r2 = r1
            r2.<init>(r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.N5.F(com.google.android.gms.internal.measurement.e):com.google.android.gms.measurement.internal.J");
    }

    /* access modifiers changed from: package-private */
    @TargetApi(30)
    public final C7645m5 G(String str, A2.a aVar, C7427v2.a aVar2, String str2) {
        int indexOf;
        if (!C7297f7.a() || !a().F(str, K.f49723Q0)) {
            return null;
        }
        long a10 = zzb().a();
        String[] split = a().D(str, K.f49779p0).split(",");
        HashSet hashSet = new HashSet(split.length);
        int length = split.length;
        int i10 = 0;
        while (i10 < length) {
            String str3 = split[i10];
            Objects.requireNonNull(str3);
            if (hashSet.add(str3)) {
                i10++;
            } else {
                throw new IllegalArgumentException("duplicate element: " + str3);
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        C7714w5 r10 = r();
        String Q10 = r10.o().Q(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(r10.a().D(str, K.f49765i0));
        if (!TextUtils.isEmpty(Q10)) {
            builder.authority(Q10 + "." + r10.a().D(str, K.f49767j0));
        } else {
            builder.authority(r10.a().D(str, K.f49767j0));
        }
        builder.path(r10.a().D(str, K.f49769k0));
        P(builder, "gmp_app_id", aVar.y1(), unmodifiableSet);
        P(builder, "gmp_version", "114010", unmodifiableSet);
        String v12 = aVar.v1();
        C7611i a11 = a();
        Y1<Boolean> y12 = K.f49729T0;
        if (a11.F(str, y12) && o().Z(str)) {
            v12 = "";
        }
        P(builder, "app_instance_id", v12, unmodifiableSet);
        P(builder, "rdid", aVar.S(), unmodifiableSet);
        P(builder, "bundle_id", aVar.u1(), unmodifiableSet);
        String Q11 = aVar2.Q();
        String a12 = H.a(Q11);
        if (!TextUtils.isEmpty(a12)) {
            Q11 = a12;
        }
        P(builder, "app_event_name", Q11, unmodifiableSet);
        P(builder, "app_version", String.valueOf(aVar.Z()), unmodifiableSet);
        String z12 = aVar.z1();
        if (a().F(str, y12) && o().d0(str) && !TextUtils.isEmpty(z12) && (indexOf = z12.indexOf(".")) != -1) {
            z12 = z12.substring(0, indexOf);
        }
        P(builder, "os_version", z12, unmodifiableSet);
        P(builder, "timestamp", String.valueOf(aVar2.O()), unmodifiableSet);
        String str4 = "1";
        if (aVar.X()) {
            P(builder, "lat", str4, unmodifiableSet);
        }
        P(builder, "privacy_sandbox_version", String.valueOf(aVar.z()), unmodifiableSet);
        P(builder, "trigger_uri_source", str4, unmodifiableSet);
        P(builder, "trigger_uri_timestamp", String.valueOf(a10), unmodifiableSet);
        P(builder, "request_uuid", str2, unmodifiableSet);
        List<C7443x2> R10 = aVar2.R();
        Bundle bundle = new Bundle();
        for (C7443x2 next : R10) {
            String Z10 = next.Z();
            if (next.c0()) {
                bundle.putString(Z10, String.valueOf(next.J()));
            } else if (next.d0()) {
                bundle.putString(Z10, String.valueOf(next.Q()));
            } else if (next.g0()) {
                bundle.putString(Z10, next.a0());
            } else if (next.e0()) {
                bundle.putString(Z10, String.valueOf(next.V()));
            }
        }
        Q(builder, a().D(str, K.f49777o0).split("\\|"), bundle, unmodifiableSet);
        List<F2> V10 = aVar.V();
        Bundle bundle2 = new Bundle();
        for (F2 next2 : V10) {
            String X10 = next2.X();
            if (next2.Z()) {
                bundle2.putString(X10, String.valueOf(next2.J()));
            } else if (next2.a0()) {
                bundle2.putString(X10, String.valueOf(next2.O()));
            } else if (next2.d0()) {
                bundle2.putString(X10, next2.Y());
            } else if (next2.b0()) {
                bundle2.putString(X10, String.valueOf(next2.S()));
            }
        }
        Q(builder, a().D(str, K.f49775n0).split("\\|"), bundle2, unmodifiableSet);
        if (!aVar.W()) {
            str4 = "0";
        }
        P(builder, "dma", str4, unmodifiableSet);
        if (!aVar.x1().isEmpty()) {
            P(builder, "dma_cps", aVar.x1(), unmodifiableSet);
        }
        if (a().r(K.f49733V0) && aVar.Y()) {
            C7388q2 B02 = aVar.B0();
            if (!B02.e0().isEmpty()) {
                P(builder, "dl_gclid", B02.e0(), unmodifiableSet);
            }
            if (!B02.d0().isEmpty()) {
                P(builder, "dl_gbraid", B02.d0(), unmodifiableSet);
            }
            if (!B02.a0().isEmpty()) {
                P(builder, "dl_gs", B02.a0(), unmodifiableSet);
            }
            if (B02.J() > 0) {
                P(builder, "dl_ss_ts", String.valueOf(B02.J()), unmodifiableSet);
            }
            if (!B02.h0().isEmpty()) {
                P(builder, "mr_gclid", B02.h0(), unmodifiableSet);
            }
            if (!B02.g0().isEmpty()) {
                P(builder, "mr_gbraid", B02.g0(), unmodifiableSet);
            }
            if (!B02.f0().isEmpty()) {
                P(builder, "mr_gs", B02.f0(), unmodifiableSet);
            }
            if (B02.N() > 0) {
                P(builder, "mr_click_ts", String.valueOf(B02.N()), unmodifiableSet);
            }
        }
        return new C7645m5(builder.build().toString(), a10, 1);
    }

    /* access modifiers changed from: package-private */
    public final String I(U1 u12) {
        if (u12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nevent_filter {\n");
        if (u12.W()) {
            Y(sb2, 0, "filter_id", Integer.valueOf(u12.M()));
        }
        Y(sb2, 0, "event_name", d().c(u12.Q()));
        String L10 = L(u12.S(), u12.T(), u12.U());
        if (!L10.isEmpty()) {
            Y(sb2, 0, "filter_type", L10);
        }
        if (u12.V()) {
            W(sb2, 1, "event_count_filter", u12.P());
        }
        if (u12.m() > 0) {
            sb2.append("  filters {\n");
            for (V1 V10 : u12.R()) {
                V(sb2, 2, V10);
            }
        }
        U(sb2, 1);
        sb2.append("}\n}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String J(X1 x12) {
        if (x12 == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nproperty_filter {\n");
        if (x12.R()) {
            Y(sb2, 0, "filter_id", Integer.valueOf(x12.m()));
        }
        Y(sb2, 0, "property_name", d().g(x12.N()));
        String L10 = L(x12.O(), x12.P(), x12.Q());
        if (!L10.isEmpty()) {
            Y(sb2, 0, "filter_type", L10);
        }
        V(sb2, 1, x12.K());
        sb2.append("}\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final String K(C7459z2 z2Var) {
        C7403s2 G22;
        if (z2Var == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\nbatch {\n");
        if (z2Var.X()) {
            Y(sb2, 0, "upload_subdomain", z2Var.U());
        }
        if (z2Var.W()) {
            Y(sb2, 0, "sgtm_join_id", z2Var.T());
        }
        for (A2 next : z2Var.V()) {
            if (next != null) {
                U(sb2, 1);
                sb2.append("bundle {\n");
                if (next.Z0()) {
                    Y(sb2, 1, "protocol_version", Integer.valueOf(next.F1()));
                }
                if (n7.a() && a().F(next.a0(), K.f49705H0) && next.c1()) {
                    Y(sb2, 1, "session_stitching_token", next.o0());
                }
                Y(sb2, 1, "platform", next.m0());
                if (next.U0()) {
                    Y(sb2, 1, "gmp_version", Long.valueOf(next.t2()));
                }
                if (next.p1()) {
                    Y(sb2, 1, "uploading_gmp_version", Long.valueOf(next.E2()));
                }
                if (next.S0()) {
                    Y(sb2, 1, "dynamite_version", Long.valueOf(next.m2()));
                }
                if (next.L0()) {
                    Y(sb2, 1, "config_version", Long.valueOf(next.e2()));
                }
                Y(sb2, 1, "gmp_app_id", next.J());
                Y(sb2, 1, "admob_app_id", next.Z());
                Y(sb2, 1, "app_id", next.a0());
                Y(sb2, 1, "app_version", next.d0());
                if (next.H0()) {
                    Y(sb2, 1, "app_version_major", Integer.valueOf(next.z0()));
                }
                Y(sb2, 1, "firebase_instance_id", next.j0());
                if (next.Q0()) {
                    Y(sb2, 1, "dev_cert_hash", Long.valueOf(next.i2()));
                }
                Y(sb2, 1, "app_store", next.c0());
                if (next.o1()) {
                    Y(sb2, 1, "upload_timestamp_millis", Long.valueOf(next.D2()));
                }
                if (next.e1()) {
                    Y(sb2, 1, "start_timestamp_millis", Long.valueOf(next.z2()));
                }
                if (next.T0()) {
                    Y(sb2, 1, "end_timestamp_millis", Long.valueOf(next.q2()));
                }
                if (next.Y0()) {
                    Y(sb2, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.x2()));
                }
                if (next.X0()) {
                    Y(sb2, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.v2()));
                }
                Y(sb2, 1, "app_instance_id", next.b0());
                Y(sb2, 1, "resettable_device_id", next.n0());
                Y(sb2, 1, "ds_id", next.i0());
                if (next.W0()) {
                    Y(sb2, 1, "limited_ad_tracking", Boolean.valueOf(next.w0()));
                }
                Y(sb2, 1, "os_version", next.l0());
                Y(sb2, 1, "device_model", next.h0());
                Y(sb2, 1, "user_default_language", next.p0());
                if (next.g1()) {
                    Y(sb2, 1, "time_zone_offset_minutes", Integer.valueOf(next.P1()));
                }
                if (next.K0()) {
                    Y(sb2, 1, "bundle_sequential_index", Integer.valueOf(next.h1()));
                }
                if (next.P0()) {
                    Y(sb2, 1, "delivery_index", Integer.valueOf(next.s1()));
                }
                if (next.b1()) {
                    Y(sb2, 1, "service_upload", Boolean.valueOf(next.x0()));
                }
                Y(sb2, 1, "health_monitor", next.k0());
                if (next.a1()) {
                    Y(sb2, 1, "retry_counter", Integer.valueOf(next.K1()));
                }
                if (next.N0()) {
                    Y(sb2, 1, "consent_signals", next.f0());
                }
                if (next.V0()) {
                    Y(sb2, 1, "is_dma_region", Boolean.valueOf(next.v0()));
                }
                if (next.O0()) {
                    Y(sb2, 1, "core_platform_services", next.g0());
                }
                if (next.M0()) {
                    Y(sb2, 1, "consent_diagnostics", next.e0());
                }
                if (next.f1()) {
                    Y(sb2, 1, "target_os_version", Long.valueOf(next.B2()));
                }
                if (C7297f7.a() && a().F(next.a0(), K.f49723Q0)) {
                    Y(sb2, 1, "ad_services_version", Integer.valueOf(next.m()));
                    if (next.I0() && (G22 = next.G2()) != null) {
                        U(sb2, 2);
                        sb2.append("attribution_eligibility_status {\n");
                        Y(sb2, 2, "eligible", Boolean.valueOf(G22.U()));
                        Y(sb2, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(G22.X()));
                        Y(sb2, 2, "pre_r", Boolean.valueOf(G22.Y()));
                        Y(sb2, 2, "r_extensions_too_old", Boolean.valueOf(G22.Z()));
                        Y(sb2, 2, "adservices_extension_too_old", Boolean.valueOf(G22.S()));
                        Y(sb2, 2, "ad_storage_not_allowed", Boolean.valueOf(G22.Q()));
                        Y(sb2, 2, "measurement_manager_disabled", Boolean.valueOf(G22.W()));
                        U(sb2, 2);
                        sb2.append("}\n");
                    }
                }
                if (next.y0()) {
                    C7388q2 F22 = next.F2();
                    U(sb2, 2);
                    sb2.append("ad_campaign_info {\n");
                    if (F22.k0()) {
                        Y(sb2, 2, "deep_link_gclid", F22.e0());
                    }
                    if (F22.j0()) {
                        Y(sb2, 2, "deep_link_gbraid", F22.d0());
                    }
                    if (F22.i0()) {
                        Y(sb2, 2, "deep_link_gad_source", F22.a0());
                    }
                    if (F22.l0()) {
                        Y(sb2, 2, "deep_link_session_millis", Long.valueOf(F22.J()));
                    }
                    if (F22.p0()) {
                        Y(sb2, 2, "market_referrer_gclid", F22.h0());
                    }
                    if (F22.o0()) {
                        Y(sb2, 2, "market_referrer_gbraid", F22.g0());
                    }
                    if (F22.n0()) {
                        Y(sb2, 2, "market_referrer_gad_source", F22.f0());
                    }
                    if (F22.m0()) {
                        Y(sb2, 2, "market_referrer_click_millis", Long.valueOf(F22.N()));
                    }
                    U(sb2, 2);
                    sb2.append("}\n");
                }
                if (next.J0()) {
                    Y(sb2, 1, "batching_timestamp_millis", Long.valueOf(next.a2()));
                }
                if (next.d1()) {
                    E2 J22 = next.J2();
                    U(sb2, 2);
                    sb2.append("sgtm_diagnostics {\n");
                    Y(sb2, 2, "upload_type", J22.P().name());
                    Y(sb2, 2, "client_upload_eligibility", J22.N().name());
                    Y(sb2, 2, "service_upload_eligibility", J22.O().name());
                    U(sb2, 2);
                    sb2.append("}\n");
                }
                List<F2> s02 = next.s0();
                if (s02 != null) {
                    for (F2 next2 : s02) {
                        if (next2 != null) {
                            U(sb2, 2);
                            sb2.append("user_property {\n");
                            Double d10 = null;
                            Y(sb2, 2, "set_timestamp_millis", next2.c0() ? Long.valueOf(next2.U()) : null);
                            Y(sb2, 2, "name", d().g(next2.X()));
                            Y(sb2, 2, "string_value", next2.Y());
                            Y(sb2, 2, "int_value", next2.b0() ? Long.valueOf(next2.S()) : null);
                            if (next2.Z()) {
                                d10 = Double.valueOf(next2.J());
                            }
                            Y(sb2, 2, "double_value", d10);
                            U(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C7411t2> q02 = next.q0();
                next.a0();
                if (q02 != null) {
                    for (C7411t2 next3 : q02) {
                        if (next3 != null) {
                            U(sb2, 2);
                            sb2.append("audience_membership {\n");
                            if (next3.S()) {
                                Y(sb2, 2, "audience_id", Integer.valueOf(next3.m()));
                            }
                            if (next3.T()) {
                                Y(sb2, 2, "new_audience", Boolean.valueOf(next3.R()));
                            }
                            X(sb2, 2, "current_data", next3.P());
                            if (next3.U()) {
                                X(sb2, 2, "previous_data", next3.Q());
                            }
                            U(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                List<C7427v2> r02 = next.r0();
                if (r02 != null) {
                    for (C7427v2 next4 : r02) {
                        if (next4 != null) {
                            U(sb2, 2);
                            sb2.append("event {\n");
                            Y(sb2, 2, "name", d().c(next4.X()));
                            if (next4.b0()) {
                                Y(sb2, 2, "timestamp_millis", Long.valueOf(next4.U()));
                            }
                            if (next4.a0()) {
                                Y(sb2, 2, "previous_timestamp_millis", Long.valueOf(next4.T()));
                            }
                            if (next4.Z()) {
                                Y(sb2, 2, "count", Integer.valueOf(next4.m()));
                            }
                            if (next4.R() != 0) {
                                Z(sb2, 2, next4.Y());
                            }
                            U(sb2, 2);
                            sb2.append("}\n");
                        }
                    }
                }
                U(sb2, 1);
                sb2.append("}\n");
            }
        }
        sb2.append("} // End-of-batch\n");
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final List<Long> N(List<Long> list, List<Integer> list2) {
        int i10;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                f().J().b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    f().J().c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i11 = size2;
            i10 = size;
            size = i11;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i10);
    }

    /* access modifiers changed from: package-private */
    public final Map<String, Object> O(Bundle bundle, boolean z10) {
        HashMap hashMap = new HashMap();
        for (String next : bundle.keySet()) {
            Object obj = bundle.get(next);
            boolean z11 = obj instanceof Parcelable[];
            if (z11 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    if (z11) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(O((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj2 = arrayList2.get(i10);
                            i10++;
                            if (obj2 instanceof Bundle) {
                                arrayList.add(O((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(O((Bundle) obj, false));
                    }
                    hashMap.put(next, arrayList);
                }
            } else if (obj != null) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    public final void S(C7443x2.a aVar, Object obj) {
        C6620s.l(obj);
        aVar.M().K().H().L();
        if (obj instanceof String) {
            aVar.I((String) obj);
        } else if (obj instanceof Long) {
            aVar.C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.A(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            ArrayList arrayList = new ArrayList();
            for (Bundle bundle : (Bundle[]) obj) {
                if (bundle != null) {
                    C7443x2.a X10 = C7443x2.X();
                    for (String next : bundle.keySet()) {
                        C7443x2.a G10 = C7443x2.X().G(next);
                        Object obj2 = bundle.get(next);
                        if (obj2 instanceof Long) {
                            G10.C(((Long) obj2).longValue());
                        } else if (obj2 instanceof String) {
                            G10.I((String) obj2);
                        } else if (obj2 instanceof Double) {
                            G10.A(((Double) obj2).doubleValue());
                        }
                        X10.D(G10);
                    }
                    if (X10.z() > 0) {
                        arrayList.add((C7443x2) ((L4) X10.s()));
                    }
                }
            }
            aVar.E(arrayList);
        } else {
            f().E().b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    public final void T(F2.a aVar, Object obj) {
        C6620s.l(obj);
        aVar.I().E().z();
        if (obj instanceof String) {
            aVar.H((String) obj);
        } else if (obj instanceof Long) {
            aVar.C(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.A(((Double) obj).doubleValue());
        } else {
            f().E().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final /* bridge */ /* synthetic */ C7611i a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean a0(long j10, long j11) {
        return j10 == 0 || j11 <= 0 || Math.abs(zzb().a() - j10) > j11;
    }

    public final /* bridge */ /* synthetic */ E b() {
        return super.b();
    }

    public final /* bridge */ /* synthetic */ C7586e2 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ C7683s2 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ C7607h2 f() {
        return super.f();
    }

    /* access modifiers changed from: package-private */
    public final byte[] f0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            f().E().b("Failed to gzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ C7595f4 g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ Q5 h() {
        return super.h();
    }

    /* access modifiers changed from: package-private */
    public final byte[] h0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e10) {
            f().E().b("Failed to ungzip content", e10);
            throw e10;
        }
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    /* access modifiers changed from: package-private */
    public final List<Integer> i0() {
        Map<String, String> e10 = K.e(this.f50303b.zza());
        if (e10 == null || e10.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = K.f49743a0.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = e10.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            f().J().b("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e11) {
                    f().J().b("Experiment ID NumberFormatException", e11);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void j() {
        super.j();
    }

    public final /* bridge */ /* synthetic */ void k() {
        super.k();
    }

    public final /* bridge */ /* synthetic */ N5 l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Y5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ C7660p n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ C2 o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ Y4 p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ J2 q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ C7714w5 r() {
        return super.r();
    }

    /* access modifiers changed from: protected */
    public final boolean v() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long x(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return y(str.getBytes(Charset.forName(Constants.ENCODING)));
    }

    /* access modifiers changed from: package-private */
    public final long y(byte[] bArr) {
        C6620s.l(bArr);
        h().k();
        MessageDigest Q02 = Q5.Q0();
        if (Q02 != null) {
            return Q5.z(Q02.digest(bArr));
        }
        f().E().a("Failed to get MD5");
        return 0;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ C7590f zzd() {
        return super.zzd();
    }
}
