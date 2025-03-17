package O0;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import m0.C5546i;
import m0.C5570z;
import nI.C17631a;
import o1.C5667g;
import z1.C6271a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001e\u001a\u00020\n8\u0016XD¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0012\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\u000e\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"LO0/M;", "LO0/g1;", "LO0/h1;", "state", "Lm0/i;", "", "snapAnimationSpec", "Lm0/z;", "flingAnimationSpec", "Lkotlin/Function0;", "", "canScroll", "<init>", "(LO0/h1;Lm0/i;Lm0/z;LnI/a;)V", "a", "LO0/h1;", "getState", "()LO0/h1;", "b", "Lm0/i;", "d", "()Lm0/i;", "c", "Lm0/z;", "()Lm0/z;", "LnI/a;", "e", "()LnI/a;", "Z", "()Z", "isPinned", "Lz1/a;", "f", "Lz1/a;", "()Lz1/a;", "setNestedScrollConnection", "(Lz1/a;)V", "nestedScrollConnection", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class M implements g1 {

    /* renamed from: a  reason: collision with root package name */
    private final h1 f9843a;

    /* renamed from: b  reason: collision with root package name */
    private final C5546i<Float> f9844b;

    /* renamed from: c  reason: collision with root package name */
    private final C5570z<Float> f9845c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<Boolean> f9846d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f9847e;

    /* renamed from: f  reason: collision with root package name */
    private C6271a f9848f = new a(this);

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"O0/M$a", "Lz1/a;", "Lo1/g;", "available", "Lz1/e;", "source", "C1", "(JI)J", "consumed", "N0", "(JJI)J", "Lc2/y;", "g0", "(JJLdI/e;)Ljava/lang/Object;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements C6271a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ M f9849a;

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", f = "AppBar.kt", l = {2386, 2388}, m = "onPostFling-RZ2iAVY")
        /* renamed from: O0.M$a$a  reason: collision with other inner class name */
        static final class C0145a extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f9850c;

            /* renamed from: d  reason: collision with root package name */
            long f9851d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f9852e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ a f9853f;

            /* renamed from: g  reason: collision with root package name */
            int f9854g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0145a(a aVar, C17164e<? super C0145a> eVar) {
                super(eVar);
                this.f9853f = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f9852e = obj;
                this.f9854g |= Integer.MIN_VALUE;
                return this.f9853f.g0(0, 0, this);
            }
        }

        a(M m10) {
            this.f9849a = m10;
        }

        public long C1(long j10, int i10) {
            if (!this.f9849a.e().invoke().booleanValue()) {
                return C5667g.f26701b.c();
            }
            float d10 = this.f9849a.getState().d();
            this.f9849a.getState().h(this.f9849a.getState().d() + C5667g.n(j10));
            return d10 == this.f9849a.getState().d() ? C5667g.f26701b.c() : C5667g.g(j10, 0.0f, 0.0f, 2, (Object) null);
        }

        public long N0(long j10, long j11, int i10) {
            if (!this.f9849a.e().invoke().booleanValue()) {
                return C5667g.f26701b.c();
            }
            h1 state = this.f9849a.getState();
            state.g(state.c() + C5667g.n(j10));
            if ((this.f9849a.getState().d() == 0.0f || this.f9849a.getState().d() == this.f9849a.getState().e()) && C5667g.n(j10) == 0.0f && C5667g.n(j11) > 0.0f) {
                this.f9849a.getState().g(0.0f);
            }
            this.f9849a.getState().h(this.f9849a.getState().d() + C5667g.n(j10));
            return C5667g.f26701b.c();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object g0(long r10, long r12, dI.C17164e<? super c2.y> r14) {
            /*
                r9 = this;
                boolean r0 = r14 instanceof O0.M.a.C0145a
                if (r0 == 0) goto L_0x0013
                r0 = r14
                O0.M$a$a r0 = (O0.M.a.C0145a) r0
                int r1 = r0.f9854g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f9854g = r1
                goto L_0x0018
            L_0x0013:
                O0.M$a$a r0 = new O0.M$a$a
                r0.<init>(r9, r14)
            L_0x0018:
                java.lang.Object r14 = r0.f9852e
                java.lang.Object r7 = eI.C17187b.f()
                int r1 = r0.f9854g
                r8 = 2
                r2 = 1
                if (r1 == 0) goto L_0x0040
                if (r1 == r2) goto L_0x0036
                if (r1 != r8) goto L_0x002e
                long r10 = r0.f9851d
                XH.y.b(r14)
                goto L_0x0080
            L_0x002e:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0036:
                long r12 = r0.f9851d
                java.lang.Object r10 = r0.f9850c
                O0.M$a r10 = (O0.M.a) r10
                XH.y.b(r14)
                goto L_0x0055
            L_0x0040:
                XH.y.b(r14)
                r0.f9850c = r9
                r0.f9851d = r12
                r0.f9854g = r2
                r1 = r9
                r2 = r10
                r4 = r12
                r6 = r0
                java.lang.Object r14 = super.g0(r2, r4, r6)
                if (r14 != r7) goto L_0x0054
                return r7
            L_0x0054:
                r10 = r9
            L_0x0055:
                c2.y r14 = (c2.y) r14
                long r1 = r14.o()
                O0.M r11 = r10.f9849a
                O0.h1 r11 = r11.getState()
                float r12 = c2.y.i(r12)
                O0.M r13 = r10.f9849a
                m0.z r13 = r13.c()
                O0.M r10 = r10.f9849a
                m0.i r10 = r10.d()
                r14 = 0
                r0.f9850c = r14
                r0.f9851d = r1
                r0.f9854g = r8
                java.lang.Object r14 = O0.C4724e.k(r11, r12, r13, r10, r0)
                if (r14 != r7) goto L_0x007f
                return r7
            L_0x007f:
                r10 = r1
            L_0x0080:
                c2.y r14 = (c2.y) r14
                long r12 = r14.o()
                long r10 = c2.y.l(r10, r12)
                c2.y r10 = c2.y.b(r10)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.M.a.g0(long, long, dI.e):java.lang.Object");
        }
    }

    public M(h1 h1Var, C5546i<Float> iVar, C5570z<Float> zVar, C17631a<Boolean> aVar) {
        this.f9843a = h1Var;
        this.f9844b = iVar;
        this.f9845c = zVar;
        this.f9846d = aVar;
    }

    public C6271a a() {
        return this.f9848f;
    }

    public boolean b() {
        return this.f9847e;
    }

    public C5570z<Float> c() {
        return this.f9845c;
    }

    public C5546i<Float> d() {
        return this.f9844b;
    }

    public final C17631a<Boolean> e() {
        return this.f9846d;
    }

    public h1 getState() {
        return this.f9843a;
    }
}
