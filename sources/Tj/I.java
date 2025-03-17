package Tj;

import Ry.f;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import gj.j;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LTj/I;", "LTj/H;", "LRy/f;", "scanAndGoCartRepositoryFactory", "LSy/a;", "analytics", "<init>", "(LRy/f;LSy/a;)V", "Lgj/j;", "input", "Lrz/g;", "lookingFor", "LXH/x;", "a", "(Lgj/j;Lrz/g;LdI/e;)Ljava/lang/Object;", "LRy/f;", "b", "LSy/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class I implements H {

    /* renamed from: a  reason: collision with root package name */
    private final f f87439a;

    /* renamed from: b  reason: collision with root package name */
    private final Sy.a f87440b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.usecase.ValidateProductForCollectUseCaseImpl", f = "ValidateProductForCollectUseCase.kt", l = {93}, m = "invoke-0E7RQCE")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f87441c;

        /* renamed from: d  reason: collision with root package name */
        Object f87442d;

        /* renamed from: e  reason: collision with root package name */
        Object f87443e;

        /* renamed from: f  reason: collision with root package name */
        Object f87444f;

        /* renamed from: g  reason: collision with root package name */
        Object f87445g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f87446h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ I f87447i;

        /* renamed from: j  reason: collision with root package name */
        int f87448j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(I i10, C17164e<? super a> eVar) {
            super(eVar);
            this.f87447i = i10;
        }

        public final Object invokeSuspend(Object obj) {
            this.f87446h = obj;
            this.f87448j |= Integer.MIN_VALUE;
            Object a10 = this.f87447i.a((j) null, (C15014g) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public I(f fVar, Sy.a aVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "analytics");
        this.f87439a = fVar;
        this.f87440b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: rz.g} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(gj.j r9, rz.C15014g r10, dI.C17164e<? super XH.x<? extends gj.j>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof Tj.I.a
            if (r0 == 0) goto L_0x0013
            r0 = r11
            Tj.I$a r0 = (Tj.I.a) r0
            int r1 = r0.f87448j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f87448j = r1
            goto L_0x0018
        L_0x0013:
            Tj.I$a r0 = new Tj.I$a
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r1 = r0.f87446h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f87448j
            r4 = 1
            if (r3 == 0) goto L_0x0047
            if (r3 != r4) goto L_0x003f
            java.lang.Object r9 = r0.f87445g
            gj.j r9 = (gj.j) r9
            java.lang.Object r9 = r0.f87444f
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r0.f87443e
            r10 = r9
            rz.g r10 = (rz.C15014g) r10
            java.lang.Object r9 = r0.f87442d
            gj.j r9 = (gj.j) r9
            java.lang.Object r11 = r0.f87441c
            Tj.I r11 = (Tj.I) r11
            XH.y.b(r1)
            goto L_0x00c7
        L_0x003f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0047:
            XH.y.b(r1)
            boolean r1 = r9 instanceof gj.j.a.c
            if (r1 != 0) goto L_0x0093
            boolean r1 = r9 instanceof gj.j.b
            if (r1 == 0) goto L_0x0053
            goto L_0x0093
        L_0x0053:
            boolean r1 = r9 instanceof gj.j.c
            if (r1 == 0) goto L_0x006f
            r1 = r9
            gj.j$c r1 = (gj.j.c) r1
            rz.O r1 = r1.g()
            rz.O r3 = rz.O.AS_IS
            if (r1 != r3) goto L_0x0093
            XH.x$a r9 = XH.x.f139812b
            Tj.H$a$c r9 = Tj.H.a.c.f87437a
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            return r9
        L_0x006f:
            boolean r10 = r9 instanceof gj.j.d
            if (r10 != 0) goto L_0x0086
            boolean r10 = r9 instanceof gj.j.e
            if (r10 != 0) goto L_0x0086
            boolean r10 = r9 instanceof gj.j.a.C2181a
            if (r10 != 0) goto L_0x0086
            boolean r9 = r9 instanceof gj.j.a.b
            if (r9 == 0) goto L_0x0080
            goto L_0x0086
        L_0x0080:
            XH.t r9 = new XH.t
            r9.<init>()
            throw r9
        L_0x0086:
            XH.x$a r9 = XH.x.f139812b
            Tj.H$a$c r9 = Tj.H.a.c.f87437a
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            return r9
        L_0x0093:
            Sy.a r1 = r8.f87440b
            java.lang.String r3 = r9.h()
            java.lang.String r5 = r9.d()
            boolean r6 = r9 instanceof gj.j.b
            rz.O r7 = r9.g()
            java.lang.String r7 = r7.b()
            r1.r(r3, r5, r6, r7)
            Ry.f r1 = r8.f87439a
            Ry.e r1 = r1.invoke()
            java.lang.String r3 = r9.h()
            r0.f87441c = r8
            r0.f87442d = r9
            r0.f87443e = r10
            r0.f87444f = r11
            r0.f87445g = r9
            r0.f87448j = r4
            java.lang.Object r1 = r1.b(r3, r0)
            if (r1 != r2) goto L_0x00c7
            return r2
        L_0x00c7:
            rz.g r1 = (rz.C15014g) r1
            if (r1 != 0) goto L_0x00d8
            XH.x$a r9 = XH.x.f139812b
            Tj.H$a$b r9 = Tj.H.a.b.f87436a
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            goto L_0x0102
        L_0x00d8:
            boolean r11 = r1.b()
            if (r11 == 0) goto L_0x00eb
            XH.x$a r9 = XH.x.f139812b
            Tj.H$a$a r9 = Tj.H.a.C1815a.f87435a
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            goto L_0x0102
        L_0x00eb:
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r1)
            if (r10 != 0) goto L_0x00fe
            XH.x$a r9 = XH.x.f139812b
            Tj.H$a$d r9 = Tj.H.a.d.f87438a
            java.lang.Object r9 = XH.y.a(r9)
            java.lang.Object r9 = XH.x.b(r9)
            goto L_0x0102
        L_0x00fe:
            java.lang.Object r9 = XH.x.b(r9)
        L_0x0102:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.I.a(gj.j, rz.g, dI.e):java.lang.Object");
    }
}
