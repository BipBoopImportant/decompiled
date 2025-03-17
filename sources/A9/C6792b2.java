package a9;

import C8.a;
import D8.c;
import F8.g;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.b2  reason: case insensitive filesystem */
public final class C6792b2 {

    /* renamed from: a  reason: collision with root package name */
    public final g f42462a;

    /* renamed from: b  reason: collision with root package name */
    public final E f42463b;

    /* renamed from: c  reason: collision with root package name */
    public final C6943u2 f42464c;

    /* renamed from: d  reason: collision with root package name */
    public final H5 f42465d;

    /* renamed from: e  reason: collision with root package name */
    public final a f42466e;

    /* renamed from: f  reason: collision with root package name */
    public final c f42467f = new c("SrEventsDispatcher");

    public C6792b2(g gVar, E e10, C6943u2 u2Var) {
        H5 h52 = new H5(new E2());
        a aVar = new a();
        C17542s.j(gVar, "deviceInfo");
        C17542s.j(e10, "configuration");
        C17542s.j(u2Var, "batchStorageProcessor");
        C17542s.j(h52, "networkTracker");
        C17542s.j(aVar, "httpConnection");
        this.f42462a = gVar;
        this.f42463b = e10;
        this.f42464c = u2Var;
        this.f42465d = h52;
        this.f42466e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        r1 = r1.o();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r15 = this;
            a9.u2 r0 = r15.f42464c
            r0.getClass()
            a9.l2 r1 = new a9.l2
            r2 = 0
            r1.<init>(r0, r2)
            GJ.h r0 = GJ.C15768k.b(r1)
            java.util.Iterator r0 = r0.iterator()
        L_0x0013:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0130
            java.lang.Object r1 = r0.next()
            XH.v r1 = (XH.v) r1
            java.lang.Object r2 = r1.a()
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Object r1 = r1.b()
            a9.i2 r1 = (a9.C6848i2) r1
            java.lang.String r5 = r1.f42608a
            byte[] r6 = r1.f42609b
            a9.E r1 = r15.f42463b
            A8.b r1 = r1.f41974b
            com.contentsquare.android.core.features.config.model.JsonConfig$ProjectConfiguration r1 = r1.b()
            if (r1 == 0) goto L_0x004b
            com.contentsquare.android.core.features.config.model.JsonConfig$SessionReplay r1 = r1.o()
            if (r1 == 0) goto L_0x004b
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            F8.g r4 = r15.f42462a
            F8.e r4 = r4.b()
            if (r1 == 0) goto L_0x0060
            F8.e r7 = F8.e.WIFI
            if (r4 == r7) goto L_0x0060
            D8.c r1 = r15.f42467f
            java.lang.String r2 = "can't send data because connection is not on WIFI"
        L_0x005c:
            r1.j(r2)
            goto L_0x0013
        L_0x0060:
            if (r1 != 0) goto L_0x006b
            F8.e r1 = F8.e.OFFLINE
            if (r4 != r1) goto L_0x006b
            D8.c r1 = r15.f42467f
            java.lang.String r2 = "can't send data because mobile connection is not available"
            goto L_0x005c
        L_0x006b:
            C8.a r4 = r15.f42466e
            r9 = 8
            r10 = 0
            java.lang.String r7 = "1"
            r8 = 0
            C8.d r1 = C8.a.i(r4, r5, r6, r7, r8, r9, r10)
            java.lang.Throwable r4 = r1.d()
            if (r4 != 0) goto L_0x0013
            a9.H5 r4 = r15.f42465d
            r4.getClass()
            java.lang.String r5 = "httpResponse"
            kotlin.jvm.internal.C17542s.j(r1, r5)
            long r5 = r1.h()
            long r7 = r4.f42045e
            long r7 = r7 + r5
            r4.f42045e = r7
            r4.f42046f = r5
            long r5 = r1.b()
            long r7 = r4.f42043c
            long r7 = r7 + r5
            r4.f42043c = r7
            r4.f42044d = r5
            long r5 = r4.f42047g
            r7 = 1
            long r5 = r5 + r7
            r4.f42047g = r5
            D8.c r1 = r15.f42467f
            a9.H5 r4 = r15.f42465d
            a9.E2 r5 = r4.f42041a
            r5.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r7 = r4.f42042b
            long r5 = r5 - r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "statistics of http post private calls:\n\trun from = "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r8 = " ms\n\tlast request size = "
            r7.append(r8)
            long r8 = r4.f42044d
            r7.append(r8)
            java.lang.String r8 = " bytes\n\ttotal sent = "
            r7.append(r8)
            long r8 = r4.f42043c
            r7.append(r8)
            java.lang.String r8 = " bytes\n\ttotal time spent = "
            r7.append(r8)
            long r8 = r4.f42045e
            r7.append(r8)
            java.lang.String r8 = " ms\n\taverage throughput = "
            r7.append(r8)
            long r8 = r4.f42043c
            long r10 = r4.f42045e
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x00ed
            r8 = r12
            goto L_0x00ee
        L_0x00ed:
            long r8 = r8 / r10
        L_0x00ee:
            r7.append(r8)
            java.lang.String r8 = " KB/sec\n\tlast request throughput = "
            r7.append(r8)
            long r8 = r4.f42044d
            long r10 = r4.f42046f
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0100
            r8 = r12
            goto L_0x0101
        L_0x0100:
            long r8 = r8 / r10
        L_0x0101:
            r7.append(r8)
            java.lang.String r8 = " KB/sec\n\tdata usage = "
            r7.append(r8)
            r8 = 60
            long r5 = r5 / r8
            long r8 = r4.f42043c
            int r10 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r10 != 0) goto L_0x0113
            goto L_0x0115
        L_0x0113:
            long r12 = r8 / r5
        L_0x0115:
            r7.append(r12)
            java.lang.String r5 = " KB/min\n\ttotal number of requests = "
            r7.append(r5)
            long r4 = r4.f42047g
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            r1.f(r4)
            a9.u2 r1 = r15.f42464c
            r1.a(r2)
            goto L_0x0013
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.C6792b2.a():void");
    }
}
