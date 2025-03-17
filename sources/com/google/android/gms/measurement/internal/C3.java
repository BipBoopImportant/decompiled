package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.util.SparseArray;
import ob.C10098b;

final class C3 implements C10098b<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ C7645m5 f49559a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ C7691t3 f49560b;

    C3(C7691t3 t3Var, C7645m5 m5Var) {
        this.f49559a = m5Var;
        this.f49560b = t3Var;
    }

    private final void c() {
        SparseArray<Long> I10 = this.f49560b.e().I();
        C7645m5 m5Var = this.f49559a;
        I10.put(m5Var.f50241c, Long.valueOf(m5Var.f50240b));
        C7683s2 e10 = this.f49560b.e();
        int[] iArr = new int[I10.size()];
        long[] jArr = new long[I10.size()];
        for (int i10 = 0; i10 < I10.size(); i10++) {
            iArr[i10] = I10.keyAt(i10);
            jArr[i10] = I10.valueAt(i10).longValue();
        }
        Bundle bundle = new Bundle();
        bundle.putIntArray("uriSources", iArr);
        bundle.putLongArray("uriTimestamps", jArr);
        e10.f50371p.b(bundle);
    }

    public final void a(Object obj) {
        this.f49560b.k();
        c();
        this.f49560b.f50411i = false;
        this.f49560b.f50412j = 1;
        this.f49560b.f().D().b("Successfully registered trigger URI", this.f49559a.f50239a);
        this.f49560b.K0();
    }

    public final void b(Throwable th2) {
        this.f49560b.k();
        this.f49560b.f50411i = false;
        int B10 = (this.f49560b.a().r(K.f49731U0) ? C7691t3.B(this.f49560b, th2) : 2) - 1;
        if (B10 == 0) {
            this.f49560b.f().J().c("registerTriggerAsync failed with retriable error. Will try later. App ID, throwable", C7607h2.t(this.f49560b.m().E()), C7607h2.t(th2.toString()));
            this.f49560b.f50412j = 1;
            this.f49560b.C0().add(this.f49559a);
        } else if (B10 == 1) {
            this.f49560b.C0().add(this.f49559a);
            if (this.f49560b.f50412j > K.f49783r0.a(null).intValue()) {
                this.f49560b.f50412j = 1;
                this.f49560b.f().J().c("registerTriggerAsync failed. May try later. App ID, throwable", C7607h2.t(this.f49560b.m().E()), C7607h2.t(th2.toString()));
                return;
            }
            this.f49560b.f().J().d("registerTriggerAsync failed. App ID, delay in seconds, throwable", C7607h2.t(this.f49560b.m().E()), C7607h2.t(String.valueOf(this.f49560b.f50412j)), C7607h2.t(th2.toString()));
            C7691t3 t3Var = this.f49560b;
            C7691t3.S0(t3Var, t3Var.f50412j);
            C7691t3 t3Var2 = this.f49560b;
            t3Var2.f50412j = t3Var2.f50412j << 1;
        } else if (B10 == 2) {
            this.f49560b.f().E().c("registerTriggerAsync failed. Dropping URI. App ID, Throwable", C7607h2.t(this.f49560b.m().E()), th2);
            c();
            this.f49560b.f50412j = 1;
            this.f49560b.K0();
        }
    }
}
