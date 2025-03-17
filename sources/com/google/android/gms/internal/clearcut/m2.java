package com.google.android.gms.internal.clearcut;

import E9.f;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.common.api.n;

final class m2 extends a<Status, q2> {

    /* renamed from: r  reason: collision with root package name */
    private final f f48434r;

    m2(f fVar, g gVar) {
        super(E9.a.f35257p, gVar);
        this.f48434r = fVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ n c(Status status) {
        return status;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void l(a.b bVar) {
        q2 q2Var = (q2) bVar;
        p2 p2Var = new p2(this);
        try {
            f fVar = this.f48434r;
            fVar.getClass();
            n2 n2Var = fVar.f35299i;
            int c10 = n2Var.c();
            byte[] bArr = new byte[c10];
            X1.b(n2Var, bArr, 0, c10);
            fVar.f35292b = bArr;
            ((u2) q2Var.D()).Z0(p2Var, this.f48434r);
        } catch (RuntimeException e10) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e10);
            p(new Status(10, "MessageProducer"));
        }
    }
}
