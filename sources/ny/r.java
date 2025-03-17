package Ny;

import Bx.a;
import FB.C12860a;
import Ry.d;
import Ry.f;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.K;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0010B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LNy/r;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LRy/d;", "cartDiscountRepository", "LCy/b;", "scanAndGoCartAnalytics", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LRy/d;LCy/b;LFB/a;)V", "Lrz/K;", "scanAndGoProfileState", "LXH/x;", "LXH/N;", "a", "(Lrz/K;LdI/e;)Ljava/lang/Object;", "LRy/f;", "b", "LRy/d;", "c", "LCy/b;", "d", "LFB/a;", "e", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* renamed from: e  reason: collision with root package name */
    public static final a f112730e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f112731f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final f f112732a;

    /* renamed from: b  reason: collision with root package name */
    private final d f112733b;

    /* renamed from: c  reason: collision with root package name */
    private final Cy.b f112734c;

    /* renamed from: d  reason: collision with root package name */
    private final C12860a f112735d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"LNy/r$a;", "", "<init>", "()V", "a", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LNy/r$a$a;", "", "LBx/a$a;", "promotionMode", "<init>", "(LBx/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LBx/a$a;", "()LBx/a$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ny.r$a$a  reason: collision with other inner class name */
        public static final class C2780a extends Throwable {

            /* renamed from: a  reason: collision with root package name */
            private final a.C2584a f112736a;

            public C2780a(a.C2584a aVar) {
                C17542s.j(aVar, "promotionMode");
                this.f112736a = aVar;
            }

            public final a.C2584a a() {
                return this.f112736a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2780a) && this.f112736a == ((C2780a) obj).f112736a;
            }

            public int hashCode() {
                return this.f112736a.hashCode();
            }

            public String toString() {
                a.C2584a aVar = this.f112736a;
                return "ResultFailure(promotionMode=" + aVar + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.ValidateCheckoutOrLoginPromptUseCase", f = "ValidateCheckoutOrLoginPromptUseCase.kt", l = {28, 29, 30}, m = "validate-gIAlu-s")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f112737c;

        /* renamed from: d  reason: collision with root package name */
        Object f112738d;

        /* renamed from: e  reason: collision with root package name */
        Object f112739e;

        /* renamed from: f  reason: collision with root package name */
        Object f112740f;

        /* renamed from: g  reason: collision with root package name */
        Object f112741g;

        /* renamed from: h  reason: collision with root package name */
        Object f112742h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f112743i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ r f112744j;

        /* renamed from: k  reason: collision with root package name */
        int f112745k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(r rVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f112744j = rVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112743i = obj;
            this.f112745k |= Integer.MIN_VALUE;
            Object a10 = this.f112744j.a((K) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public r(f fVar, d dVar, Cy.b bVar, C12860a aVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(dVar, "cartDiscountRepository");
        C17542s.j(bVar, "scanAndGoCartAnalytics");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f112732a = fVar;
        this.f112733b = dVar;
        this.f112734c = bVar;
        this.f112735d = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: dI.e<? super XH.x<XH.N>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(rz.K r10, dI.C17164e<? super XH.x<XH.C16807N>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof Ny.r.b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Ny.r$b r0 = (Ny.r.b) r0
            int r1 = r0.f112745k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f112745k = r1
            goto L_0x0018
        L_0x0013:
            Ny.r$b r0 = new Ny.r$b
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f112743i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f112745k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0078
            if (r3 == r6) goto L_0x0067
            if (r3 == r5) goto L_0x0050
            if (r3 != r4) goto L_0x0048
            java.lang.Object r10 = r0.f112742h
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r10 = r0.f112741g
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.f112740f
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r2 = r0.f112739e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r0.f112738d
            rz.K r2 = (rz.K) r2
            java.lang.Object r0 = r0.f112737c
            Ny.r r0 = (Ny.r) r0
            XH.y.b(r1)
            goto L_0x00d7
        L_0x0048:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0050:
            java.lang.Object r10 = r0.f112740f
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r0.f112739e
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r3 = r0.f112738d
            rz.K r3 = (rz.K) r3
            java.lang.Object r5 = r0.f112737c
            Ny.r r5 = (Ny.r) r5
            XH.y.b(r1)
            r8 = r5
            r5 = r3
            r3 = r8
            goto L_0x00ae
        L_0x0067:
            java.lang.Object r10 = r0.f112739e
            r11 = r10
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r10 = r0.f112738d
            rz.K r10 = (rz.K) r10
            java.lang.Object r3 = r0.f112737c
            Ny.r r3 = (Ny.r) r3
            XH.y.b(r1)
            goto L_0x0091
        L_0x0078:
            XH.y.b(r1)
            Ry.f r1 = r9.f112732a
            Ry.e r1 = r1.invoke()
            r0.f112737c = r9
            r0.f112738d = r10
            r0.f112739e = r11
            r0.f112745k = r6
            java.lang.Object r1 = r1.h(r0)
            if (r1 != r2) goto L_0x0090
            return r2
        L_0x0090:
            r3 = r9
        L_0x0091:
            java.util.List r1 = (java.util.List) r1
            Ry.d r6 = r3.f112733b
            TJ.g r6 = r6.a()
            r0.f112737c = r3
            r0.f112738d = r10
            r0.f112739e = r11
            r0.f112740f = r1
            r0.f112745k = r5
            java.lang.Object r5 = TJ.C16534i.D(r6, r0)
            if (r5 != r2) goto L_0x00aa
            return r2
        L_0x00aa:
            r8 = r5
            r5 = r10
            r10 = r1
            r1 = r8
        L_0x00ae:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x00b7
            java.util.List r6 = YH.C16877v.n()
            goto L_0x00b8
        L_0x00b7:
            r6 = r1
        L_0x00b8:
            FB.a r7 = r3.f112735d
            TJ.g r7 = r7.b()
            r0.f112737c = r3
            r0.f112738d = r5
            r0.f112739e = r11
            r0.f112740f = r10
            r0.f112741g = r6
            r0.f112742h = r1
            r0.f112745k = r4
            java.lang.Object r1 = TJ.C16534i.B(r7, r0)
            if (r1 != r2) goto L_0x00d3
            return r2
        L_0x00d3:
            r11 = r10
            r0 = r3
            r2 = r5
            r10 = r6
        L_0x00d7:
            EB.d r1 = (EB.C12832d) r1
            if (r1 == 0) goto L_0x00e0
            java.lang.String r1 = r1.e()
            goto L_0x00e1
        L_0x00e0:
            r1 = 0
        L_0x00e1:
            if (r1 != 0) goto L_0x00e5
            java.lang.String r1 = ""
        L_0x00e5:
            Cy.b r0 = r0.f112734c
            r0.m(r11, r10, r1)
            rz.K$b r10 = rz.K.b.f130758b
            boolean r10 = kotlin.jvm.internal.C17542s.e(r2, r10)
            if (r10 != 0) goto L_0x010f
            rz.K$a$c r10 = rz.K.a.c.f130757b
            boolean r10 = kotlin.jvm.internal.C17542s.e(r2, r10)
            if (r10 == 0) goto L_0x00fb
            goto L_0x010f
        L_0x00fb:
            boolean r10 = r2 instanceof rz.K.c
            if (r10 != 0) goto L_0x0177
            boolean r10 = r2 instanceof rz.K.a.b
            if (r10 != 0) goto L_0x0177
            boolean r10 = r2 instanceof rz.K.a.C3233a
            if (r10 == 0) goto L_0x0109
            goto L_0x0177
        L_0x0109:
            XH.t r10 = new XH.t
            r10.<init>()
            throw r10
        L_0x010f:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r10 = r11 instanceof java.util.Collection
            if (r10 == 0) goto L_0x011f
            r10 = r11
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x011f
            goto L_0x0177
        L_0x011f:
            java.util.Iterator r10 = r11.iterator()
        L_0x0123:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0177
            java.lang.Object r11 = r10.next()
            rz.g r11 = (rz.C15014g) r11
            com.ingka.ikea.core.model.product.ProductItem r11 = r11.g()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r11 = r11.e()
            com.ingka.ikea.core.model.product.ProductItem$Price r11 = r11.g()
            boolean r11 = r11 instanceof com.ingka.ikea.core.model.product.ProductItem.Price.FamilyPrice
            if (r11 == 0) goto L_0x0123
            boolean r10 = r2 instanceof rz.K.a.c
            if (r10 == 0) goto L_0x0146
            Bx.a$a r10 = Bx.a.C2584a.SCAN_AND_GO_UPGRADE_TO_FAMILY
            goto L_0x014c
        L_0x0146:
            boolean r10 = r2 instanceof rz.K.b
            if (r10 == 0) goto L_0x015c
            Bx.a$a r10 = Bx.a.C2584a.SCAN_AND_GO
        L_0x014c:
            XH.x$a r11 = XH.x.f139812b
            Ny.r$a$a r11 = new Ny.r$a$a
            r11.<init>(r10)
            java.lang.Object r10 = XH.y.a(r11)
            java.lang.Object r10 = XH.x.b(r10)
            goto L_0x017f
        L_0x015c:
            boolean r10 = r2 instanceof rz.K.c
            if (r10 != 0) goto L_0x016f
            boolean r10 = r2 instanceof rz.K.a.b
            if (r10 != 0) goto L_0x016f
            boolean r10 = r2 instanceof rz.K.a.C3233a
            if (r10 == 0) goto L_0x0169
            goto L_0x016f
        L_0x0169:
            XH.t r10 = new XH.t
            r10.<init>()
            throw r10
        L_0x016f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Unexpected profile status"
            r10.<init>(r11)
            throw r10
        L_0x0177:
            XH.x$a r10 = XH.x.f139812b
            XH.N r10 = XH.C16807N.f139792a
            java.lang.Object r10 = XH.x.b(r10)
        L_0x017f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.r.a(rz.K, dI.e):java.lang.Object");
    }
}
