package fA;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import tw.g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0010"}, d2 = {"LfA/c;", "LfA/b;", "Ltw/g;", "networkParameters", "LfA/a;", "guestTokenEndpoint", "<init>", "(Ltw/g;LfA/a;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "currentToken", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Ltw/g;", "LfA/a;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fA.c  reason: case insensitive filesystem */
public final class C14440c implements C14439b {

    /* renamed from: a  reason: collision with root package name */
    private final g f126822a;

    /* renamed from: b  reason: collision with root package name */
    private final C14438a f126823b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.session.impl.guesttoken.network.GuestTokenRemoteDataSourceImpl", f = "GuestTokenRemoteDataSourceImpl.kt", l = {34}, m = "fetchGuestToken")
    /* renamed from: fA.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f126824c;

        /* renamed from: d  reason: collision with root package name */
        Object f126825d;

        /* renamed from: e  reason: collision with root package name */
        Object f126826e;

        /* renamed from: f  reason: collision with root package name */
        Object f126827f;

        /* renamed from: g  reason: collision with root package name */
        Object f126828g;

        /* renamed from: h  reason: collision with root package name */
        Object f126829h;

        /* renamed from: i  reason: collision with root package name */
        Object f126830i;

        /* renamed from: j  reason: collision with root package name */
        Object f126831j;

        /* renamed from: k  reason: collision with root package name */
        Object f126832k;

        /* renamed from: l  reason: collision with root package name */
        Object f126833l;

        /* renamed from: m  reason: collision with root package name */
        Object f126834m;

        /* renamed from: n  reason: collision with root package name */
        int f126835n;

        /* renamed from: o  reason: collision with root package name */
        int f126836o;

        /* renamed from: p  reason: collision with root package name */
        int f126837p;

        /* renamed from: q  reason: collision with root package name */
        int f126838q;

        /* renamed from: r  reason: collision with root package name */
        int f126839r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f126840s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C14440c f126841t;

        /* renamed from: u  reason: collision with root package name */
        int f126842u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14440c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f126841t = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126840s = obj;
            this.f126842u |= Integer.MIN_VALUE;
            return this.f126841t.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.session.impl.guesttoken.network.GuestTokenRemoteDataSourceImpl", f = "GuestTokenRemoteDataSourceImpl.kt", l = {62}, m = "refreshGuestToken")
    /* renamed from: fA.c$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f126843c;

        /* renamed from: d  reason: collision with root package name */
        Object f126844d;

        /* renamed from: e  reason: collision with root package name */
        Object f126845e;

        /* renamed from: f  reason: collision with root package name */
        Object f126846f;

        /* renamed from: g  reason: collision with root package name */
        Object f126847g;

        /* renamed from: h  reason: collision with root package name */
        Object f126848h;

        /* renamed from: i  reason: collision with root package name */
        Object f126849i;

        /* renamed from: j  reason: collision with root package name */
        Object f126850j;

        /* renamed from: k  reason: collision with root package name */
        Object f126851k;

        /* renamed from: l  reason: collision with root package name */
        Object f126852l;

        /* renamed from: m  reason: collision with root package name */
        Object f126853m;

        /* renamed from: n  reason: collision with root package name */
        Object f126854n;

        /* renamed from: o  reason: collision with root package name */
        int f126855o;

        /* renamed from: p  reason: collision with root package name */
        int f126856p;

        /* renamed from: q  reason: collision with root package name */
        int f126857q;

        /* renamed from: r  reason: collision with root package name */
        int f126858r;

        /* renamed from: s  reason: collision with root package name */
        int f126859s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f126860t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ C14440c f126861u;

        /* renamed from: v  reason: collision with root package name */
        int f126862v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C14440c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f126861u = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f126860t = obj;
            this.f126862v |= Integer.MIN_VALUE;
            return this.f126861u.b((String) null, this);
        }
    }

    public C14440c(g gVar, C14438a aVar) {
        C17542s.j(gVar, "networkParameters");
        C17542s.j(aVar, "guestTokenEndpoint");
        this.f126822a = gVar;
        this.f126823b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v13, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super java.lang.String> r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            boolean r2 = r1 instanceof fA.C14440c.a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            fA.c$a r2 = (fA.C14440c.a) r2
            int r3 = r2.f126842u
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f126842u = r3
            goto L_0x001c
        L_0x0017:
            fA.c$a r2 = new fA.c$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f126840s
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f126842u
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r13 = 1
            r15 = 0
            if (r5 == 0) goto L_0x006d
            if (r5 != r13) goto L_0x0065
            java.lang.Object r1 = r2.f126833l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f126832k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f126831j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f126830i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f126829h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r2.f126828g
            fA.c r1 = (fA.C14440c) r1
            java.lang.Object r1 = r2.f126827f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f126826e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f126825d
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f126824c
            fA.c r1 = (fA.C14440c) r1
            XH.y.b(r3)
            r24 = r7
            r25 = r8
            goto L_0x0180
        L_0x0065:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x006d:
            XH.y.b(r3)
            qv.e r3 = qv.e.DEBUG
            qv.d r5 = qv.d.f102012a
            java.util.List r5 = r5.a()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0083:
            boolean r17 = r5.hasNext()
            if (r17 == 0) goto L_0x009a
            java.lang.Object r11 = r5.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r3, r15)
            if (r12 == 0) goto L_0x0083
            r13.add(r11)
            goto L_0x0083
        L_0x009a:
            java.util.Iterator r5 = r13.iterator()
            r17 = r13
            r11 = 0
            r12 = 0
        L_0x00a2:
            boolean r18 = r5.hasNext()
            java.lang.Class<fA.c> r19 = fA.C14440c.class
            if (r18 == 0) goto L_0x0132
            java.lang.Object r23 = r5.next()
            r17 = r23
            qv.b r17 = (qv.C11819b) r17
            r15 = 0
            if (r11 != 0) goto L_0x00c9
            java.lang.String r14 = "fetchGuestToken"
            java.lang.String r14 = qv.C11818a.a(r14, r15)
            if (r14 != 0) goto L_0x00c5
            r24 = r7
            r25 = r8
            r7 = r23
            goto L_0x0138
        L_0x00c5:
            java.lang.String r11 = qv.C11820c.a(r14)
        L_0x00c9:
            if (r12 != 0) goto L_0x0117
            java.lang.String r12 = r19.getName()
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
            if (r7 != 0) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            java.lang.String r12 = HJ.C15854t.P0(r8, r10)
        L_0x00ef:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            r8 = 1
            boolean r7 = HJ.C15854t.b0(r7, r9, r8)
            if (r7 == 0) goto L_0x0101
            r7 = r25
            goto L_0x0103
        L_0x0101:
            r7 = r24
        L_0x0103:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r6)
            r8.append(r12)
            java.lang.String r7 = r8.toString()
            r12 = r7
            goto L_0x011b
        L_0x0117:
            r24 = r7
            r25 = r8
        L_0x011b:
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
            goto L_0x00a2
        L_0x0132:
            r24 = r7
            r25 = r8
            r7 = r17
        L_0x0138:
            tw.g r8 = r0.f126822a
            java.lang.String r8 = r8.i()
            tw.g r14 = r0.f126822a
            java.lang.String r14 = r14.a()
            boolean r15 = HJ.C15854t.v0(r8)
            if (r15 != 0) goto L_0x025d
            boolean r15 = HJ.C15854t.v0(r14)
            if (r15 == 0) goto L_0x0152
            goto L_0x025d
        L_0x0152:
            fA.a r15 = r0.f126823b
            r2.f126824c = r0
            r2.f126825d = r1
            r2.f126826e = r8
            r2.f126827f = r14
            r2.f126828g = r0
            r2.f126829h = r3
            r2.f126830i = r11
            r2.f126831j = r12
            r2.f126832k = r13
            r2.f126833l = r5
            r2.f126834m = r7
            r1 = 0
            r2.f126835n = r1
            r2.f126836o = r1
            r2.f126837p = r1
            r2.f126838q = r1
            r2.f126839r = r1
            r1 = 1
            r2.f126842u = r1
            java.lang.Object r3 = r15.a(r2)
            if (r3 != r4) goto L_0x017f
            return r4
        L_0x017f:
            r1 = r0
        L_0x0180:
            QL.x r3 = (QL.x) r3
            boolean r2 = r3.e()
            if (r2 == 0) goto L_0x019d
            java.lang.Object r1 = r3.a()
            com.ingka.ikea.session.impl.guesttoken.network.models.GuestTokenResponse r1 = (com.ingka.ikea.session.impl.guesttoken.network.models.GuestTokenResponse) r1
            if (r1 == 0) goto L_0x0195
            java.lang.String r1 = r1.b()
            return r1
        L_0x0195:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Empty or null body received"
            r1.<init>(r2)
            throw r1
        L_0x019d:
            qv.e r2 = qv.e.WARN
            qv.d r4 = qv.d.f102012a
            java.util.List r4 = r4.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x01b0:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x01c8
            java.lang.Object r7 = r4.next()
            r8 = r7
            qv.b r8 = (qv.C11819b) r8
            r11 = 0
            boolean r8 = r8.b(r2, r11)
            if (r8 == 0) goto L_0x01b0
            r5.add(r7)
            goto L_0x01b0
        L_0x01c8:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
            r7 = 0
        L_0x01ce:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x0255
            java.lang.Object r8 = r4.next()
            r17 = r8
            qv.b r17 = (qv.C11819b) r17
            r8 = 0
            if (r5 != 0) goto L_0x01fa
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "Unable to fetch guest token, response: "
            r5.append(r11)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = qv.C11818a.a(r5, r8)
            if (r5 == 0) goto L_0x0255
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x01fa:
            if (r7 != 0) goto L_0x0246
            java.lang.Class r7 = r1.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r11 = 36
            r12 = 2
            r13 = 0
            java.lang.String r14 = HJ.C15854t.s1(r7, r11, r13, r12, r13)
            r11 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r11, r13, r12, r13)
            int r11 = r14.length()
            if (r11 != 0) goto L_0x021c
            goto L_0x0220
        L_0x021c:
            java.lang.String r7 = HJ.C15854t.P0(r14, r10)
        L_0x0220:
            java.lang.Thread r11 = java.lang.Thread.currentThread()
            java.lang.String r11 = r11.getName()
            r12 = 1
            boolean r11 = HJ.C15854t.b0(r11, r9, r12)
            if (r11 == 0) goto L_0x0232
            r11 = r25
            goto L_0x0234
        L_0x0232:
            r11 = r24
        L_0x0234:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            r12.append(r6)
            r12.append(r7)
            java.lang.String r7 = r12.toString()
        L_0x0246:
            r20 = 0
            r18 = r2
            r19 = r7
            r21 = r8
            r22 = r5
            r17.a(r18, r19, r20, r21, r22)
            goto L_0x01ce
        L_0x0255:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Unable to fetch guest token"
            r1.<init>(r2)
            throw r1
        L_0x025d:
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0270:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0288
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r7 = 0
            boolean r5 = r5.b(r1, r7)
            if (r5 == 0) goto L_0x0270
            r3.add(r4)
            goto L_0x0270
        L_0x0288:
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
            r7 = 0
        L_0x028e:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "Unable to fetch guest token, no market set"
            if (r4 == 0) goto L_0x0307
            java.lang.Object r4 = r2.next()
            r11 = r4
            qv.b r11 = (qv.C11819b) r11
            r15 = 0
            if (r7 != 0) goto L_0x02ab
            java.lang.String r4 = qv.C11818a.a(r5, r15)
            if (r4 == 0) goto L_0x0307
            java.lang.String r4 = qv.C11820c.a(r4)
            r7 = r4
        L_0x02ab:
            if (r3 != 0) goto L_0x02f4
            java.lang.String r3 = r19.getName()
            kotlin.jvm.internal.C17542s.g(r3)
            r4 = 36
            r5 = 0
            r8 = 2
            java.lang.String r12 = HJ.C15854t.s1(r3, r4, r5, r8, r5)
            r14 = 46
            java.lang.String r12 = HJ.C15854t.o1(r12, r14, r5, r8, r5)
            int r13 = r12.length()
            if (r13 != 0) goto L_0x02c9
            goto L_0x02cd
        L_0x02c9:
            java.lang.String r3 = HJ.C15854t.P0(r12, r10)
        L_0x02cd:
            java.lang.Thread r12 = java.lang.Thread.currentThread()
            java.lang.String r12 = r12.getName()
            r13 = 1
            boolean r12 = HJ.C15854t.b0(r12, r9, r13)
            if (r12 == 0) goto L_0x02df
            r12 = r25
            goto L_0x02e1
        L_0x02df:
            r12 = r24
        L_0x02e1:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r12)
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x02f9
        L_0x02f4:
            r5 = 0
            r8 = 2
            r13 = 1
            r14 = 46
        L_0x02f9:
            r4 = 0
            r12 = r1
            r17 = r13
            r13 = r3
            r18 = r14
            r14 = r4
            r16 = r7
            r11.a(r12, r13, r14, r15, r16)
            goto L_0x028e
        L_0x0307:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fA.C14440c.a(dI.e):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v9, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v11, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r29, dI.C17164e<? super java.lang.String> r30) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r2 instanceof fA.C14440c.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            fA.c$b r3 = (fA.C14440c.b) r3
            int r4 = r3.f126862v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f126862v = r4
            goto L_0x001e
        L_0x0019:
            fA.c$b r3 = new fA.c$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f126860t
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f126862v
            java.lang.String r7 = "|"
            java.lang.String r8 = "b"
            java.lang.String r9 = "m"
            java.lang.String r10 = "main"
            java.lang.String r11 = "Kt"
            r14 = 1
            r12 = 0
            if (r6 == 0) goto L_0x0075
            if (r6 != r14) goto L_0x006d
            java.lang.Object r1 = r3.f126853m
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f126852l
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f126851k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126850j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126849i
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f126848h
            fA.c r1 = (fA.C14440c) r1
            java.lang.Object r1 = r3.f126847g
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126846f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126845e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f126844d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f126843c
            fA.c r1 = (fA.C14440c) r1
            XH.y.b(r4)
            r18 = r7
            r25 = r8
            r26 = r9
            goto L_0x01a3
        L_0x006d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0075:
            XH.y.b(r4)
            qv.e r4 = qv.e.DEBUG
            qv.d r6 = qv.d.f102012a
            java.util.List r6 = r6.a()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x008b:
            boolean r18 = r6.hasNext()
            if (r18 == 0) goto L_0x00a2
            java.lang.Object r13 = r6.next()
            r15 = r13
            qv.b r15 = (qv.C11819b) r15
            boolean r15 = r15.b(r4, r12)
            if (r15 == 0) goto L_0x008b
            r14.add(r13)
            goto L_0x008b
        L_0x00a2:
            java.util.Iterator r6 = r14.iterator()
            r18 = r14
            r13 = 0
            r15 = 0
        L_0x00aa:
            boolean r19 = r6.hasNext()
            java.lang.Class<fA.c> r20 = fA.C14440c.class
            if (r19 == 0) goto L_0x013f
            java.lang.Object r24 = r6.next()
            r18 = r24
            qv.b r18 = (qv.C11819b) r18
            r12 = 0
            r25 = r8
            if (r13 != 0) goto L_0x00d4
            java.lang.String r8 = "refreshGuestToken"
            java.lang.String r8 = qv.C11818a.a(r8, r12)
            if (r8 != 0) goto L_0x00cf
            r27 = r5
            r26 = r9
            r5 = r24
            goto L_0x0147
        L_0x00cf:
            java.lang.String r8 = qv.C11820c.a(r8)
            r13 = r8
        L_0x00d4:
            if (r15 != 0) goto L_0x0122
            java.lang.String r8 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r27 = r5
            r26 = r9
            r9 = 0
            r12 = 2
            r15 = 36
            java.lang.String r5 = HJ.C15854t.s1(r8, r15, r9, r12, r9)
            r15 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r15, r9, r12, r9)
            int r9 = r5.length()
            if (r9 != 0) goto L_0x00f6
            goto L_0x00fa
        L_0x00f6:
            java.lang.String r8 = HJ.C15854t.P0(r5, r11)
        L_0x00fa:
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            r9 = 1
            boolean r5 = HJ.C15854t.b0(r5, r10, r9)
            if (r5 == 0) goto L_0x010c
            r5 = r26
            goto L_0x010e
        L_0x010c:
            r5 = r25
        L_0x010e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r9.append(r7)
            r9.append(r8)
            java.lang.String r5 = r9.toString()
            r15 = r5
            goto L_0x0126
        L_0x0122:
            r27 = r5
            r26 = r9
        L_0x0126:
            r21 = 0
            r19 = r4
            r20 = r15
            r5 = 0
            r22 = r5
            r23 = r13
            r18.a(r19, r20, r21, r22, r23)
            r18 = r24
            r8 = r25
            r9 = r26
            r5 = r27
            r12 = 0
            goto L_0x00aa
        L_0x013f:
            r27 = r5
            r25 = r8
            r26 = r9
            r5 = r18
        L_0x0147:
            if (r1 == 0) goto L_0x034a
            int r8 = r29.length()
            if (r8 == 0) goto L_0x034a
            tw.g r8 = r0.f126822a
            java.lang.String r8 = r8.i()
            tw.g r9 = r0.f126822a
            java.lang.String r9 = r9.a()
            boolean r12 = HJ.C15854t.v0(r8)
            if (r12 != 0) goto L_0x0167
            boolean r12 = HJ.C15854t.v0(r9)
            if (r12 == 0) goto L_0x016a
        L_0x0167:
            r13 = r7
            goto L_0x0295
        L_0x016a:
            fA.a r12 = r0.f126823b
            r18 = r7
            com.ingka.ikea.session.impl.guesttoken.network.models.TokenBody r7 = new com.ingka.ikea.session.impl.guesttoken.network.models.TokenBody
            r7.<init>(r1)
            r3.f126843c = r0
            r3.f126844d = r1
            r3.f126845e = r2
            r3.f126846f = r8
            r3.f126847g = r9
            r3.f126848h = r0
            r3.f126849i = r4
            r3.f126850j = r13
            r3.f126851k = r15
            r3.f126852l = r14
            r3.f126853m = r6
            r3.f126854n = r5
            r1 = 0
            r3.f126855o = r1
            r3.f126856p = r1
            r3.f126857q = r1
            r3.f126858r = r1
            r3.f126859s = r1
            r1 = 1
            r3.f126862v = r1
            java.lang.Object r4 = r12.b(r7, r3)
            r1 = r27
            if (r4 != r1) goto L_0x01a2
            return r1
        L_0x01a2:
            r1 = r0
        L_0x01a3:
            QL.x r4 = (QL.x) r4
            boolean r2 = r4.e()
            if (r2 == 0) goto L_0x01c0
            java.lang.Object r1 = r4.a()
            com.ingka.ikea.session.impl.guesttoken.network.models.GuestTokenResponse r1 = (com.ingka.ikea.session.impl.guesttoken.network.models.GuestTokenResponse) r1
            if (r1 == 0) goto L_0x01b8
            java.lang.String r1 = r1.b()
            return r1
        L_0x01b8:
            gA.a$a r1 = new gA.a$a
            java.lang.String r2 = "Empty or null body received"
            r1.<init>(r2)
            throw r1
        L_0x01c0:
            qv.e r2 = qv.e.WARN
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x01d3:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01eb
            java.lang.Object r6 = r3.next()
            r7 = r6
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r2, r8)
            if (r7 == 0) goto L_0x01d3
            r5.add(r6)
            goto L_0x01d3
        L_0x01eb:
            java.util.Iterator r3 = r5.iterator()
            r5 = 0
            r9 = 0
        L_0x01f1:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0282
            java.lang.Object r6 = r3.next()
            qv.b r6 = (qv.C11819b) r6
            r7 = 0
            if (r5 != 0) goto L_0x021d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Unable to fetch guest token, response: "
            r5.append(r8)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = qv.C11818a.a(r5, r7)
            if (r5 != 0) goto L_0x0219
            goto L_0x0282
        L_0x0219:
            java.lang.String r5 = qv.C11820c.a(r5)
        L_0x021d:
            if (r9 != 0) goto L_0x026d
            java.lang.Class r8 = r1.getClass()
            java.lang.String r8 = r8.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            r9 = 36
            r12 = 2
            r13 = 0
            java.lang.String r14 = HJ.C15854t.s1(r8, r9, r13, r12, r13)
            r9 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r9, r13, r12, r13)
            int r9 = r14.length()
            if (r9 != 0) goto L_0x023f
            goto L_0x0243
        L_0x023f:
            java.lang.String r8 = HJ.C15854t.P0(r14, r11)
        L_0x0243:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            r12 = 1
            boolean r9 = HJ.C15854t.b0(r9, r10, r12)
            if (r9 == 0) goto L_0x0255
            r9 = r26
            goto L_0x0257
        L_0x0255:
            r9 = r25
        L_0x0257:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            r13 = r18
            r12.append(r13)
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r9 = r8
            goto L_0x026f
        L_0x026d:
            r13 = r18
        L_0x026f:
            r21 = 0
            r18 = r6
            r19 = r2
            r20 = r9
            r22 = r7
            r23 = r5
            r18.a(r19, r20, r21, r22, r23)
            r18 = r13
            goto L_0x01f1
        L_0x0282:
            int r1 = r4.b()
            r2 = 401(0x191, float:5.62E-43)
            if (r1 != r2) goto L_0x028d
            gA.a$b r1 = gA.C14498a.b.f127252a
            goto L_0x0294
        L_0x028d:
            gA.a$a r1 = new gA.a$a
            java.lang.String r2 = "Unable to fetch guest token"
            r1.<init>(r2)
        L_0x0294:
            throw r1
        L_0x0295:
            qv.e r1 = qv.e.WARN
            qv.d r2 = qv.d.f102012a
            java.util.List r2 = r2.a()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x02a8:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02c0
            java.lang.Object r4 = r2.next()
            r5 = r4
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r1, r6)
            if (r5 == 0) goto L_0x02a8
            r3.add(r4)
            goto L_0x02a8
        L_0x02c0:
            java.util.Iterator r8 = r3.iterator()
            r2 = 0
            r9 = 0
        L_0x02c6:
            boolean r3 = r8.hasNext()
            java.lang.String r4 = "Unable to refresh guest token, no market set"
            if (r3 == 0) goto L_0x0344
            java.lang.Object r3 = r8.next()
            qv.b r3 = (qv.C11819b) r3
            r6 = 0
            if (r9 != 0) goto L_0x02e2
            java.lang.String r5 = qv.C11818a.a(r4, r6)
            if (r5 == 0) goto L_0x0344
            java.lang.String r4 = qv.C11820c.a(r5)
            r9 = r4
        L_0x02e2:
            if (r2 != 0) goto L_0x032d
            java.lang.String r2 = r20.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r12 = 36
            r14 = 2
            r15 = 0
            java.lang.String r4 = HJ.C15854t.s1(r2, r12, r15, r14, r15)
            r7 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r7, r15, r14, r15)
            int r5 = r4.length()
            if (r5 != 0) goto L_0x0300
            goto L_0x0304
        L_0x0300:
            java.lang.String r2 = HJ.C15854t.P0(r4, r11)
        L_0x0304:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r5 = 1
            boolean r4 = HJ.C15854t.b0(r4, r10, r5)
            if (r4 == 0) goto L_0x0316
            r4 = r26
            goto L_0x0318
        L_0x0316:
            r4 = r25
        L_0x0318:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            r5.append(r13)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
        L_0x032a:
            r16 = r2
            goto L_0x0334
        L_0x032d:
            r7 = 46
            r12 = 36
            r14 = 2
            r15 = 0
            goto L_0x032a
        L_0x0334:
            r5 = 0
            r2 = r3
            r3 = r1
            r4 = r16
            r17 = 1
            r18 = r7
            r7 = r9
            r2.a(r3, r4, r5, r6, r7)
            r2 = r16
            goto L_0x02c6
        L_0x0344:
            gA.a$a r1 = new gA.a$a
            r1.<init>(r4)
            throw r1
        L_0x034a:
            gA.a$a r1 = new gA.a$a
            java.lang.String r2 = "Unable to refresh guest token, no current token"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fA.C14440c.b(java.lang.String, dI.e):java.lang.Object");
    }
}
