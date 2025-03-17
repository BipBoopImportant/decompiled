package Ny;

import FB.C12860a;
import Ry.f;
import Ry.g;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import rz.D;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LNy/b;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LSy/a;", "scanAndGoAnalytics", "LRy/g;", "scanAndGoCouponsRepository", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LSy/a;LRy/g;LFB/a;)V", "Lrz/D;", "syncedCoupon", "LXH/N;", "b", "(Lrz/D;)V", "", "familyCardId", "coupon", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LRy/f;", "LSy/a;", "c", "LRy/g;", "d", "LFB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final f f112498a;

    /* renamed from: b  reason: collision with root package name */
    private final Sy.a f112499b;

    /* renamed from: c  reason: collision with root package name */
    private final g f112500c;

    /* renamed from: d  reason: collision with root package name */
    private final C12860a f112501d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.ApplyCouponUseCase", f = "ApplyCouponUseCase.kt", l = {30, 33, 44}, m = "applyCoupon")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112502c;

        /* renamed from: d  reason: collision with root package name */
        Object f112503d;

        /* renamed from: e  reason: collision with root package name */
        Object f112504e;

        /* renamed from: f  reason: collision with root package name */
        Object f112505f;

        /* renamed from: g  reason: collision with root package name */
        Object f112506g;

        /* renamed from: h  reason: collision with root package name */
        Object f112507h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f112508i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f112509j;

        /* renamed from: k  reason: collision with root package name */
        int f112510k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f112509j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112508i = obj;
            this.f112510k |= Integer.MIN_VALUE;
            return this.f112509j.a((String) null, (String) null, this);
        }
    }

    public b(f fVar, Sy.a aVar, g gVar, C12860a aVar2) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "scanAndGoAnalytics");
        C17542s.j(gVar, "scanAndGoCouponsRepository");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        this.f112498a = fVar;
        this.f112499b = aVar;
        this.f112500c = gVar;
        this.f112501d = aVar2;
    }

    private final void b(D d10) {
        if (d10 != null && d10.b() == null) {
            this.f112499b.h(d10.a());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: rz.D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: rz.D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: rz.D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: rz.D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: rz.D} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: dI.e<? super XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, dI.C17164e<? super XH.C16807N> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof Ny.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Ny.b$a r0 = (Ny.b.a) r0
            int r1 = r0.f112510k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f112510k = r1
            goto L_0x0018
        L_0x0013:
            Ny.b$a r0 = new Ny.b$a
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f112508i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f112510k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0086
            if (r3 == r6) goto L_0x0070
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            java.lang.Object r9 = r0.f112506g
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f112505f
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f112504e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f112503d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r10 = r0.f112502c
            Ny.b r10 = (Ny.b) r10
            XH.y.b(r1)
            goto L_0x00e9
        L_0x0044:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x004c:
            java.lang.Object r9 = r0.f112506g
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r0.f112505f
            dI.e r10 = (dI.C17164e) r10
            java.lang.Object r11 = r0.f112504e
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r3 = r0.f112503d
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.f112502c
            Ny.b r5 = (Ny.b) r5
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r1 = r1.j()
            r7 = r1
            r1 = r9
            r9 = r11
            r11 = r10
            r10 = r5
            r5 = r7
            goto L_0x00c8
        L_0x0070:
            java.lang.Object r9 = r0.f112505f
            r11 = r9
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r9 = r0.f112504e
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r0.f112503d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r3 = r0.f112502c
            Ny.b r3 = (Ny.b) r3
            XH.y.b(r1)
            goto L_0x00a5
        L_0x0086:
            XH.y.b(r1)
            FB.a r1 = r8.f112501d
            TJ.g r1 = r1.b()
            TJ.g r1 = TJ.C16534i.A(r1)
            r0.f112502c = r8
            r0.f112503d = r9
            r0.f112504e = r10
            r0.f112505f = r11
            r0.f112510k = r6
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)
            if (r1 != r2) goto L_0x00a4
            return r2
        L_0x00a4:
            r3 = r8
        L_0x00a5:
            EB.d r1 = (EB.C12832d) r1
            java.lang.String r1 = r1.e()
            Ry.f r6 = r3.f112498a
            Ry.e r6 = r6.invoke()
            r0.f112502c = r3
            r0.f112503d = r9
            r0.f112504e = r10
            r0.f112505f = r11
            r0.f112506g = r1
            r0.f112510k = r5
            java.lang.Object r5 = r6.j(r1, r9, r10, r0)
            if (r5 != r2) goto L_0x00c4
            return r2
        L_0x00c4:
            r7 = r3
            r3 = r9
            r9 = r10
            r10 = r7
        L_0x00c8:
            java.lang.Throwable r6 = XH.x.e(r5)
            if (r6 != 0) goto L_0x0114
            Ry.g r6 = r10.f112500c
            TJ.g r6 = r6.a()
            r0.f112502c = r10
            r0.f112503d = r3
            r0.f112504e = r9
            r0.f112505f = r11
            r0.f112506g = r1
            r0.f112507h = r5
            r0.f112510k = r4
            java.lang.Object r1 = TJ.C16534i.D(r6, r0)
            if (r1 != r2) goto L_0x00e9
            return r2
        L_0x00e9:
            java.util.List r1 = (java.util.List) r1
            r11 = 0
            if (r1 == 0) goto L_0x010e
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L_0x00f4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x010c
            java.lang.Object r1 = r0.next()
            r2 = r1
            rz.D r2 = (rz.D) r2
            java.lang.String r2 = r2.a()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r9)
            if (r2 == 0) goto L_0x00f4
            r11 = r1
        L_0x010c:
            rz.D r11 = (rz.D) r11
        L_0x010e:
            r10.b(r11)
            XH.N r9 = XH.C16807N.f139792a
            return r9
        L_0x0114:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.b.a(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
