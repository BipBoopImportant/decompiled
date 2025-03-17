package com.google.android.gms.common.api.internal;

import K9.C6620s;
import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.n;

public abstract class a<R extends n, A extends a.b> extends BasePendingResult<R> {

    /* renamed from: p  reason: collision with root package name */
    private final a.c<A> f48031p;

    /* renamed from: q  reason: collision with root package name */
    private final com.google.android.gms.common.api.a<?> f48032q;

    protected a(com.google.android.gms.common.api.a<?> aVar, g gVar) {
        super((g) C6620s.m(gVar, "GoogleApiClient must not be null"));
        C6620s.m(aVar, "Api must not be null");
        this.f48031p = aVar.b();
        this.f48032q = aVar;
    }

    private void o(RemoteException remoteException) {
        p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    /* access modifiers changed from: protected */
    public abstract void l(A a10);

    /* access modifiers changed from: protected */
    public void m(R r10) {
    }

    public final void n(A a10) {
        try {
            l(a10);
        } catch (DeadObjectException e10) {
            o(e10);
            throw e10;
        } catch (RemoteException e11) {
            o(e11);
        }
    }

    public final void p(Status status) {
        C6620s.b(!status.E0(), "Failed result must not be success");
        n c10 = c(status);
        f(c10);
        m(c10);
    }
}
