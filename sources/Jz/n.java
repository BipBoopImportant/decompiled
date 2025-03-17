package jz;

import FB.C12860a;
import Ry.k;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kz.C14738a;
import kz.h;
import kz.i;
import rz.b0;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH@¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Ljz/n;", "LRy/k;", "Lkz/i;", "upptackaRemoteDataSource", "Lkz/a;", "cartSourceLocal", "Lkz/h;", "upptackaLocalDataSource", "LFB/a;", "localStoreSelectionRepository", "<init>", "(Lkz/i;Lkz/a;Lkz/h;LFB/a;)V", "", "listId", "LRy/j;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "", "Lrz/b0;", "list", "LRy/i;", "b", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "Lkz/i;", "Lkz/a;", "c", "Lkz/h;", "d", "LFB/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements k {

    /* renamed from: a  reason: collision with root package name */
    private final i f128504a;

    /* renamed from: b  reason: collision with root package name */
    private final C14738a f128505b;

    /* renamed from: c  reason: collision with root package name */
    private final h f128506c;

    /* renamed from: d  reason: collision with root package name */
    private final C12860a f128507d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.UpptackaRepositoryImpl", f = "UpptackaRepositoryImpl.kt", l = {49}, m = "addProductsToCart")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f128508c;

        /* renamed from: d  reason: collision with root package name */
        Object f128509d;

        /* renamed from: e  reason: collision with root package name */
        Object f128510e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f128511f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ n f128512g;

        /* renamed from: h  reason: collision with root package name */
        int f128513h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f128512g = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128511f = obj;
            this.f128513h |= Integer.MIN_VALUE;
            return this.f128512g.b((List<b0>) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.repository.UpptackaRepositoryImpl", f = "UpptackaRepositoryImpl.kt", l = {27, 29, 26}, m = "fetchProductsFromUpptacka")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f128514c;

        /* renamed from: d  reason: collision with root package name */
        Object f128515d;

        /* renamed from: e  reason: collision with root package name */
        Object f128516e;

        /* renamed from: f  reason: collision with root package name */
        Object f128517f;

        /* renamed from: g  reason: collision with root package name */
        Object f128518g;

        /* renamed from: h  reason: collision with root package name */
        Object f128519h;

        /* renamed from: i  reason: collision with root package name */
        Object f128520i;

        /* renamed from: j  reason: collision with root package name */
        Object f128521j;

        /* renamed from: k  reason: collision with root package name */
        Object f128522k;

        /* renamed from: l  reason: collision with root package name */
        Object f128523l;

        /* renamed from: m  reason: collision with root package name */
        Object f128524m;

        /* renamed from: n  reason: collision with root package name */
        int f128525n;

        /* renamed from: o  reason: collision with root package name */
        int f128526o;

        /* renamed from: p  reason: collision with root package name */
        int f128527p;

        /* renamed from: q  reason: collision with root package name */
        /* synthetic */ Object f128528q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ n f128529r;

        /* renamed from: s  reason: collision with root package name */
        int f128530s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(n nVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f128529r = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f128528q = obj;
            this.f128530s |= Integer.MIN_VALUE;
            return this.f128529r.a((String) null, this);
        }
    }

    public n(i iVar, C14738a aVar, h hVar, C12860a aVar2) {
        C17542s.j(iVar, "upptackaRemoteDataSource");
        C17542s.j(aVar, "cartSourceLocal");
        C17542s.j(hVar, "upptackaLocalDataSource");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        this.f128504a = iVar;
        this.f128505b = aVar;
        this.f128506c = hVar;
        this.f128507d = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e5  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x010f A[LOOP:0: B:25:0x0109->B:27:0x010f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x014e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r18, dI.C17164e<? super Ry.j> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof jz.n.b
            if (r2 == 0) goto L_0x0017
            r2 = r1
            jz.n$b r2 = (jz.n.b) r2
            int r3 = r2.f128530s
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f128530s = r3
            goto L_0x001c
        L_0x0017:
            jz.n$b r2 = new jz.n$b
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f128528q
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f128530s
            r6 = 3
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L_0x009f
            if (r5 == r8) goto L_0x0085
            if (r5 == r7) goto L_0x0068
            if (r5 != r6) goto L_0x0060
            java.lang.Object r1 = r2.f128524m
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r2.f128523l
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f128522k
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f128521j
            kz.i r1 = (kz.i) r1
            java.lang.Object r1 = r2.f128520i
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r2.f128519h
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Object r1 = r2.f128518g
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f128517f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r2.f128516e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r2.f128515d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r2.f128514c
            jz.n r1 = (jz.n) r1
            XH.y.b(r3)
            goto L_0x014f
        L_0x0060:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0068:
            java.lang.Object r1 = r2.f128519h
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r5 = r2.f128518g
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r7 = r2.f128517f
            kz.i r7 = (kz.i) r7
            java.lang.Object r8 = r2.f128516e
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r9 = r2.f128515d
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.f128514c
            jz.n r10 = (jz.n) r10
            XH.y.b(r3)
            goto L_0x00ee
        L_0x0085:
            java.lang.Object r1 = r2.f128517f
            kz.i r1 = (kz.i) r1
            java.lang.Object r5 = r2.f128516e
            dI.e r5 = (dI.C17164e) r5
            java.lang.Object r8 = r2.f128515d
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.f128514c
            jz.n r9 = (jz.n) r9
            XH.y.b(r3)
            r10 = r9
            r16 = r5
            r5 = r1
            r1 = r16
            goto L_0x00c8
        L_0x009f:
            XH.y.b(r3)
            kz.i r3 = r0.f128504a
            FB.a r5 = r0.f128507d
            TJ.g r5 = r5.b()
            TJ.g r5 = TJ.C16534i.A(r5)
            r2.f128514c = r0
            r9 = r18
            r2.f128515d = r9
            r2.f128516e = r1
            r2.f128517f = r3
            r2.f128530s = r8
            java.lang.Object r5 = TJ.C16534i.B(r5, r2)
            if (r5 != r4) goto L_0x00c1
            return r4
        L_0x00c1:
            r10 = r0
            r8 = r9
            r16 = r5
            r5 = r3
            r3 = r16
        L_0x00c8:
            EB.d r3 = (EB.C12832d) r3
            java.lang.String r3 = r3.e()
            kz.a r9 = r10.f128505b
            r2.f128514c = r10
            r2.f128515d = r8
            r2.f128516e = r1
            r2.f128517f = r5
            r2.f128518g = r3
            r2.f128519h = r8
            r2.f128530s = r7
            java.lang.Object r7 = r9.h(r2)
            if (r7 != r4) goto L_0x00e5
            return r4
        L_0x00e5:
            r9 = r8
            r8 = r1
            r1 = r9
            r16 = r5
            r5 = r3
            r3 = r7
            r7 = r16
        L_0x00ee:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r11 = 10
            int r11 = YH.C16877v.y(r3, r11)
            int r11 = YH.X.e(r11)
            r12 = 16
            int r11 = tI.C17978n.e(r11, r12)
            java.util.LinkedHashMap r12 = new java.util.LinkedHashMap
            r12.<init>(r11)
            java.util.Iterator r13 = r3.iterator()
        L_0x0109:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0129
            java.lang.Object r14 = r13.next()
            rz.g r14 = (rz.C15014g) r14
            java.lang.String r15 = r14.a()
            rz.U r14 = r14.h()
            int r14 = r14.c()
            java.lang.Integer r14 = kotlin.coroutines.jvm.internal.b.e(r14)
            r12.put(r15, r14)
            goto L_0x0109
        L_0x0129:
            r2.f128514c = r10
            r2.f128515d = r9
            r2.f128516e = r8
            r2.f128517f = r3
            r2.f128518g = r3
            r2.f128519h = r12
            r2.f128520i = r13
            r2.f128521j = r7
            r2.f128522k = r5
            r2.f128523l = r1
            r2.f128524m = r12
            r3 = 0
            r2.f128525n = r3
            r2.f128526o = r11
            r2.f128527p = r3
            r2.f128530s = r6
            java.lang.Object r3 = r7.a(r5, r1, r12, r2)
            if (r3 != r4) goto L_0x014f
            return r4
        L_0x014f:
            kz.i$a r3 = (kz.i.a) r3
            boolean r1 = r3 instanceof kz.i.a.C3174a
            if (r1 == 0) goto L_0x0161
            Ry.j$b r1 = new Ry.j$b
            kz.i$a$a r3 = (kz.i.a.C3174a) r3
            rz.a0 r2 = r3.a()
            r1.<init>(r2)
            goto L_0x0176
        L_0x0161:
            kz.i$a$b r1 = kz.i.a.b.f128889a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r3, r1)
            if (r1 == 0) goto L_0x016c
            Ry.j$a r1 = Ry.j.a.f115635a
            goto L_0x0176
        L_0x016c:
            kz.i$a$c r1 = kz.i.a.c.f128890a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r3, r1)
            if (r1 == 0) goto L_0x0177
            Ry.j$c r1 = Ry.j.c.f115637a
        L_0x0176:
            return r1
        L_0x0177:
            XH.t r1 = new XH.t
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jz.n.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.util.List<rz.b0> r6, dI.C17164e<? super Ry.i> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof jz.n.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            jz.n$a r0 = (jz.n.a) r0
            int r1 = r0.f128513h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f128513h = r1
            goto L_0x0018
        L_0x0013:
            jz.n$a r0 = new jz.n$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f128511f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f128513h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f128510e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f128509d
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r6 = r0.f128508c
            jz.n r6 = (jz.n) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            kz.h r1 = r5.f128506c
            r0.f128508c = r5
            r0.f128509d = r6
            r0.f128510e = r7
            r0.f128513h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            kz.h$a r1 = (kz.h.a) r1
            kz.h$a$a r6 = kz.h.a.C3173a.f128886a
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x005e
            Ry.i$a r6 = Ry.i.a.f115633a
            goto L_0x0068
        L_0x005e:
            kz.h$a$b r6 = kz.h.a.b.f128887a
            boolean r6 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r6 == 0) goto L_0x0069
            Ry.i$b r6 = Ry.i.b.f115634a
        L_0x0068:
            return r6
        L_0x0069:
            XH.t r6 = new XH.t
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jz.n.b(java.util.List, dI.e):java.lang.Object");
    }
}
