package Tz;

import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTz/b;", "LTz/a;", "LUz/a;", "endpoint", "LVz/b;", "responseMapper", "<init>", "(LUz/a;LVz/b;)V", "LXH/x;", "LQz/a;", "a", "(LdI/e;)Ljava/lang/Object;", "LUz/a;", "b", "LVz/b;", "seasonability-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Uz.a f116981a;

    /* renamed from: b  reason: collision with root package name */
    private final Vz.b f116982b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.seasonability.impl.data.datasource.PromoImageRemoteDataSourceImpl", f = "PromoImageRemoteSource.kt", l = {23}, m = "fetchPromoImage-IoAF18A")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f116983c;

        /* renamed from: d  reason: collision with root package name */
        Object f116984d;

        /* renamed from: e  reason: collision with root package name */
        Object f116985e;

        /* renamed from: f  reason: collision with root package name */
        Object f116986f;

        /* renamed from: g  reason: collision with root package name */
        int f116987g;

        /* renamed from: h  reason: collision with root package name */
        int f116988h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f116989i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ b f116990j;

        /* renamed from: k  reason: collision with root package name */
        int f116991k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f116990j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f116989i = obj;
            this.f116991k |= Integer.MIN_VALUE;
            Object a10 = this.f116990j.a(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public b(Uz.a aVar, Vz.b bVar) {
        C17542s.j(aVar, "endpoint");
        C17542s.j(bVar, "responseMapper");
        this.f116981a = aVar;
        this.f116982b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.x<Qz.a>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Tz.b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            Tz.b$a r0 = (Tz.b.a) r0
            int r1 = r0.f116991k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f116991k = r1
            goto L_0x0018
        L_0x0013:
            Tz.b$a r0 = new Tz.b$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f116989i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f116991k
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f116986f
            Tz.b r6 = (Tz.b) r6
            java.lang.Object r2 = r0.f116985e
            Tz.b r2 = (Tz.b) r2
            java.lang.Object r2 = r0.f116984d
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r0 = r0.f116983c
            Tz.b r0 = (Tz.b) r0
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0063
        L_0x0039:
            r6 = move-exception
            goto L_0x0070
        L_0x003b:
            r6 = move-exception
            goto L_0x007b
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            Uz.a r1 = r5.f116981a     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f116983c = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f116984d = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f116985e = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f116986f = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6 = 0
            r0.f116987g = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f116988h = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f116991k = r4     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r1 = r1.a(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            r6 = r5
        L_0x0063:
            com.ingka.ikea.seasonability.impl.data.models.remote.PromoMediaItemsRemote r1 = (com.ingka.ikea.seasonability.impl.data.models.remote.PromoMediaItemsRemote) r1     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            Vz.b r6 = r6.f116982b     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            Qz.a r6 = r6.a(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x007a
        L_0x0070:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x007a:
            return r6
        L_0x007b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Tz.b.a(dI.e):java.lang.Object");
    }
}
