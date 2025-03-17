package qH;

import AH.C15410a;
import AH.C15411b;
import AH.C15413d;
import AH.C15416g;
import BH.C15456a;
import BH.C15458c;
import JH.C15954a;
import JH.C15955b;
import OH.C16158a;
import QJ.Q;
import dI.C17164e;
import dI.C17168i;
import io.ktor.utils.io.g;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pH.C17746a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \"2\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B!\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\nJ\u0013\u0010\f\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR*\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0006@DX.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00168\u0006@DX.¢\u0006\u0012\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u001aR\u001a\u0010/\u001a\u00020+8\u0014XD¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b \u0010.R\u0014\u00103\u001a\u0002008VX\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106\u0002\u0004\n\u0002\b\u0019¨\u00068"}, d2 = {"LqH/b;", "LQJ/Q;", "LpH/a;", "client", "<init>", "(LpH/a;)V", "LAH/d;", "requestData", "LAH/g;", "responseData", "(LpH/a;LAH/d;LAH/g;)V", "Lio/ktor/utils/io/g;", "g", "(LdI/e;)Ljava/lang/Object;", "LOH/a;", "info", "", "a", "(LOH/a;LdI/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "LBH/c;", "response", "LXH/N;", "k", "(LBH/c;)V", "LpH/a;", "c", "()LpH/a;", "LAH/b;", "<set-?>", "b", "LAH/b;", "e", "()LAH/b;", "i", "(LAH/b;)V", "request", "LBH/c;", "f", "()LBH/c;", "j", "", "d", "Z", "()Z", "allowDoubleReceive", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "LJH/b;", "getAttributes", "()LJH/b;", "attributes", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: qH.b  reason: case insensitive filesystem */
public class C17777b implements Q {

    /* renamed from: e  reason: collision with root package name */
    public static final a f146438e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f146439f = AtomicIntegerFieldUpdater.newUpdater(C17777b.class, "received");

    /* renamed from: g  reason: collision with root package name */
    private static final C15954a<Object> f146440g = new C15954a<>("CustomResponse");

    /* renamed from: a  reason: collision with root package name */
    private final C17746a f146441a;

    /* renamed from: b  reason: collision with root package name */
    protected C15411b f146442b;

    /* renamed from: c  reason: collision with root package name */
    protected C15458c f146443c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f146444d;
    private volatile /* synthetic */ int received;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LqH/b$a;", "", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: qH.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "io.ktor.client.call.HttpClientCall", f = "HttpClientCall.kt", l = {86, 89}, m = "bodyNullable")
    /* renamed from: qH.b$b  reason: collision with other inner class name */
    static final class C4260b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f146445c;

        /* renamed from: d  reason: collision with root package name */
        Object f146446d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f146447e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17777b f146448f;

        /* renamed from: g  reason: collision with root package name */
        int f146449g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4260b(C17777b bVar, C17164e<? super C4260b> eVar) {
            super(eVar);
            this.f146448f = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f146447e = obj;
            this.f146449g |= Integer.MIN_VALUE;
            return this.f146448f.a((C16158a) null, this);
        }
    }

    public C17777b(C17746a aVar) {
        C17542s.j(aVar, "client");
        this.f146441a = aVar;
        this.received = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c8 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c9 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cc A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(OH.C16158a r6, dI.C17164e<java.lang.Object> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof qH.C17777b.C4260b
            if (r0 == 0) goto L_0x0013
            r0 = r7
            qH.b$b r0 = (qH.C17777b.C4260b) r0
            int r1 = r0.f146449g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f146449g = r1
            goto L_0x0018
        L_0x0013:
            qH.b$b r0 = new qH.b$b
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.f146447e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f146449g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            java.lang.Object r6 = r0.f146446d
            OH.a r6 = (OH.C16158a) r6
            java.lang.Object r0 = r0.f146445c
            qH.b r0 = (qH.C17777b) r0
            XH.y.b(r7)     // Catch:{ all -> 0x0035 }
            goto L_0x00ba
        L_0x0035:
            r6 = move-exception
            goto L_0x00f5
        L_0x0038:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0040:
            java.lang.Object r6 = r0.f146446d
            OH.a r6 = (OH.C16158a) r6
            java.lang.Object r2 = r0.f146445c
            qH.b r2 = (qH.C17777b) r2
            XH.y.b(r7)     // Catch:{ all -> 0x004c }
            goto L_0x00a1
        L_0x004c:
            r6 = move-exception
            r0 = r2
            goto L_0x00f5
        L_0x0050:
            XH.y.b(r7)
            BH.c r7 = r5.f()     // Catch:{ all -> 0x006d }
            uI.d r2 = r6.b()     // Catch:{ all -> 0x006d }
            boolean r7 = OH.b.b(r7, r2)     // Catch:{ all -> 0x006d }
            if (r7 == 0) goto L_0x0071
            BH.c r6 = r5.f()     // Catch:{ all -> 0x006d }
            BH.c r7 = r5.f()
            BH.C15460e.c(r7)
            return r6
        L_0x006d:
            r6 = move-exception
            r0 = r5
            goto L_0x00f5
        L_0x0071:
            boolean r7 = r5.b()     // Catch:{ all -> 0x006d }
            if (r7 != 0) goto L_0x0087
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = f146439f     // Catch:{ all -> 0x006d }
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r4)     // Catch:{ all -> 0x006d }
            if (r7 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            qH.a r6 = new qH.a     // Catch:{ all -> 0x006d }
            r6.<init>(r5)     // Catch:{ all -> 0x006d }
            throw r6     // Catch:{ all -> 0x006d }
        L_0x0087:
            JH.b r7 = r5.getAttributes()     // Catch:{ all -> 0x006d }
            JH.a<java.lang.Object> r2 = f146440g     // Catch:{ all -> 0x006d }
            java.lang.Object r7 = r7.e(r2)     // Catch:{ all -> 0x006d }
            if (r7 != 0) goto L_0x00a0
            r0.f146445c = r5     // Catch:{ all -> 0x006d }
            r0.f146446d = r6     // Catch:{ all -> 0x006d }
            r0.f146449g = r4     // Catch:{ all -> 0x006d }
            java.lang.Object r7 = r5.g(r0)     // Catch:{ all -> 0x006d }
            if (r7 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r2 = r5
        L_0x00a1:
            BH.d r4 = new BH.d     // Catch:{ all -> 0x004c }
            r4.<init>(r6, r7)     // Catch:{ all -> 0x004c }
            pH.a r7 = r2.f146441a     // Catch:{ all -> 0x004c }
            BH.f r7 = r7.l()     // Catch:{ all -> 0x004c }
            r0.f146445c = r2     // Catch:{ all -> 0x004c }
            r0.f146446d = r6     // Catch:{ all -> 0x004c }
            r0.f146449g = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r7 = r7.d(r2, r4, r0)     // Catch:{ all -> 0x004c }
            if (r7 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r0 = r2
        L_0x00ba:
            BH.d r7 = (BH.C15459d) r7     // Catch:{ all -> 0x0035 }
            java.lang.Object r7 = r7.c()     // Catch:{ all -> 0x0035 }
            FH.c r1 = FH.c.f134396a     // Catch:{ all -> 0x0035 }
            boolean r1 = kotlin.jvm.internal.C17542s.e(r7, r1)     // Catch:{ all -> 0x0035 }
            if (r1 != 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r7 = 0
        L_0x00ca:
            if (r7 == 0) goto L_0x00ed
            uI.d r1 = r6.b()     // Catch:{ all -> 0x0035 }
            boolean r1 = OH.b.b(r7, r1)     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x00d7
            goto L_0x00ed
        L_0x00d7:
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x0035 }
            uI.d r7 = kotlin.jvm.internal.P.b(r7)     // Catch:{ all -> 0x0035 }
            uI.d r6 = r6.b()     // Catch:{ all -> 0x0035 }
            qH.c r1 = new qH.c     // Catch:{ all -> 0x0035 }
            BH.c r2 = r0.f()     // Catch:{ all -> 0x0035 }
            r1.<init>(r2, r7, r6)     // Catch:{ all -> 0x0035 }
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x00ed:
            BH.c r6 = r0.f()
            BH.C15460e.c(r6)
            return r7
        L_0x00f5:
            BH.c r7 = r0.f()     // Catch:{ all -> 0x00ff }
            java.lang.String r1 = "Receive failed"
            QJ.S.c(r7, r1, r6)     // Catch:{ all -> 0x00ff }
            throw r6     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r6 = move-exception
            BH.c r7 = r0.f()
            BH.C15460e.c(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: qH.C17777b.a(OH.a, dI.e):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public boolean b() {
        return this.f146444d;
    }

    public final C17746a c() {
        return this.f146441a;
    }

    public final C15411b e() {
        C15411b bVar = this.f146442b;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("request");
        return null;
    }

    public final C15458c f() {
        C15458c cVar = this.f146443c;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("response");
        return null;
    }

    /* access modifiers changed from: protected */
    public Object g(C17164e<? super g> eVar) {
        return f().b();
    }

    public final C15955b getAttributes() {
        return e().getAttributes();
    }

    public C17168i getCoroutineContext() {
        return f().getCoroutineContext();
    }

    /* access modifiers changed from: protected */
    public final void i(C15411b bVar) {
        C17542s.j(bVar, "<set-?>");
        this.f146442b = bVar;
    }

    /* access modifiers changed from: protected */
    public final void j(C15458c cVar) {
        C17542s.j(cVar, "<set-?>");
        this.f146443c = cVar;
    }

    public final void k(C15458c cVar) {
        C17542s.j(cVar, "response");
        j(cVar);
    }

    public String toString() {
        return "HttpClientCall[" + e().getUrl() + ", " + f().f() + ']';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C17777b(C17746a aVar, C15413d dVar, C15416g gVar) {
        this(aVar);
        C17542s.j(aVar, "client");
        C17542s.j(dVar, "requestData");
        C17542s.j(gVar, "responseData");
        i(new C15410a(this, dVar));
        j(new C15456a(this, gVar));
        if (!(gVar.a() instanceof g)) {
            getAttributes().c(f146440g, gVar.a());
        }
    }
}
