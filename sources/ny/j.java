package Ny;

import Cy.b;
import FB.C12860a;
import Ry.f;
import Ry.h;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\fH@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LNy/j;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LRy/h;", "scanAndGoProductRepository", "LCy/b;", "scanAndGoCartAnalytics", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LRy/h;LCy/b;LFB/a;)V", "", "barcode", "", "isUnavailable", "familyCardId", "LXH/N;", "a", "(Ljava/lang/String;ZLjava/lang/String;LdI/e;)Ljava/lang/Object;", "LRy/f;", "b", "LRy/h;", "c", "LCy/b;", "d", "LFB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final f f112581a;

    /* renamed from: b  reason: collision with root package name */
    private final h f112582b;

    /* renamed from: c  reason: collision with root package name */
    private final b f112583c;

    /* renamed from: d  reason: collision with root package name */
    private final C12860a f112584d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.RemoveItemFromCartUseCase", f = "RemoveItemFromCartUseCase.kt", l = {28, 32, 34, 44}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112585c;

        /* renamed from: d  reason: collision with root package name */
        Object f112586d;

        /* renamed from: e  reason: collision with root package name */
        Object f112587e;

        /* renamed from: f  reason: collision with root package name */
        Object f112588f;

        /* renamed from: g  reason: collision with root package name */
        Object f112589g;

        /* renamed from: h  reason: collision with root package name */
        Object f112590h;

        /* renamed from: i  reason: collision with root package name */
        Object f112591i;

        /* renamed from: j  reason: collision with root package name */
        Object f112592j;

        /* renamed from: k  reason: collision with root package name */
        Object f112593k;

        /* renamed from: l  reason: collision with root package name */
        boolean f112594l;

        /* renamed from: m  reason: collision with root package name */
        int f112595m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f112596n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ j f112597o;

        /* renamed from: p  reason: collision with root package name */
        int f112598p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(j jVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f112597o = jVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112596n = obj;
            this.f112598p |= Integer.MIN_VALUE;
            return this.f112597o.a((String) null, false, (String) null, this);
        }
    }

    public j(f fVar, h hVar, b bVar, C12860a aVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(hVar, "scanAndGoProductRepository");
        C17542s.j(bVar, "scanAndGoCartAnalytics");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f112581a = fVar;
        this.f112582b = hVar;
        this.f112583c = bVar;
        this.f112584d = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: dI.e<? super XH.N>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0109 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0164 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r12, boolean r13, java.lang.String r14, dI.C17164e<? super XH.C16807N> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof Ny.j.a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            Ny.j$a r0 = (Ny.j.a) r0
            int r1 = r0.f112598p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f112598p = r1
            goto L_0x0018
        L_0x0013:
            Ny.j$a r0 = new Ny.j$a
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r1 = r0.f112596n
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f112598p
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r3 == 0) goto L_0x00c6
            if (r3 == r7) goto L_0x00ae
            if (r3 == r6) goto L_0x0088
            if (r3 == r5) goto L_0x005d
            if (r3 != r4) goto L_0x0055
            java.lang.Object r12 = r0.f112591i
            rz.g r12 = (rz.C15014g) r12
            java.lang.Object r12 = r0.f112590h
            Ry.e r12 = (Ry.e) r12
            java.lang.Object r12 = r0.f112589g
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f112588f
            dI.e r12 = (dI.C17164e) r12
            java.lang.Object r12 = r0.f112587e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f112586d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r0.f112585c
            Ny.j r12 = (Ny.j) r12
            XH.y.b(r1)
            XH.x r1 = (XH.x) r1
            java.lang.Object r12 = r1.j()
            goto L_0x0165
        L_0x0055:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x005d:
            boolean r12 = r0.f112594l
            java.lang.Object r13 = r0.f112593k
            rz.g r13 = (rz.C15014g) r13
            java.lang.Object r14 = r0.f112592j
            rz.g r14 = (rz.C15014g) r14
            java.lang.Object r14 = r0.f112591i
            rz.g r14 = (rz.C15014g) r14
            java.lang.Object r15 = r0.f112590h
            Ry.e r15 = (Ry.e) r15
            java.lang.Object r3 = r0.f112589g
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r0.f112588f
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r6 = r0.f112587e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f112586d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f112585c
            Ny.j r8 = (Ny.j) r8
            XH.y.b(r1)
            goto L_0x013c
        L_0x0088:
            boolean r12 = r0.f112594l
            java.lang.Object r13 = r0.f112590h
            Ry.e r13 = (Ry.e) r13
            java.lang.Object r14 = r0.f112589g
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r0.f112588f
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r3 = r0.f112587e
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r6 = r0.f112586d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f112585c
            Ny.j r7 = (Ny.j) r7
            XH.y.b(r1)
            r8 = r7
            r7 = r6
            r6 = r3
            r3 = r14
            r10 = r15
            r15 = r13
            r13 = r10
            goto L_0x0113
        L_0x00ae:
            boolean r13 = r0.f112594l
            java.lang.Object r12 = r0.f112588f
            r15 = r12
            dI.e r15 = (dI.C17164e) r15
            java.lang.Object r12 = r0.f112587e
            r14 = r12
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r12 = r0.f112586d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r3 = r0.f112585c
            Ny.j r3 = (Ny.j) r3
            XH.y.b(r1)
            goto L_0x00e7
        L_0x00c6:
            XH.y.b(r1)
            FB.a r1 = r11.f112584d
            TJ.g r1 = r1.b()
            TJ.g r1 = TJ.C16534i.A(r1)
            r0.f112585c = r11
            r0.f112586d = r12
            r0.f112587e = r14
            r0.f112588f = r15
            r0.f112594l = r13
            r0.f112598p = r7
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)
            if (r1 != r2) goto L_0x00e6
            return r2
        L_0x00e6:
            r3 = r11
        L_0x00e7:
            EB.d r1 = (EB.C12832d) r1
            java.lang.String r1 = r1.e()
            Ry.f r7 = r3.f112581a
            Ry.e r7 = r7.invoke()
            r0.f112585c = r3
            r0.f112586d = r12
            r0.f112587e = r14
            r0.f112588f = r15
            r0.f112589g = r1
            r0.f112590h = r7
            r0.f112594l = r13
            r0.f112598p = r6
            java.lang.Object r6 = r7.b(r12, r0)
            if (r6 != r2) goto L_0x010a
            return r2
        L_0x010a:
            r8 = r3
            r3 = r1
            r1 = r6
            r6 = r14
            r10 = r7
            r7 = r12
            r12 = r13
            r13 = r15
            r15 = r10
        L_0x0113:
            r14 = r1
            rz.g r14 = (rz.C15014g) r14
            if (r14 == 0) goto L_0x014c
            Ry.h r1 = r8.f112582b
            r0.f112585c = r8
            r0.f112586d = r7
            r0.f112587e = r6
            r0.f112588f = r13
            r0.f112589g = r3
            r0.f112590h = r15
            r0.f112591i = r14
            r0.f112592j = r14
            r0.f112593k = r14
            r0.f112594l = r12
            r9 = 0
            r0.f112595m = r9
            r0.f112598p = r5
            java.lang.Object r1 = r1.c(r7, r0)
            if (r1 != r2) goto L_0x013a
            return r2
        L_0x013a:
            r5 = r13
            r13 = r14
        L_0x013c:
            rz.P r1 = (rz.P) r1
            if (r1 == 0) goto L_0x0145
            Sy.a$b r1 = r1.a()
            goto L_0x0146
        L_0x0145:
            r1 = 0
        L_0x0146:
            Cy.b r9 = r8.f112583c
            r9.q(r13, r12, r1, r3)
            r13 = r5
        L_0x014c:
            r0.f112585c = r8
            r0.f112586d = r7
            r0.f112587e = r6
            r0.f112588f = r13
            r0.f112589g = r3
            r0.f112590h = r15
            r0.f112591i = r14
            r0.f112594l = r12
            r0.f112598p = r4
            java.lang.Object r12 = r15.s(r7, r3, r6, r0)
            if (r12 != r2) goto L_0x0165
            return r2
        L_0x0165:
            java.lang.Throwable r12 = XH.x.e(r12)
            if (r12 != 0) goto L_0x016e
            XH.N r12 = XH.C16807N.f139792a
            return r12
        L_0x016e:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.j.a(java.lang.String, boolean, java.lang.String, dI.e):java.lang.Object");
    }
}
