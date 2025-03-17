package lu;

import dI.C17164e;
import ju.C11454a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import nt.C11674a;
import qu.C11817a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Llu/e;", "Llu/d;", "Lnt/a;", "storeModeLocalDataSource", "Lju/a;", "storeModeCleanup", "Lqu/a;", "storeModeAnalytics", "<init>", "(Lnt/a;Lju/a;Lqu/a;)V", "", "nearbyStoreId", "LXH/N;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lnt/a;", "b", "Lju/a;", "c", "Lqu/a;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lu.e  reason: case insensitive filesystem */
public final class C11572e implements C11571d {

    /* renamed from: a  reason: collision with root package name */
    private final C11674a f99510a;

    /* renamed from: b  reason: collision with root package name */
    private final C11454a f99511b;

    /* renamed from: c  reason: collision with root package name */
    private final C11817a f99512c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.impl.storemode.usecase.EnableStoreModeUseCaseImpl", f = "EnableStoreModeUseCase.kt", l = {30}, m = "invoke")
    /* renamed from: lu.e$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f99513c;

        /* renamed from: d  reason: collision with root package name */
        Object f99514d;

        /* renamed from: e  reason: collision with root package name */
        Object f99515e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f99516f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11572e f99517g;

        /* renamed from: h  reason: collision with root package name */
        int f99518h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11572e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f99517g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f99516f = obj;
            this.f99518h |= Integer.MIN_VALUE;
            return this.f99517g.a((String) null, this);
        }
    }

    public C11572e(C11674a aVar, C11454a aVar2, C11817a aVar3) {
        C17542s.j(aVar, "storeModeLocalDataSource");
        C17542s.j(aVar2, "storeModeCleanup");
        C17542s.j(aVar3, "storeModeAnalytics");
        this.f99510a = aVar;
        this.f99511b = aVar2;
        this.f99512c = aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lu.C11572e.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            lu.e$a r0 = (lu.C11572e.a) r0
            int r1 = r0.f99518h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f99518h = r1
            goto L_0x0018
        L_0x0013:
            lu.e$a r0 = new lu.e$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f99516f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f99518h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f99515e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f99514d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f99513c
            lu.e r6 = (lu.C11572e) r6
            XH.y.b(r1)
            goto L_0x0057
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            qu.a r1 = r5.f99512c
            r1.e(r6)
            nt.a r1 = r5.f99510a
            r0.f99513c = r5
            r0.f99514d = r6
            r0.f99515e = r7
            r0.f99518h = r4
            java.lang.Object r6 = r1.d(r4, r0)
            if (r6 != r2) goto L_0x0056
            return r2
        L_0x0056:
            r6 = r5
        L_0x0057:
            ju.a r6 = r6.f99511b
            r6.a()
            XH.N r6 = XH.C16807N.f139792a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lu.C11572e.a(java.lang.String, dI.e):java.lang.Object");
    }
}
