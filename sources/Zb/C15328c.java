package zB;

import EB.C12831c;
import FB.C12863d;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LzB/c;", "LFB/d;", "LzB/b;", "storeListRemoteDataSource", "<init>", "(LzB/b;)V", "", "LEB/c;", "c", "(LdI/e;)Ljava/lang/Object;", "", "storeId", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "countryCode", "languageCode", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LzB/b;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zB.c  reason: case insensitive filesystem */
public final class C15328c implements C12863d {

    /* renamed from: a  reason: collision with root package name */
    private final C15327b f132371a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.datalayer.impl.StoreRepositoryImpl", f = "StoreRepositoryImpl.kt", l = {22}, m = "getStore")
    /* renamed from: zB.c$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f132372c;

        /* renamed from: d  reason: collision with root package name */
        Object f132373d;

        /* renamed from: e  reason: collision with root package name */
        Object f132374e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f132375f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C15328c f132376g;

        /* renamed from: h  reason: collision with root package name */
        int f132377h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15328c cVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f132376g = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f132375f = obj;
            this.f132377h |= Integer.MIN_VALUE;
            return this.f132376g.b((String) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.datalayer.impl.StoreRepositoryImpl", f = "StoreRepositoryImpl.kt", l = {30}, m = "getStoreForMarket")
    /* renamed from: zB.c$b */
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f132378c;

        /* renamed from: d  reason: collision with root package name */
        Object f132379d;

        /* renamed from: e  reason: collision with root package name */
        Object f132380e;

        /* renamed from: f  reason: collision with root package name */
        Object f132381f;

        /* renamed from: g  reason: collision with root package name */
        Object f132382g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f132383h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C15328c f132384i;

        /* renamed from: j  reason: collision with root package name */
        int f132385j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C15328c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f132384i = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f132383h = obj;
            this.f132385j |= Integer.MIN_VALUE;
            return this.f132384i.a((String) null, (String) null, (String) null, this);
        }
    }

    public C15328c(C15327b bVar) {
        C17542s.j(bVar, "storeListRemoteDataSource");
        this.f132371a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(java.lang.String r6, java.lang.String r7, java.lang.String r8, dI.C17164e<? super EB.C12831c> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof zB.C15328c.b
            if (r0 == 0) goto L_0x0013
            r0 = r9
            zB.c$b r0 = (zB.C15328c.b) r0
            int r1 = r0.f132385j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f132385j = r1
            goto L_0x0018
        L_0x0013:
            zB.c$b r0 = new zB.c$b
            r0.<init>(r5, r9)
        L_0x0018:
            java.lang.Object r1 = r0.f132383h
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f132385j
            r4 = 1
            if (r3 == 0) goto L_0x0046
            if (r3 != r4) goto L_0x003e
            java.lang.Object r6 = r0.f132382g
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f132381f
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r6 = r0.f132380e
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f132379d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f132378c
            zB.c r6 = (zB.C15328c) r6
            XH.y.b(r1)
            goto L_0x005e
        L_0x003e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0046:
            XH.y.b(r1)
            zB.b r1 = r5.f132371a
            r0.f132378c = r5
            r0.f132379d = r6
            r0.f132380e = r7
            r0.f132381f = r8
            r0.f132382g = r9
            r0.f132385j = r4
            java.lang.Object r1 = r1.b(r6, r7, r0)
            if (r1 != r2) goto L_0x005e
            return r2
        L_0x005e:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r6 = r1.iterator()
        L_0x0064:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x007c
            java.lang.Object r7 = r6.next()
            r9 = r7
            EB.c r9 = (EB.C12831c) r9
            java.lang.String r9 = r9.g()
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r8)
            if (r9 == 0) goto L_0x0064
            goto L_0x007d
        L_0x007c:
            r7 = 0
        L_0x007d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zB.C15328c.a(java.lang.String, java.lang.String, java.lang.String, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object b(java.lang.String r6, dI.C17164e<? super EB.C12831c> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof zB.C15328c.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            zB.c$a r0 = (zB.C15328c.a) r0
            int r1 = r0.f132377h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f132377h = r1
            goto L_0x0018
        L_0x0013:
            zB.c$a r0 = new zB.c$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f132375f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f132377h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f132374e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f132373d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.f132372c
            zB.c r7 = (zB.C15328c) r7
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            zB.b r1 = r5.f132371a
            r0.f132372c = r5
            r0.f132373d = r6
            r0.f132374e = r7
            r0.f132377h = r4
            java.lang.Object r1 = r1.a(r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r7 = r1.iterator()
        L_0x0057:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r0 = r7.next()
            r1 = r0
            EB.c r1 = (EB.C12831c) r1
            java.lang.String r1 = r1.g()
            boolean r1 = kotlin.jvm.internal.C17542s.e(r1, r6)
            if (r1 == 0) goto L_0x0057
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zB.C15328c.b(java.lang.String, dI.e):java.lang.Object");
    }

    public Object c(C17164e<? super List<C12831c>> eVar) {
        return this.f132371a.a(eVar);
    }
}
