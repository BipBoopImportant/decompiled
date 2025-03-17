package K9;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class W extends i0 {

    /* renamed from: d  reason: collision with root package name */
    public final int f37784d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f37785e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ C6604c f37786f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected W(C6604c cVar, int i10, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f37786f = cVar;
        this.f37784d = i10;
        this.f37785e = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void a(java.lang.Object r3) {
        /*
            r2 = this;
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            int r3 = r2.f37784d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001e
            boolean r3 = r2.g()
            if (r3 != 0) goto L_0x001d
            K9.c r3 = r2.f37786f
            r3.i0(r0, (android.os.IInterface) null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
            r2.f(r3)
        L_0x001d:
            return
        L_0x001e:
            K9.c r3 = r2.f37786f
            r3.i0(r0, (android.os.IInterface) null)
            android.os.Bundle r3 = r2.f37785e
            if (r3 == 0) goto L_0x0030
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x0030:
            int r3 = r2.f37784d
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r3, r1)
            r2.f(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.W.a(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    public final void b() {
    }

    /* access modifiers changed from: protected */
    public abstract void f(ConnectionResult connectionResult);

    /* access modifiers changed from: protected */
    public abstract boolean g();
}
