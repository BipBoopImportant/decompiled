package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import sa.C8762o;
import sa.G;
import sa.H;
import sa.J;

/* renamed from: com.google.android.gms.measurement.internal.e2  reason: case insensitive filesystem */
public final class C7586e2 {

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicReference<String[]> f50117b = new AtomicReference<>();

    /* renamed from: c  reason: collision with root package name */
    private static final AtomicReference<String[]> f50118c = new AtomicReference<>();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicReference<String[]> f50119d = new AtomicReference<>();

    /* renamed from: a  reason: collision with root package name */
    private final C8762o f50120a;

    public C7586e2(C8762o oVar) {
        this.f50120a = oVar;
    }

    private static String d(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C6620s.l(strArr);
        C6620s.l(strArr2);
        C6620s.l(atomicReference);
        C6620s.a(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i10] == null) {
                            strArr3[i10] = strArr2[i10] + "(" + strArr[i10] + ")";
                        }
                        str2 = strArr3[i10];
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    private final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[");
        for (Bundle bundle : objArr) {
            String a10 = bundle instanceof Bundle ? a(bundle) : String.valueOf(bundle);
            if (a10 != null) {
                if (sb2.length() != 1) {
                    sb2.append(", ");
                }
                sb2.append(a10);
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f50120a.zza()) {
            return bundle.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Bundle[{");
        for (String next : bundle.keySet()) {
            if (sb2.length() != 8) {
                sb2.append(", ");
            }
            sb2.append(f(next));
            sb2.append("=");
            Object obj = bundle.get(next);
            sb2.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb2.append("}]");
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String b(J j10) {
        String str = null;
        if (j10 == null) {
            return null;
        }
        if (!this.f50120a.zza()) {
            return j10.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("origin=");
        sb2.append(j10.f49674c);
        sb2.append(",name=");
        sb2.append(c(j10.f49672a));
        sb2.append(",params=");
        F f10 = j10.f49673b;
        if (f10 != null) {
            str = !this.f50120a.zza() ? f10.toString() : a(f10.J());
        }
        sb2.append(str);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !this.f50120a.zza() ? str : d(str, H.f56087c, H.f56085a, f50117b);
    }

    /* access modifiers changed from: protected */
    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f50120a.zza() ? str : d(str, G.f56082b, G.f56081a, f50118c);
    }

    /* access modifiers changed from: protected */
    public final String g(String str) {
        if (str == null) {
            return null;
        }
        if (!this.f50120a.zza()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return d(str, J.f56090b, J.f56089a, f50119d);
        }
        return "experiment_id" + "(" + str + ")";
    }
}
