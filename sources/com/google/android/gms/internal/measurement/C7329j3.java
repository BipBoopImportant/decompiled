package com.google.android.gms.internal.measurement;

import android.content.Context;
import jb.k;
import jb.r;

/* renamed from: com.google.android.gms.internal.measurement.j3  reason: case insensitive filesystem */
final class C7329j3 extends J3 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48980a;

    /* renamed from: b  reason: collision with root package name */
    private final r<k<C7428v3>> f48981b;

    C7329j3(Context context, r<k<C7428v3>> rVar) {
        if (context != null) {
            this.f48980a = context;
            this.f48981b = rVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* access modifiers changed from: package-private */
    public final Context a() {
        return this.f48980a;
    }

    /* access modifiers changed from: package-private */
    public final r<k<C7428v3>> b() {
        return this.f48981b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f48981b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.gms.internal.measurement.J3
            r2 = 0
            if (r1 == 0) goto L_0x002d
            com.google.android.gms.internal.measurement.J3 r5 = (com.google.android.gms.internal.measurement.J3) r5
            android.content.Context r1 = r4.f48980a
            android.content.Context r3 = r5.a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x002d
            jb.r<jb.k<com.google.android.gms.internal.measurement.v3>> r1 = r4.f48981b
            if (r1 != 0) goto L_0x0022
            jb.r r5 = r5.b()
            if (r5 != 0) goto L_0x002d
            goto L_0x002c
        L_0x0022:
            jb.r r5 = r5.b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x002d
        L_0x002c:
            return r0
        L_0x002d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C7329j3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = (this.f48980a.hashCode() ^ 1000003) * 1000003;
        r<k<C7428v3>> rVar = this.f48981b;
        return hashCode ^ (rVar == null ? 0 : rVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f48980a);
        String valueOf2 = String.valueOf(this.f48981b);
        return "FlagsContext{context=" + valueOf + ", hermeticFileOverrides=" + valueOf2 + "}";
    }
}
