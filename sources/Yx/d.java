package yx;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import pp.C11767a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lyx/d;", "LAx/b;", "Lyx/a;", "cache", "LAx/a;", "service", "<init>", "(Lyx/a;LAx/a;)V", "", "itemNo", "Lpp/a;", "cacheStrategy", "Lop/j;", "a", "(Ljava/lang/String;Lpp/a;LdI/e;)Ljava/lang/Object;", "Lyx/a;", "b", "LAx/a;", "productprovider-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements Ax.b {

    /* renamed from: a  reason: collision with root package name */
    private final C15311a f132228a;

    /* renamed from: b  reason: collision with root package name */
    private final Ax.a f132229b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f132230a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                pp.a[] r0 = pp.C11767a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pp.a r1 = pp.C11767a.NETWORK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                pp.a r1 = pp.C11767a.LOCAL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f132230a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yx.d.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.productprovider.data.ProductDetailsRepoImpl", f = "ProductDetailsRepositoryImpl.kt", l = {23, 31}, m = "fetch")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f132231c;

        /* renamed from: d  reason: collision with root package name */
        Object f132232d;

        /* renamed from: e  reason: collision with root package name */
        Object f132233e;

        /* renamed from: f  reason: collision with root package name */
        Object f132234f;

        /* renamed from: g  reason: collision with root package name */
        Object f132235g;

        /* renamed from: h  reason: collision with root package name */
        Object f132236h;

        /* renamed from: i  reason: collision with root package name */
        int f132237i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f132238j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ d f132239k;

        /* renamed from: l  reason: collision with root package name */
        int f132240l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(d dVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f132239k = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f132238j = obj;
            this.f132240l |= Integer.MIN_VALUE;
            return this.f132239k.a((String) null, (C11767a) null, this);
        }
    }

    public d(C15311a aVar, Ax.a aVar2) {
        C17542s.j(aVar, "cache");
        C17542s.j(aVar2, "service");
        this.f132228a = aVar;
        this.f132229b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r7, pp.C11767a r8, dI.C17164e<? super op.C11699j> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof yx.d.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            yx.d$b r0 = (yx.d.b) r0
            int r1 = r0.f132240l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f132240l = r1
            goto L_0x0018
        L_0x0013:
            yx.d$b r0 = new yx.d$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f132238j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f132240l
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0064
            if (r3 == r5) goto L_0x004c
            if (r3 != r4) goto L_0x0044
            java.lang.Object r7 = r0.f132236h
            op.j r7 = (op.C11699j) r7
            java.lang.Object r7 = r0.f132235g
            pp.a r7 = (pp.C11767a) r7
            java.lang.Object r7 = r0.f132234f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f132233e
            pp.a r7 = (pp.C11767a) r7
            java.lang.Object r7 = r0.f132232d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f132231c
            yx.d r7 = (yx.d) r7
            XH.y.b(r1)
            goto L_0x0096
        L_0x0044:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x004c:
            java.lang.Object r7 = r0.f132235g
            pp.a r7 = (pp.C11767a) r7
            java.lang.Object r7 = r0.f132234f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f132233e
            pp.a r7 = (pp.C11767a) r7
            java.lang.Object r7 = r0.f132232d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r0.f132231c
            yx.d r8 = (yx.d) r8
            XH.y.b(r1)
            goto L_0x00b6
        L_0x0064:
            XH.y.b(r1)
            int[] r1 = yx.d.a.f132230a
            int r3 = r8.ordinal()
            r1 = r1[r3]
            if (r1 == r5) goto L_0x009e
            if (r1 != r4) goto L_0x0098
            yx.a r3 = r6.f132228a
            java.lang.Object r3 = r3.b(r7)
            op.j r3 = (op.C11699j) r3
            if (r3 != 0) goto L_0x0097
            pp.a r5 = pp.C11767a.NETWORK
            r0.f132231c = r6
            r0.f132232d = r7
            r0.f132233e = r8
            r0.f132234f = r9
            r0.f132235g = r8
            r0.f132236h = r3
            r0.f132237i = r1
            r0.f132240l = r4
            java.lang.Object r1 = r6.a(r7, r5, r0)
            if (r1 != r2) goto L_0x0096
            return r2
        L_0x0096:
            return r1
        L_0x0097:
            return r3
        L_0x0098:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        L_0x009e:
            Ax.a r3 = r6.f132229b
            r0.f132231c = r6
            r0.f132232d = r7
            r0.f132233e = r8
            r0.f132234f = r9
            r0.f132235g = r8
            r0.f132237i = r1
            r0.f132240l = r5
            java.lang.Object r1 = r3.a(r7, r0)
            if (r1 != r2) goto L_0x00b5
            return r2
        L_0x00b5:
            r8 = r6
        L_0x00b6:
            com.ingka.ikea.core.remotemodel.product.ProductDetailsResponseRemote r1 = (com.ingka.ikea.core.remotemodel.product.ProductDetailsResponseRemote) r1
            op.j r9 = r1.f()
            yx.a r8 = r8.f132228a
            r8.e(r7, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yx.d.a(java.lang.String, pp.a, dI.e):java.lang.Object");
    }
}
