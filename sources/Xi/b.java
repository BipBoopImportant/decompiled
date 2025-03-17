package Xi;

import Kf.C9133b;
import XH.x;
import Xi.c;
import com.ingka.ikea.analytics.Interaction$Component;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import rz.C15031y;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JZ\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\nHB¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001d¨\u0006\u001e"}, d2 = {"LXi/b;", "LXi/a;", "LKf/b;", "cartApi", "LXi/c;", "addToOnlineCartAnalytics", "<init>", "(LKf/b;LXi/c;)V", "Lrz/y;", "parentProductType", "", "itemNo", "itemType", "", "priceInclVat", "LXi/c$a;", "b", "(Lrz/y;Ljava/lang/String;Ljava/lang/String;D)LXi/c$a;", "", "quantity", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "componentValue", "currentStoreId", "LXH/x;", "LXH/N;", "a", "(Lrz/y;Ljava/lang/String;Ljava/lang/String;DILcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LKf/b;", "LXi/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C9133b f89167a;

    /* renamed from: b  reason: collision with root package name */
    private final c f89168b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.scanandgoonlineredesign.addtoonlinecart.AddProductToOnlineCartUseCaseImpl", f = "AddProductToOnlineCartUseCase.kt", l = {60}, m = "invoke-tZkwj4A")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f89169c;

        /* renamed from: d  reason: collision with root package name */
        Object f89170d;

        /* renamed from: e  reason: collision with root package name */
        Object f89171e;

        /* renamed from: f  reason: collision with root package name */
        Object f89172f;

        /* renamed from: g  reason: collision with root package name */
        Object f89173g;

        /* renamed from: h  reason: collision with root package name */
        Object f89174h;

        /* renamed from: i  reason: collision with root package name */
        Object f89175i;

        /* renamed from: j  reason: collision with root package name */
        Object f89176j;

        /* renamed from: k  reason: collision with root package name */
        double f89177k;

        /* renamed from: l  reason: collision with root package name */
        int f89178l;

        /* renamed from: m  reason: collision with root package name */
        /* synthetic */ Object f89179m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ b f89180n;

        /* renamed from: o  reason: collision with root package name */
        int f89181o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f89180n = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f89179m = obj;
            this.f89181o |= Integer.MIN_VALUE;
            Object a10 = this.f89180n.a((C15031y) null, (String) null, (String) null, 0.0d, 0, (Interaction$Component) null, (String) null, (String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public b(C9133b bVar, c cVar) {
        C17542s.j(bVar, "cartApi");
        C17542s.j(cVar, "addToOnlineCartAnalytics");
        this.f89167a = bVar;
        this.f89168b = cVar;
    }

    private final c.a b(C15031y yVar, String str, String str2, double d10) {
        return new c.a(yVar != null ? new c.a.C1908a(yVar) : null, new c.a.b(str, str2, d10));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: rz.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: Xi.b} */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0115, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0116, code lost:
        r11 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x023b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x023c, code lost:
        r11 = r27;
        r15 = r29;
        r1 = r30;
        r21 = r12;
        r6 = r26;
        r9 = r28;
        r5 = r35;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0209 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0337 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0115 A[ExcHandler: b (e Kf.g$b), Splitter:B:20:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0263  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(rz.C15031y r27, java.lang.String r28, java.lang.String r29, double r30, int r32, com.ingka.ikea.analytics.Interaction$Component r33, java.lang.String r34, java.lang.String r35, dI.C17164e<? super XH.x<XH.C16807N>> r36) {
        /*
            r26 = this;
            r1 = r26
            r2 = r28
            r3 = r32
            r0 = r33
            r4 = r34
            r5 = r36
            boolean r6 = r5 instanceof Xi.b.a
            if (r6 == 0) goto L_0x001f
            r6 = r5
            Xi.b$a r6 = (Xi.b.a) r6
            int r7 = r6.f89181o
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = r7 & r8
            if (r9 == 0) goto L_0x001f
            int r7 = r7 - r8
            r6.f89181o = r7
            goto L_0x0024
        L_0x001f:
            Xi.b$a r6 = new Xi.b$a
            r6.<init>(r1, r5)
        L_0x0024:
            java.lang.Object r7 = r6.f89179m
            java.lang.Object r8 = eI.C17187b.f()
            int r9 = r6.f89181o
            java.lang.String r10 = "|"
            java.lang.String r11 = "b"
            java.lang.String r12 = "m"
            java.lang.String r13 = "main"
            java.lang.String r14 = "Kt"
            r15 = 1
            r19 = r11
            if (r9 == 0) goto L_0x0092
            if (r9 != r15) goto L_0x008a
            int r2 = r6.f89178l
            double r3 = r6.f89177k
            java.lang.Object r0 = r6.f89176j
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r6.f89175i
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r0 = r6.f89174h
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r6.f89173g
            com.ingka.ikea.analytics.Interaction$Component r0 = (com.ingka.ikea.analytics.Interaction$Component) r0
            java.lang.Object r0 = r6.f89172f
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r0 = r6.f89171e
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r6.f89170d
            r20 = r0
            rz.y r20 = (rz.C15031y) r20
            java.lang.Object r0 = r6.f89169c
            r6 = r0
            Xi.b r6 = (Xi.b) r6
            XH.y.b(r7)     // Catch:{ a -> 0x007d, b -> 0x0072 }
            r11 = r20
            r24 = r3
            r3 = r2
            r1 = r24
            goto L_0x00cd
        L_0x0072:
            r0 = move-exception
            r15 = r8
            r11 = r20
            r24 = r3
            r3 = r2
            r1 = r24
            goto L_0x011d
        L_0x007d:
            r0 = move-exception
            r15 = r8
            r21 = r12
            r11 = r20
            r24 = r3
            r3 = r2
            r1 = r24
            goto L_0x024a
        L_0x008a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0092:
            XH.y.b(r7)
            Kf.b r7 = r1.f89167a     // Catch:{ a -> 0x023b, b -> 0x0115 }
            Kf.y r9 = new Kf.y     // Catch:{ a -> 0x0119, b -> 0x0115 }
            r9.<init>(r2, r3)     // Catch:{ a -> 0x0119, b -> 0x0115 }
            java.util.List r9 = YH.C16877v.e(r9)     // Catch:{ a -> 0x0119, b -> 0x0115 }
            r6.f89169c = r1     // Catch:{ a -> 0x0119, b -> 0x0115 }
            r11 = r27
            r6.f89170d = r11     // Catch:{ a -> 0x0111, b -> 0x010d }
            r6.f89171e = r2     // Catch:{ a -> 0x0111, b -> 0x010d }
            r15 = r29
            r6.f89172f = r15     // Catch:{ a -> 0x0109, b -> 0x0105 }
            r6.f89173g = r0     // Catch:{ a -> 0x0109, b -> 0x0105 }
            r6.f89174h = r4     // Catch:{ a -> 0x0109, b -> 0x0105 }
            r1 = r35
            r6.f89175i = r1     // Catch:{ a -> 0x0109, b -> 0x0105 }
            r6.f89176j = r5     // Catch:{ a -> 0x0109, b -> 0x0105 }
            r1 = r30
            r6.f89177k = r1     // Catch:{ a -> 0x00fd, b -> 0x00f5 }
            r6.f89178l = r3     // Catch:{ a -> 0x00fd, b -> 0x00f5 }
            r5 = 1
            r6.f89181o = r5     // Catch:{ a -> 0x00fd, b -> 0x00f5 }
            java.lang.Object r0 = r7.b(r9, r0, r4, r6)     // Catch:{ a -> 0x00fd, b -> 0x00f5 }
            if (r0 != r8) goto L_0x00c6
            return r8
        L_0x00c6:
            r6 = r26
            r9 = r28
            r5 = r35
            r8 = r15
        L_0x00cd:
            Xi.c r0 = r6.f89168b     // Catch:{ a -> 0x00ef, b -> 0x00ec }
            r27 = r6
            r28 = r11
            r29 = r9
            r30 = r8
            r31 = r1
            Xi.c$a r4 = r27.b(r28, r29, r30, r31)     // Catch:{ a -> 0x00ef, b -> 0x00ec }
            Sy.a$e r7 = Sy.a.e.SHOP_GO_PIP     // Catch:{ a -> 0x00ef, b -> 0x00ec }
            r0.b(r5, r4, r3, r7)     // Catch:{ a -> 0x00ef, b -> 0x00ec }
            XH.x$a r0 = XH.x.f139812b     // Catch:{ a -> 0x00ef, b -> 0x00ec }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ a -> 0x00ef, b -> 0x00ec }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ a -> 0x00ef, b -> 0x00ec }
            goto L_0x0368
        L_0x00ec:
            r0 = move-exception
            r15 = r8
            goto L_0x011d
        L_0x00ef:
            r0 = move-exception
            r15 = r8
        L_0x00f1:
            r21 = r12
            goto L_0x024a
        L_0x00f5:
            r0 = move-exception
        L_0x00f6:
            r6 = r26
            r9 = r28
            r5 = r35
            goto L_0x011d
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            r6 = r26
            r9 = r28
            r5 = r35
            goto L_0x00f1
        L_0x0105:
            r0 = move-exception
        L_0x0106:
            r1 = r30
            goto L_0x00f6
        L_0x0109:
            r0 = move-exception
        L_0x010a:
            r1 = r30
            goto L_0x00fe
        L_0x010d:
            r0 = move-exception
        L_0x010e:
            r15 = r29
            goto L_0x0106
        L_0x0111:
            r0 = move-exception
        L_0x0112:
            r15 = r29
            goto L_0x010a
        L_0x0115:
            r0 = move-exception
            r11 = r27
            goto L_0x010e
        L_0x0119:
            r0 = move-exception
            r11 = r27
            goto L_0x0112
        L_0x011d:
            qv.e r4 = qv.e.WARN
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0130:
            boolean r21 = r7.hasNext()
            if (r21 == 0) goto L_0x0154
            r21 = r12
            java.lang.Object r12 = r7.next()
            r27 = r7
            r7 = r12
            qv.b r7 = (qv.C11819b) r7
            r33 = r3
            r3 = 0
            boolean r7 = r7.b(r4, r3)
            if (r7 == 0) goto L_0x014d
            r8.add(r12)
        L_0x014d:
            r7 = r27
            r3 = r33
            r12 = r21
            goto L_0x0130
        L_0x0154:
            r33 = r3
            r21 = r12
            java.util.Iterator r3 = r8.iterator()
            r7 = 0
            r8 = 0
        L_0x015e:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0209
            java.lang.Object r12 = r3.next()
            qv.b r12 = (qv.C11819b) r12
            r34 = r3
            if (r7 != 0) goto L_0x0197
            java.lang.String r7 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r35 = r0
            java.lang.String r0 = "Illegal qty exception "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            r3 = 0
            java.lang.String r0 = qv.C11818a.a(r0, r3)
            if (r0 != 0) goto L_0x0192
        L_0x018c:
            r22 = r1
            r36 = r5
            goto L_0x020c
        L_0x0192:
            java.lang.String r7 = qv.C11820c.a(r0)
            goto L_0x0199
        L_0x0197:
            r35 = r0
        L_0x0199:
            if (r8 != 0) goto L_0x01ea
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r22 = r1
            r36 = r5
            r3 = 36
            r5 = 0
            r8 = 2
            java.lang.String r1 = HJ.C15854t.s1(r0, r3, r5, r8, r5)
            r2 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r2, r5, r8, r5)
            int r2 = r1.length()
            if (r2 != 0) goto L_0x01bf
            goto L_0x01c3
        L_0x01bf:
            java.lang.String r0 = HJ.C15854t.P0(r1, r14)
        L_0x01c3:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r2 = 1
            boolean r1 = HJ.C15854t.b0(r1, r13, r2)
            if (r1 == 0) goto L_0x01d5
            r1 = r21
            goto L_0x01d7
        L_0x01d5:
            r1 = r19
        L_0x01d7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r10)
            r2.append(r0)
            java.lang.String r8 = r2.toString()
            goto L_0x01ee
        L_0x01ea:
            r22 = r1
            r36 = r5
        L_0x01ee:
            r0 = 0
            r27 = r12
            r28 = r4
            r29 = r8
            r30 = r0
            r0 = 0
            r31 = r0
            r32 = r7
            r27.a(r28, r29, r30, r31, r32)
            r3 = r34
            r0 = r35
            r5 = r36
            r1 = r22
            goto L_0x015e
        L_0x0209:
            r35 = r0
            goto L_0x018c
        L_0x020c:
            Xi.c r0 = r6.f89168b
            r27 = r6
            r28 = r11
            r29 = r9
            r30 = r15
            r31 = r22
            Xi.c$a r1 = r27.b(r28, r29, r30, r31)
            Sy.a$e r2 = Sy.a.e.SHOP_GO_PIP
            r27 = r0
            r28 = r36
            r29 = r35
            r30 = r1
            r31 = r33
            r32 = r2
            r27.c(r28, r29, r30, r31, r32)
            XH.x$a r0 = XH.x.f139812b
            Xi.a$a$a r0 = Xi.a.C1906a.C1907a.f89166a
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
            goto L_0x0368
        L_0x023b:
            r0 = move-exception
            r11 = r27
            r15 = r29
            r1 = r30
            r21 = r12
            r6 = r26
            r9 = r28
            r5 = r35
        L_0x024a:
            qv.e r4 = qv.e.WARN
            qv.d r7 = qv.d.f102012a
            java.util.List r7 = r7.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x025d:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x027d
            java.lang.Object r12 = r7.next()
            r27 = r7
            r7 = r12
            qv.b r7 = (qv.C11819b) r7
            r33 = r3
            r3 = 0
            boolean r7 = r7.b(r4, r3)
            if (r7 == 0) goto L_0x0278
            r8.add(r12)
        L_0x0278:
            r7 = r27
            r3 = r33
            goto L_0x025d
        L_0x027d:
            r33 = r3
            java.util.Iterator r3 = r8.iterator()
            r7 = 0
            r8 = 0
        L_0x0285:
            boolean r12 = r3.hasNext()
            if (r12 == 0) goto L_0x0337
            java.lang.Object r12 = r3.next()
            qv.b r12 = (qv.C11819b) r12
            r34 = r3
            if (r7 != 0) goto L_0x02bf
            java.lang.String r7 = r0.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r35 = r0
            java.lang.String r0 = "Generic exception "
            r3.append(r0)
            r3.append(r7)
            java.lang.String r0 = r3.toString()
            r3 = 0
            java.lang.String r0 = qv.C11818a.a(r0, r3)
            if (r0 != 0) goto L_0x02b9
        L_0x02b3:
            r17 = r1
            r36 = r5
            goto L_0x033b
        L_0x02b9:
            java.lang.String r0 = qv.C11820c.a(r0)
            r7 = r0
            goto L_0x02c1
        L_0x02bf:
            r35 = r0
        L_0x02c1:
            if (r8 != 0) goto L_0x0314
            java.lang.Class r0 = r6.getClass()
            java.lang.String r0 = r0.getName()
            kotlin.jvm.internal.C17542s.g(r0)
            r17 = r1
            r36 = r5
            r3 = 36
            r5 = 0
            r8 = 2
            java.lang.String r1 = HJ.C15854t.s1(r0, r3, r5, r8, r5)
            r2 = 46
            java.lang.String r1 = HJ.C15854t.o1(r1, r2, r5, r8, r5)
            int r16 = r1.length()
            if (r16 != 0) goto L_0x02e7
            goto L_0x02eb
        L_0x02e7:
            java.lang.String r0 = HJ.C15854t.P0(r1, r14)
        L_0x02eb:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r2 = 1
            boolean r1 = HJ.C15854t.b0(r1, r13, r2)
            if (r1 == 0) goto L_0x02fd
            r1 = r21
            goto L_0x02ff
        L_0x02fd:
            r1 = r19
        L_0x02ff:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r10)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1 = r8
            r8 = r0
            goto L_0x031c
        L_0x0314:
            r17 = r1
            r36 = r5
            r1 = 2
            r3 = 36
            r5 = 0
        L_0x031c:
            r0 = 0
            r27 = r12
            r28 = r4
            r29 = r8
            r30 = r0
            r0 = 0
            r31 = r0
            r32 = r7
            r27.a(r28, r29, r30, r31, r32)
            r3 = r34
            r0 = r35
            r5 = r36
            r1 = r17
            goto L_0x0285
        L_0x0337:
            r35 = r0
            goto L_0x02b3
        L_0x033b:
            Xi.c r0 = r6.f89168b
            r27 = r6
            r28 = r11
            r29 = r9
            r30 = r15
            r31 = r17
            Xi.c$a r1 = r27.b(r28, r29, r30, r31)
            Sy.a$e r2 = Sy.a.e.SHOP_GO_PIP
            r27 = r0
            r28 = r36
            r29 = r35
            r30 = r1
            r31 = r33
            r32 = r2
            r27.c(r28, r29, r30, r31, r32)
            XH.x$a r0 = XH.x.f139812b
            Xi.a$a$a r0 = Xi.a.C1906a.C1907a.f89166a
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0368:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Xi.b.a(rz.y, java.lang.String, java.lang.String, double, int, com.ingka.ikea.analytics.Interaction$Component, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
