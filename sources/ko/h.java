package ko;

import Nn.C10800c;
import Nn.K;
import Nn.x;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JT\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH@¢\u0006\u0004\b\u0012\u0010\u0013JT\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lko/h;", "Lko/g;", "LNn/x;", "checkoutRepository", "<init>", "(LNn/x;)V", "", "checkoutId", "deliveryArrangementId", "timeSlotId", "LNn/K;", "selectedDeliveryServiceHolder", "", "additionalUserDetailsValues", "", "LNn/c;", "capabilities", "LXH/N;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNn/K;Ljava/util/Map;Ljava/util/List;LdI/e;)Ljava/lang/Object;", "a", "LNn/x;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {

    /* renamed from: a  reason: collision with root package name */
    private final x f98991a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.checkout.impl.delivery.usecase.SaveTimeSlotUseCaseImpl", f = "SaveTimeSlotUseCase.kt", l = {83, 89}, m = "saveTimeSlot")
    static final class a extends d {

        /* renamed from: A  reason: collision with root package name */
        int f98992A;

        /* renamed from: B  reason: collision with root package name */
        int f98993B;

        /* renamed from: C  reason: collision with root package name */
        /* synthetic */ Object f98994C;

        /* renamed from: D  reason: collision with root package name */
        final /* synthetic */ h f98995D;

        /* renamed from: E  reason: collision with root package name */
        int f98996E;

        /* renamed from: c  reason: collision with root package name */
        Object f98997c;

        /* renamed from: d  reason: collision with root package name */
        Object f98998d;

        /* renamed from: e  reason: collision with root package name */
        Object f98999e;

        /* renamed from: f  reason: collision with root package name */
        Object f99000f;

        /* renamed from: g  reason: collision with root package name */
        Object f99001g;

        /* renamed from: h  reason: collision with root package name */
        Object f99002h;

        /* renamed from: i  reason: collision with root package name */
        Object f99003i;

        /* renamed from: j  reason: collision with root package name */
        Object f99004j;

        /* renamed from: k  reason: collision with root package name */
        Object f99005k;

        /* renamed from: l  reason: collision with root package name */
        Object f99006l;

        /* renamed from: m  reason: collision with root package name */
        Object f99007m;

        /* renamed from: n  reason: collision with root package name */
        Object f99008n;

        /* renamed from: o  reason: collision with root package name */
        Object f99009o;

        /* renamed from: p  reason: collision with root package name */
        Object f99010p;

        /* renamed from: q  reason: collision with root package name */
        Object f99011q;

        /* renamed from: r  reason: collision with root package name */
        Object f99012r;

        /* renamed from: s  reason: collision with root package name */
        Object f99013s;

        /* renamed from: t  reason: collision with root package name */
        Object f99014t;

        /* renamed from: u  reason: collision with root package name */
        Object f99015u;

        /* renamed from: v  reason: collision with root package name */
        Object f99016v;

        /* renamed from: w  reason: collision with root package name */
        Object f99017w;

        /* renamed from: x  reason: collision with root package name */
        Object f99018x;

        /* renamed from: y  reason: collision with root package name */
        Object f99019y;

        /* renamed from: z  reason: collision with root package name */
        int f99020z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f98995D = hVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f98994C = obj;
            this.f98996E |= Integer.MIN_VALUE;
            return this.f98995D.c((String) null, (String) null, (String) null, (K) null, (Map<String, String>) null, (List<C10800c>) null, this);
        }
    }

    public h(x xVar) {
        C17542s.j(xVar, "checkoutRepository");
        this.f98991a = xVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0184, code lost:
        r10 = r12.d();
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02ea A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(java.lang.String r31, java.lang.String r32, java.lang.String r33, Nn.K r34, java.util.Map<java.lang.String, java.lang.String> r35, java.util.List<Nn.C10800c> r36, dI.C17164e<? super XH.C16807N> r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r36
            r5 = r37
            boolean r6 = r5 instanceof ko.h.a
            if (r6 == 0) goto L_0x001f
            r6 = r5
            ko.h$a r6 = (ko.h.a) r6
            int r7 = r6.f98996E
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f98996E = r7
            goto L_0x0024
        L_0x001f:
            ko.h$a r6 = new ko.h$a
            r6.<init>(r0, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f98994C
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f98996E
            r10 = 2
            r11 = 1
            if (r9 == 0) goto L_0x014e
            if (r9 == r11) goto L_0x0099
            if (r9 != r10) goto L_0x0091
            java.lang.Object r1 = r6.f99019y
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99018x
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99017w
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99016v
            Nn.L r1 = (Nn.L) r1
            java.lang.Object r1 = r6.f99014t
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99013s
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99012r
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99011q
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r6.f99010p
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r6.f99009o
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r6.f99008n
            Nn.J$a$a r1 = (Nn.J.a.C1694a) r1
            java.lang.Object r1 = r6.f99007m
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99006l
            Nn.J$b r1 = (Nn.J.b) r1
            java.lang.Object r1 = r6.f99005k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f99004j
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r6.f99003i
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r6.f99002h
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r6.f99001g
            Nn.K r1 = (Nn.K) r1
            java.lang.Object r1 = r6.f99000f
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f98999e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f98998d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r6.f98997c
            ko.h r1 = (ko.h) r1
            XH.y.b(r7)
            goto L_0x02eb
        L_0x0091:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0099:
            int r1 = r6.f98993B
            int r2 = r6.f98992A
            int r3 = r6.f99020z
            java.lang.Object r4 = r6.f99019y
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r6.f99018x
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r6.f99017w
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r11 = r6.f99016v
            Nn.L r11 = (Nn.L) r11
            java.lang.Object r12 = r6.f99015u
            java.lang.Object r13 = r6.f99014t
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r6.f99013s
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r6.f99012r
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r10 = r6.f99011q
            java.util.Iterator r10 = (java.util.Iterator) r10
            r31 = r1
            java.lang.Object r1 = r6.f99010p
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r32 = r1
            java.lang.Object r1 = r6.f99009o
            Nn.c r1 = (Nn.C10800c) r1
            java.lang.Object r1 = r6.f99008n
            Nn.J$a$a r1 = (Nn.J.a.C1694a) r1
            r33 = r1
            java.lang.Object r1 = r6.f99007m
            java.lang.String r1 = (java.lang.String) r1
            r34 = r1
            java.lang.Object r1 = r6.f99006l
            Nn.J$b r1 = (Nn.J.b) r1
            r35 = r1
            java.lang.Object r1 = r6.f99005k
            java.lang.String r1 = (java.lang.String) r1
            r36 = r1
            java.lang.Object r1 = r6.f99004j
            dI.e r1 = (dI.C17164e) r1
            r37 = r1
            java.lang.Object r1 = r6.f99003i
            java.util.List r1 = (java.util.List) r1
            r16 = r1
            java.lang.Object r1 = r6.f99002h
            java.util.Map r1 = (java.util.Map) r1
            r17 = r1
            java.lang.Object r1 = r6.f99001g
            Nn.K r1 = (Nn.K) r1
            r18 = r1
            java.lang.Object r1 = r6.f99000f
            java.lang.String r1 = (java.lang.String) r1
            r19 = r1
            java.lang.Object r1 = r6.f98999e
            java.lang.String r1 = (java.lang.String) r1
            r20 = r1
            java.lang.Object r1 = r6.f98998d
            java.lang.String r1 = (java.lang.String) r1
            r21 = r1
            java.lang.Object r1 = r6.f98997c
            ko.h r1 = (ko.h) r1
            XH.y.b(r7)
            r22 = r31
            r23 = r2
            r24 = r3
            r25 = r9
            r26 = r11
            r27 = r12
            r28 = r13
            r2 = r18
            r3 = r19
            r0 = r20
            r13 = r34
            r9 = r35
            r11 = r37
            r12 = r1
            r18 = r5
            r19 = r7
            r20 = r14
            r1 = r21
            r5 = r32
            r7 = r36
            r14 = r10
            r21 = r15
            r10 = r16
            r16 = r4
            r4 = r33
            r29 = r17
            r17 = r8
            r8 = r29
            goto L_0x027d
        L_0x014e:
            XH.y.b(r7)
            java.lang.String r7 = r34.f()
            Nn.p r9 = r34.c()
            Nn.J$b r9 = Co.c.j(r9)
            java.util.List r10 = r34.a()
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0167:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x017f
            java.lang.Object r12 = r10.next()
            r14 = r12
            Nn.K$b r14 = (Nn.K.b) r14
            java.lang.String r14 = r14.a()
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r2)
            if (r14 == 0) goto L_0x0167
            goto L_0x0180
        L_0x017f:
            r12 = 0
        L_0x0180:
            Nn.K$b r12 = (Nn.K.b) r12
            if (r12 == 0) goto L_0x018f
            Nn.G r10 = r12.d()
            if (r10 == 0) goto L_0x018f
            java.lang.String r10 = r10.g()
            goto L_0x0190
        L_0x018f:
            r10 = 0
        L_0x0190:
            r12 = r4
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Iterator r14 = r12.iterator()
        L_0x0197:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01b0
            java.lang.Object r15 = r14.next()
            r16 = r15
            Nn.c r16 = (Nn.C10800c) r16
            Nn.N r13 = r16.b()
            Nn.N r11 = Nn.N.AUTHORITY_TO_LEAVE
            if (r13 != r11) goto L_0x01ae
            goto L_0x01b1
        L_0x01ae:
            r11 = 1
            goto L_0x0197
        L_0x01b0:
            r15 = 0
        L_0x01b1:
            Nn.c r15 = (Nn.C10800c) r15
            if (r15 == 0) goto L_0x01ba
            boolean r13 = r15.a()
            goto L_0x01bb
        L_0x01ba:
            r13 = 0
        L_0x01bb:
            java.util.Iterator r14 = r12.iterator()
        L_0x01bf:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L_0x01da
            java.lang.Object r15 = r14.next()
            r18 = r15
            Nn.c r18 = (Nn.C10800c) r18
            Nn.N r11 = r18.b()
            r18 = r15
            Nn.N r15 = Nn.N.WHEELCHAIR
            if (r11 != r15) goto L_0x01bf
            r11 = r18
            goto L_0x01db
        L_0x01da:
            r11 = 0
        L_0x01db:
            r15 = r11
            Nn.c r15 = (Nn.C10800c) r15
            if (r15 == 0) goto L_0x01ed
            boolean r17 = r15.a()
            r18 = r11
            r29 = r17
            r17 = r8
            r8 = r29
            goto L_0x01f2
        L_0x01ed:
            r17 = r8
            r18 = r11
            r8 = 0
        L_0x01f2:
            Nn.L r11 = new Nn.L
            r11.<init>(r13, r8)
            r19 = r8
            Nn.J$a$a r8 = new Nn.J$a$a
            r8.<init>(r2, r3, r10, r11)
            r20 = r13
            Nn.x r13 = r0.f98991a
            r21 = r13
            Nn.s$b r13 = new Nn.s$b
            r13.<init>(r8)
            r6.f98997c = r0
            r6.f98998d = r1
            r6.f98999e = r2
            r6.f99000f = r3
            r0 = r34
            r6.f99001g = r0
            r0 = r35
            r6.f99002h = r0
            r6.f99003i = r4
            r6.f99004j = r5
            r6.f99005k = r7
            r6.f99006l = r9
            r6.f99007m = r10
            r6.f99008n = r8
            r6.f99009o = r15
            r6.f99010p = r12
            r6.f99011q = r14
            r6.f99012r = r2
            r6.f99013s = r3
            r6.f99014t = r10
            r15 = r18
            r6.f99015u = r15
            r6.f99016v = r11
            r6.f99017w = r10
            r6.f99018x = r3
            r6.f99019y = r2
            r0 = r20
            r6.f99020z = r0
            r2 = r19
            r6.f98992A = r2
            r6.f98993B = r0
            r0 = 1
            r6.f98996E = r0
            r0 = r21
            java.lang.Object r0 = r0.A(r1, r7, r13, r6)
            r13 = r17
            if (r0 != r13) goto L_0x0255
            return r13
        L_0x0255:
            r16 = r32
            r21 = r16
            r19 = r0
            r23 = r2
            r18 = r3
            r25 = r10
            r28 = r25
            r26 = r11
            r17 = r13
            r27 = r15
            r22 = r20
            r24 = r22
            r0 = r21
            r2 = r34
            r20 = r18
            r11 = r5
            r13 = r28
            r5 = r12
            r12 = r30
            r10 = r4
            r4 = r8
            r8 = r35
        L_0x027d:
            r15 = r19
            java.util.List r15 = (java.util.List) r15
            r19 = r14
            Nn.x r14 = r12.f98991a
            r6.f98997c = r12
            r6.f98998d = r1
            r6.f98999e = r0
            r6.f99000f = r3
            r6.f99001g = r2
            r6.f99002h = r8
            r6.f99003i = r10
            r6.f99004j = r11
            r6.f99005k = r7
            r6.f99006l = r9
            r6.f99007m = r13
            r6.f99008n = r4
            r6.f99009o = r15
            r6.f99010p = r5
            r10 = r19
            r6.f99011q = r10
            r0 = r21
            r6.f99012r = r0
            r3 = r20
            r6.f99013s = r3
            r10 = r28
            r6.f99014t = r10
            r12 = r27
            r6.f99015u = r12
            r11 = r26
            r6.f99016v = r11
            r10 = r25
            r6.f99017w = r10
            r3 = r18
            r6.f99018x = r3
            r4 = r16
            r6.f99019y = r4
            r3 = r24
            r6.f99020z = r3
            r2 = r23
            r6.f98992A = r2
            r0 = r22
            r6.f98993B = r0
            r0 = 2
            r6.f98996E = r0
            r31 = r14
            r32 = r1
            r33 = r7
            r34 = r9
            r35 = r15
            r36 = r8
            r37 = r6
            java.lang.Object r0 = r31.D(r32, r33, r34, r35, r36, r37)
            r1 = r17
            if (r0 != r1) goto L_0x02eb
            return r1
        L_0x02eb:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.h.c(java.lang.String, java.lang.String, java.lang.String, Nn.K, java.util.Map, java.util.List, dI.e):java.lang.Object");
    }

    public Object a(String str, String str2, String str3, K k10, Map<String, String> map, List<C10800c> list, C17164e<? super C16807N> eVar) {
        Object c10 = c(str, str2, str3, k10, map, list, eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}
