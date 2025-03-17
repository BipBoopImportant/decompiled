package Ny;

import FB.C12860a;
import Ry.f;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;
import rz.U;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0011H@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"LNy/p;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LSy/a;", "scanAndGoAnalytics", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LSy/a;LFB/a;)V", "", "newQuantity", "Lrz/U;", "quantityLimits", "", "a", "(ILrz/U;)Z", "", "barcode", "familyCardId", "LXH/x;", "LXH/N;", "b", "(Ljava/lang/String;ILjava/lang/String;LdI/e;)Ljava/lang/Object;", "LRy/f;", "LSy/a;", "c", "LFB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final f f112692a;

    /* renamed from: b  reason: collision with root package name */
    private final Sy.a f112693b;

    /* renamed from: c  reason: collision with root package name */
    private final C12860a f112694c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.UpdateItemQtyInCartUseCase", f = "UpdateItemQtyInCartUseCase.kt", l = {28, 30, 51}, m = "invoke-BWLJW6A")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112695c;

        /* renamed from: d  reason: collision with root package name */
        Object f112696d;

        /* renamed from: e  reason: collision with root package name */
        Object f112697e;

        /* renamed from: f  reason: collision with root package name */
        Object f112698f;

        /* renamed from: g  reason: collision with root package name */
        Object f112699g;

        /* renamed from: h  reason: collision with root package name */
        Object f112700h;

        /* renamed from: i  reason: collision with root package name */
        Object f112701i;

        /* renamed from: j  reason: collision with root package name */
        Object f112702j;

        /* renamed from: k  reason: collision with root package name */
        Object f112703k;

        /* renamed from: l  reason: collision with root package name */
        int f112704l;

        /* renamed from: m  reason: collision with root package name */
        int f112705m;

        /* renamed from: n  reason: collision with root package name */
        /* synthetic */ Object f112706n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ p f112707o;

        /* renamed from: p  reason: collision with root package name */
        int f112708p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p pVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f112707o = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112706n = obj;
            this.f112708p |= Integer.MIN_VALUE;
            Object b10 = this.f112707o.b((String) null, 0, (String) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    public p(f fVar, Sy.a aVar, C12860a aVar2) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "scanAndGoAnalytics");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        this.f112692a = fVar;
        this.f112693b = aVar;
        this.f112694c = aVar2;
    }

    private final boolean a(int i10, U u10) {
        return i10 >= 1 && i10 <= u10.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0101 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r20, int r21, java.lang.String r22, dI.C17164e<? super XH.x<XH.C16807N>> r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r1 instanceof Ny.p.a
            if (r2 == 0) goto L_0x0018
            r2 = r1
            Ny.p$a r2 = (Ny.p.a) r2
            int r3 = r2.f112708p
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0018
            int r3 = r3 - r4
            r2.f112708p = r3
        L_0x0016:
            r8 = r2
            goto L_0x001e
        L_0x0018:
            Ny.p$a r2 = new Ny.p$a
            r2.<init>(r0, r1)
            goto L_0x0016
        L_0x001e:
            java.lang.Object r2 = r8.f112706n
            java.lang.Object r9 = eI.C17187b.f()
            int r3 = r8.f112708p
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x00b6
            if (r3 == r6) goto L_0x0091
            if (r3 == r5) goto L_0x0068
            if (r3 != r4) goto L_0x0060
            java.lang.Object r1 = r8.f112703k
            rz.g r1 = (rz.C15014g) r1
            java.lang.Object r1 = r8.f112702j
            rz.g r1 = (rz.C15014g) r1
            java.lang.Object r1 = r8.f112701i
            rz.g r1 = (rz.C15014g) r1
            java.lang.Object r1 = r8.f112700h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f112699g
            Ry.e r1 = (Ry.e) r1
            java.lang.Object r1 = r8.f112698f
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r8.f112697e
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f112696d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r8.f112695c
            Ny.p r1 = (Ny.p) r1
            XH.y.b(r2)
            XH.x r2 = (XH.x) r2
            java.lang.Object r1 = r2.j()
            goto L_0x015c
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0068:
            int r1 = r8.f112704l
            java.lang.Object r3 = r8.f112700h
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r5 = r8.f112699g
            Ry.e r5 = (Ry.e) r5
            java.lang.Object r6 = r8.f112698f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r8.f112697e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r8.f112696d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.f112695c
            Ny.p r11 = (Ny.p) r11
            XH.y.b(r2)
            r15 = r7
            r7 = r10
            r14 = r11
            r17 = r5
            r5 = r1
            r1 = r6
            r6 = r3
            r3 = r17
            goto L_0x0107
        L_0x0091:
            int r1 = r8.f112704l
            java.lang.Object r3 = r8.f112699g
            Ry.e r3 = (Ry.e) r3
            java.lang.Object r6 = r8.f112698f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r7 = r8.f112697e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r10 = r8.f112696d
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r8.f112695c
            Ny.p r11 = (Ny.p) r11
            XH.y.b(r2)
            r17 = r11
            r11 = r1
            r1 = r6
            r6 = r17
            r18 = r10
            r10 = r7
            r7 = r18
            goto L_0x00e5
        L_0x00b6:
            XH.y.b(r2)
            Ry.f r2 = r0.f112692a
            Ry.e r3 = r2.invoke()
            FB.a r2 = r0.f112694c
            TJ.g r2 = r2.b()
            TJ.g r2 = TJ.C16534i.A(r2)
            r8.f112695c = r0
            r7 = r20
            r8.f112696d = r7
            r10 = r22
            r8.f112697e = r10
            r8.f112698f = r1
            r8.f112699g = r3
            r11 = r21
            r8.f112704l = r11
            r8.f112708p = r6
            java.lang.Object r2 = TJ.C16534i.B(r2, r8)
            if (r2 != r9) goto L_0x00e4
            return r9
        L_0x00e4:
            r6 = r0
        L_0x00e5:
            EB.d r2 = (EB.C12832d) r2
            java.lang.String r2 = r2.e()
            r8.f112695c = r6
            r8.f112696d = r7
            r8.f112697e = r10
            r8.f112698f = r1
            r8.f112699g = r3
            r8.f112700h = r2
            r8.f112704l = r11
            r8.f112708p = r5
            java.lang.Object r5 = r3.b(r7, r8)
            if (r5 != r9) goto L_0x0102
            return r9
        L_0x0102:
            r14 = r6
            r15 = r10
            r6 = r2
            r2 = r5
            r5 = r11
        L_0x0107:
            rz.g r2 = (rz.C15014g) r2
            if (r2 == 0) goto L_0x015d
            rz.U r10 = r2.h()
            boolean r10 = r14.a(r5, r10)
            if (r10 == 0) goto L_0x015d
            Sy.a r10 = r14.f112693b
            com.ingka.ikea.core.model.product.ProductItem r11 = r2.g()
            java.lang.String r11 = r11.f()
            Sy.a$c r12 = r2.f()
            java.lang.String r12 = r12.m()
            Sy.a$c r13 = r2.f()
            java.lang.String r13 = r13.j()
            r16 = 1
            r4 = r14
            r14 = r5
            r0 = r15
            r15 = r16
            r10.l(r11, r12, r13, r14, r15)
            r8.f112695c = r4
            r8.f112696d = r7
            r8.f112697e = r0
            r8.f112698f = r1
            r8.f112699g = r3
            r8.f112700h = r6
            r8.f112701i = r2
            r8.f112702j = r2
            r8.f112703k = r2
            r8.f112704l = r5
            r1 = 0
            r8.f112705m = r1
            r1 = 3
            r8.f112708p = r1
            r4 = r7
            r7 = r0
            java.lang.Object r1 = r3.k(r4, r5, r6, r7, r8)
            if (r1 != r9) goto L_0x015c
            return r9
        L_0x015c:
            return r1
        L_0x015d:
            XH.x$a r0 = XH.x.f139812b
            XH.N r0 = XH.C16807N.f139792a
            java.lang.Object r0 = XH.x.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.p.b(java.lang.String, int, java.lang.String, dI.e):java.lang.Object");
    }
}
