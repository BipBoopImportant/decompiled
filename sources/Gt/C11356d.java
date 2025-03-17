package gt;

import QL.x;
import XH.C16807N;
import dI.C17164e;
import jt.C11453a;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kt.C11531a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgt/d;", "", "Lkt/a;", "secureEndpoint", "Lgt/a;", "registrationRequestMapper", "<init>", "(Lkt/a;Lgt/a;)V", "", "storeId", "", "Ljt/b;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "eventId", "timeslotId", "Ljt/a;", "registrationRequest", "LQL/x;", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljt/a;LdI/e;)Ljava/lang/Object;", "Lkt/a;", "Lgt/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gt.d  reason: case insensitive filesystem */
public final class C11356d {

    /* renamed from: a  reason: collision with root package name */
    private final C11531a f97983a;

    /* renamed from: b  reason: collision with root package name */
    private final C11353a f97984b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.instore.datalayer.storeevents.StoreEventsRemoteDataSource", f = "StoreEventsRemoteDataSource.kt", l = {21}, m = "getStoreEvents")
    /* renamed from: gt.d$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f97985c;

        /* renamed from: d  reason: collision with root package name */
        Object f97986d;

        /* renamed from: e  reason: collision with root package name */
        Object f97987e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f97988f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11356d f97989g;

        /* renamed from: h  reason: collision with root package name */
        int f97990h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11356d dVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f97989g = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f97988f = obj;
            this.f97990h |= Integer.MIN_VALUE;
            return this.f97989g.a((String) null, this);
        }
    }

    public C11356d(C11531a aVar, C11353a aVar2) {
        C17542s.j(aVar, "secureEndpoint");
        C17542s.j(aVar2, "registrationRequestMapper");
        this.f97983a = aVar;
        this.f97984b = aVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e A[LOOP:0: B:16:0x0068->B:18:0x006e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.String r6, dI.C17164e<? super java.util.List<jt.b>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof gt.C11356d.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            gt.d$a r0 = (gt.C11356d.a) r0
            int r1 = r0.f97990h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f97990h = r1
            goto L_0x0018
        L_0x0013:
            gt.d$a r0 = new gt.d$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f97988f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f97990h
            r4 = 1
            if (r3 == 0) goto L_0x003d
            if (r3 != r4) goto L_0x0035
            java.lang.Object r6 = r0.f97987e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f97986d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f97985c
            gt.d r6 = (gt.C11356d) r6
            XH.y.b(r1)
            goto L_0x0051
        L_0x0035:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003d:
            XH.y.b(r1)
            kt.a r1 = r5.f97983a
            r0.f97985c = r5
            r0.f97986d = r6
            r0.f97987e = r7
            r0.f97990h = r4
            java.lang.Object r1 = r1.a(r6, r0)
            if (r1 != r2) goto L_0x0051
            return r2
        L_0x0051:
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventDetailsRemote r1 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventDetailsRemote) r1
            java.util.List r6 = r1.b()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = YH.C16877v.y(r6, r0)
            r7.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L_0x0068:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x007c
            java.lang.Object r0 = r6.next()
            com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote r0 = (com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventRemote) r0
            jt.b r0 = r0.d()
            r7.add(r0)
            goto L_0x0068
        L_0x007c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gt.C11356d.a(java.lang.String, dI.e):java.lang.Object");
    }

    public final Object b(String str, String str2, C11453a aVar, C17164e<? super x<C16807N>> eVar) {
        return this.f97983a.b(str, str2, this.f97984b.a(aVar), eVar);
    }
}
