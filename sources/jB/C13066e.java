package JB;

import dI.C17164e;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LJB/e;", "", "LJB/d;", "endpoint", "<init>", "(LJB/d;)V", "", "storeId", "Ljava/time/LocalDate;", "date", "LGB/b;", "b", "(Ljava/lang/String;Ljava/time/LocalDate;LdI/e;)Ljava/lang/Object;", "LGB/h;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LJB/d;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JB.e  reason: case insensitive filesystem */
public final class C13066e {

    /* renamed from: a  reason: collision with root package name */
    private final C13065d f111188a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.impl.data.StoreDetailsRemoteDataSource", f = "StoreDetailsRemoteDataSource.kt", l = {18}, m = "fetchStoreDetails")
    /* renamed from: JB.e$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111189c;

        /* renamed from: d  reason: collision with root package name */
        Object f111190d;

        /* renamed from: e  reason: collision with root package name */
        Object f111191e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f111192f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13066e f111193g;

        /* renamed from: h  reason: collision with root package name */
        int f111194h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13066e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f111193g = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111192f = obj;
            this.f111194h |= Integer.MIN_VALUE;
            return this.f111193g.a((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.impl.data.StoreDetailsRemoteDataSource", f = "StoreDetailsRemoteDataSource.kt", l = {15}, m = "fetchStoreOpeningHours")
    /* renamed from: JB.e$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111195c;

        /* renamed from: d  reason: collision with root package name */
        Object f111196d;

        /* renamed from: e  reason: collision with root package name */
        Object f111197e;

        /* renamed from: f  reason: collision with root package name */
        Object f111198f;

        /* renamed from: g  reason: collision with root package name */
        Object f111199g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f111200h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C13066e f111201i;

        /* renamed from: j  reason: collision with root package name */
        int f111202j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13066e eVar, C17164e<? super b> eVar2) {
            super(eVar2);
            this.f111201i = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111200h = obj;
            this.f111202j |= Integer.MIN_VALUE;
            return this.f111201i.b((String) null, (LocalDate) null, this);
        }
    }

    public C13066e(C13065d dVar) {
        C17542s.j(dVar, "endpoint");
        this.f111188a = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, dI.C17164e<? super GB.h> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof JB.C13066e.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            JB.e$a r0 = (JB.C13066e.a) r0
            int r1 = r0.f111194h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111194h = r1
            goto L_0x0018
        L_0x0013:
            JB.e$a r0 = new JB.e$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f111192f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111194h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f111191e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f111190d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f111189c
            JB.e r6 = (JB.C13066e) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            JB.d r1 = r5.f111188a
            r0.f111189c = r5
            r0.f111190d = r6
            r0.f111191e = r7
            r0.f111194h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsResponseRemote r1 = (com.ingka.ikea.store.impl.data.remotemodel.StoreDetailsResponseRemote) r1
            GB.h r6 = r1.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: JB.C13066e.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r7, java.time.LocalDate r8, dI.C17164e<? super GB.C12917b> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof JB.C13066e.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            JB.e$b r0 = (JB.C13066e.b) r0
            int r1 = r0.f111202j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111202j = r1
            goto L_0x0018
        L_0x0013:
            JB.e$b r0 = new JB.e$b
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f111200h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111202j
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r7 = r0.f111199g
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f111198f
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f111197e
            java.time.LocalDate r7 = (java.time.LocalDate) r7
            java.lang.Object r7 = r0.f111196d
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r7 = r0.f111195c
            JB.e r7 = (JB.C13066e) r7
            XH.y.b(r1)
            goto L_0x0066
        L_0x003d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0045:
            XH.y.b(r1)
            JB.d r1 = r6.f111188a
            java.lang.String r3 = r8.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r3, r5)
            r0.f111195c = r6
            r0.f111196d = r7
            r0.f111197e = r8
            r0.f111198f = r9
            r0.f111199g = r3
            r0.f111202j = r4
            java.lang.Object r1 = r1.b(r7, r3, r0)
            if (r1 != r2) goto L_0x0066
            return r2
        L_0x0066:
            com.ingka.ikea.store.impl.data.remotemodel.StoreOpeningHoursRemote r1 = (com.ingka.ikea.store.impl.data.remotemodel.StoreOpeningHoursRemote) r1
            GB.b r7 = r1.b()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: JB.C13066e.b(java.lang.String, java.time.LocalDate, dI.e):java.lang.Object");
    }
}
