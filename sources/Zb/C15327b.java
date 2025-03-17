package zB;

import BB.C12610a;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"LzB/b;", "", "LBB/a;", "endpoint", "<init>", "(LBB/a;)V", "", "LEB/c;", "a", "(LdI/e;)Ljava/lang/Object;", "", "countryCode", "languageCode", "b", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LBB/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zB.b  reason: case insensitive filesystem */
public final class C15327b {

    /* renamed from: a  reason: collision with root package name */
    private final C12610a f132358a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.datalayer.impl.StoreListRemoteDataSource", f = "StoreListRemoteDataSource.kt", l = {14}, m = "fetchStores")
    /* renamed from: zB.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f132359c;

        /* renamed from: d  reason: collision with root package name */
        Object f132360d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f132361e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C15327b f132362f;

        /* renamed from: g  reason: collision with root package name */
        int f132363g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15327b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f132362f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f132361e = obj;
            this.f132363g |= Integer.MIN_VALUE;
            return this.f132362f.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.datalayer.impl.StoreListRemoteDataSource", f = "StoreListRemoteDataSource.kt", l = {18}, m = "fetchStoresForMarket")
    /* renamed from: zB.b$b  reason: collision with other inner class name */
    static final class C3272b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f132364c;

        /* renamed from: d  reason: collision with root package name */
        Object f132365d;

        /* renamed from: e  reason: collision with root package name */
        Object f132366e;

        /* renamed from: f  reason: collision with root package name */
        Object f132367f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f132368g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C15327b f132369h;

        /* renamed from: i  reason: collision with root package name */
        int f132370i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3272b(C15327b bVar, C17164e<? super C3272b> eVar) {
            super(eVar);
            this.f132369h = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f132368g = obj;
            this.f132370i |= Integer.MIN_VALUE;
            return this.f132369h.b((String) null, (String) null, this);
        }
    }

    public C15327b(C12610a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f132358a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(dI.C17164e<? super java.util.List<EB.C12831c>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof zB.C15327b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            zB.b$a r0 = (zB.C15327b.a) r0
            int r1 = r0.f132363g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f132363g = r1
            goto L_0x0018
        L_0x0013:
            zB.b$a r0 = new zB.b$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f132361e
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f132363g
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f132360d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f132359c
            zB.b r6 = (zB.C15327b) r6
            XH.y.b(r1)
            goto L_0x004b
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            BB.a r1 = r5.f132358a
            r0.f132359c = r5
            r0.f132360d = r6
            r0.f132363g = r4
            java.lang.Object r1 = r1.b(r0)
            if (r1 != r2) goto L_0x004b
            return r2
        L_0x004b:
            com.ingka.ikea.store.datalayer.impl.network.model.StoreListResponseRemote r1 = (com.ingka.ikea.store.datalayer.impl.network.model.StoreListResponseRemote) r1
            java.util.List r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zB.C15327b.a(dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r6, java.lang.String r7, dI.C17164e<? super java.util.List<EB.C12831c>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zB.C15327b.C3272b
            if (r0 == 0) goto L_0x0013
            r0 = r8
            zB.b$b r0 = (zB.C15327b.C3272b) r0
            int r1 = r0.f132370i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f132370i = r1
            goto L_0x0018
        L_0x0013:
            zB.b$b r0 = new zB.b$b
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r1 = r0.f132368g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f132370i
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 != r4) goto L_0x0039
            java.lang.Object r6 = r0.f132367f
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f132366e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f132365d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f132364c
            zB.b r6 = (zB.C15327b) r6
            XH.y.b(r1)
            goto L_0x0057
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            XH.y.b(r1)
            BB.a r1 = r5.f132358a
            r0.f132364c = r5
            r0.f132365d = r6
            r0.f132366e = r7
            r0.f132367f = r8
            r0.f132370i = r4
            java.lang.Object r1 = r1.a(r6, r7, r0)
            if (r1 != r2) goto L_0x0057
            return r2
        L_0x0057:
            com.ingka.ikea.store.datalayer.impl.network.model.StoreListResponseRemote r1 = (com.ingka.ikea.store.datalayer.impl.network.model.StoreListResponseRemote) r1
            java.util.List r6 = r1.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zB.C15327b.b(java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }
}
