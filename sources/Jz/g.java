package jz;

import dI.C17164e;
import iz.C14589c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lz.d;
import pp.C11767a;
import sz.c;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljz/g;", "Lsz/c;", "Llz/d;", "remoteDataSource", "Ljz/f;", "cache", "Liz/c;", "mapper", "<init>", "(Llz/d;Ljz/f;Liz/c;)V", "", "storeId", "itemNo", "Lpp/a;", "cacheStrategy", "Lrz/l;", "a", "(Ljava/lang/String;Ljava/lang/String;Lpp/a;LdI/e;)Ljava/lang/Object;", "Llz/d;", "b", "Ljz/f;", "c", "Liz/c;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    private final d f128281a;

    /* renamed from: b  reason: collision with root package name */
    private final f f128282b;

    /* renamed from: c  reason: collision with root package name */
    private final C14589c f128283c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f128284a;

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
                f128284a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jz.g.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.ScanAndGoCombinationProductRepositoryImpl", f = "ScanAndGoCombinationProductRepositoryImpl.kt", l = {27, 36}, m = "fetch")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f128285c;

        /* renamed from: d  reason: collision with root package name */
        Object f128286d;

        /* renamed from: e  reason: collision with root package name */
        Object f128287e;

        /* renamed from: f  reason: collision with root package name */
        Object f128288f;

        /* renamed from: g  reason: collision with root package name */
        Object f128289g;

        /* renamed from: h  reason: collision with root package name */
        Object f128290h;

        /* renamed from: i  reason: collision with root package name */
        Object f128291i;

        /* renamed from: j  reason: collision with root package name */
        int f128292j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f128293k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ g f128294l;

        /* renamed from: m  reason: collision with root package name */
        int f128295m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f128294l = gVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128293k = obj;
            this.f128295m |= Integer.MIN_VALUE;
            return this.f128294l.a((String) null, (String) null, (C11767a) null, this);
        }
    }

    public g(d dVar, f fVar, C14589c cVar) {
        C17542s.j(dVar, "remoteDataSource");
        C17542s.j(fVar, "cache");
        C17542s.j(cVar, "mapper");
        this.f128281a = dVar;
        this.f128282b = fVar;
        this.f128283c = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r7, java.lang.String r8, pp.C11767a r9, dI.C17164e<? super rz.C15019l> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof jz.g.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            jz.g$b r0 = (jz.g.b) r0
            int r1 = r0.f128295m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128295m = r1
            goto L_0x0018
        L_0x0013:
            jz.g$b r0 = new jz.g$b
            r0.<init>(r6, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f128293k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f128295m
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0070
            if (r3 == r5) goto L_0x0050
            if (r3 != r4) goto L_0x0048
            java.lang.Object r7 = r0.f128291i
            rz.l r7 = (rz.C15019l) r7
            java.lang.Object r7 = r0.f128290h
            pp.a r7 = (pp.C11767a) r7
            java.lang.Object r7 = r0.f128289g
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f128288f
            pp.a r7 = (pp.C11767a) r7
            java.lang.Object r7 = r0.f128287e
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f128286d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f128285c
            jz.g r7 = (jz.g) r7
            XH.y.b(r1)
            goto L_0x00a4
        L_0x0048:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0050:
            java.lang.Object r7 = r0.f128291i
            iz.c r7 = (iz.C14589c) r7
            java.lang.Object r8 = r0.f128290h
            pp.a r8 = (pp.C11767a) r8
            java.lang.Object r8 = r0.f128289g
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f128288f
            pp.a r8 = (pp.C11767a) r8
            java.lang.Object r8 = r0.f128287e
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r0.f128286d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r9 = r0.f128285c
            jz.g r9 = (jz.g) r9
            XH.y.b(r1)
            goto L_0x00ca
        L_0x0070:
            XH.y.b(r1)
            int[] r1 = jz.g.a.f128284a
            int r3 = r9.ordinal()
            r1 = r1[r3]
            if (r1 == r5) goto L_0x00ab
            if (r1 != r4) goto L_0x00a5
            jz.f r3 = r6.f128282b
            java.lang.Object r3 = r3.b(r8)
            rz.l r3 = (rz.C15019l) r3
            if (r3 != 0) goto L_0x00d5
            pp.a r5 = pp.C11767a.NETWORK
            r0.f128285c = r6
            r0.f128286d = r7
            r0.f128287e = r8
            r0.f128288f = r9
            r0.f128289g = r10
            r0.f128290h = r9
            r0.f128291i = r3
            r0.f128292j = r1
            r0.f128295m = r4
            java.lang.Object r1 = r6.a(r7, r8, r5, r0)
            if (r1 != r2) goto L_0x00a4
            return r2
        L_0x00a4:
            return r1
        L_0x00a5:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        L_0x00ab:
            iz.c r3 = r6.f128283c
            lz.d r4 = r6.f128281a
            r0.f128285c = r6
            r0.f128286d = r7
            r0.f128287e = r8
            r0.f128288f = r9
            r0.f128289g = r10
            r0.f128290h = r9
            r0.f128291i = r3
            r0.f128292j = r1
            r0.f128295m = r5
            java.lang.Object r1 = r4.c(r7, r8, r5, r0)
            if (r1 != r2) goto L_0x00c8
            return r2
        L_0x00c8:
            r9 = r6
            r7 = r3
        L_0x00ca:
            com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote r1 = (com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote) r1
            rz.l r3 = r7.a(r1)
            jz.f r7 = r9.f128282b
            r7.e(r8, r3)
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: jz.g.a(java.lang.String, java.lang.String, pp.a, dI.e):java.lang.Object");
    }
}
