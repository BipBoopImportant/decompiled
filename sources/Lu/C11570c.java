package lu;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import lu.C11569b;
import nt.C11674a;
import qu.C11817a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bHB¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Llu/c;", "Llu/b;", "Lnt/a;", "storeModeLocalDataSource", "Lqu/a;", "storeModeAnalytics", "<init>", "(Lnt/a;Lqu/a;)V", "Llu/b$a;", "source", "LXH/N;", "a", "(Llu/b$a;LdI/e;)Ljava/lang/Object;", "Lnt/a;", "b", "Lqu/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lu.c  reason: case insensitive filesystem */
public final class C11570c implements C11569b {

    /* renamed from: a  reason: collision with root package name */
    private final C11674a f99501a;

    /* renamed from: b  reason: collision with root package name */
    private final C11817a f99502b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.storemode.usecase.DisableStoreModeUseCaseImpl", f = "DisableStoreModeUseCase.kt", l = {51, 60}, m = "invoke")
    /* renamed from: lu.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f99503c;

        /* renamed from: d  reason: collision with root package name */
        Object f99504d;

        /* renamed from: e  reason: collision with root package name */
        Object f99505e;

        /* renamed from: f  reason: collision with root package name */
        Object f99506f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f99507g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11570c f99508h;

        /* renamed from: i  reason: collision with root package name */
        int f99509i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11570c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f99508h = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99507g = obj;
            this.f99509i |= Integer.MIN_VALUE;
            return this.f99508h.a((C11569b.a) null, this);
        }
    }

    public C11570c(C11674a aVar, C11817a aVar2) {
        C17542s.j(aVar, "storeModeLocalDataSource");
        C17542s.j(aVar2, "storeModeAnalytics");
        this.f99501a = aVar;
        this.f99502b = aVar2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: dI.e<? super XH.N>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(lu.C11569b.a r7, dI.C17164e<? super XH.C16807N> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof lu.C11570c.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            lu.c$a r0 = (lu.C11570c.a) r0
            int r1 = r0.f99509i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f99509i = r1
            goto L_0x0018
        L_0x0013:
            lu.c$a r0 = new lu.c$a
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f99507g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f99509i
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0055
            if (r3 == r5) goto L_0x0044
            if (r3 != r4) goto L_0x003c
            java.lang.Object r7 = r0.f99506f
            lu.b$a r7 = (lu.C11569b.a) r7
            java.lang.Object r7 = r0.f99505e
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f99504d
            lu.b$a r7 = (lu.C11569b.a) r7
            java.lang.Object r7 = r0.f99503c
            lu.c r7 = (lu.C11570c) r7
            XH.y.b(r1)
            goto L_0x00a6
        L_0x003c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0044:
            java.lang.Object r7 = r0.f99505e
            r8 = r7
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r7 = r0.f99504d
            lu.b$a r7 = (lu.C11569b.a) r7
            java.lang.Object r3 = r0.f99503c
            lu.c r3 = (lu.C11570c) r3
            XH.y.b(r1)
            goto L_0x006e
        L_0x0055:
            XH.y.b(r1)
            nt.a r1 = r6.f99501a
            TJ.g r1 = r1.c()
            r0.f99503c = r6
            r0.f99504d = r7
            r0.f99505e = r8
            r0.f99509i = r5
            java.lang.Object r1 = TJ.C16534i.B(r1, r0)
            if (r1 != r2) goto L_0x006d
            return r2
        L_0x006d:
            r3 = r6
        L_0x006e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x0079
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x0079:
            qu.a r1 = r3.f99502b
            boolean r5 = r7 instanceof lu.C11569b.a.c
            if (r5 == 0) goto L_0x0082
            qu.a$c r5 = qu.C11817a.c.BUTTON
            goto L_0x008f
        L_0x0082:
            boolean r5 = r7 instanceof lu.C11569b.a.C2278a
            if (r5 == 0) goto L_0x0089
            qu.a$c r5 = qu.C11817a.c.AUTOMATIC
            goto L_0x008f
        L_0x0089:
            boolean r5 = r7 instanceof lu.C11569b.a.C2279b
            if (r5 == 0) goto L_0x00a9
            qu.a$c r5 = qu.C11817a.c.CHANGED_STORE
        L_0x008f:
            r1.b(r5)
            nt.a r1 = r3.f99501a
            r0.f99503c = r3
            r0.f99504d = r7
            r0.f99505e = r8
            r0.f99506f = r7
            r0.f99509i = r4
            r7 = 0
            java.lang.Object r7 = r1.d(r7, r0)
            if (r7 != r2) goto L_0x00a6
            return r2
        L_0x00a6:
            XH.N r7 = XH.C16807N.f139792a
            return r7
        L_0x00a9:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.C11570c.a(lu.b$a, dI.e):java.lang.Object");
    }
}
