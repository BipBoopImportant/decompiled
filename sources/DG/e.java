package dg;

import Ax.c;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bHB¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Ldg/e;", "Ldg/d;", "LXf/e;", "replacementRemoteDataSource", "LAx/c;", "productRemoteDataSource", "<init>", "(LXf/e;LAx/c;)V", "", "itemNo", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LXf/e;", "b", "LAx/c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final Xf.e f72439a;

    /* renamed from: b  reason: collision with root package name */
    private final c f72440b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.usecase.GetReplacementRecommendationsUseCaseImpl", f = "GetReplacementRecommendationsUseCase.kt", l = {23, 29}, m = "invoke")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f72441c;

        /* renamed from: d  reason: collision with root package name */
        Object f72442d;

        /* renamed from: e  reason: collision with root package name */
        Object f72443e;

        /* renamed from: f  reason: collision with root package name */
        Object f72444f;

        /* renamed from: g  reason: collision with root package name */
        Object f72445g;

        /* renamed from: h  reason: collision with root package name */
        Object f72446h;

        /* renamed from: i  reason: collision with root package name */
        int f72447i;

        /* renamed from: j  reason: collision with root package name */
        int f72448j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f72449k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ e f72450l;

        /* renamed from: m  reason: collision with root package name */
        int f72451m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f72450l = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f72449k = obj;
            this.f72451m |= Integer.MIN_VALUE;
            return this.f72450l.a((String) null, this);
        }
    }

    public e(Xf.e eVar, c cVar) {
        C17542s.j(eVar, "replacementRemoteDataSource");
        C17542s.j(cVar, "productRemoteDataSource");
        this.f72439a = eVar;
        this.f72440b = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: dI.e<? super java.util.List<com.ingka.ikea.core.model.product.ProductItem>>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082 A[SYNTHETIC, Splitter:B:24:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r7, dI.C17164e<? super java.util.List<com.ingka.ikea.core.model.product.ProductItem>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dg.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            dg.e$a r0 = (dg.e.a) r0
            int r1 = r0.f72451m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f72451m = r1
            goto L_0x0018
        L_0x0013:
            dg.e$a r0 = new dg.e$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f72449k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f72451m
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0062
            if (r3 == r5) goto L_0x0051
            if (r3 != r4) goto L_0x0049
            java.lang.Object r7 = r0.f72446h
            dg.e r7 = (dg.e) r7
            java.lang.Object r7 = r0.f72445g
            dg.e r7 = (dg.e) r7
            java.lang.Object r7 = r0.f72444f
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r7 = r0.f72443e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f72442d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f72441c
            dg.e r7 = (dg.e) r7
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            goto L_0x00a0
        L_0x0044:
            r7 = move-exception
            goto L_0x00a7
        L_0x0046:
            r7 = move-exception
            goto L_0x00c1
        L_0x0049:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0051:
            java.lang.Object r7 = r0.f72443e
            r8 = r7
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r7 = r0.f72442d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r3 = r0.f72441c
            dg.e r3 = (dg.e) r3
            XH.y.b(r1)
            goto L_0x0077
        L_0x0062:
            XH.y.b(r1)
            Xf.e r1 = r6.f72439a
            r0.f72441c = r6
            r0.f72442d = r7
            r0.f72443e = r8
            r0.f72451m = r5
            java.lang.Object r1 = r1.a(r7, r0)
            if (r1 != r2) goto L_0x0076
            return r2
        L_0x0076:
            r3 = r6
        L_0x0077:
            java.util.List r1 = (java.util.List) r1
            r5 = r1
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00c2
            XH.x$a r5 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            Ax.c r5 = r3.f72440b     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72441c = r3     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72442d = r7     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72443e = r8     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72444f = r1     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72445g = r3     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72446h = r3     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r7 = 0
            r0.f72447i = r7     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72448j = r7     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            r0.f72451m = r4     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            java.lang.Object r1 = r5.e(r1, r0)     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            if (r1 != r2) goto L_0x00a0
            return r2
        L_0x00a0:
            java.util.List r1 = (java.util.List) r1     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            java.lang.Object r7 = XH.x.b(r1)     // Catch:{ CancellationException -> 0x0046, all -> 0x0044 }
            goto L_0x00b1
        L_0x00a7:
            XH.x$a r8 = XH.x.f139812b
            java.lang.Object r7 = XH.y.a(r7)
            java.lang.Object r7 = XH.x.b(r7)
        L_0x00b1:
            boolean r8 = XH.x.g(r7)
            if (r8 == 0) goto L_0x00b8
            r7 = 0
        L_0x00b8:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x00c6
            java.util.List r7 = YH.C16877v.n()
            goto L_0x00c6
        L_0x00c1:
            throw r7
        L_0x00c2:
            java.util.List r7 = YH.C16877v.n()
        L_0x00c6:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dg.e.a(java.lang.String, dI.e):java.lang.Object");
    }
}
