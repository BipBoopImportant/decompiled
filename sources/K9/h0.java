package K9;

import android.os.Looper;
import android.os.Message;
import ca.C7112f;

final class h0 extends C7112f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C6604c f37867b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(C6604c cVar, Looper looper) {
        super(looper);
        this.f37867b = cVar;
    }

    private static final void a(Message message) {
        i0 i0Var = (i0) message.obj;
        i0Var.b();
        i0Var.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            K9.c r0 = r7.f37867b
            java.util.concurrent.atomic.AtomicInteger r0 = r0.f37792C
            int r0 = r0.get()
            int r1 = r8.arg1
            if (r0 == r1) goto L_0x0016
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0015
            a(r8)
        L_0x0015:
            return
        L_0x0016:
            int r0 = r8.what
            r1 = 4
            r2 = 1
            r3 = 5
            if (r0 == r2) goto L_0x002e
            r4 = 7
            if (r0 == r4) goto L_0x002e
            if (r0 != r1) goto L_0x002a
            K9.c r0 = r7.f37867b
            boolean r0 = r0.t()
            if (r0 == 0) goto L_0x002e
        L_0x002a:
            int r0 = r8.what
            if (r0 != r3) goto L_0x0036
        L_0x002e:
            K9.c r0 = r7.f37867b
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x0120
        L_0x0036:
            int r0 = r8.what
            r4 = 8
            r5 = 3
            r6 = 0
            if (r0 != r1) goto L_0x007e
            K9.c r0 = r7.f37867b
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r1.<init>(r8)
            r0.f37818z = r1
            K9.c r8 = r7.f37867b
            boolean r8 = K9.C6604c.h0(r8)
            if (r8 == 0) goto L_0x005f
            K9.c r8 = r7.f37867b
            boolean r0 = r8.f37790A
            if (r0 == 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r8.i0(r5, (android.os.IInterface) null)
            return
        L_0x005f:
            K9.c r8 = r7.f37867b
            com.google.android.gms.common.ConnectionResult r0 = r8.f37818z
            if (r0 == 0) goto L_0x006c
            com.google.android.gms.common.ConnectionResult r8 = r8.f37818z
            goto L_0x0071
        L_0x006c:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0071:
            K9.c r0 = r7.f37867b
            K9.c$c r0 = r0.f37808p
            r0.a(r8)
            K9.c r0 = r7.f37867b
            r0.L(r8)
            return
        L_0x007e:
            if (r0 != r3) goto L_0x009f
            K9.c r8 = r7.f37867b
            com.google.android.gms.common.ConnectionResult r0 = r8.f37818z
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.common.ConnectionResult r8 = r8.f37818z
            goto L_0x0092
        L_0x008d:
            com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
            r8.<init>(r4)
        L_0x0092:
            K9.c r0 = r7.f37867b
            K9.c$c r0 = r0.f37808p
            r0.a(r8)
            K9.c r0 = r7.f37867b
            r0.L(r8)
            return
        L_0x009f:
            if (r0 != r5) goto L_0x00be
            java.lang.Object r0 = r8.obj
            boolean r1 = r0 instanceof android.app.PendingIntent
            if (r1 == 0) goto L_0x00aa
            r6 = r0
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6
        L_0x00aa:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            int r8 = r8.arg2
            r0.<init>(r8, r6)
            K9.c r8 = r7.f37867b
            K9.c$c r8 = r8.f37808p
            r8.a(r0)
            K9.c r8 = r7.f37867b
            r8.L(r0)
            return
        L_0x00be:
            r1 = 6
            if (r0 != r1) goto L_0x00e4
            K9.c r0 = r7.f37867b
            r0.i0(r3, (android.os.IInterface) null)
            K9.c r0 = r7.f37867b
            K9.c$a r1 = r0.f37813u
            if (r1 == 0) goto L_0x00d7
            K9.c$a r0 = r0.f37813u
            int r1 = r8.arg2
            r0.onConnectionSuspended(r1)
        L_0x00d7:
            K9.c r0 = r7.f37867b
            int r8 = r8.arg2
            r0.M(r8)
            K9.c r8 = r7.f37867b
            K9.C6604c.g0(r8, r3, r2, r6)
            return
        L_0x00e4:
            r1 = 2
            if (r0 != r1) goto L_0x00f4
            K9.c r0 = r7.f37867b
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x00f0
            goto L_0x00f4
        L_0x00f0:
            a(r8)
            return
        L_0x00f4:
            boolean r0 = b(r8)
            if (r0 == 0) goto L_0x0102
            java.lang.Object r8 = r8.obj
            K9.i0 r8 = (K9.i0) r8
            r8.c()
            return
        L_0x0102:
            int r8 = r8.what
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Don't know how to handle message: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r1 = "GmsClient"
            android.util.Log.wtf(r1, r8, r0)
            return
        L_0x0120:
            a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K9.h0.handleMessage(android.os.Message):void");
    }
}
