package Le;

import Je.b;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u0011"}, d2 = {"LLe/a;", "", "LMe/a;", "addressLookupRemoteDataSource", "<init>", "(LMe/a;)V", "", "searchString", "", "LJe/b;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "address", "Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "b", "(LJe/b;)Lcom/ingka/ikea/app/addresspicker/addresslookup/repo/PostalCodeAddress;", "LMe/a;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Me.a f61613a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.app.addresspicker.addresslookup.repo.AddressLookupRepository", f = "AddressLookupRepository.kt", l = {113}, m = "fetchAddresses")
    /* renamed from: Le.a$a  reason: collision with other inner class name */
    static final class C1025a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f61614c;

        /* renamed from: d  reason: collision with root package name */
        Object f61615d;

        /* renamed from: e  reason: collision with root package name */
        Object f61616e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f61617f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a f61618g;

        /* renamed from: h  reason: collision with root package name */
        int f61619h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1025a(a aVar, C17164e<? super C1025a> eVar) {
            super(eVar);
            this.f61618g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f61617f = obj;
            this.f61619h |= Integer.MIN_VALUE;
            return this.f61618g.a((String) null, this);
        }
    }

    public a(Me.a aVar) {
        C17542s.j(aVar, "addressLookupRemoteDataSource");
        this.f61613a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068 A[LOOP:0: B:16:0x0062->B:18:0x0068, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, dI.C17164e<? super java.util.List<? extends Je.b>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Le.a.C1025a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Le.a$a r0 = (Le.a.C1025a) r0
            int r1 = r0.f61619h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f61619h = r1
            goto L_0x0018
        L_0x0013:
            Le.a$a r0 = new Le.a$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f61617f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f61619h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f61616e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f61615d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f61614c
            Le.a r6 = (Le.a) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            Me.a r1 = r5.f61613a
            r0.f61614c = r5
            r0.f61615d = r6
            r0.f61616e = r7
            r0.f61619h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = YH.C16877v.y(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r7 = r1.iterator()
        L_0x0062:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r7.next()
            com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress r0 = (com.ingka.ikea.app.addresspicker.addresslookup.repo.PostalCodeAddress) r0
            Je.b$a r1 = new Je.b$a
            r1.<init>(r0)
            r6.add(r1)
            goto L_0x0062
        L_0x0077:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Le.a.a(java.lang.String, dI.e):java.lang.Object");
    }

    public final PostalCodeAddress b(b bVar) {
        C17542s.j(bVar, PlaceTypes.ADDRESS);
        return ((b.a) bVar).a();
    }
}
