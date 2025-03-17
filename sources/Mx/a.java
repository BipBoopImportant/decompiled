package Mx;

import Lx.b;
import Lx.c;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LMx/a;", "LLx/b;", "LQx/a;", "pushNotificationAnalyticsRemoteSource", "LPx/a;", "pushNotificationEventRemoteMapper", "LNx/a;", "pushNotificationAnalyticsContract", "<init>", "(LQx/a;LPx/a;LNx/a;)V", "LLx/c;", "event", "LXH/N;", "a", "(LLx/c;LdI/e;)Ljava/lang/Object;", "LQx/a;", "b", "LPx/a;", "c", "LNx/a;", "pushnotification-analytics-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final Qx.a f112049a;

    /* renamed from: b  reason: collision with root package name */
    private final Px.a f112050b;

    /* renamed from: c  reason: collision with root package name */
    private final Nx.a f112051c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.pushnotification.analytics.implementation.PushNotificationAnalyticsImpl", f = "PushNotificationAnalyticsImpl.kt", l = {23, 29}, m = "logEvent")
    /* renamed from: Mx.a$a  reason: collision with other inner class name */
    static final class C2747a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112052c;

        /* renamed from: d  reason: collision with root package name */
        Object f112053d;

        /* renamed from: e  reason: collision with root package name */
        Object f112054e;

        /* renamed from: f  reason: collision with root package name */
        Object f112055f;

        /* renamed from: g  reason: collision with root package name */
        Object f112056g;

        /* renamed from: h  reason: collision with root package name */
        int f112057h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f112058i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ a f112059j;

        /* renamed from: k  reason: collision with root package name */
        int f112060k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2747a(a aVar, C17164e<? super C2747a> eVar) {
            super(eVar);
            this.f112059j = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112058i = obj;
            this.f112060k |= Integer.MIN_VALUE;
            return this.f112059j.a((c) null, this);
        }
    }

    public a(Qx.a aVar, Px.a aVar2, Nx.a aVar3) {
        C17542s.j(aVar, "pushNotificationAnalyticsRemoteSource");
        C17542s.j(aVar2, "pushNotificationEventRemoteMapper");
        C17542s.j(aVar3, "pushNotificationAnalyticsContract");
        this.f112049a = aVar;
        this.f112050b = aVar2;
        this.f112051c = aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(Lx.c r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            boolean r3 = r2 instanceof Mx.a.C2747a
            if (r3 == 0) goto L_0x0019
            r3 = r2
            Mx.a$a r3 = (Mx.a.C2747a) r3
            int r4 = r3.f112060k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f112060k = r4
            goto L_0x001e
        L_0x0019:
            Mx.a$a r3 = new Mx.a$a
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f112058i
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f112060k
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r14 = 0
            r15 = 1
            r12 = 2
            if (r6 == 0) goto L_0x0076
            if (r6 == r15) goto L_0x005b
            if (r6 != r12) goto L_0x0053
            java.lang.Object r1 = r3.f112056g
            com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData r1 = (com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData) r1
            java.lang.Object r1 = r3.f112054e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f112053d
            Lx.c r1 = (Lx.c) r1
            java.lang.Object r1 = r3.f112052c
            Mx.a r1 = (Mx.a) r1
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r2 = r4.j()
            goto L_0x00b8
        L_0x0053:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x005b:
            java.lang.Object r1 = r3.f112054e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r2 = r3.f112053d
            Lx.c r2 = (Lx.c) r2
            java.lang.Object r6 = r3.f112052c
            Mx.a r6 = (Mx.a) r6
            XH.y.b(r4)
            XH.x r4 = (XH.x) r4
            java.lang.Object r4 = r4.j()
            r23 = r2
            r2 = r1
            r1 = r23
            goto L_0x0097
        L_0x0076:
            XH.y.b(r4)
            Px.a r4 = r0.f112050b
            Nx.a r6 = r0.f112051c
            java.lang.String r6 = r6.a()
            Nx.a r13 = r0.f112051c
            java.lang.String r13 = r13.b()
            r3.f112052c = r0
            r3.f112053d = r1
            r3.f112054e = r2
            r3.f112060k = r15
            java.lang.Object r4 = r4.a(r1, r6, r13, r3)
            if (r4 != r5) goto L_0x0096
            return r5
        L_0x0096:
            r6 = r0
        L_0x0097:
            java.lang.Throwable r13 = XH.x.e(r4)
            if (r13 != 0) goto L_0x020a
            r13 = r4
            com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData r13 = (com.ingka.ikea.pushnotification.analytics.implementation.data.model.PushAnalyticPostData) r13
            Qx.a r15 = r6.f112049a
            r3.f112052c = r6
            r3.f112053d = r1
            r3.f112054e = r2
            r3.f112055f = r4
            r3.f112056g = r13
            r3.f112057h = r14
            r3.f112060k = r12
            java.lang.Object r2 = r15.a(r13, r3)
            if (r2 != r5) goto L_0x00b7
            return r5
        L_0x00b7:
            r1 = r6
        L_0x00b8:
            java.lang.Throwable r3 = XH.x.e(r2)
            if (r3 != 0) goto L_0x0166
            XH.N r2 = (XH.C16807N) r2
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x00d3:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ea
            java.lang.Object r5 = r3.next()
            r6 = r5
            qv.b r6 = (qv.C11819b) r6
            boolean r6 = r6.b(r2, r14)
            if (r6 == 0) goto L_0x00d3
            r4.add(r5)
            goto L_0x00d3
        L_0x00ea:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = 0
        L_0x00f0:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x02b0
            java.lang.Object r6 = r3.next()
            r17 = r6
            qv.b r17 = (qv.C11819b) r17
            r6 = 0
            if (r4 != 0) goto L_0x010f
            java.lang.String r4 = "Send the push event successfully."
            java.lang.String r4 = qv.C11818a.a(r4, r6)
            if (r4 != 0) goto L_0x010b
            goto L_0x02b0
        L_0x010b:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x010f:
            if (r5 != 0) goto L_0x0158
            java.lang.Class r5 = r1.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r13 = 36
            r14 = 0
            java.lang.String r15 = HJ.C15854t.s1(r5, r13, r14, r12, r14)
            r13 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r13, r14, r12, r14)
            int r13 = r15.length()
            if (r13 != 0) goto L_0x0130
            goto L_0x0134
        L_0x0130:
            java.lang.String r5 = HJ.C15854t.P0(r15, r11)
        L_0x0134:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r14 = 1
            boolean r13 = HJ.C15854t.b0(r13, r10, r14)
            if (r13 == 0) goto L_0x0145
            r13 = r9
            goto L_0x0146
        L_0x0145:
            r13 = r8
        L_0x0146:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r7)
            r14.append(r5)
            java.lang.String r5 = r14.toString()
        L_0x0158:
            r20 = 0
            r18 = r2
            r19 = r5
            r21 = r6
            r22 = r4
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x00f0
        L_0x0166:
            qv.e r2 = qv.e.ERROR
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0179:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0190
            java.lang.Object r6 = r4.next()
            r13 = r6
            qv.b r13 = (qv.C11819b) r13
            boolean r13 = r13.b(r2, r14)
            if (r13 == 0) goto L_0x0179
            r5.add(r6)
            goto L_0x0179
        L_0x0190:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r14 = 0
        L_0x0196:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02b0
            java.lang.Object r6 = r4.next()
            r17 = r6
            qv.b r17 = (qv.C11819b) r17
            r6 = 0
            if (r5 != 0) goto L_0x01b3
            java.lang.String r5 = qv.C11818a.a(r6, r3)
            if (r5 != 0) goto L_0x01af
            goto L_0x02b0
        L_0x01af:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x01b3:
            if (r14 != 0) goto L_0x01fc
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getName()
            kotlin.jvm.internal.C17542s.g(r13)
            r14 = 36
            java.lang.String r15 = HJ.C15854t.s1(r13, r14, r6, r12, r6)
            r14 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r14, r6, r12, r6)
            int r6 = r15.length()
            if (r6 != 0) goto L_0x01d3
            goto L_0x01d7
        L_0x01d3:
            java.lang.String r13 = HJ.C15854t.P0(r15, r11)
        L_0x01d7:
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            java.lang.String r6 = r6.getName()
            r14 = 1
            boolean r6 = HJ.C15854t.b0(r6, r10, r14)
            if (r6 == 0) goto L_0x01e8
            r6 = r9
            goto L_0x01e9
        L_0x01e8:
            r6 = r8
        L_0x01e9:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r6)
            r14.append(r7)
            r14.append(r13)
            java.lang.String r6 = r14.toString()
            r14 = r6
        L_0x01fc:
            r20 = 0
            r18 = r2
            r19 = r14
            r21 = r3
            r22 = r5
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x0196
        L_0x020a:
            qv.e r1 = qv.e.ERROR
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x021d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0234
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            boolean r5 = r5.b(r1, r14)
            if (r5 == 0) goto L_0x021d
            r3.add(r4)
            goto L_0x021d
        L_0x0234:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r14 = 0
        L_0x023a:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02b0
            java.lang.Object r4 = r2.next()
            r17 = r4
            qv.b r17 = (qv.C11819b) r17
            r4 = 0
            if (r14 != 0) goto L_0x0257
            java.lang.String r5 = qv.C11818a.a(r4, r13)
            if (r5 != 0) goto L_0x0252
            goto L_0x02b0
        L_0x0252:
            java.lang.String r5 = qv.C11820c.a(r5)
            r14 = r5
        L_0x0257:
            if (r3 != 0) goto L_0x02a0
            java.lang.Class r3 = r6.getClass()
            java.lang.String r3 = r3.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r5 = 36
            java.lang.String r15 = HJ.C15854t.s1(r3, r5, r4, r12, r4)
            r5 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r5, r4, r12, r4)
            int r16 = r15.length()
            if (r16 != 0) goto L_0x0277
            goto L_0x027b
        L_0x0277:
            java.lang.String r3 = HJ.C15854t.P0(r15, r11)
        L_0x027b:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r4 = 1
            boolean r15 = HJ.C15854t.b0(r15, r10, r4)
            if (r15 == 0) goto L_0x028c
            r15 = r9
            goto L_0x028d
        L_0x028c:
            r15 = r8
        L_0x028d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r15)
            r4.append(r7)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x02a2
        L_0x02a0:
            r5 = 46
        L_0x02a2:
            r20 = 0
            r18 = r1
            r19 = r3
            r21 = r13
            r22 = r14
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x023a
        L_0x02b0:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Mx.a.a(Lx.c, dI.e):java.lang.Object");
    }
}
