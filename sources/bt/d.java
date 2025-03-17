package bt;

import dI.C17164e;
import et.C11261a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Lbt/d;", "", "Let/a;", "endpoint", "<init>", "(Let/a;)V", "", "storeId", "Ldt/b;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Let/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final C11261a f90692a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.datalayer.foodmobile.FoodMobileRemoteDataSource", f = "FoodMobileRemoteDataSource.kt", l = {14}, m = "fetchFoodMobileDetails")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f90693c;

        /* renamed from: d  reason: collision with root package name */
        Object f90694d;

        /* renamed from: e  reason: collision with root package name */
        Object f90695e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f90696f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f90697g;

        /* renamed from: h  reason: collision with root package name */
        int f90698h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f90697g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f90696f = obj;
            this.f90698h |= Integer.MIN_VALUE;
            return this.f90697g.a((String) null, this);
        }
    }

    public d(C11261a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f90692a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, dI.C17164e<? super dt.b> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof bt.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            bt.d$a r0 = (bt.d.a) r0
            int r1 = r0.f90698h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90698h = r1
            goto L_0x0018
        L_0x0013:
            bt.d$a r0 = new bt.d$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f90696f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f90698h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f90695e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f90694d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f90693c
            bt.d r6 = (bt.d) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            et.a r1 = r5.f90692a
            r0.f90693c = r5
            r0.f90694d = r6
            r0.f90695e = r7
            r0.f90698h = r4
            java.lang.Object r1 = r1.b(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote r1 = (com.ingka.ikea.instore.datalayer.foodmobile.network.model.FoodMobileDetailsRemote) r1
            dt.b r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bt.d.a(java.lang.String, dI.e):java.lang.Object");
    }
}
