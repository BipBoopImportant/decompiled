package Kv;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import o1.C5667g;
import o1.C5668h;
import p0.C5685c;
import z1.C6271a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0014H@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0014H@¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001a"}, d2 = {"LKv/e;", "Lz1/a;", "Lp0/c;", "LKv/d;", "draggableState", "<init>", "(Lp0/c;)V", "state", "", "a", "(LKv/d;)Z", "Lo1/g;", "available", "Lz1/e;", "source", "C1", "(JI)J", "consumed", "N0", "(JJI)J", "Lc2/y;", "E1", "(JLdI/e;)Ljava/lang/Object;", "g0", "(JJLdI/e;)Ljava/lang/Object;", "Lp0/c;", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements C6271a {

    /* renamed from: a  reason: collision with root package name */
    private final C5685c<d> f37961a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.membership.impl.compose.member.scaffold.DispatchingScrollConnection", f = "DispatchingScrollConnection.kt", l = {69}, m = "onPostFling-RZ2iAVY")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f37962c;

        /* renamed from: d  reason: collision with root package name */
        Object f37963d;

        /* renamed from: e  reason: collision with root package name */
        long f37964e;

        /* renamed from: f  reason: collision with root package name */
        long f37965f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f37966g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f37967h;

        /* renamed from: i  reason: collision with root package name */
        int f37968i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(e eVar, C17164e<? super a> eVar2) {
            super(eVar2);
            this.f37967h = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f37966g = obj;
            this.f37968i |= Integer.MIN_VALUE;
            return this.f37967h.g0(0, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.membership.impl.compose.member.scaffold.DispatchingScrollConnection", f = "DispatchingScrollConnection.kt", l = {56}, m = "onPreFling-QWom1Mo")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f37969c;

        /* renamed from: d  reason: collision with root package name */
        Object f37970d;

        /* renamed from: e  reason: collision with root package name */
        long f37971e;

        /* renamed from: f  reason: collision with root package name */
        boolean f37972f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f37973g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ e f37974h;

        /* renamed from: i  reason: collision with root package name */
        int f37975i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, C17164e<? super b> eVar2) {
            super(eVar2);
            this.f37974h = eVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f37973g = obj;
            this.f37975i |= Integer.MIN_VALUE;
            return this.f37974h.E1(0, this);
        }
    }

    public e(C5685c<d> cVar) {
        C17542s.j(cVar, "draggableState");
        this.f37961a = cVar;
    }

    private final boolean a(d dVar) {
        C5685c<d> cVar = this.f37961a;
        return (cVar.u() == dVar && cVar.u() == cVar.w()) || (cVar.w() == dVar && Zv.a.d(cVar));
    }

    public long C1(long j10, int i10) {
        return C5667g.n(j10) < 0.0f ? C5668h.a(0.0f, this.f37961a.m(C5667g.n(j10))) : C5667g.f26701b.c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object E1(long r8, dI.C17164e<? super c2.y> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof Kv.e.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Kv.e$b r0 = (Kv.e.b) r0
            int r1 = r0.f37975i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f37975i = r1
            goto L_0x0018
        L_0x0013:
            Kv.e$b r0 = new Kv.e$b
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f37973g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f37975i
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x003a
            if (r3 != r5) goto L_0x0032
            java.lang.Object r8 = r0.f37970d
            dI.e r8 = (dI.C17164e) r8
            java.lang.Object r8 = r0.f37969c
            Kv.e r8 = (Kv.e) r8
            XH.y.b(r1)
            goto L_0x0064
        L_0x0032:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003a:
            XH.y.b(r1)
            Kv.d r1 = Kv.d.Floating
            boolean r1 = r7.a(r1)
            float r3 = c2.y.i(r8)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x006f
            if (r1 == 0) goto L_0x006f
            p0.c<Kv.d> r3 = r7.f37961a
            float r6 = c2.y.i(r8)
            r0.f37969c = r7
            r0.f37970d = r10
            r0.f37971e = r8
            r0.f37972f = r1
            r0.f37975i = r5
            java.lang.Object r1 = r3.H(r6, r0)
            if (r1 != r2) goto L_0x0064
            return r2
        L_0x0064:
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            long r8 = c2.z.a(r4, r8)
            goto L_0x0075
        L_0x006f:
            c2.y$a r8 = c2.y.f23066b
            long r8 = r8.a()
        L_0x0075:
            c2.y r8 = c2.y.b(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Kv.e.E1(long, dI.e):java.lang.Object");
    }

    public long N0(long j10, long j11, int i10) {
        return C5668h.a(0.0f, this.f37961a.m(C5667g.n(j11)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object g0(long r6, long r8, dI.C17164e<? super c2.y> r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof Kv.e.a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            Kv.e$a r0 = (Kv.e.a) r0
            int r1 = r0.f37968i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f37968i = r1
            goto L_0x0018
        L_0x0013:
            Kv.e$a r0 = new Kv.e$a
            r0.<init>(r5, r10)
        L_0x0018:
            java.lang.Object r1 = r0.f37966g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f37968i
            r4 = 1
            if (r3 == 0) goto L_0x0039
            if (r3 != r4) goto L_0x0031
            java.lang.Object r6 = r0.f37963d
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f37962c
            Kv.e r6 = (Kv.e) r6
            XH.y.b(r1)
            goto L_0x0053
        L_0x0031:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0039:
            XH.y.b(r1)
            p0.c<Kv.d> r1 = r5.f37961a
            float r3 = c2.y.i(r8)
            r0.f37962c = r5
            r0.f37963d = r10
            r0.f37964e = r6
            r0.f37965f = r8
            r0.f37968i = r4
            java.lang.Object r1 = r1.H(r3, r0)
            if (r1 != r2) goto L_0x0053
            return r2
        L_0x0053:
            java.lang.Number r1 = (java.lang.Number) r1
            float r6 = r1.floatValue()
            r7 = 0
            long r6 = c2.z.a(r7, r6)
            c2.y r6 = c2.y.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Kv.e.g0(long, long, dI.e):java.lang.Object");
    }
}
