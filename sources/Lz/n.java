package lz;

import dI.C17164e;
import dz.C14369a;
import iz.C14606t;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kz.h;
import rz.b0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llz/n;", "Lkz/h;", "Ldz/a;", "database", "Liz/t;", "upptackaProductsMapper", "<init>", "(Ldz/a;Liz/t;)V", "", "Lrz/b0;", "list", "Lkz/h$a;", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Ldz/a;", "b", "Liz/t;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C14369a f129323a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14606t f129324b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.sourceimpl.UpptackaLocalDataSourceImpl", f = "UpptackaLocalDataSourceImpl.kt", l = {38}, m = "addCartItems")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f129325c;

        /* renamed from: d  reason: collision with root package name */
        Object f129326d;

        /* renamed from: e  reason: collision with root package name */
        Object f129327e;

        /* renamed from: f  reason: collision with root package name */
        Object f129328f;

        /* renamed from: g  reason: collision with root package name */
        Object f129329g;

        /* renamed from: h  reason: collision with root package name */
        Object f129330h;

        /* renamed from: i  reason: collision with root package name */
        Object f129331i;

        /* renamed from: j  reason: collision with root package name */
        Object f129332j;

        /* renamed from: k  reason: collision with root package name */
        Object f129333k;

        /* renamed from: l  reason: collision with root package name */
        Object f129334l;

        /* renamed from: m  reason: collision with root package name */
        Object f129335m;

        /* renamed from: n  reason: collision with root package name */
        int f129336n;

        /* renamed from: o  reason: collision with root package name */
        int f129337o;

        /* renamed from: p  reason: collision with root package name */
        int f129338p;

        /* renamed from: q  reason: collision with root package name */
        int f129339q;

        /* renamed from: r  reason: collision with root package name */
        /* synthetic */ Object f129340r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ n f129341s;

        /* renamed from: t  reason: collision with root package name */
        int f129342t;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f129341s = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f129340r = obj;
            this.f129342t |= Integer.MIN_VALUE;
            return this.f129341s.a((List<b0>) null, this);
        }
    }

    public n(C14369a aVar, C14606t tVar) {
        C17542s.j(aVar, "database");
        C17542s.j(tVar, "upptackaProductsMapper");
        this.f129323a = aVar;
        this.f129324b = tVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010d, code lost:
        r2 = hp.C11375a.C2209a.UNKNOWN;
        r3 = r0.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0115, code lost:
        if (r3 == null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0117, code lost:
        r3 = "Could not get error message from exception";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        throw new hp.C11375a(r2, lz.f.a(r0, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012e, code lost:
        throw new hp.C11375a(hp.C11375a.C2209a.ITEM_NOT_FOUND, lz.f.b(r0, (java.lang.String) null, 1, (java.lang.Object) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013b, code lost:
        throw new hp.C11376b(lz.f.a(r0, "Unknown problem while mapping"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0147, code lost:
        throw new hp.C11376b(lz.f.b(r0, (java.lang.String) null, 1, (java.lang.Object) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0148, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        return kz.h.a.C3173a.f128886a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return kz.h.a.C3173a.f128886a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:10:0x0059, B:19:0x0079, B:22:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd A[Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa, CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065, b -> 0x014c, a -> 0x0149 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.util.List<rz.b0> r18, dI.C17164e<? super kz.h.a> r19) {
        /*
            r17 = this;
            r0 = r19
            boolean r1 = r0 instanceof lz.n.a
            if (r1 == 0) goto L_0x0017
            r1 = r0
            lz.n$a r1 = (lz.n.a) r1
            int r2 = r1.f129342t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0017
            int r2 = r2 - r3
            r1.f129342t = r2
            r2 = r17
            goto L_0x001e
        L_0x0017:
            lz.n$a r1 = new lz.n$a
            r2 = r17
            r1.<init>(r2, r0)
        L_0x001e:
            java.lang.Object r3 = r1.f129340r
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r1.f129342t
            r8 = 1
            if (r5 == 0) goto L_0x0076
            if (r5 != r8) goto L_0x006e
            int r0 = r1.f129338p
            int r5 = r1.f129337o
            int r9 = r1.f129336n
            java.lang.Object r10 = r1.f129335m
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r11 = r1.f129334l
            gz.c r11 = (gz.c) r11
            java.lang.Object r11 = r1.f129332j
            java.util.Iterator r11 = (java.util.Iterator) r11
            java.lang.Object r12 = r1.f129331i
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.lang.Object r13 = r1.f129330h
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r14 = r1.f129329g
            lz.m r14 = (lz.m) r14
            java.lang.Object r15 = r1.f129328f
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r6 = r1.f129327e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r8 = r1.f129326d
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r1.f129325c
            lz.n r7 = (lz.n) r7
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r3 = r0
            r0 = r8
            r8 = r7
            r7 = r5
            r5 = r1
            r1 = r6
            r6 = r13
            goto L_0x0105
        L_0x0065:
            r0 = move-exception
            goto L_0x010d
        L_0x0068:
            r0 = move-exception
            goto L_0x0121
        L_0x006b:
            r0 = move-exception
            goto L_0x012f
        L_0x006e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0076:
            XH.y.b(r3)
            lz.g r3 = lz.g.f129232a     // Catch:{ b -> 0x014c, a -> 0x0149 }
            r3 = r18
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            r6 = 10
            int r6 = YH.C16877v.y(r3, r6)     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            r5.<init>(r6)     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
        L_0x008e:
            boolean r6 = r3.hasNext()     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            if (r6 == 0) goto L_0x00b3
            java.lang.Object r6 = r3.next()     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            rz.b0 r6 = (rz.b0) r6     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            iz.t r7 = r17.f129324b     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            gz.c r6 = r7.a(r6, r8)     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            r5.add(r6)     // Catch:{ CancellationException -> 0x00b0, IllegalArgumentException -> 0x00ad, Exception -> 0x00aa }
            goto L_0x008e
        L_0x00aa:
            r0 = move-exception
            goto L_0x0130
        L_0x00ad:
            r0 = move-exception
            goto L_0x013c
        L_0x00b0:
            r0 = move-exception
            goto L_0x0148
        L_0x00b3:
            lz.m r3 = lz.m.f129322a     // Catch:{ b -> 0x014c, a -> 0x0149 }
            java.util.Iterator r6 = r5.iterator()     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r8 = r2
            r14 = r3
            r10 = r5
            r12 = r10
            r15 = r12
            r11 = r6
            r3 = 0
            r7 = 0
            r9 = 0
            r5 = r1
            r6 = r5
            r1 = r0
            r0 = r18
        L_0x00c7:
            boolean r13 = r11.hasNext()     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            if (r13 == 0) goto L_0x0108
            java.lang.Object r13 = r11.next()     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r2 = r13
            gz.c r2 = (gz.c) r2     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r16 = r4
            dz.a r4 = r8.f129323a     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129325c = r8     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129326d = r0     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129327e = r1     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129328f = r15     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129329g = r14     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129330h = r6     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129331i = r12     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129332j = r11     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129333k = r13     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129334l = r2     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129335m = r10     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129336n = r9     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129337o = r7     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r5.f129338p = r3     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r13 = 0
            r5.f129339q = r13     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r13 = 1
            r5.f129342t = r13     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            java.lang.Object r2 = r4.p(r2, r5)     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            r4 = r16
            if (r2 != r4) goto L_0x0105
            return r4
        L_0x0105:
            r2 = r17
            goto L_0x00c7
        L_0x0108:
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ CancellationException -> 0x006b, NullPointerException -> 0x0068, Exception -> 0x0065 }
            kz.h$a$b r0 = kz.h.a.b.f128887a     // Catch:{ b -> 0x014c, a -> 0x0149 }
            goto L_0x014e
        L_0x010d:
            hp.a r1 = new hp.a     // Catch:{ b -> 0x014c, a -> 0x0149 }
            hp.a$a r2 = hp.C11375a.C2209a.UNKNOWN     // Catch:{ b -> 0x014c, a -> 0x0149 }
            java.lang.String r3 = r0.getMessage()     // Catch:{ b -> 0x014c, a -> 0x0149 }
            if (r3 != 0) goto L_0x0119
            java.lang.String r3 = "Could not get error message from exception"
        L_0x0119:
            java.lang.String r0 = lz.f.a(r0, r3)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            r1.<init>(r2, r0)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            throw r1     // Catch:{ b -> 0x014c, a -> 0x0149 }
        L_0x0121:
            hp.a r1 = new hp.a     // Catch:{ b -> 0x014c, a -> 0x0149 }
            hp.a$a r2 = hp.C11375a.C2209a.ITEM_NOT_FOUND     // Catch:{ b -> 0x014c, a -> 0x0149 }
            r3 = 0
            r4 = 1
            java.lang.String r0 = lz.f.b(r0, r3, r4, r3)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            r1.<init>(r2, r0)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            throw r1     // Catch:{ b -> 0x014c, a -> 0x0149 }
        L_0x012f:
            throw r0     // Catch:{ b -> 0x014c, a -> 0x0149 }
        L_0x0130:
            hp.b r1 = new hp.b     // Catch:{ b -> 0x014c, a -> 0x0149 }
            java.lang.String r2 = "Unknown problem while mapping"
            java.lang.String r0 = lz.f.a(r0, r2)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            r1.<init>(r0)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            throw r1     // Catch:{ b -> 0x014c, a -> 0x0149 }
        L_0x013c:
            hp.b r1 = new hp.b     // Catch:{ b -> 0x014c, a -> 0x0149 }
            r2 = 0
            r3 = 1
            java.lang.String r0 = lz.f.b(r0, r2, r3, r2)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            r1.<init>(r0)     // Catch:{ b -> 0x014c, a -> 0x0149 }
            throw r1     // Catch:{ b -> 0x014c, a -> 0x0149 }
        L_0x0148:
            throw r0     // Catch:{ b -> 0x014c, a -> 0x0149 }
        L_0x0149:
            kz.h$a$a r0 = kz.h.a.C3173a.f128886a
            goto L_0x014e
        L_0x014c:
            kz.h$a$a r0 = kz.h.a.C3173a.f128886a
        L_0x014e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lz.n.a(java.util.List, dI.e):java.lang.Object");
    }
}
