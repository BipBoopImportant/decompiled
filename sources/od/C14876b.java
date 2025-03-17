package oD;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import qD.C14940b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LoD/b;", "", "LqD/b;", "userAppointmentsToLocalMapper", "LoD/a;", "userAppointmentsEndPoint", "<init>", "(LqD/b;LoD/a;)V", "LXH/x;", "LrD/d;", "a", "(LdI/e;)Ljava/lang/Object;", "LqD/b;", "b", "LoD/a;", "userappointments-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oD.b  reason: case insensitive filesystem */
public final class C14876b {

    /* renamed from: a  reason: collision with root package name */
    private final C14940b f129978a;

    /* renamed from: b  reason: collision with root package name */
    private final C14875a f129979b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.userappointments.impl.UserAppointmentsRemoteSource", f = "UserAppointmentsRemoteSource.kt", l = {18}, m = "getUserAppointments-IoAF18A")
    /* renamed from: oD.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129980c;

        /* renamed from: d  reason: collision with root package name */
        Object f129981d;

        /* renamed from: e  reason: collision with root package name */
        Object f129982e;

        /* renamed from: f  reason: collision with root package name */
        Object f129983f;

        /* renamed from: g  reason: collision with root package name */
        Object f129984g;

        /* renamed from: h  reason: collision with root package name */
        int f129985h;

        /* renamed from: i  reason: collision with root package name */
        int f129986i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f129987j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C14876b f129988k;

        /* renamed from: l  reason: collision with root package name */
        int f129989l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14876b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f129988k = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129987j = obj;
            this.f129989l |= Integer.MIN_VALUE;
            Object a10 = this.f129988k.a(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C14876b(C14940b bVar, C14875a aVar) {
        C17542s.j(bVar, "userAppointmentsToLocalMapper");
        C17542s.j(aVar, "userAppointmentsEndPoint");
        this.f129978a = bVar;
        this.f129979b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super XH.x<rD.C14995d>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof oD.C14876b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            oD.b$a r0 = (oD.C14876b.a) r0
            int r1 = r0.f129989l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f129989l = r1
            goto L_0x0018
        L_0x0013:
            oD.b$a r0 = new oD.b$a
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f129987j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f129989l
            r4 = 1
            if (r3 == 0) goto L_0x0049
            if (r3 != r4) goto L_0x0041
            java.lang.Object r7 = r0.f129984g
            qD.b r7 = (qD.C14940b) r7
            java.lang.Object r2 = r0.f129983f
            oD.b r2 = (oD.C14876b) r2
            java.lang.Object r2 = r0.f129982e
            oD.b r2 = (oD.C14876b) r2
            java.lang.Object r2 = r0.f129981d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f129980c
            oD.b r0 = (oD.C14876b) r0
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x006d
        L_0x003d:
            r7 = move-exception
            goto L_0x0078
        L_0x003f:
            r7 = move-exception
            goto L_0x0083
        L_0x0041:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0049:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            qD.b r1 = r6.f129978a     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            oD.a r3 = r6.f129979b     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129980c = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129981d = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129982e = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129983f = r6     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129984g = r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r7 = 0
            r0.f129985h = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129986i = r7     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            r0.f129989l = r4     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r7 = r3.a(r0)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            if (r7 != r2) goto L_0x006a
            return r2
        L_0x006a:
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x006d:
            com.ingka.ikea.userappointments.impl.models.remote.UserAppointmentsRemote r1 = (com.ingka.ikea.userappointments.impl.models.remote.UserAppointmentsRemote) r1     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            rD.d r7 = r7.a(r1)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            java.lang.Object r7 = XH.x.b(r7)     // Catch:{ CancellationException -> 0x003f, all -> 0x003d }
            goto L_0x0082
        L_0x0078:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r7 = XH.y.a(r7)
            java.lang.Object r7 = XH.x.b(r7)
        L_0x0082:
            return r7
        L_0x0083:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oD.C14876b.a(dI.e):java.lang.Object");
    }
}
