package JB;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LJB/b;", "", "LJB/a;", "endpoint", "<init>", "(LJB/a;)V", "", "storeId", "LGB/f;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LGB/e;", "a", "LJB/a;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: JB.b  reason: case insensitive filesystem */
public final class C13063b {

    /* renamed from: a  reason: collision with root package name */
    private final C13062a f111174a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.impl.data.PopularTimesRemoteDataSource", f = "PopularTimesRemoteDataSource.kt", l = {17}, m = "getPopularTimesLive")
    /* renamed from: JB.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111175c;

        /* renamed from: d  reason: collision with root package name */
        Object f111176d;

        /* renamed from: e  reason: collision with root package name */
        Object f111177e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f111178f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13063b f111179g;

        /* renamed from: h  reason: collision with root package name */
        int f111180h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C13063b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f111179g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111178f = obj;
            this.f111180h |= Integer.MIN_VALUE;
            return this.f111179g.a((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.impl.data.PopularTimesRemoteDataSource", f = "PopularTimesRemoteDataSource.kt", l = {14}, m = "getPopularTimesTrend")
    /* renamed from: JB.b$b  reason: collision with other inner class name */
    static final class C2694b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f111181c;

        /* renamed from: d  reason: collision with root package name */
        Object f111182d;

        /* renamed from: e  reason: collision with root package name */
        Object f111183e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f111184f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C13063b f111185g;

        /* renamed from: h  reason: collision with root package name */
        int f111186h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2694b(C13063b bVar, C17164e<? super C2694b> eVar) {
            super(eVar);
            this.f111185g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f111184f = obj;
            this.f111186h |= Integer.MIN_VALUE;
            return this.f111185g.b((String) null, this);
        }
    }

    public C13063b(C13062a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f111174a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, dI.C17164e<? super GB.e> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof JB.C13063b.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            JB.b$a r0 = (JB.C13063b.a) r0
            int r1 = r0.f111180h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111180h = r1
            goto L_0x0018
        L_0x0013:
            JB.b$a r0 = new JB.b$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f111178f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111180h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f111177e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f111176d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f111175c
            JB.b r6 = (JB.C13063b) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            JB.a r1 = r5.f111174a
            r0.f111175c = r5
            r0.f111176d = r6
            r0.f111177e = r7
            r0.f111180h = r4
            java.lang.Object r1 = r1.b(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.store.impl.data.remotemodel.PopularTimesLiveRemote r1 = (com.ingka.ikea.store.impl.data.remotemodel.PopularTimesLiveRemote) r1
            GB.e r6 = r1.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: JB.C13063b.a(java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r6, dI.C17164e<? super GB.f> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof JB.C13063b.C2694b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            JB.b$b r0 = (JB.C13063b.C2694b) r0
            int r1 = r0.f111186h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f111186h = r1
            goto L_0x0018
        L_0x0013:
            JB.b$b r0 = new JB.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f111184f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f111186h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f111183e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f111182d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f111181c
            JB.b r6 = (JB.C13063b) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            JB.a r1 = r5.f111174a
            r0.f111181c = r5
            r0.f111182d = r6
            r0.f111183e = r7
            r0.f111186h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.store.impl.data.remotemodel.PopularTimesTrendRemote r1 = (com.ingka.ikea.store.impl.data.remotemodel.PopularTimesTrendRemote) r1
            GB.f r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: JB.C13063b.b(java.lang.String, dI.e):java.lang.Object");
    }
}
