package Tj;

import Kj.a;
import QJ.C16310i;
import QJ.M;
import QJ.Q;
import Ry.e;
import Ry.f;
import Ry.h;
import XH.C16807N;
import aj.C11061a;
import aj.C11062b;
import aj.C11063c;
import dI.C17164e;
import dj.C11194b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import rz.C;
import rz.C15007A;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J.\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H@¢\u0006\u0004\b\u001c\u0010\u001dJI\u0010$\u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020\u001f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010%JB\u0010)\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0016\u001a\u00020\u0015HB¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u0002088BX\u0004¢\u0006\u0006\u001a\u0004\b6\u00109¨\u0006;"}, d2 = {"LTj/g;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LRy/h;", "scanAndGoProductRepository", "Lsz/b;", "scanAndGoCoWorkerDiscountRepository", "Laj/b;", "purchaseItemMapper", "Laj/c;", "checkoutAnalytics", "Ldj/b;", "fetchPickupInformationUseCase", "LQJ/M;", "dispatcher", "<init>", "(LRy/f;LRy/h;Lsz/b;Laj/b;Laj/c;Ldj/b;LQJ/M;)V", "", "storeId", "familyCardId", "", "isEarlyPayment", "", "Laj/a;", "i", "(Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "LXH/N;", "f", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "timeSlotId", "Lrz/A;", "checkout", "purchaseItems", "LKj/a$c$a;", "pickupInformation", "j", "(Ljava/lang/String;Ljava/lang/String;Lrz/A;Ljava/util/List;LKj/a$c$a;Z)V", "Lrz/C$c;", "status", "LKj/a$c;", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrz/A;Lrz/C$c;ZLdI/e;)Ljava/lang/Object;", "a", "LRy/f;", "b", "LRy/h;", "c", "Lsz/b;", "d", "Laj/b;", "e", "Laj/c;", "Ldj/b;", "g", "LQJ/M;", "LRy/e;", "()LRy/e;", "cartRepo", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tj.g  reason: case insensitive filesystem */
public final class C10942g {

    /* renamed from: a  reason: collision with root package name */
    private final f f87491a;

    /* renamed from: b  reason: collision with root package name */
    private final h f87492b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final sz.b f87493c;

    /* renamed from: d  reason: collision with root package name */
    private final C11062b f87494d;

    /* renamed from: e  reason: collision with root package name */
    private final C11063c f87495e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final C11194b f87496f;

    /* renamed from: g  reason: collision with root package name */
    private final M f87497g;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.CheckoutPaymentCompletedUseCase", f = "CheckoutPaymentCompletedUseCase.kt", l = {113}, m = "clearCart")
    /* renamed from: Tj.g$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87498c;

        /* renamed from: d  reason: collision with root package name */
        Object f87499d;

        /* renamed from: e  reason: collision with root package name */
        Object f87500e;

        /* renamed from: f  reason: collision with root package name */
        Object f87501f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f87502g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C10942g f87503h;

        /* renamed from: i  reason: collision with root package name */
        int f87504i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C10942g gVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f87503h = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87502g = obj;
            this.f87504i |= Integer.MIN_VALUE;
            return this.f87503h.f((String) null, (String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LKj/a$c;", "<anonymous>", "(LQJ/Q;)LKj/a$c;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.CheckoutPaymentCompletedUseCase$invoke$2", f = "CheckoutPaymentCompletedUseCase.kt", l = {45, 51, 57}, m = "invokeSuspend")
    /* renamed from: Tj.g$b */
    static final class b extends l implements p<Q, C17164e<? super a.c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f87505c;

        /* renamed from: d  reason: collision with root package name */
        Object f87506d;

        /* renamed from: e  reason: collision with root package name */
        int f87507e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10942g f87508f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f87509g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f87510h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C15007A f87511i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ String f87512j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ boolean f87513k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C.c f87514l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C10942g gVar, String str, String str2, C15007A a10, String str3, boolean z10, C.c cVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f87508f = gVar;
            this.f87509g = str;
            this.f87510h = str2;
            this.f87511i = a10;
            this.f87512j = str3;
            this.f87513k = z10;
            this.f87514l = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f87508f, this.f87509g, this.f87510h, this.f87511i, this.f87512j, this.f87513k, this.f87514l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super a.c> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0094 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0095  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f87507e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x003f
                if (r1 == r4) goto L_0x0035
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                java.lang.Object r0 = r12.f87506d
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r1 = r12.f87505c
                Kj.a$c$a r1 = (Kj.a.c.C1636a) r1
                XH.y.b(r13)
                r8 = r0
                r11 = r1
                goto L_0x0097
            L_0x0020:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0028:
                java.lang.Object r1 = r12.f87506d
                rz.B r1 = (rz.B) r1
                java.lang.Object r1 = r12.f87505c
                Kj.a$c$a r1 = (Kj.a.c.C1636a) r1
                XH.y.b(r13)
                r3 = r13
                goto L_0x0080
            L_0x0035:
                java.lang.Object r1 = r12.f87505c
                rz.B r1 = (rz.B) r1
                XH.y.b(r13)
                r7 = r1
                r1 = r13
                goto L_0x0069
            L_0x003f:
                XH.y.b(r13)
                Tj.g r1 = r12.f87508f
                dj.b r1 = r1.f87496f
                java.lang.String r5 = r12.f87509g
                java.lang.String r6 = r12.f87510h
                rz.A r7 = r12.f87511i
                rz.B r7 = r7.f()
                if (r7 == 0) goto L_0x005d
                int r8 = r7.a()
                java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.e(r8)
                goto L_0x005e
            L_0x005d:
                r8 = 0
            L_0x005e:
                r12.f87505c = r7
                r12.f87507e = r4
                java.lang.Object r1 = r1.d(r5, r6, r8, r12)
                if (r1 != r0) goto L_0x0069
                return r0
            L_0x0069:
                Kj.a$c$a r1 = (Kj.a.c.C1636a) r1
                Tj.g r4 = r12.f87508f
                java.lang.String r5 = r12.f87509g
                java.lang.String r6 = r12.f87512j
                boolean r8 = r12.f87513k
                r12.f87505c = r1
                r12.f87506d = r7
                r12.f87507e = r3
                java.lang.Object r3 = r4.i(r5, r6, r8, r12)
                if (r3 != r0) goto L_0x0080
                return r0
            L_0x0080:
                java.util.List r3 = (java.util.List) r3
                Tj.g r4 = r12.f87508f
                sz.b r4 = r4.f87493c
                r12.f87505c = r1
                r12.f87506d = r3
                r12.f87507e = r2
                java.lang.Object r2 = r4.b(r12)
                if (r2 != r0) goto L_0x0095
                return r0
            L_0x0095:
                r11 = r1
                r8 = r3
            L_0x0097:
                Tj.g r4 = r12.f87508f
                java.lang.String r5 = r12.f87509g
                java.lang.String r6 = r12.f87510h
                rz.A r7 = r12.f87511i
                boolean r10 = r12.f87513k
                r9 = r11
                r4.j(r5, r6, r7, r8, r9, r10)
                Kj.a$c r8 = new Kj.a$c
                rz.C$c r0 = r12.f87514l
                java.lang.String r1 = r0.b()
                rz.C$c r0 = r12.f87514l
                java.lang.String r2 = r0.c()
                rz.C$c r0 = r12.f87514l
                java.lang.String r3 = r0.a()
                r6 = 16
                r7 = 0
                r5 = 0
                r0 = r8
                r4 = r11
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Tj.C10942g.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.CheckoutPaymentCompletedUseCase", f = "CheckoutPaymentCompletedUseCase.kt", l = {87, 90, 97, 101, 104, 107}, m = "processPurchaseItems")
    /* renamed from: Tj.g$c */
    static final class c extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87515c;

        /* renamed from: d  reason: collision with root package name */
        Object f87516d;

        /* renamed from: e  reason: collision with root package name */
        Object f87517e;

        /* renamed from: f  reason: collision with root package name */
        Object f87518f;

        /* renamed from: g  reason: collision with root package name */
        Object f87519g;

        /* renamed from: h  reason: collision with root package name */
        Object f87520h;

        /* renamed from: i  reason: collision with root package name */
        Object f87521i;

        /* renamed from: j  reason: collision with root package name */
        Object f87522j;

        /* renamed from: k  reason: collision with root package name */
        Object f87523k;

        /* renamed from: l  reason: collision with root package name */
        Object f87524l;

        /* renamed from: m  reason: collision with root package name */
        Object f87525m;

        /* renamed from: n  reason: collision with root package name */
        Object f87526n;

        /* renamed from: o  reason: collision with root package name */
        Object f87527o;

        /* renamed from: p  reason: collision with root package name */
        boolean f87528p;

        /* renamed from: q  reason: collision with root package name */
        int f87529q;

        /* renamed from: r  reason: collision with root package name */
        int f87530r;

        /* renamed from: s  reason: collision with root package name */
        int f87531s;

        /* renamed from: t  reason: collision with root package name */
        /* synthetic */ Object f87532t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ C10942g f87533u;

        /* renamed from: v  reason: collision with root package name */
        int f87534v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10942g gVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f87533u = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87532t = obj;
            this.f87534v |= Integer.MIN_VALUE;
            return this.f87533u.i((String) null, (String) null, false, this);
        }
    }

    public C10942g(f fVar, h hVar, sz.b bVar, C11062b bVar2, C11063c cVar, C11194b bVar3, M m10) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(hVar, "scanAndGoProductRepository");
        C17542s.j(bVar, "scanAndGoCoWorkerDiscountRepository");
        C17542s.j(bVar2, "purchaseItemMapper");
        C17542s.j(cVar, "checkoutAnalytics");
        C17542s.j(bVar3, "fetchPickupInformationUseCase");
        C17542s.j(m10, "dispatcher");
        this.f87491a = fVar;
        this.f87492b = hVar;
        this.f87493c = bVar;
        this.f87494d = bVar2;
        this.f87495e = cVar;
        this.f87496f = bVar3;
        this.f87497g = m10;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(java.lang.String r24, java.lang.String r25, dI.C17164e<? super XH.C16807N> r26) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            boolean r4 = r3 instanceof Tj.C10942g.a
            if (r4 == 0) goto L_0x001b
            r4 = r3
            Tj.g$a r4 = (Tj.C10942g.a) r4
            int r5 = r4.f87504i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L_0x001b
            int r5 = r5 - r6
            r4.f87504i = r5
            goto L_0x0020
        L_0x001b:
            Tj.g$a r4 = new Tj.g$a
            r4.<init>(r0, r3)
        L_0x0020:
            java.lang.Object r5 = r4.f87502g
            java.lang.Object r6 = eI.C17187b.f()
            int r7 = r4.f87504i
            r8 = 1
            if (r7 == 0) goto L_0x004f
            if (r7 != r8) goto L_0x0047
            java.lang.Object r1 = r4.f87501f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r4.f87500e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f87499d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r4.f87498c
            Tj.g r1 = (Tj.C10942g) r1
            XH.y.b(r5)
            XH.x r5 = (XH.x) r5
            java.lang.Object r2 = r5.j()
            goto L_0x006a
        L_0x0047:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004f:
            XH.y.b(r5)
            Ry.f r5 = r0.f87491a
            Ry.e r5 = r5.invoke()
            r4.f87498c = r0
            r4.f87499d = r1
            r4.f87500e = r2
            r4.f87501f = r3
            r4.f87504i = r8
            java.lang.Object r2 = r5.l(r1, r2, r4)
            if (r2 != r6) goto L_0x0069
            return r6
        L_0x0069:
            r1 = r0
        L_0x006a:
            java.lang.Throwable r3 = XH.x.e(r2)
            java.lang.String r4 = "|"
            java.lang.String r5 = "b"
            java.lang.String r6 = "m"
            java.lang.String r7 = "main"
            java.lang.String r15 = "Kt"
            r13 = 36
            r9 = 0
            r12 = 2
            r11 = 0
            if (r3 != 0) goto L_0x0127
            XH.N r2 = (XH.C16807N) r2
            qv.e r2 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r16 = r3.hasNext()
            if (r16 == 0) goto L_0x00ac
            java.lang.Object r8 = r3.next()
            r14 = r8
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r2, r9)
            if (r14 == 0) goto L_0x00aa
            r10.add(r8)
        L_0x00aa:
            r8 = 1
            goto L_0x0094
        L_0x00ac:
            java.util.Iterator r3 = r10.iterator()
            r8 = r11
            r9 = r8
        L_0x00b2:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x01e6
            java.lang.Object r10 = r3.next()
            r16 = r10
            qv.b r16 = (qv.C11819b) r16
            r10 = 0
            if (r8 != 0) goto L_0x00d1
            java.lang.String r8 = "Cart cleared"
            java.lang.String r8 = qv.C11818a.a(r8, r10)
            if (r8 != 0) goto L_0x00cd
            goto L_0x01e6
        L_0x00cd:
            java.lang.String r8 = qv.C11820c.a(r8)
        L_0x00d1:
            if (r9 != 0) goto L_0x0117
            java.lang.Class r9 = r1.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            java.lang.String r14 = HJ.C15854t.s1(r9, r13, r11, r12, r11)
            r13 = 46
            java.lang.String r14 = HJ.C15854t.o1(r14, r13, r11, r12, r11)
            int r13 = r14.length()
            if (r13 != 0) goto L_0x00ef
            goto L_0x00f3
        L_0x00ef:
            java.lang.String r9 = HJ.C15854t.P0(r14, r15)
        L_0x00f3:
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            java.lang.String r13 = r13.getName()
            r14 = 1
            boolean r13 = HJ.C15854t.b0(r13, r7, r14)
            if (r13 == 0) goto L_0x0104
            r13 = r6
            goto L_0x0105
        L_0x0104:
            r13 = r5
        L_0x0105:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r14.append(r13)
            r14.append(r4)
            r14.append(r9)
            java.lang.String r9 = r14.toString()
        L_0x0117:
            r19 = 0
            r17 = r2
            r18 = r9
            r20 = r10
            r21 = r8
            r16.a(r17, r18, r19, r20, r21)
            r13 = 36
            goto L_0x00b2
        L_0x0127:
            qv.e r2 = qv.e.WARN
            qv.d r8 = qv.d.f102012a
            java.util.List r8 = r8.a()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x013a:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x0151
            java.lang.Object r13 = r8.next()
            r14 = r13
            qv.b r14 = (qv.C11819b) r14
            boolean r14 = r14.b(r2, r9)
            if (r14 == 0) goto L_0x013a
            r10.add(r13)
            goto L_0x013a
        L_0x0151:
            java.util.Iterator r8 = r10.iterator()
            r9 = r11
            r10 = r9
        L_0x0157:
            boolean r13 = r8.hasNext()
            if (r13 == 0) goto L_0x01e6
            java.lang.Object r13 = r8.next()
            qv.b r13 = (qv.C11819b) r13
            if (r9 != 0) goto L_0x0173
            java.lang.String r9 = "Failed to clear cart"
            java.lang.String r9 = qv.C11818a.a(r9, r3)
            if (r9 != 0) goto L_0x016f
            goto L_0x01e6
        L_0x016f:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0173:
            r16 = r9
            if (r10 != 0) goto L_0x01c0
            java.lang.Class r9 = r1.getClass()
            java.lang.String r9 = r9.getName()
            kotlin.jvm.internal.C17542s.g(r9)
            r14 = 36
            java.lang.String r10 = HJ.C15854t.s1(r9, r14, r11, r12, r11)
            r14 = 46
            java.lang.String r10 = HJ.C15854t.o1(r10, r14, r11, r12, r11)
            int r17 = r10.length()
            if (r17 != 0) goto L_0x0195
            goto L_0x0199
        L_0x0195:
            java.lang.String r9 = HJ.C15854t.P0(r10, r15)
        L_0x0199:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            r12 = 1
            boolean r10 = HJ.C15854t.b0(r10, r7, r12)
            if (r10 == 0) goto L_0x01aa
            r10 = r6
            goto L_0x01ab
        L_0x01aa:
            r10 = r5
        L_0x01ab:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r10)
            r11.append(r4)
            r11.append(r9)
            java.lang.String r10 = r11.toString()
        L_0x01bd:
            r17 = r10
            goto L_0x01c4
        L_0x01c0:
            r12 = 1
            r14 = 46
            goto L_0x01bd
        L_0x01c4:
            r18 = 0
            r9 = r13
            r10 = r2
            r19 = 0
            r11 = r17
            r20 = r12
            r21 = 2
            r12 = r18
            r18 = 36
            r13 = r3
            r22 = r14
            r14 = r16
            r9.a(r10, r11, r12, r13, r14)
            r9 = r16
            r10 = r17
            r11 = r19
            r12 = r21
            goto L_0x0157
        L_0x01e6:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.C10942g.f(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    private final e g() {
        return this.f87491a.invoke();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: rz.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: rz.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v14, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x01a1, code lost:
        r9 = new java.util.ArrayList();
        r6 = ((java.lang.Iterable) r6).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01b0, code lost:
        if (r6.hasNext() == false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01b2, code lost:
        r11 = r6.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01bd, code lost:
        if (((rz.C15014g) r11).d() == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01bf, code lost:
        r9.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01c3, code lost:
        r6 = new java.util.ArrayList(YH.C16877v.y(r9, 10));
        r11 = r9.iterator();
        r12 = 0;
        r13 = 0;
        r10 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01d8, code lost:
        if (r11.hasNext() == false) goto L_0x0295;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x01da, code lost:
        r14 = r11.next();
        r15 = (rz.C15014g) r14;
        r0 = r8.g();
        r16 = r7;
        r7 = r15.a();
        r5.f87515c = r8;
        r5.f87516d = r1;
        r5.f87517e = r2;
        r5.f87518f = r4;
        r5.f87519g = r9;
        r5.f87520h = r10;
        r5.f87521i = r6;
        r5.f87522j = r11;
        r5.f87523k = r14;
        r5.f87524l = r15;
        r5.f87525m = r6;
        r5.f87528p = r3;
        r5.f87529q = r12;
        r5.f87530r = r13;
        r20 = r3;
        r5.f87531s = 0;
        r5.f87534v = 2;
        r0 = r0.s(r7, r1, r2, r5);
        r7 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0215, code lost:
        if (r0 != r7) goto L_0x0218;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0217, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0218, code lost:
        r3 = r20;
        r0 = r1;
        r16 = r7;
        r1 = r8;
        r20 = 0;
        r8 = r2;
        r2 = r13;
        r13 = r10;
        r10 = r11;
        r11 = r6;
        r6 = r9;
        r9 = r15;
        r15 = r4;
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0229, code lost:
        r7 = r1.f87494d;
        r21 = r2;
        r22 = r1.f87492b;
        r2 = r9.a();
        r5.f87515c = r1;
        r5.f87516d = r0;
        r5.f87517e = r8;
        r5.f87518f = r15;
        r5.f87519g = r6;
        r5.f87520h = r13;
        r5.f87521i = r11;
        r5.f87522j = r10;
        r5.f87523k = r14;
        r5.f87524l = r9;
        r5.f87525m = r9;
        r5.f87526n = r7;
        r5.f87527o = r4;
        r5.f87528p = r3;
        r5.f87529q = r12;
        r14 = r21;
        r5.f87530r = r14;
        r21 = r0;
        r5.f87531s = r20;
        r5.f87534v = 3;
        r0 = r22.c(r2, r5);
        r2 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0268, code lost:
        if (r0 != r2) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x026a, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x026b, code lost:
        r16 = r14;
        r14 = r15;
        r15 = r8;
        r8 = r7;
        r7 = r10;
        r10 = r13;
        r13 = r6;
        r6 = r0;
        r0 = r1;
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0277, code lost:
        r6 = (rz.P) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0279, code lost:
        if (r6 == null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x027b, code lost:
        r6 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0280, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0281, code lost:
        r4.add(r8.a(r9, r6));
        r8 = r0;
        r6 = r11;
        r9 = r13;
        r4 = r14;
        r13 = r16;
        r0 = r19;
        r11 = r7;
        r7 = r2;
        r2 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x02b5, code lost:
        r6 = (java.lang.Iterable) r6;
        r9 = new java.util.ArrayList(YH.C16877v.y(r6, 10));
        r11 = r2;
        r14 = r6;
        r15 = r14;
        r12 = r6.iterator();
        r2 = r1;
        r6 = r5;
        r1 = r8;
        r5 = r3;
        r8 = r4;
        r3 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x02d3, code lost:
        if (r12.hasNext() == false) goto L_0x0344;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x02d5, code lost:
        r10 = r12.next();
        r13 = r10;
        r7 = r1.f87494d;
        r16 = r0;
        r20 = r1.f87492b;
        r0 = r13.a();
        r6.f87515c = r1;
        r6.f87516d = r2;
        r6.f87517e = r11;
        r6.f87518f = r8;
        r6.f87519g = r15;
        r6.f87520h = r14;
        r6.f87521i = r9;
        r6.f87522j = r12;
        r6.f87523k = r10;
        r6.f87524l = r13;
        r6.f87525m = r13;
        r6.f87526n = r7;
        r6.f87527o = r9;
        r6.f87528p = r5;
        r6.f87529q = r4;
        r6.f87530r = r3;
        r6.f87531s = 0;
        r6.f87534v = 5;
        r0 = r20.c(r0, r6);
        r10 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0316, code lost:
        if (r0 != r10) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0318, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0319, code lost:
        r16 = r15;
        r15 = r14;
        r14 = r12;
        r12 = r11;
        r11 = r13;
        r13 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r0;
        r0 = r4;
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0326, code lost:
        r6 = (rz.P) r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0328, code lost:
        if (r6 == null) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x032a, code lost:
        r6 = r6.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x032f, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0330, code lost:
        r4.add(r8.a(r11, r6));
        r4 = r0;
        r6 = r7;
        r8 = r9;
        r0 = r10;
        r11 = r12;
        r9 = r13;
        r12 = r14;
        r14 = r15;
        r15 = r16;
        r7 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0344, code lost:
        r10 = r0;
        r0 = (java.util.List) r9;
        r6.f87515c = r1;
        r6.f87516d = r2;
        r6.f87517e = r11;
        r6.f87518f = r8;
        r6.f87519g = r0;
        r6.f87520h = r0;
        r6.f87521i = r9;
        r6.f87522j = r12;
        r6.f87528p = r5;
        r6.f87529q = 0;
        r6.f87530r = r3;
        r6.f87534v = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0366, code lost:
        if (r1.f(r2, r11, r6) != r10) goto L_0x0369;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0368, code lost:
        return r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0369, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return (java.util.List) r6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(java.lang.String r20, java.lang.String r21, boolean r22, dI.C17164e<? super java.util.List<aj.C11061a>> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            boolean r5 = r4 instanceof Tj.C10942g.c
            if (r5 == 0) goto L_0x001d
            r5 = r4
            Tj.g$c r5 = (Tj.C10942g.c) r5
            int r6 = r5.f87534v
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001d
            int r6 = r6 - r7
            r5.f87534v = r6
            goto L_0x0022
        L_0x001d:
            Tj.g$c r5 = new Tj.g$c
            r5.<init>(r0, r4)
        L_0x0022:
            java.lang.Object r6 = r5.f87532t
            java.lang.Object r7 = eI.C17187b.f()
            int r8 = r5.f87534v
            r10 = 10
            switch(r8) {
                case 0: goto L_0x0183;
                case 1: goto L_0x0166;
                case 2: goto L_0x0117;
                case 3: goto L_0x00cc;
                case 4: goto L_0x00a9;
                case 5: goto L_0x005c;
                case 6: goto L_0x0037;
                default: goto L_0x002f;
            }
        L_0x002f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0037:
            java.lang.Object r1 = r5.f87522j
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r5.f87521i
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r1 = r5.f87520h
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r1 = r5.f87519g
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r5.f87518f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r5.f87517e
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r5.f87516d
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r5.f87515c
            Tj.g r2 = (Tj.C10942g) r2
            XH.y.b(r6)
            goto L_0x036a
        L_0x005c:
            int r1 = r5.f87530r
            int r2 = r5.f87529q
            boolean r3 = r5.f87528p
            java.lang.Object r4 = r5.f87527o
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r8 = r5.f87526n
            aj.b r8 = (aj.C11062b) r8
            java.lang.Object r10 = r5.f87525m
            rz.g r10 = (rz.C15014g) r10
            java.lang.Object r12 = r5.f87524l
            rz.g r12 = (rz.C15014g) r12
            java.lang.Object r12 = r5.f87522j
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r5.f87521i
            java.util.Collection r13 = (java.util.Collection) r13
            java.lang.Object r14 = r5.f87520h
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r5.f87519g
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.lang.Object r9 = r5.f87518f
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r11 = r5.f87517e
            java.lang.String r11 = (java.lang.String) r11
            r20 = r1
            java.lang.Object r1 = r5.f87516d
            java.lang.String r1 = (java.lang.String) r1
            r21 = r1
            java.lang.Object r1 = r5.f87515c
            Tj.g r1 = (Tj.C10942g) r1
            XH.y.b(r6)
            r0 = r2
            r16 = r15
            r2 = r21
            r15 = r14
            r14 = r12
            r12 = r11
            r11 = r10
            r10 = r7
            r7 = r5
            r5 = r3
            r3 = r20
            goto L_0x0326
        L_0x00a9:
            boolean r1 = r5.f87528p
            java.lang.Object r2 = r5.f87518f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r3 = r5.f87517e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.f87516d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r5.f87515c
            Tj.g r8 = (Tj.C10942g) r8
            XH.y.b(r6)
            r17 = r7
            r7 = r0
            r0 = r17
            r18 = r3
            r3 = r1
            r1 = r4
            r4 = r2
            r2 = r18
            goto L_0x02b5
        L_0x00cc:
            int r1 = r5.f87530r
            int r2 = r5.f87529q
            boolean r3 = r5.f87528p
            java.lang.Object r4 = r5.f87527o
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r8 = r5.f87526n
            aj.b r8 = (aj.C11062b) r8
            java.lang.Object r9 = r5.f87525m
            rz.g r9 = (rz.C15014g) r9
            java.lang.Object r10 = r5.f87524l
            rz.g r10 = (rz.C15014g) r10
            java.lang.Object r10 = r5.f87522j
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r11 = r5.f87521i
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r5.f87520h
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r5.f87519g
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r5.f87518f
            dI.e r14 = (dI.C17164e) r14
            java.lang.Object r15 = r5.f87517e
            java.lang.String r15 = (java.lang.String) r15
            r20 = r1
            java.lang.Object r1 = r5.f87516d
            java.lang.String r1 = (java.lang.String) r1
            r21 = r1
            java.lang.Object r1 = r5.f87515c
            Tj.g r1 = (Tj.C10942g) r1
            XH.y.b(r6)
            r16 = r20
            r0 = r1
            r1 = r21
            r17 = r12
            r12 = r2
            r2 = r7
            r7 = r10
            r10 = r17
            goto L_0x0277
        L_0x0117:
            int r1 = r5.f87531s
            int r2 = r5.f87530r
            int r3 = r5.f87529q
            boolean r4 = r5.f87528p
            java.lang.Object r8 = r5.f87525m
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r9 = r5.f87524l
            rz.g r9 = (rz.C15014g) r9
            java.lang.Object r10 = r5.f87523k
            java.lang.Object r11 = r5.f87522j
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r5.f87521i
            java.util.Collection r12 = (java.util.Collection) r12
            java.lang.Object r13 = r5.f87520h
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.lang.Object r14 = r5.f87519g
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.lang.Object r15 = r5.f87518f
            dI.e r15 = (dI.C17164e) r15
            r20 = r1
            java.lang.Object r1 = r5.f87517e
            java.lang.String r1 = (java.lang.String) r1
            r21 = r1
            java.lang.Object r1 = r5.f87516d
            java.lang.String r1 = (java.lang.String) r1
            r22 = r1
            java.lang.Object r1 = r5.f87515c
            Tj.g r1 = (Tj.C10942g) r1
            XH.y.b(r6)
            XH.x r6 = (XH.x) r6
            r6.j()
            r0 = r22
            r16 = r7
            r6 = r14
            r14 = r10
            r10 = r11
            r11 = r12
            r12 = r3
            r3 = r4
            r4 = r8
            r8 = r21
            goto L_0x0229
        L_0x0166:
            boolean r1 = r5.f87528p
            java.lang.Object r2 = r5.f87518f
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r3 = r5.f87517e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.f87516d
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r5.f87515c
            Tj.g r8 = (Tj.C10942g) r8
            XH.y.b(r6)
            r17 = r3
            r3 = r1
            r1 = r4
            r4 = r2
            r2 = r17
            goto L_0x01a1
        L_0x0183:
            XH.y.b(r6)
            if (r3 == 0) goto L_0x0299
            Ry.e r6 = r19.g()
            r5.f87515c = r0
            r5.f87516d = r1
            r5.f87517e = r2
            r5.f87518f = r4
            r5.f87528p = r3
            r8 = 1
            r5.f87534v = r8
            java.lang.Object r6 = r6.h(r5)
            if (r6 != r7) goto L_0x01a0
            return r7
        L_0x01a0:
            r8 = r0
        L_0x01a1:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x01ac:
            boolean r11 = r6.hasNext()
            if (r11 == 0) goto L_0x01c3
            java.lang.Object r11 = r6.next()
            r12 = r11
            rz.g r12 = (rz.C15014g) r12
            boolean r12 = r12.d()
            if (r12 == 0) goto L_0x01ac
            r9.add(r11)
            goto L_0x01ac
        L_0x01c3:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r10 = YH.C16877v.y(r9, r10)
            r6.<init>(r10)
            java.util.Iterator r10 = r9.iterator()
            r11 = r10
            r12 = 0
            r13 = 0
            r10 = r9
        L_0x01d4:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x0295
            java.lang.Object r14 = r11.next()
            r15 = r14
            rz.g r15 = (rz.C15014g) r15
            Ry.e r0 = r8.g()
            r16 = r7
            java.lang.String r7 = r15.a()
            r5.f87515c = r8
            r5.f87516d = r1
            r5.f87517e = r2
            r5.f87518f = r4
            r5.f87519g = r9
            r5.f87520h = r10
            r5.f87521i = r6
            r5.f87522j = r11
            r5.f87523k = r14
            r5.f87524l = r15
            r5.f87525m = r6
            r5.f87528p = r3
            r5.f87529q = r12
            r5.f87530r = r13
            r20 = r3
            r3 = 0
            r5.f87531s = r3
            r3 = 2
            r5.f87534v = r3
            java.lang.Object r0 = r0.s(r7, r1, r2, r5)
            r7 = r16
            if (r0 != r7) goto L_0x0218
            return r7
        L_0x0218:
            r3 = r20
            r0 = r1
            r16 = r7
            r1 = r8
            r20 = 0
            r8 = r2
            r2 = r13
            r13 = r10
            r10 = r11
            r11 = r6
            r6 = r9
            r9 = r15
            r15 = r4
            r4 = r11
        L_0x0229:
            aj.b r7 = r1.f87494d
            r21 = r2
            Ry.h r2 = r1.f87492b
            r22 = r2
            java.lang.String r2 = r9.a()
            r5.f87515c = r1
            r5.f87516d = r0
            r5.f87517e = r8
            r5.f87518f = r15
            r5.f87519g = r6
            r5.f87520h = r13
            r5.f87521i = r11
            r5.f87522j = r10
            r5.f87523k = r14
            r5.f87524l = r9
            r5.f87525m = r9
            r5.f87526n = r7
            r5.f87527o = r4
            r5.f87528p = r3
            r5.f87529q = r12
            r14 = r21
            r5.f87530r = r14
            r21 = r0
            r0 = r20
            r5.f87531s = r0
            r0 = 3
            r5.f87534v = r0
            r0 = r22
            java.lang.Object r0 = r0.c(r2, r5)
            r2 = r16
            if (r0 != r2) goto L_0x026b
            return r2
        L_0x026b:
            r16 = r14
            r14 = r15
            r15 = r8
            r8 = r7
            r7 = r10
            r10 = r13
            r13 = r6
            r6 = r0
            r0 = r1
            r1 = r21
        L_0x0277:
            rz.P r6 = (rz.P) r6
            if (r6 == 0) goto L_0x0280
            Sy.a$b r6 = r6.a()
            goto L_0x0281
        L_0x0280:
            r6 = 0
        L_0x0281:
            aj.a r6 = r8.a(r9, r6)
            r4.add(r6)
            r8 = r0
            r6 = r11
            r9 = r13
            r4 = r14
            r13 = r16
            r0 = r19
            r11 = r7
            r7 = r2
            r2 = r15
            goto L_0x01d4
        L_0x0295:
            java.util.List r6 = (java.util.List) r6
            goto L_0x036b
        L_0x0299:
            r0 = r7
            Ry.e r6 = r19.g()
            r7 = r19
            r5.f87515c = r7
            r5.f87516d = r1
            r5.f87517e = r2
            r5.f87518f = r4
            r5.f87528p = r3
            r8 = 4
            r5.f87534v = r8
            java.lang.Object r6 = r6.h(r5)
            if (r6 != r0) goto L_0x02b4
            return r0
        L_0x02b4:
            r8 = r7
        L_0x02b5:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = YH.C16877v.y(r6, r10)
            r9.<init>(r10)
            java.util.Iterator r10 = r6.iterator()
            r11 = r2
            r14 = r6
            r15 = r14
            r12 = r10
            r2 = r1
            r6 = r5
            r1 = r8
            r5 = r3
            r8 = r4
            r3 = 0
            r4 = 0
        L_0x02cf:
            boolean r10 = r12.hasNext()
            if (r10 == 0) goto L_0x0344
            java.lang.Object r10 = r12.next()
            r13 = r10
            rz.g r13 = (rz.C15014g) r13
            aj.b r7 = r1.f87494d
            r16 = r0
            Ry.h r0 = r1.f87492b
            r20 = r0
            java.lang.String r0 = r13.a()
            r6.f87515c = r1
            r6.f87516d = r2
            r6.f87517e = r11
            r6.f87518f = r8
            r6.f87519g = r15
            r6.f87520h = r14
            r6.f87521i = r9
            r6.f87522j = r12
            r6.f87523k = r10
            r6.f87524l = r13
            r6.f87525m = r13
            r6.f87526n = r7
            r6.f87527o = r9
            r6.f87528p = r5
            r6.f87529q = r4
            r6.f87530r = r3
            r10 = 0
            r6.f87531s = r10
            r10 = 5
            r6.f87534v = r10
            r10 = r20
            java.lang.Object r0 = r10.c(r0, r6)
            r10 = r16
            if (r0 != r10) goto L_0x0319
            return r10
        L_0x0319:
            r16 = r15
            r15 = r14
            r14 = r12
            r12 = r11
            r11 = r13
            r13 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r0
            r0 = r4
            r4 = r13
        L_0x0326:
            rz.P r6 = (rz.P) r6
            if (r6 == 0) goto L_0x032f
            Sy.a$b r6 = r6.a()
            goto L_0x0330
        L_0x032f:
            r6 = 0
        L_0x0330:
            aj.a r6 = r8.a(r11, r6)
            r4.add(r6)
            r4 = r0
            r6 = r7
            r8 = r9
            r0 = r10
            r11 = r12
            r9 = r13
            r12 = r14
            r14 = r15
            r15 = r16
            r7 = r19
            goto L_0x02cf
        L_0x0344:
            r10 = r0
            r0 = r9
            java.util.List r0 = (java.util.List) r0
            r6.f87515c = r1
            r6.f87516d = r2
            r6.f87517e = r11
            r6.f87518f = r8
            r6.f87519g = r0
            r6.f87520h = r0
            r6.f87521i = r9
            r6.f87522j = r12
            r6.f87528p = r5
            r4 = 0
            r6.f87529q = r4
            r6.f87530r = r3
            r3 = 6
            r6.f87534v = r3
            java.lang.Object r1 = r1.f(r2, r11, r6)
            if (r1 != r10) goto L_0x0369
            return r10
        L_0x0369:
            r1 = r0
        L_0x036a:
            r6 = r1
        L_0x036b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.C10942g.i(java.lang.String, java.lang.String, boolean, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    public final void j(String str, String str2, C15007A a10, List<C11061a> list, a.c.C1636a aVar, boolean z10) {
        if (!z10 || !(aVar instanceof a.c.C1636a.b)) {
            this.f87495e.l(str, aVar, str2, list, a10.c());
        } else {
            this.f87495e.k(str, (a.c.C1636a.b) aVar, list, a10.c());
        }
        this.f87495e.f(str, a10.c(), a10.b().b(), list);
        this.f87495e.h(str, a10.c(), list);
    }

    public final Object h(String str, String str2, String str3, C15007A a10, C.c cVar, boolean z10, C17164e<? super a.c> eVar) {
        return C16310i.g(this.f87497g, new b(this, str, str2, a10, str3, z10, cVar, (C17164e<? super b>) null), eVar);
    }
}
