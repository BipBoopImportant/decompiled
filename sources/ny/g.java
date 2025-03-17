package Ny;

import FB.C12860a;
import Ry.f;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bHB¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LNy/g;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LFB/a;)V", "", "barcode", "familyCardId", "LXH/x;", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LRy/f;", "b", "LFB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final f f112550a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f112551b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.CollectItemUseCase", f = "CollectItemUseCase.kt", l = {23, 26}, m = "invoke-0E7RQCE")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112552c;

        /* renamed from: d  reason: collision with root package name */
        Object f112553d;

        /* renamed from: e  reason: collision with root package name */
        Object f112554e;

        /* renamed from: f  reason: collision with root package name */
        Object f112555f;

        /* renamed from: g  reason: collision with root package name */
        Object f112556g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f112557h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ g f112558i;

        /* renamed from: j  reason: collision with root package name */
        int f112559j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f112558i = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112557h = obj;
            this.f112559j |= Integer.MIN_VALUE;
            Object a10 = this.f112558i.a((String) null, (String) null, this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public g(f fVar, C12860a aVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f112550a = fVar;
        this.f112551b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: dI.e<? super XH.x<XH.N>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00af A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r9, java.lang.String r10, dI.C17164e<? super XH.x<XH.C16807N>> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof Ny.g.a
            if (r0 == 0) goto L_0x0014
            r0 = r11
            Ny.g$a r0 = (Ny.g.a) r0
            int r1 = r0.f112559j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.f112559j = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            Ny.g$a r0 = new Ny.g$a
            r0.<init>(r8, r11)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r0 = r6.f112557h
            java.lang.Object r7 = eI.C17187b.f()
            int r1 = r6.f112559j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0067
            if (r1 == r3) goto L_0x0050
            if (r1 != r2) goto L_0x0048
            java.lang.Object r9 = r6.f112556g
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r6.f112555f
            dI.e r9 = (dI.C17164e) r9
            java.lang.Object r9 = r6.f112554e
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r6.f112553d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r6.f112552c
            Ny.g r9 = (Ny.g) r9
            XH.y.b(r0)
            XH.x r0 = (XH.x) r0
            java.lang.Object r9 = r0.j()
            goto L_0x00a9
        L_0x0048:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0050:
            java.lang.Object r9 = r6.f112555f
            r11 = r9
            dI.e r11 = (dI.C17164e) r11
            java.lang.Object r9 = r6.f112554e
            r10 = r9
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r6.f112553d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r1 = r6.f112552c
            Ny.g r1 = (Ny.g) r1
            XH.y.b(r0)
        L_0x0065:
            r5 = r10
            goto L_0x0087
        L_0x0067:
            XH.y.b(r0)
            FB.a r0 = r8.f112551b
            TJ.g r0 = r0.b()
            TJ.g r0 = TJ.C16534i.A(r0)
            r6.f112552c = r8
            r6.f112553d = r9
            r6.f112554e = r10
            r6.f112555f = r11
            r6.f112559j = r3
            java.lang.Object r0 = TJ.C16534i.B(r0, r6)
            if (r0 != r7) goto L_0x0085
            return r7
        L_0x0085:
            r1 = r8
            goto L_0x0065
        L_0x0087:
            EB.d r0 = (EB.C12832d) r0
            java.lang.String r4 = r0.e()
            Ry.f r10 = r1.f112550a
            Ry.e r10 = r10.invoke()
            r6.f112552c = r1
            r6.f112553d = r9
            r6.f112554e = r5
            r6.f112555f = r11
            r6.f112556g = r4
            r6.f112559j = r2
            r3 = 1
            r1 = r10
            r2 = r9
            java.lang.Object r9 = r1.n(r2, r3, r4, r5, r6)
            if (r9 != r7) goto L_0x00a9
            return r7
        L_0x00a9:
            java.lang.Throwable r10 = XH.x.e(r9)
            if (r10 != 0) goto L_0x00b0
            return r9
        L_0x00b0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.g.a(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
