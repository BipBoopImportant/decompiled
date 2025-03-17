package Qn;

import Nn.C10815s;
import Nn.J;
import Nn.x;
import Vn.b;
import XH.t;
import dI.C17164e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000eH@¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0011H@¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015HB¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"LQn/b;", "LVn/b;", "LNn/x;", "checkoutRepository", "<init>", "(LNn/x;)V", "", "checkoutId", "LVn/b$b;", "selectDelivery", "", "LNn/J$a$a;", "e", "(Ljava/lang/String;LVn/b$b;LdI/e;)Ljava/lang/Object;", "LVn/b$b$a;", "c", "(Ljava/lang/String;LVn/b$b$a;LdI/e;)Ljava/lang/Object;", "LVn/b$b$b;", "d", "(Ljava/lang/String;LVn/b$b$b;LdI/e;)Ljava/lang/Object;", "selectDeliveryService", "", "additionalValues", "LVn/b$a;", "a", "(Ljava/lang/String;LVn/b$b;Ljava/util/Map;LdI/e;)Ljava/lang/Object;", "LNn/x;", "onlinecheckout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Vn.b {

    /* renamed from: a  reason: collision with root package name */
    private final x f86050a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.checkout.datalayer.impl.domain.usecase.SelectEarliestTimeWindowUseCaseImpl", f = "SelectEarliestTimeWindowUseCaseImpl.kt", l = {115}, m = "getSelectDeliveriesHome")
    static final class a extends d {

        /* renamed from: A  reason: collision with root package name */
        int f86051A;

        /* renamed from: B  reason: collision with root package name */
        int f86052B;

        /* renamed from: C  reason: collision with root package name */
        int f86053C;

        /* renamed from: D  reason: collision with root package name */
        int f86054D;

        /* renamed from: E  reason: collision with root package name */
        int f86055E;

        /* renamed from: F  reason: collision with root package name */
        int f86056F;

        /* renamed from: G  reason: collision with root package name */
        /* synthetic */ Object f86057G;

        /* renamed from: H  reason: collision with root package name */
        final /* synthetic */ b f86058H;

        /* renamed from: I  reason: collision with root package name */
        int f86059I;

        /* renamed from: c  reason: collision with root package name */
        Object f86060c;

        /* renamed from: d  reason: collision with root package name */
        Object f86061d;

        /* renamed from: e  reason: collision with root package name */
        Object f86062e;

        /* renamed from: f  reason: collision with root package name */
        Object f86063f;

        /* renamed from: g  reason: collision with root package name */
        Object f86064g;

        /* renamed from: h  reason: collision with root package name */
        Object f86065h;

        /* renamed from: i  reason: collision with root package name */
        Object f86066i;

        /* renamed from: j  reason: collision with root package name */
        Object f86067j;

        /* renamed from: k  reason: collision with root package name */
        Object f86068k;

        /* renamed from: l  reason: collision with root package name */
        Object f86069l;

        /* renamed from: m  reason: collision with root package name */
        Object f86070m;

        /* renamed from: n  reason: collision with root package name */
        Object f86071n;

        /* renamed from: o  reason: collision with root package name */
        Object f86072o;

        /* renamed from: p  reason: collision with root package name */
        Object f86073p;

        /* renamed from: q  reason: collision with root package name */
        Object f86074q;

        /* renamed from: r  reason: collision with root package name */
        Object f86075r;

        /* renamed from: s  reason: collision with root package name */
        Object f86076s;

        /* renamed from: t  reason: collision with root package name */
        Object f86077t;

        /* renamed from: u  reason: collision with root package name */
        Object f86078u;

        /* renamed from: v  reason: collision with root package name */
        Object f86079v;

        /* renamed from: w  reason: collision with root package name */
        Object f86080w;

        /* renamed from: x  reason: collision with root package name */
        Object f86081x;

        /* renamed from: y  reason: collision with root package name */
        int f86082y;

        /* renamed from: z  reason: collision with root package name */
        int f86083z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f86058H = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f86057G = obj;
            this.f86059I |= Integer.MIN_VALUE;
            return this.f86058H.d((String) null, (b.C1881b.C1882b) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.checkout.datalayer.impl.domain.usecase.SelectEarliestTimeWindowUseCaseImpl", f = "SelectEarliestTimeWindowUseCaseImpl.kt", l = {30, 42}, m = "invoke")
    /* renamed from: Qn.b$b  reason: collision with other inner class name */
    static final class C1769b extends d {

        /* renamed from: A  reason: collision with root package name */
        int f86084A;

        /* renamed from: c  reason: collision with root package name */
        Object f86085c;

        /* renamed from: d  reason: collision with root package name */
        Object f86086d;

        /* renamed from: e  reason: collision with root package name */
        Object f86087e;

        /* renamed from: f  reason: collision with root package name */
        Object f86088f;

        /* renamed from: g  reason: collision with root package name */
        Object f86089g;

        /* renamed from: h  reason: collision with root package name */
        Object f86090h;

        /* renamed from: i  reason: collision with root package name */
        Object f86091i;

        /* renamed from: j  reason: collision with root package name */
        Object f86092j;

        /* renamed from: k  reason: collision with root package name */
        Object f86093k;

        /* renamed from: l  reason: collision with root package name */
        Object f86094l;

        /* renamed from: m  reason: collision with root package name */
        Object f86095m;

        /* renamed from: n  reason: collision with root package name */
        Object f86096n;

        /* renamed from: o  reason: collision with root package name */
        Object f86097o;

        /* renamed from: p  reason: collision with root package name */
        Object f86098p;

        /* renamed from: q  reason: collision with root package name */
        Object f86099q;

        /* renamed from: r  reason: collision with root package name */
        int f86100r;

        /* renamed from: s  reason: collision with root package name */
        int f86101s;

        /* renamed from: t  reason: collision with root package name */
        int f86102t;

        /* renamed from: u  reason: collision with root package name */
        int f86103u;

        /* renamed from: v  reason: collision with root package name */
        int f86104v;

        /* renamed from: w  reason: collision with root package name */
        int f86105w;

        /* renamed from: x  reason: collision with root package name */
        int f86106x;

        /* renamed from: y  reason: collision with root package name */
        /* synthetic */ Object f86107y;

        /* renamed from: z  reason: collision with root package name */
        final /* synthetic */ b f86108z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1769b(b bVar, C17164e<? super C1769b> eVar) {
            super(eVar);
            this.f86108z = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f86107y = obj;
            this.f86084A |= Integer.MIN_VALUE;
            return this.f86108z.a((String) null, (b.C1881b) null, (Map<String, String>) null, this);
        }
    }

    public b(x xVar) {
        C17542s.j(xVar, "checkoutRepository");
        this.f86050a = xVar;
    }

    private final Object c(String str, b.C1881b.a aVar, C17164e<? super List<J.a.C1694a>> eVar) {
        String a10 = aVar.a();
        return this.f86050a.A(str, a10, new C10815s.a(a10, aVar.c(), aVar.d()), eVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: Nn.o$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v10, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v12, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v24, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(java.lang.String r32, Vn.b.C1881b.C1882b r33, dI.C17164e<? super java.util.List<Nn.J.a.C1694a>> r34) {
        /*
            r31 = this;
            r0 = r34
            boolean r1 = r0 instanceof Qn.b.a
            if (r1 == 0) goto L_0x0017
            r1 = r0
            Qn.b$a r1 = (Qn.b.a) r1
            int r2 = r1.f86059I
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f86059I = r2
            r2 = r31
            goto L_0x001e
        L_0x0017:
            Qn.b$a r1 = new Qn.b$a
            r2 = r31
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f86057G
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f86059I
            r6 = 1
            if (r5 == 0) goto L_0x009d
            if (r5 != r6) goto L_0x0095
            int r0 = r1.f86083z
            int r5 = r1.f86082y
            java.lang.Object r9 = r1.f86081x
            java.util.Collection r9 = (java.util.Collection) r9
            java.lang.Object r10 = r1.f86079v
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r10 = r1.f86078u
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.lang.Object r10 = r1.f86077t
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r1.f86076s
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r1.f86075r
            qv.e r10 = (qv.e) r10
            java.lang.Object r10 = r1.f86074q
            Qn.b r10 = (Qn.b) r10
            java.lang.Object r10 = r1.f86073p
            Qn.b r10 = (Qn.b) r10
            java.lang.Object r10 = r1.f86072o
            java.lang.IllegalArgumentException r10 = (java.lang.IllegalArgumentException) r10
            java.lang.Object r11 = r1.f86071n
            Nn.M r11 = (Nn.M) r11
            java.lang.Object r11 = r1.f86070m
            Nn.o$b r11 = (Nn.C10812o.b) r11
            java.lang.Object r12 = r1.f86068k
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r1.f86067j
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r14 = r1.f86066i
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r1.f86065h
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.lang.Object r6 = r1.f86064g
            Nn.o$a r6 = (Nn.C10812o.a) r6
            java.lang.Object r7 = r1.f86063f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r8 = r1.f86062e
            Vn.b$b$b r8 = (Vn.b.C1881b.C1882b) r8
            r32 = r0
            java.lang.Object r0 = r1.f86061d
            java.lang.String r0 = (java.lang.String) r0
            r33 = r0
            java.lang.Object r0 = r1.f86060c
            Qn.b r0 = (Qn.b) r0
            XH.y.b(r3)
            r2 = r32
            r18 = r9
            r22 = r15
            r9 = r4
            r15 = r6
            r4 = r7
            r6 = 1
            r7 = r1
            r1 = r33
            goto L_0x0290
        L_0x0095:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x009d:
            XH.y.b(r3)
            Nn.o$a r3 = r33.c()
            java.util.List r5 = r3.b()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = YH.C16877v.y(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r5.iterator()
            r15 = r3
            r10 = r5
            r11 = r10
            r13 = r6
            r12 = r7
            r6 = 0
            r14 = 0
            r3 = r0
            r7 = r1
            r5 = r2
            r0 = r32
            r1 = r33
        L_0x00c7:
            boolean r8 = r12.hasNext()
            if (r8 == 0) goto L_0x02cf
            java.lang.Object r8 = r12.next()
            r9 = r8
            Nn.o$b r9 = (Nn.C10812o.b) r9
            Nn.M r2 = r9.b()
            if (r2 == 0) goto L_0x00ff
            Nn.J$a$a r8 = new Nn.J$a$a
            java.lang.String r9 = r9.c()
            java.lang.String r2 = r2.e()
            r17 = r4
            Nn.L r4 = new Nn.L
            r32 = r6
            r6 = 0
            r4.<init>(r6, r6)
            r6 = 0
            r8.<init>(r9, r2, r6, r4)
            r22 = r10
            r2 = r13
            r9 = r17
            r10 = r8
            r8 = r1
            r1 = r0
            r0 = r6
            r6 = r32
            goto L_0x02c1
        L_0x00ff:
            r17 = r4
            r32 = r6
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "No time window available"
            r4.<init>(r6)
            qv.e r6 = qv.e.ERROR
            qv.d r18 = qv.d.f102012a
            java.util.List r18 = r18.a()
            java.lang.Iterable r18 = (java.lang.Iterable) r18
            r33 = r14
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r18 = r18.iterator()
        L_0x011f:
            boolean r19 = r18.hasNext()
            if (r19 == 0) goto L_0x0143
            r34 = r2
            java.lang.Object r2 = r18.next()
            r24 = r9
            r9 = r2
            qv.b r9 = (qv.C11819b) r9
            r25 = r8
            r8 = 0
            boolean r9 = r9.b(r6, r8)
            if (r9 == 0) goto L_0x013c
            r14.add(r2)
        L_0x013c:
            r2 = r34
            r9 = r24
            r8 = r25
            goto L_0x011f
        L_0x0143:
            r34 = r2
            r25 = r8
            r24 = r9
            java.util.Iterator r2 = r14.iterator()
            r18 = r14
            r8 = 0
            r9 = 0
        L_0x0151:
            boolean r19 = r2.hasNext()
            if (r19 == 0) goto L_0x01fd
            java.lang.Object r26 = r2.next()
            r18 = r26
            qv.b r18 = (qv.C11819b) r18
            r27 = r2
            if (r8 != 0) goto L_0x0188
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r28 = r14
            java.lang.String r14 = "Invalid deliveryService: "
            r2.append(r14)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = qv.C11818a.a(r2, r4)
            if (r2 != 0) goto L_0x0182
            r29 = r12
            r2 = r26
            goto L_0x0205
        L_0x0182:
            java.lang.String r2 = qv.C11820c.a(r2)
            r8 = r2
            goto L_0x018a
        L_0x0188:
            r28 = r14
        L_0x018a:
            if (r9 != 0) goto L_0x01e4
            java.lang.Class r2 = r5.getClass()
            java.lang.String r2 = r2.getName()
            kotlin.jvm.internal.C17542s.g(r2)
            r9 = 36
            r14 = 2
            r29 = r12
            r12 = 0
            java.lang.String r9 = HJ.C15854t.s1(r2, r9, r12, r14, r12)
            r19 = r2
            r2 = 46
            java.lang.String r2 = HJ.C15854t.o1(r9, r2, r12, r14, r12)
            int r9 = r2.length()
            if (r9 != 0) goto L_0x01b2
            r2 = r19
            goto L_0x01b8
        L_0x01b2:
            java.lang.String r9 = "Kt"
            java.lang.String r2 = HJ.C15854t.P0(r2, r9)
        L_0x01b8:
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r12 = "main"
            r14 = 1
            boolean r9 = HJ.C15854t.b0(r9, r12, r14)
            if (r9 == 0) goto L_0x01cc
            java.lang.String r9 = "m"
            goto L_0x01ce
        L_0x01cc:
            java.lang.String r9 = "b"
        L_0x01ce:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            java.lang.String r9 = "|"
            r12.append(r9)
            r12.append(r2)
            java.lang.String r2 = r12.toString()
            r9 = r2
            goto L_0x01e6
        L_0x01e4:
            r29 = r12
        L_0x01e6:
            r21 = 0
            r19 = r6
            r20 = r9
            r22 = r4
            r23 = r8
            r18.a(r19, r20, r21, r22, r23)
            r18 = r26
            r2 = r27
            r14 = r28
            r12 = r29
            goto L_0x0151
        L_0x01fd:
            r27 = r2
            r29 = r12
            r28 = r14
            r2 = r18
        L_0x0205:
            Nn.x r12 = r5.f86050a
            java.lang.String r14 = r15.h()
            Nn.J$b r18 = Nn.J.b.HOME
            r7.f86060c = r5
            r7.f86061d = r0
            r7.f86062e = r1
            r7.f86063f = r3
            r7.f86064g = r15
            r7.f86065h = r10
            r7.f86066i = r11
            r7.f86067j = r13
            r19 = r11
            r11 = r29
            r7.f86068k = r11
            r20 = r1
            r1 = r25
            r7.f86069l = r1
            r1 = r24
            r7.f86070m = r1
            r1 = r34
            r7.f86071n = r1
            r7.f86072o = r4
            r7.f86073p = r5
            r7.f86074q = r5
            r7.f86075r = r6
            r7.f86076s = r8
            r7.f86077t = r9
            r1 = r28
            r7.f86078u = r1
            r1 = r27
            r7.f86079v = r1
            r7.f86080w = r2
            r7.f86081x = r13
            r1 = r33
            r7.f86082y = r1
            r2 = r32
            r7.f86083z = r2
            r6 = 0
            r7.f86051A = r6
            r7.f86052B = r6
            r7.f86053C = r6
            r7.f86054D = r6
            r7.f86055E = r6
            r7.f86056F = r6
            r6 = 1
            r7.f86059I = r6
            r16 = 0
            r8 = r12
            r21 = r24
            r9 = r0
            r22 = r10
            r10 = r14
            r12 = r11
            r14 = r19
            r11 = r16
            r16 = r12
            r12 = r18
            r18 = r13
            r13 = r7
            java.lang.Object r8 = r8.B(r9, r10, r11, r12, r13)
            r9 = r17
            if (r8 != r9) goto L_0x027f
            return r9
        L_0x027f:
            r10 = r4
            r12 = r16
            r13 = r18
            r11 = r21
            r4 = r3
            r3 = r8
            r8 = r20
            r30 = r1
            r1 = r0
            r0 = r5
            r5 = r30
        L_0x0290:
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = YH.C16877v.y0(r3)
            Nn.q r3 = (Nn.C10814q) r3
            if (r3 == 0) goto L_0x029f
            Nn.M r3 = r3.c()
            goto L_0x02a0
        L_0x029f:
            r3 = 0
        L_0x02a0:
            if (r3 == 0) goto L_0x02ce
            Nn.J$a$a r10 = new Nn.J$a$a
            java.lang.String r11 = r11.c()
            java.lang.String r3 = r3.e()
            Nn.L r6 = new Nn.L
            r32 = r0
            r0 = 0
            r6.<init>(r0, r0)
            r0 = 0
            r10.<init>(r11, r3, r0, r6)
            r6 = r2
            r3 = r4
            r2 = r13
            r11 = r14
            r13 = r18
            r14 = r5
            r5 = r32
        L_0x02c1:
            r13.add(r10)
            r0 = r1
            r13 = r2
            r1 = r8
            r4 = r9
            r10 = r22
            r2 = r31
            goto L_0x00c7
        L_0x02ce:
            throw r10
        L_0x02cf:
            r18 = r13
            r13 = r18
            java.util.List r13 = (java.util.List) r13
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: Qn.b.d(java.lang.String, Vn.b$b$b, dI.e):java.lang.Object");
    }

    private final Object e(String str, b.C1881b bVar, C17164e<? super List<J.a.C1694a>> eVar) {
        if (bVar instanceof b.C1881b.a) {
            return c(str, (b.C1881b.a) bVar, eVar);
        }
        if (bVar instanceof b.C1881b.C1882b) {
            return d(str, (b.C1881b.C1882b) bVar, eVar);
        }
        throw new t();
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x03eb A[Catch:{ CancellationException -> 0x0088, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x047f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0463 A[EDGE_INSN: B:145:0x0463->B:119:0x0463 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0275 A[Catch:{ CancellationException -> 0x0088, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x033c A[Catch:{ CancellationException -> 0x0088, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03ce A[Catch:{ CancellationException -> 0x0088, all -> 0x0085 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r46, Vn.b.C1881b r47, java.util.Map<java.lang.String, java.lang.String> r48, dI.C17164e<? super Vn.b.a> r49) {
        /*
            r45 = this;
            r1 = r45
            r0 = r46
            r2 = r47
            r3 = r49
            boolean r4 = r3 instanceof Qn.b.C1769b
            if (r4 == 0) goto L_0x001c
            r4 = r3
            Qn.b$b r4 = (Qn.b.C1769b) r4
            int r5 = r4.f86084A
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001c
            int r5 = r5 - r6
            r4.f86084A = r5
        L_0x001a:
            r11 = r4
            goto L_0x0022
        L_0x001c:
            Qn.b$b r4 = new Qn.b$b
            r4.<init>(r1, r3)
            goto L_0x001a
        L_0x0022:
            java.lang.Object r4 = r11.f86107y
            java.lang.Object r12 = eI.C17187b.f()
            int r5 = r11.f86084A
            java.lang.String r13 = "|"
            java.lang.String r14 = "b"
            java.lang.String r15 = "m"
            java.lang.String r10 = "main"
            java.lang.String r9 = "Kt"
            r6 = 1
            r8 = 2
            if (r5 == 0) goto L_0x012d
            if (r5 == r6) goto L_0x0093
            if (r5 != r8) goto L_0x008b
            java.lang.Object r0 = r11.f86098p
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r11.f86097o
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r11.f86096n
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.f86095m
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r11.f86094l
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r11.f86093k
            Qn.b r0 = (Qn.b) r0
            java.lang.Object r0 = r11.f86092j
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r11.f86091i
            Qn.b r0 = (Qn.b) r0
            java.lang.Object r2 = r11.f86090h
            Qn.b r2 = (Qn.b) r2
            java.lang.Object r2 = r11.f86089g
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r11.f86088f
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = r11.f86087e
            Vn.b$b r2 = (Vn.b.C1881b) r2
            java.lang.Object r2 = r11.f86086d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r11.f86085c
            Qn.b r2 = (Qn.b) r2
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r4 = r0
            r2 = r8
            r3 = r9
            r28 = r14
            r29 = r15
            r0 = 0
            r12 = 36
            r14 = 0
            r15 = r10
            goto L_0x03b5
        L_0x0085:
            r0 = move-exception
            goto L_0x046a
        L_0x0088:
            r0 = move-exception
            goto L_0x0485
        L_0x008b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0093:
            int r0 = r11.f86106x
            int r2 = r11.f86105w
            int r3 = r11.f86104v
            int r5 = r11.f86103u
            int r6 = r11.f86102t
            int r7 = r11.f86101s
            int r8 = r11.f86100r
            r46 = r0
            java.lang.Object r0 = r11.f86099q
            r47 = r0
            java.lang.Object r0 = r11.f86098p
            java.util.Iterator r0 = (java.util.Iterator) r0
            r48 = r0
            java.lang.Object r0 = r11.f86097o
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r49 = r0
            java.lang.Object r0 = r11.f86096n
            java.lang.String r0 = (java.lang.String) r0
            r21 = r0
            java.lang.Object r0 = r11.f86095m
            java.lang.String r0 = (java.lang.String) r0
            r22 = r0
            java.lang.Object r0 = r11.f86094l
            qv.e r0 = (qv.e) r0
            r23 = r0
            java.lang.Object r0 = r11.f86093k
            Qn.b r0 = (Qn.b) r0
            r24 = r0
            java.lang.Object r0 = r11.f86092j
            Qn.b r0 = (Qn.b) r0
            java.lang.Object r0 = r11.f86091i
            Qn.b r0 = (Qn.b) r0
            r25 = r0
            java.lang.Object r0 = r11.f86090h
            Qn.b r0 = (Qn.b) r0
            r26 = r0
            java.lang.Object r0 = r11.f86089g
            dI.e r0 = (dI.C17164e) r0
            r27 = r0
            java.lang.Object r0 = r11.f86088f
            java.util.Map r0 = (java.util.Map) r0
            r28 = r0
            java.lang.Object r0 = r11.f86087e
            Vn.b$b r0 = (Vn.b.C1881b) r0
            r29 = r0
            java.lang.Object r0 = r11.f86086d
            java.lang.String r0 = (java.lang.String) r0
            r30 = r0
            java.lang.Object r0 = r11.f86085c
            Qn.b r0 = (Qn.b) r0
            XH.y.b(r4)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r32 = r46
            r33 = r2
            r34 = r3
            r35 = r5
            r36 = r6
            r37 = r7
            r38 = r8
            r8 = r23
            r7 = r24
            r6 = r26
            r3 = r27
            r1 = r28
            r2 = r29
            r23 = r48
            r24 = r49
            r5 = r0
            r28 = r14
            r29 = r15
            r14 = r21
            r0 = r30
            r21 = r4
            r30 = r12
            r12 = r22
            r4 = r25
            r22 = r47
            goto L_0x026b
        L_0x012d:
            XH.y.b(r4)
            XH.x$a r4 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            qv.e r4 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            qv.d r5 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.List r5 = r5.a()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r6.<init>()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x0145:
            boolean r7 = r5.hasNext()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r7 == 0) goto L_0x0161
            java.lang.Object r7 = r5.next()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r8 = r7
            qv.b r8 = (qv.C11819b) r8     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r21 = r5
            r5 = 0
            boolean r8 = r8.b(r4, r5)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r8 == 0) goto L_0x015e
            r6.add(r7)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x015e:
            r5 = r21
            goto L_0x0145
        L_0x0161:
            java.util.Iterator r5 = r6.iterator()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r21 = r6
            r7 = 0
            r8 = 0
        L_0x0169:
            boolean r22 = r5.hasNext()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r22 == 0) goto L_0x0202
            java.lang.Object r27 = r5.next()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r21 = r27
            qv.b r21 = (qv.C11819b) r21     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r28 = r14
            r14 = 0
            if (r7 != 0) goto L_0x0193
            r29 = r15
            java.lang.String r15 = "Select earliest time window"
            java.lang.String r15 = qv.C11818a.a(r15, r14)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r15 != 0) goto L_0x018e
            r31 = r5
            r30 = r12
            r5 = r27
            goto L_0x020c
        L_0x018e:
            java.lang.String r7 = qv.C11820c.a(r15)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x0195
        L_0x0193:
            r29 = r15
        L_0x0195:
            if (r8 != 0) goto L_0x01e4
            java.lang.Class<Qn.b> r8 = Qn.b.class
            java.lang.String r8 = r8.getName()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r31 = r5
            r30 = r12
            r12 = 0
            r14 = 2
            r15 = 36
            java.lang.String r5 = HJ.C15854t.s1(r8, r15, r12, r14, r12)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r15 = 46
            java.lang.String r5 = HJ.C15854t.o1(r5, r15, r12, r14, r12)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            int r12 = r5.length()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r12 != 0) goto L_0x01b9
            goto L_0x01bd
        L_0x01b9:
            java.lang.String r8 = HJ.C15854t.P0(r5, r9)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x01bd:
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r5 = r5.getName()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r12 = 1
            boolean r5 = HJ.C15854t.b0(r5, r10, r12)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r5 == 0) goto L_0x01cf
            r5 = r29
            goto L_0x01d1
        L_0x01cf:
            r5 = r28
        L_0x01d1:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r12.<init>()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r12.append(r5)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r12.append(r13)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r12.append(r8)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r8 = r12.toString()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x01e8
        L_0x01e4:
            r31 = r5
            r30 = r12
        L_0x01e8:
            r24 = 0
            r22 = r4
            r23 = r8
            r5 = 0
            r25 = r5
            r26 = r7
            r21.a(r22, r23, r24, r25, r26)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r21 = r27
            r14 = r28
            r15 = r29
            r12 = r30
            r5 = r31
            goto L_0x0169
        L_0x0202:
            r31 = r5
            r30 = r12
            r28 = r14
            r29 = r15
            r5 = r21
        L_0x020c:
            r11.f86085c = r1     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86086d = r0     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86087e = r2     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r12 = r48
            r11.f86088f = r12     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86089g = r3     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86090h = r1     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86091i = r1     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86092j = r1     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86093k = r1     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86094l = r4     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86095m = r7     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86096n = r8     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86097o = r6     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r14 = r31
            r11.f86098p = r14     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86099q = r5     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r15 = 0
            r11.f86100r = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86101s = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86102t = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86103u = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86104v = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86105w = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86106x = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r15 = 1
            r11.f86084A = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.Object r15 = r1.e(r0, r2, r11)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r0 = r30
            if (r15 != r0) goto L_0x0249
            return r0
        L_0x0249:
            r30 = r0
            r22 = r5
            r24 = r6
            r23 = r14
            r21 = r15
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r0 = r46
            r5 = r1
            r6 = r5
            r14 = r8
            r8 = r4
            r4 = r6
            r1 = r12
            r12 = r7
            r7 = r4
        L_0x026b:
            r15 = r21
            java.util.List r15 = (java.util.List) r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            boolean r21 = r15.isEmpty()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r21 == 0) goto L_0x033c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r1 = "No available delivery"
            r0.<init>(r1)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            qv.e r1 = qv.e.ERROR     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            qv.d r3 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.List r3 = r3.a()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5.<init>()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x028f:
            boolean r6 = r3.hasNext()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r6 == 0) goto L_0x02a7
            java.lang.Object r6 = r3.next()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r7 = r6
            qv.b r7 = (qv.C11819b) r7     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r8 = 0
            boolean r7 = r7.b(r1, r8)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r7 == 0) goto L_0x028f
            r5.add(r6)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x028f
        L_0x02a7:
            java.util.Iterator r3 = r5.iterator()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5 = 0
            r12 = 0
        L_0x02ad:
            boolean r6 = r3.hasNext()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r6 == 0) goto L_0x033b
            java.lang.Object r6 = r3.next()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r39 = r6
            qv.b r39 = (qv.C11819b) r39     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r12 != 0) goto L_0x02d9
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r6.<init>()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r7 = "Invalid selectDelivery: "
            r6.append(r7)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r6.append(r2)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = r6.toString()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r6 = qv.C11818a.a(r6, r0)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r6 == 0) goto L_0x033b
            java.lang.String r6 = qv.C11820c.a(r6)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r12 = r6
        L_0x02d9:
            if (r5 != 0) goto L_0x0326
            java.lang.Class r5 = r4.getClass()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r5 = r5.getName()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r6 = 36
            r7 = 2
            r8 = 0
            java.lang.String r11 = HJ.C15854t.s1(r5, r6, r8, r7, r8)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r14 = 46
            java.lang.String r11 = HJ.C15854t.o1(r11, r14, r8, r7, r8)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            int r7 = r11.length()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r7 != 0) goto L_0x02fb
            goto L_0x02ff
        L_0x02fb:
            java.lang.String r5 = HJ.C15854t.P0(r11, r9)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x02ff:
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r7 = r7.getName()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11 = 1
            boolean r7 = HJ.C15854t.b0(r7, r10, r11)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r7 == 0) goto L_0x0311
            r7 = r29
            goto L_0x0313
        L_0x0311:
            r7 = r28
        L_0x0313:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r15.<init>()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r15.append(r7)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r15.append(r13)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r15.append(r5)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r5 = r15.toString()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x032c
        L_0x0326:
            r6 = 36
            r8 = 0
            r11 = 1
            r14 = 46
        L_0x032c:
            r42 = 0
            r40 = r1
            r41 = r5
            r43 = r0
            r44 = r12
            r39.a(r40, r41, r42, r43, r44)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x02ad
        L_0x033b:
            throw r0     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x033c:
            r21 = r9
            r16 = 46
            r17 = 36
            r18 = 1
            r19 = 0
            r20 = 0
            Nn.x r9 = r4.f86050a     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r25 = r2.a()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            Nn.J$b r26 = r2.b()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86085c = r5     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86086d = r0     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86087e = r2     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86088f = r1     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86089g = r3     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86090h = r6     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86091i = r4     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86092j = r15     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86093k = r7     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86094l = r8     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86095m = r12     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r11.f86096n = r14     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r6 = r24
            r11.f86097o = r6     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r14 = r23
            r11.f86098p = r14     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5 = r22
            r11.f86099q = r5     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r8 = r38
            r11.f86100r = r8     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r7 = r37
            r11.f86101s = r7     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r6 = r36
            r11.f86102t = r6     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5 = r35
            r11.f86103u = r5     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r3 = r34
            r11.f86104v = r3     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r2 = r33
            r11.f86105w = r2     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r2 = r32
            r11.f86106x = r2     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r2 = 2
            r11.f86084A = r2     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5 = r9
            r3 = r18
            r6 = r0
            r12 = r17
            r14 = r19
            r0 = r20
            r7 = r25
            r9 = r2
            r2 = r16
            r8 = r26
            r2 = r9
            r3 = r21
            r9 = r15
            r15 = r10
            r10 = r1
            java.lang.Object r1 = r5.D(r6, r7, r8, r9, r10, r11)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5 = r30
            if (r1 != r5) goto L_0x03b5
            return r5
        L_0x03b5:
            qv.e r1 = qv.e.DEBUG     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            qv.d r5 = qv.d.f102012a     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.List r5 = r5.a()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.Iterable r5 = (java.lang.Iterable) r5     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r6.<init>()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x03c8:
            boolean r7 = r5.hasNext()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r7 == 0) goto L_0x03df
            java.lang.Object r7 = r5.next()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r8 = r7
            qv.b r8 = (qv.C11819b) r8     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            boolean r8 = r8.b(r1, r14)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r8 == 0) goto L_0x03c8
            r6.add(r7)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x03c8
        L_0x03df:
            java.util.Iterator r11 = r6.iterator()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5 = r0
            r7 = r5
        L_0x03e5:
            boolean r6 = r11.hasNext()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r6 == 0) goto L_0x0463
            java.lang.Object r6 = r11.next()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            qv.b r6 = (qv.C11819b) r6     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r9 = 0
            if (r7 != 0) goto L_0x0402
            java.lang.String r7 = "Delivery services selected"
            java.lang.String r7 = qv.C11818a.a(r7, r9)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r7 != 0) goto L_0x03fe
            goto L_0x0463
        L_0x03fe:
            java.lang.String r7 = qv.C11820c.a(r7)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x0402:
            r14 = r7
            if (r5 != 0) goto L_0x044c
            java.lang.Class r5 = r4.getClass()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r5 = r5.getName()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r7 = HJ.C15854t.s1(r5, r12, r0, r2, r0)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r10 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r10, r0, r2, r0)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            int r8 = r7.length()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r8 != 0) goto L_0x0421
            goto L_0x0425
        L_0x0421:
            java.lang.String r5 = HJ.C15854t.P0(r7, r3)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
        L_0x0425:
            java.lang.Thread r7 = java.lang.Thread.currentThread()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r7 = r7.getName()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r8 = 1
            boolean r7 = HJ.C15854t.b0(r7, r15, r8)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            if (r7 == 0) goto L_0x0437
            r7 = r29
            goto L_0x0439
        L_0x0437:
            r7 = r28
        L_0x0439:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r0.<init>()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r0.append(r7)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r0.append(r13)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r0.append(r5)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.String r0 = r0.toString()     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x0450
        L_0x044c:
            r8 = 1
            r10 = 46
            r0 = r5
        L_0x0450:
            r16 = 0
            r5 = r6
            r6 = r1
            r7 = r0
            r17 = r8
            r8 = r16
            r16 = r10
            r10 = r14
            r5.a(r6, r7, r8, r9, r10)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            r5 = r0
            r7 = r14
            r0 = 0
            goto L_0x03e5
        L_0x0463:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0088, all -> 0x0085 }
            goto L_0x0474
        L_0x046a:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0474:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 != 0) goto L_0x047f
            XH.N r0 = (XH.C16807N) r0
            Vn.b$a$b r0 = Vn.b.a.C1880b.f88721a
            goto L_0x0484
        L_0x047f:
            Vn.b$a$a r0 = new Vn.b$a$a
            r0.<init>(r1)
        L_0x0484:
            return r0
        L_0x0485:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Qn.b.a(java.lang.String, Vn.b$b, java.util.Map, dI.e):java.lang.Object");
    }
}
