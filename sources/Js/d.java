package js;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Ljs/d;", "Ljs/c;", "Ljs/b;", "communicationPostEndpoint", "<init>", "(Ljs/b;)V", "", "Ljs/a;", "a", "(LdI/e;)Ljava/lang/Object;", "Ljs/b;", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final C11452b f98698a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.inbox.communicationpost.impl.CommunicationPostRemoteSourceImpl", f = "CommunicationPostRemoteSource.kt", l = {19}, m = "getCommunicationPost")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f98699c;

        /* renamed from: d  reason: collision with root package name */
        Object f98700d;

        /* renamed from: e  reason: collision with root package name */
        Object f98701e;

        /* renamed from: f  reason: collision with root package name */
        Object f98702f;

        /* renamed from: g  reason: collision with root package name */
        Object f98703g;

        /* renamed from: h  reason: collision with root package name */
        Object f98704h;

        /* renamed from: i  reason: collision with root package name */
        Object f98705i;

        /* renamed from: j  reason: collision with root package name */
        Object f98706j;

        /* renamed from: k  reason: collision with root package name */
        Object f98707k;

        /* renamed from: l  reason: collision with root package name */
        int f98708l;

        /* renamed from: m  reason: collision with root package name */
        int f98709m;

        /* renamed from: n  reason: collision with root package name */
        int f98710n;

        /* renamed from: o  reason: collision with root package name */
        int f98711o;

        /* renamed from: p  reason: collision with root package name */
        /* synthetic */ Object f98712p;

        /* renamed from: q  reason: collision with root package name */
        final /* synthetic */ d f98713q;

        /* renamed from: r  reason: collision with root package name */
        int f98714r;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f98713q = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98712p = obj;
            this.f98714r |= Integer.MIN_VALUE;
            return this.f98713q.a(this);
        }
    }

    public d(C11452b bVar) {
        C17542s.j(bVar, "communicationPostEndpoint");
        this.f98698a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v22, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.util.List<js.C11451a>> r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r1 instanceof js.d.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            js.d$a r2 = (js.d.a) r2
            int r3 = r2.f98714r
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f98714r = r3
            goto L_0x001c
        L_0x0017:
            js.d$a r2 = new js.d$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f98712p
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f98714r
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r13 = 1
            r15 = 0
            if (r5 == 0) goto L_0x0065
            if (r5 != r13) goto L_0x005d
            java.lang.Object r1 = r2.f98706j
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f98705i
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f98704h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f98703g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f98702f
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f98701e
            js.d r1 = (js.d) r1
            java.lang.Object r1 = r2.f98700d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f98699c
            js.d r1 = (js.d) r1
            XH.y.b(r3)
            r24 = r7
            r25 = r8
            goto L_0x0158
        L_0x005d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0065:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x007b:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x0092
            java.lang.Object r11 = r5.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r3, r15)
            if (r12 == 0) goto L_0x007b
            r13.add(r11)
            goto L_0x007b
        L_0x0092:
            java.util.Iterator r5 = r13.iterator()
            r17 = r13
            r11 = 0
            r12 = 0
        L_0x009a:
            boolean r18 = r5.hasNext()
            if (r18 == 0) goto L_0x012a
            java.lang.Object r23 = r5.next()
            r17 = r23
            qv.b r17 = (qv.C11819b) r17
            r15 = 0
            if (r11 != 0) goto L_0x00bf
            java.lang.String r14 = "Fetching Communication post"
            java.lang.String r14 = qv.C11818a.a(r14, r15)
            if (r14 != 0) goto L_0x00bb
            r24 = r7
            r25 = r8
            r7 = r23
            goto L_0x0130
        L_0x00bb:
            java.lang.String r11 = qv.C11820c.a(r14)
        L_0x00bf:
            if (r12 != 0) goto L_0x010f
            java.lang.Class<js.d> r12 = js.d.class
            java.lang.String r12 = r12.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            r24 = r7
            r25 = r8
            r7 = 0
            r14 = 36
            r15 = 2
            java.lang.String r8 = HJ.C15854t.s1(r12, r14, r7, r15, r7)
            r14 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r14, r7, r15, r7)
            int r7 = r8.length()
            if (r7 != 0) goto L_0x00e3
            goto L_0x00e7
        L_0x00e3:
            java.lang.String r12 = HJ.C15854t.P0(r8, r10)
        L_0x00e7:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r8 = 1
            boolean r7 = HJ.C15854t.b0(r7, r9, r8)
            if (r7 == 0) goto L_0x00f9
            r7 = r25
            goto L_0x00fb
        L_0x00f9:
            r7 = r24
        L_0x00fb:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r6)
            r8.append(r12)
            java.lang.String r7 = r8.toString()
            r12 = r7
            goto L_0x0113
        L_0x010f:
            r24 = r7
            r25 = r8
        L_0x0113:
            r20 = 0
            r18 = r3
            r19 = r12
            r7 = 0
            r21 = r7
            r22 = r11
            r17.a(r18, r19, r20, r21, r22)
            r17 = r23
            r7 = r24
            r8 = r25
            r15 = 0
            goto L_0x009a
        L_0x012a:
            r24 = r7
            r25 = r8
            r7 = r17
        L_0x0130:
            js.b r8 = r0.f98698a
            r2.f98699c = r0
            r2.f98700d = r1
            r2.f98701e = r0
            r2.f98702f = r3
            r2.f98703g = r11
            r2.f98704h = r12
            r2.f98705i = r13
            r2.f98706j = r5
            r2.f98707k = r7
            r1 = 0
            r2.f98708l = r1
            r2.f98709m = r1
            r2.f98710n = r1
            r2.f98711o = r1
            r1 = 1
            r2.f98714r = r1
            java.lang.Object r3 = r8.a(r2)
            if (r3 != r4) goto L_0x0157
            return r4
        L_0x0157:
            r1 = r0
        L_0x0158:
            QL.x r3 = (QL.x) r3
            java.lang.Object r2 = r3.a()
            com.ingka.ikea.inbox.communicationpost.impl.CommunicationPostsRemote r2 = (com.ingka.ikea.inbox.communicationpost.impl.CommunicationPostsRemote) r2
            if (r2 != 0) goto L_0x0210
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0175:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x018d
            java.lang.Object r5 = r3.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r2, r8)
            if (r7 == 0) goto L_0x0175
            r4.add(r5)
            goto L_0x0175
        L_0x018d:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r7 = 0
        L_0x0193:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x020b
            java.lang.Object r5 = r3.next()
            r17 = r5
            qv.b r17 = (qv.C11819b) r17
            r5 = 0
            if (r4 != 0) goto L_0x01b1
            java.lang.String r4 = "Communication post response body was null"
            java.lang.String r4 = qv.C11818a.a(r4, r5)
            if (r4 != 0) goto L_0x01ad
            goto L_0x020b
        L_0x01ad:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x01b1:
            if (r7 != 0) goto L_0x01fd
            java.lang.Class r7 = r1.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r8 = 36
            r11 = 2
            r12 = 0
            java.lang.String r13 = HJ.C15854t.s1(r7, r8, r12, r11, r12)
            r8 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r8, r12, r11, r12)
            int r8 = r13.length()
            if (r8 != 0) goto L_0x01d3
            goto L_0x01d7
        L_0x01d3:
            java.lang.String r7 = HJ.C15854t.P0(r13, r10)
        L_0x01d7:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r11 = 1
            boolean r8 = HJ.C15854t.b0(r8, r9, r11)
            if (r8 == 0) goto L_0x01e9
            r8 = r25
            goto L_0x01eb
        L_0x01e9:
            r8 = r24
        L_0x01eb:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r8)
            r11.append(r6)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
        L_0x01fd:
            r20 = 0
            r18 = r2
            r19 = r7
            r21 = r5
            r22 = r4
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x0193
        L_0x020b:
            java.util.List r1 = YH.C16877v.n()
            return r1
        L_0x0210:
            boolean r4 = r3.e()
            if (r4 != 0) goto L_0x02dd
            qv.e r2 = qv.e.DEBUG
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x0229:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x0241
            java.lang.Object r7 = r4.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            r11 = 0
            boolean r8 = r8.b(r2, r11)
            if (r8 == 0) goto L_0x0229
            r5.add(r7)
            goto L_0x0229
        L_0x0241:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r7 = 0
        L_0x0247:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x02d8
            java.lang.Object r8 = r4.next()
            r17 = r8
            qv.b r17 = (qv.C11819b) r17
            r8 = 0
            if (r7 != 0) goto L_0x0278
            int r7 = r3.b()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Communication post response was unsuccessful "
            r11.append(r12)
            r11.append(r7)
            java.lang.String r7 = r11.toString()
            java.lang.String r7 = qv.C11818a.a(r7, r8)
            if (r7 != 0) goto L_0x0274
            goto L_0x02d8
        L_0x0274:
            java.lang.String r7 = qv.C11820c.a(r7)
        L_0x0278:
            if (r5 != 0) goto L_0x02c5
            java.lang.Class r5 = r1.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r11 = 36
            r12 = 2
            r13 = 0
            java.lang.String r14 = HJ.C15854t.s1(r5, r11, r13, r12, r13)
            r15 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r15, r13, r12, r13)
            int r16 = r14.length()
            if (r16 != 0) goto L_0x029a
            goto L_0x029e
        L_0x029a:
            java.lang.String r5 = HJ.C15854t.P0(r14, r10)
        L_0x029e:
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            r11 = 1
            boolean r14 = HJ.C15854t.b0(r14, r9, r11)
            if (r14 == 0) goto L_0x02b0
            r14 = r25
            goto L_0x02b2
        L_0x02b0:
            r14 = r24
        L_0x02b2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            r11.append(r6)
            r11.append(r5)
            java.lang.String r5 = r11.toString()
            goto L_0x02c9
        L_0x02c5:
            r12 = 2
            r13 = 0
            r15 = 46
        L_0x02c9:
            r20 = 0
            r18 = r2
            r19 = r5
            r21 = r8
            r22 = r7
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x0247
        L_0x02d8:
            java.util.List r1 = YH.C16877v.n()
            return r1
        L_0x02dd:
            js.e r1 = r2.b()
            java.util.List r1 = r1.a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: js.d.a(dI.e):java.lang.Object");
    }
}
