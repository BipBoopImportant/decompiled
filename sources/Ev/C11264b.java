package ev;

import XH.x;
import dI.C17164e;
import dv.C11242a;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lev/b;", "Lev/a;", "Ldv/a;", "endpoint", "<init>", "(Ldv/a;)V", "LXH/x;", "Lhv/b;", "a", "(LdI/e;)Ljava/lang/Object;", "Ldv/a;", "liveshopping-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ev.b  reason: case insensitive filesystem */
public final class C11264b implements C11263a {

    /* renamed from: a  reason: collision with root package name */
    private final C11242a f97259a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.liveshopping.impl.data.repo.LiveShoppingEntryPointRepositoryImpl", f = "LiveShoppingEntryPointRepositoryImpl.kt", l = {17}, m = "getLiveShoppingDiscoveryItem-IoAF18A")
    /* renamed from: ev.b$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f97260c;

        /* renamed from: d  reason: collision with root package name */
        Object f97261d;

        /* renamed from: e  reason: collision with root package name */
        Object f97262e;

        /* renamed from: f  reason: collision with root package name */
        Object f97263f;

        /* renamed from: g  reason: collision with root package name */
        int f97264g;

        /* renamed from: h  reason: collision with root package name */
        int f97265h;

        /* renamed from: i  reason: collision with root package name */
        /* synthetic */ Object f97266i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C11264b f97267j;

        /* renamed from: k  reason: collision with root package name */
        int f97268k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C11264b bVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f97267j = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f97266i = obj;
            this.f97268k |= Integer.MIN_VALUE;
            Object a10 = this.f97267j.a(this);
            return a10 == C17187b.f() ? a10 : x.a(a10);
        }
    }

    public C11264b(C11242a aVar) {
        C17542s.j(aVar, "endpoint");
        this.f97259a = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object a(dI.C17164e<? super XH.x<hv.C11386b>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ev.C11264b.a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            ev.b$a r0 = (ev.C11264b.a) r0
            int r1 = r0.f97268k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f97268k = r1
            goto L_0x0018
        L_0x0013:
            ev.b$a r0 = new ev.b$a
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r1 = r0.f97266i
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f97268k
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f97263f
            ev.b r6 = (ev.C11264b) r6
            java.lang.Object r6 = r0.f97262e
            ev.b r6 = (ev.C11264b) r6
            java.lang.Object r6 = r0.f97261d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f97260c
            ev.b r6 = (ev.C11264b) r6
            XH.y.b(r1)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0062
        L_0x0039:
            r6 = move-exception
            goto L_0x006d
        L_0x003b:
            r6 = move-exception
            goto L_0x0078
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            XH.x$a r1 = XH.x.f139812b     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            dv.a r1 = r5.f97259a     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f97260c = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f97261d = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f97262e = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f97263f = r5     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r6 = 0
            r0.f97264g = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f97265h = r6     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            r0.f97268k = r4     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r1 = r1.a(r0)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            if (r1 != r2) goto L_0x0062
            return r2
        L_0x0062:
            com.ingka.ikea.liveshopping.impl.data.network.model.LiveShoppingEntrypointRemote r1 = (com.ingka.ikea.liveshopping.impl.data.network.model.LiveShoppingEntrypointRemote) r1     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            hv.b r6 = r1.b()     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            java.lang.Object r6 = XH.x.b(r6)     // Catch:{ CancellationException -> 0x003b, all -> 0x0039 }
            goto L_0x0077
        L_0x006d:
            XH.x$a r0 = XH.x.f139812b
            java.lang.Object r6 = XH.y.a(r6)
            java.lang.Object r6 = XH.x.b(r6)
        L_0x0077:
            return r6
        L_0x0078:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ev.C11264b.a(dI.e):java.lang.Object");
    }
}
