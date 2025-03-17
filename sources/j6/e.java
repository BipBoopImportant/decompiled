package j6;

import GK.C15802u;
import XH.v;
import dI.C17164e;
import g6.C7886n;
import g6.C7887o;
import g6.C7888p;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lg6/o;", "LGK/B;", "h", "(Lg6/o;LdI/e;)Ljava/lang/Object;", "Lg6/p;", "LWK/h;", "d", "(Lg6/p;LdI/e;)Ljava/lang/Object;", "LGK/D;", "Lg6/q;", "g", "(LGK/D;)Lg6/q;", "Lg6/n;", "LGK/u;", "e", "(Lg6/n;)LGK/u;", "f", "(LGK/u;)Lg6/n;", "coil-network-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {39}, m = "readByteString")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f54051c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f54052d;

        /* renamed from: e  reason: collision with root package name */
        int f54053e;

        a(C17164e<? super a> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f54052d = obj;
            this.f54053e |= Integer.MIN_VALUE;
            return e.d((C7888p) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "coil3.network.okhttp.internal.UtilsKt", f = "utils.kt", l = {32}, m = "toRequest")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f54054c;

        /* renamed from: d  reason: collision with root package name */
        Object f54055d;

        /* renamed from: e  reason: collision with root package name */
        Object f54056e;

        /* renamed from: f  reason: collision with root package name */
        Object f54057f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f54058g;

        /* renamed from: h  reason: collision with root package name */
        int f54059h;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f54058g = obj;
            this.f54059h |= Integer.MIN_VALUE;
            return e.h((C7887o) null, this);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object d(g6.C7888p r4, dI.C17164e<? super WK.C16773h> r5) {
        /*
            boolean r0 = r5 instanceof j6.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            j6.e$a r0 = (j6.e.a) r0
            int r1 = r0.f54053e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54053e = r1
            goto L_0x0018
        L_0x0013:
            j6.e$a r0 = new j6.e$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f54052d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f54053e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.f54051c
            WK.e r4 = (WK.C16770e) r4
            XH.y.b(r5)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            XH.y.b(r5)
            WK.e r5 = new WK.e
            r5.<init>()
            r0.f54051c = r5
            r0.f54053e = r3
            java.lang.Object r4 = r4.A(r5, r0)
            if (r4 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r4 = r5
        L_0x0049:
            WK.h r4 = r4.i0()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.d(g6.p, dI.e):java.lang.Object");
    }

    private static final C15802u e(C7886n nVar) {
        C15802u.a aVar = new C15802u.a();
        for (Map.Entry next : nVar.b().entrySet()) {
            String str = (String) next.getKey();
            for (String e10 : (List) next.getValue()) {
                aVar.e(str, e10);
            }
        }
        return aVar.f();
    }

    private static final C7886n f(C15802u uVar) {
        C7886n.a aVar = new C7886n.a();
        Iterator<v<String, String>> it = uVar.iterator();
        while (it.hasNext()) {
            v next = it.next();
            aVar.a((String) next.a(), (String) next.b());
        }
        return aVar.b();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001a, code lost:
        r0 = r0.k3();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final g6.C7889q g(GK.C15776D r10) {
        /*
            int r1 = r10.g()
            long r2 = r10.B()
            long r4 = r10.x()
            GK.u r0 = r10.q()
            g6.n r6 = f(r0)
            GK.E r0 = r10.c()
            if (r0 == 0) goto L_0x0026
            WK.g r0 = r0.k3()
            if (r0 == 0) goto L_0x0026
            g6.r r0 = g6.C7882j.a(r0)
        L_0x0024:
            r7 = r0
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0024
        L_0x0028:
            g6.q r9 = new g6.q
            r0 = r9
            r8 = r10
            r0.<init>(r1, r2, r4, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.g(GK.D):g6.q");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object h(g6.C7887o r7, dI.C17164e<? super GK.C15774B> r8) {
        /*
            boolean r0 = r8 instanceof j6.e.b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            j6.e$b r0 = (j6.e.b) r0
            int r1 = r0.f54059h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f54059h = r1
            goto L_0x0018
        L_0x0013:
            j6.e$b r0 = new j6.e$b
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.f54058g
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f54059h
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r4) goto L_0x003a
            java.lang.Object r7 = r0.f54057f
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r1 = r0.f54056e
            GK.B$a r1 = (GK.C15774B.a) r1
            java.lang.Object r2 = r0.f54055d
            GK.B$a r2 = (GK.C15774B.a) r2
            java.lang.Object r0 = r0.f54054c
            g6.o r0 = (g6.C7887o) r0
            XH.y.b(r8)
            goto L_0x0071
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            XH.y.b(r8)
            GK.B$a r8 = new GK.B$a
            r8.<init>()
            java.lang.String r2 = r7.d()
            r8.n(r2)
            java.lang.String r2 = r7.c()
            g6.p r5 = r7.a()
            if (r5 == 0) goto L_0x0081
            r0.f54054c = r7
            r0.f54055d = r8
            r0.f54056e = r8
            r0.f54057f = r2
            r0.f54059h = r4
            java.lang.Object r0 = d(r5, r0)
            if (r0 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r1 = r8
            r8 = r0
            r0 = r7
            r7 = r2
            r2 = r1
        L_0x0071:
            WK.h r8 = (WK.C16773h) r8
            if (r8 == 0) goto L_0x007c
            GK.C$a r5 = GK.C15775C.f134790a
            GK.C r3 = GK.C15775C.a.j(r5, r8, r3, r4, r3)
            goto L_0x0087
        L_0x007c:
            r8 = r1
            r6 = r0
            r0 = r7
            r7 = r6
            goto L_0x0083
        L_0x0081:
            r0 = r2
            r2 = r8
        L_0x0083:
            r1 = r8
            r6 = r0
            r0 = r7
            r7 = r6
        L_0x0087:
            r1.g(r7, r3)
            g6.n r7 = r0.b()
            GK.u r7 = e(r7)
            r2.f(r7)
            GK.B r7 = r2.b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.e.h(g6.o, dI.e):java.lang.Object");
    }
}
