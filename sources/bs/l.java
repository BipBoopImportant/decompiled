package Bs;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import os.C11715b;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0006\u0010\t\u001a\u00020\bHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LBs/l;", "LBs/k;", "Los/b;", "syncCommunicationPostsToInboxUseCase", "LBs/q;", "showInboxNotificationUseCase", "<init>", "(Los/b;LBs/q;)V", "", "notifyOnNewMessages", "LXH/x;", "", "LPs/d;", "a", "(ZLdI/e;)Ljava/lang/Object;", "Los/b;", "b", "LBs/q;", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final C11715b f79402a;

    /* renamed from: b  reason: collision with root package name */
    private final q f79403b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.impl.usecase.RefreshInboxSourcesUseCaseImpl", f = "RefreshInboxSourcesUseCase.kt", l = {32, 36}, m = "invoke-gIAlu-s")
    static final class a extends d {

        /* renamed from: A  reason: collision with root package name */
        int f79404A;

        /* renamed from: c  reason: collision with root package name */
        Object f79405c;

        /* renamed from: d  reason: collision with root package name */
        Object f79406d;

        /* renamed from: e  reason: collision with root package name */
        Object f79407e;

        /* renamed from: f  reason: collision with root package name */
        Object f79408f;

        /* renamed from: g  reason: collision with root package name */
        Object f79409g;

        /* renamed from: h  reason: collision with root package name */
        Object f79410h;

        /* renamed from: i  reason: collision with root package name */
        Object f79411i;

        /* renamed from: j  reason: collision with root package name */
        Object f79412j;

        /* renamed from: k  reason: collision with root package name */
        Object f79413k;

        /* renamed from: l  reason: collision with root package name */
        Object f79414l;

        /* renamed from: m  reason: collision with root package name */
        Object f79415m;

        /* renamed from: n  reason: collision with root package name */
        Object f79416n;

        /* renamed from: o  reason: collision with root package name */
        Object f79417o;

        /* renamed from: p  reason: collision with root package name */
        boolean f79418p;

        /* renamed from: q  reason: collision with root package name */
        int f79419q;

        /* renamed from: r  reason: collision with root package name */
        int f79420r;

        /* renamed from: s  reason: collision with root package name */
        int f79421s;

        /* renamed from: t  reason: collision with root package name */
        int f79422t;

        /* renamed from: u  reason: collision with root package name */
        int f79423u;

        /* renamed from: v  reason: collision with root package name */
        int f79424v;

        /* renamed from: w  reason: collision with root package name */
        int f79425w;

        /* renamed from: x  reason: collision with root package name */
        int f79426x;

        /* renamed from: y  reason: collision with root package name */
        /* synthetic */ Object f79427y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ l f79428z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(l lVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f79428z = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f79427y = obj;
            this.f79404A |= Integer.MIN_VALUE;
            Object a10 = this.f79428z.a(false, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public l(C11715b bVar, q qVar) {
        C17542s.j(bVar, "syncCommunicationPostsToInboxUseCase");
        C17542s.j(qVar, "showInboxNotificationUseCase");
        this.f79402a = bVar;
        this.f79403b = qVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x024e A[Catch:{ CancellationException -> 0x0062, all -> 0x005f }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x024f A[Catch:{ CancellationException -> 0x0062, all -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(boolean r25, dI.C17164e<? super XH.x<? extends java.util.List<Ps.d>>> r26) {
        /*
            r24 = this;
            r1 = r24
            r0 = r26
            boolean r2 = r0 instanceof Bs.l.a
            if (r2 == 0) goto L_0x0017
            r2 = r0
            Bs.l$a r2 = (Bs.l.a) r2
            int r3 = r2.f79404A
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f79404A = r3
            goto L_0x001c
        L_0x0017:
            Bs.l$a r2 = new Bs.l$a
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f79427y
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f79404A
            r6 = 1
            r7 = 2
            if (r5 == 0) goto L_0x00e7
            if (r5 == r6) goto L_0x006d
            if (r5 != r7) goto L_0x0065
            java.lang.Object r0 = r2.f79416n
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f79415m
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f79414l
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f79413k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f79412j
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f79411i
            Bs.l r0 = (Bs.l) r0
            java.lang.Object r0 = r2.f79410h
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r2.f79409g
            java.lang.Object r4 = r2.f79408f
            Bs.l r4 = (Bs.l) r4
            java.lang.Object r4 = r2.f79407e
            Bs.l r4 = (Bs.l) r4
            java.lang.Object r4 = r2.f79406d
            dI.e r4 = (dI.C17164e) r4
            java.lang.Object r2 = r2.f79405c
            Bs.l r2 = (Bs.l) r2
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            goto L_0x0250
        L_0x005f:
            r0 = move-exception
            goto L_0x0258
        L_0x0062:
            r0 = move-exception
            goto L_0x0263
        L_0x0065:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006d:
            int r0 = r2.f79425w
            int r5 = r2.f79424v
            int r6 = r2.f79423u
            int r9 = r2.f79422t
            int r10 = r2.f79421s
            int r11 = r2.f79420r
            int r12 = r2.f79419q
            boolean r13 = r2.f79418p
            java.lang.Object r14 = r2.f79416n
            java.lang.Object r15 = r2.f79415m
            java.util.Iterator r15 = (java.util.Iterator) r15
            java.lang.Object r7 = r2.f79414l
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.lang.Object r8 = r2.f79413k
            java.lang.String r8 = (java.lang.String) r8
            r25 = r0
            java.lang.Object r0 = r2.f79412j
            java.lang.String r0 = (java.lang.String) r0
            r26 = r0
            java.lang.Object r0 = r2.f79411i
            qv.e r0 = (qv.e) r0
            r16 = r0
            java.lang.Object r0 = r2.f79410h
            Bs.l r0 = (Bs.l) r0
            r17 = r0
            java.lang.Object r0 = r2.f79409g
            Bs.l r0 = (Bs.l) r0
            java.lang.Object r0 = r2.f79408f
            Bs.l r0 = (Bs.l) r0
            r18 = r0
            java.lang.Object r0 = r2.f79407e
            Bs.l r0 = (Bs.l) r0
            r19 = r0
            java.lang.Object r0 = r2.f79406d
            dI.e r0 = (dI.C17164e) r0
            r20 = r0
            java.lang.Object r0 = r2.f79405c
            Bs.l r0 = (Bs.l) r0
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            XH.x r3 = (XH.x) r3     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.Object r3 = r3.j()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r1 = r8
            r8 = r17
            r17 = r25
            r25 = r10
            r10 = r26
            r22 = r6
            r6 = r0
            r0 = r20
            r20 = r9
            r9 = r16
            r16 = r4
            r4 = r14
            r14 = r12
            r12 = r11
            r11 = r15
            r15 = r7
            r7 = r19
            r19 = r22
            r23 = r18
            r18 = r5
            r5 = r23
            goto L_0x01f0
        L_0x00e7:
            XH.y.b(r3)
            XH.x$a r3 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            qv.e r3 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            qv.d r5 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.util.List r5 = r5.a()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r13.<init>()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
        L_0x00ff:
            boolean r7 = r5.hasNext()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r7 == 0) goto L_0x0117
            java.lang.Object r7 = r5.next()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r8 = r7
            qv.b r8 = (qv.C11819b) r8     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r9 = 0
            boolean r8 = r8.b(r3, r9)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r8 == 0) goto L_0x00ff
            r13.add(r7)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            goto L_0x00ff
        L_0x0117:
            java.util.Iterator r15 = r13.iterator()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r5 = 0
            r7 = r5
            r8 = r7
            r9 = r13
        L_0x011f:
            boolean r10 = r15.hasNext()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r10 == 0) goto L_0x019f
            java.lang.Object r14 = r15.next()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r9 = r14
            qv.b r9 = (qv.C11819b) r9     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r11 = 0
            if (r7 != 0) goto L_0x013d
            java.lang.String r10 = "Refreshing inbox"
            java.lang.String r10 = qv.C11818a.a(r10, r11)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r10 != 0) goto L_0x0139
            goto L_0x01a0
        L_0x0139:
            java.lang.String r7 = qv.C11820c.a(r10)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
        L_0x013d:
            r16 = r7
            if (r8 != 0) goto L_0x018d
            java.lang.Class<Bs.l> r7 = Bs.l.class
            java.lang.String r7 = r7.getName()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            kotlin.jvm.internal.C17542s.g(r7)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r8 = 36
            r10 = 2
            java.lang.String r8 = HJ.C15854t.s1(r7, r8, r5, r10, r5)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r12 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r12, r5, r10, r5)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            int r10 = r8.length()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r10 != 0) goto L_0x015e
            goto L_0x0164
        L_0x015e:
            java.lang.String r7 = "Kt"
            java.lang.String r7 = HJ.C15854t.P0(r8, r7)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
        L_0x0164:
            java.lang.Thread r8 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.String r8 = r8.getName()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.String r10 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r10, r6)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r8 == 0) goto L_0x0177
            java.lang.String r8 = "m"
            goto L_0x0179
        L_0x0177:
            java.lang.String r8 = "b"
        L_0x0179:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r10.<init>()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r10.append(r8)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.String r8 = "|"
            r10.append(r8)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r10.append(r7)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.String r8 = r10.toString()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
        L_0x018d:
            r17 = r8
            r10 = 0
            r7 = r9
            r8 = r3
            r9 = r17
            r12 = r16
            r7.a(r8, r9, r10, r11, r12)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r9 = r14
            r7 = r16
            r8 = r17
            goto L_0x011f
        L_0x019f:
            r14 = r9
        L_0x01a0:
            os.b r5 = r1.f79402a     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79405c = r1     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79406d = r0     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79407e = r1     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79408f = r1     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79409g = r1     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79410h = r1     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79411i = r3     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79412j = r7     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79413k = r8     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79414l = r13     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79415m = r15     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79416n = r14     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r9 = r25
            r2.f79418p = r9     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r10 = 0
            r2.f79419q = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79420r = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79421s = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79422t = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79423u = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79424v = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79425w = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79404A = r6     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.Object r5 = r5.m14invokeIoAF18A(r2)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r5 != r4) goto L_0x01d6
            return r4
        L_0x01d6:
            r6 = r1
            r16 = r4
            r10 = r7
            r4 = r14
            r11 = r15
            r25 = 0
            r12 = 0
            r14 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r7 = r6
            r1 = r8
            r15 = r13
            r8 = r7
            r13 = r9
            r9 = r3
            r3 = r5
            r5 = r8
        L_0x01f0:
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r26 = r12
            r12 = r3
            java.util.List r12 = (java.util.List) r12     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r13 == 0) goto L_0x0251
            r21 = r12
            java.util.Collection r21 = (java.util.Collection) r21     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            boolean r21 = r21.isEmpty()     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            if (r21 != 0) goto L_0x0251
            r21 = r14
            Bs.q r14 = r5.f79403b     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79405c = r6     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79406d = r0     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79407e = r7     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79408f = r5     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79409g = r3     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79410h = r12     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79411i = r8     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79412j = r9     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79413k = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79414l = r1     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79415m = r15     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79416n = r11     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79417o = r4     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r2.f79418p = r13     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r0 = r21
            r2.f79419q = r0     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r11 = r26
            r2.f79420r = r11     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r0 = 0
            r2.f79421s = r0     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r10 = r25
            r2.f79422t = r10     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r9 = r20
            r2.f79423u = r9     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r6 = r19
            r2.f79424v = r6     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r5 = r18
            r2.f79425w = r5     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r0 = r17
            r2.f79426x = r0     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r0 = 2
            r2.f79404A = r0     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.Object r0 = r14.a(r12, r2)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            r1 = r16
            if (r0 != r1) goto L_0x024f
            return r1
        L_0x024f:
            r0 = r3
        L_0x0250:
            r3 = r0
        L_0x0251:
            java.util.List r3 = (java.util.List) r3     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            java.lang.Object r0 = XH.x.b(r3)     // Catch:{ CancellationException -> 0x0062, all -> 0x005f }
            goto L_0x0262
        L_0x0258:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0262:
            return r0
        L_0x0263:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Bs.l.a(boolean, dI.e):java.lang.Object");
    }
}
