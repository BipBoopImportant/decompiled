package M0;

import QJ.F0;
import QJ.Q;
import QJ.T;
import U0.A1;
import U0.C4892n0;
import U0.C4899r0;
import U0.D0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import m0.C5546i;
import m0.t0;
import n0.C5589L;
import n0.C5591N;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tI.C17978n;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B5\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010%\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0012R+\u0010,\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u00188B@BX\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010\u001bR+\u00100\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010\u0012\"\u0004\b/\u0010\u001dR+\u00103\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010-\u001a\u0004\b1\u0010\u0012\"\u0004\b2\u0010\u001dR+\u00106\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0002¢\u0006\u0012\n\u0004\b$\u0010-\u001a\u0004\b4\u0010\u0012\"\u0004\b5\u0010\u001dR+\u00109\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b8B@BX\u0002¢\u0006\u0012\n\u0004\b1\u0010-\u001a\u0004\b7\u0010\u0012\"\u0004\b8\u0010\u001dR\u0014\u0010=\u001a\u00020:8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0011\u0010?\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00188@X\u0004¢\u0006\u0006\u001a\u0004\b@\u0010*R\u0014\u0010A\u001a\u00020\b8@X\u0004¢\u0006\u0006\u001a\u0004\b;\u0010\u0012R\u0014\u0010\n\u001a\u00020\b8@X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\u0012¨\u0006C"}, d2 = {"LM0/g;", "", "LQJ/Q;", "animationScope", "LU0/A1;", "Lkotlin/Function0;", "LXH/N;", "onRefreshState", "", "refreshingOffset", "threshold", "<init>", "(LQJ/Q;LU0/A1;FF)V", "offset", "LQJ/F0;", "e", "(F)LQJ/F0;", "f", "()F", "pullDelta", "q", "(F)F", "velocity", "r", "", "refreshing", "t", "(Z)V", "v", "(F)V", "u", "a", "LQJ/Q;", "b", "LU0/A1;", "c", "g", "adjustedDistancePulled", "<set-?>", "d", "LU0/r0;", "n", "()Z", "x", "_refreshing", "LU0/n0;", "m", "w", "_position", "h", "s", "distancePulled", "p", "z", "_threshold", "o", "y", "_refreshingOffset", "Ln0/N;", "i", "Ln0/N;", "mutatorMutex", "j", "progress", "k", "position", "l", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class g {

    /* renamed from: j  reason: collision with root package name */
    public static final int f9115j = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Q f9116a;

    /* renamed from: b  reason: collision with root package name */
    private final A1<C17631a<C16807N>> f9117b;

    /* renamed from: c  reason: collision with root package name */
    private final A1 f9118c = p1.e(new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final C4899r0 f9119d = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);

    /* renamed from: e  reason: collision with root package name */
    private final C4892n0 f9120e = D0.a(0.0f);

    /* renamed from: f  reason: collision with root package name */
    private final C4892n0 f9121f = D0.a(0.0f);

    /* renamed from: g  reason: collision with root package name */
    private final C4892n0 f9122g;

    /* renamed from: h  reason: collision with root package name */
    private final C4892n0 f9123h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public final C5591N f9124i;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f9125c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f9125c = gVar;
        }

        /* renamed from: b */
        public final Float invoke() {
            return Float.valueOf(this.f9125c.h() * 0.5f);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1", f = "PullRefreshState.kt", l = {187}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9126c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g f9127d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f9128e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.compose.material.pullrefresh.PullRefreshState$animateIndicatorTo$1$1", f = "PullRefreshState.kt", l = {188}, m = "invokeSuspend")
        static final class a extends l implements C17642l<C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f9129c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g f9130d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ float f9131e;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "value", "<anonymous parameter 1>", "LXH/N;", "a", "(FF)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: M0.g$b$a$a  reason: collision with other inner class name */
            static final class C0129a extends C17544u implements p<Float, Float, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ g f9132c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0129a(g gVar) {
                    super(2);
                    this.f9132c = gVar;
                }

                public final void a(float f10, float f11) {
                    this.f9132c.w(f10);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g gVar, float f10, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f9130d = gVar;
                this.f9131e = f10;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f9130d, this.f9131e, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super C16807N> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f9129c;
                if (i10 == 0) {
                    y.b(obj);
                    float c10 = this.f9130d.m();
                    float f11 = this.f9131e;
                    C0129a aVar = new C0129a(this.f9130d);
                    this.f9129c = 1;
                    if (t0.e(c10, f11, 0.0f, (C5546i) null, aVar, this, 12, (Object) null) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar, float f10, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f9127d = gVar;
            this.f9128e = f10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f9127d, this.f9128e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f9126c;
            if (i10 == 0) {
                y.b(obj);
                C5591N b10 = this.f9127d.f9124i;
                a aVar = new a(this.f9127d, this.f9128e, (C17164e<? super a>) null);
                this.f9126c = 1;
                if (C5591N.e(b10, (C5589L) null, aVar, this, 1, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public g(Q q10, A1<? extends C17631a<C16807N>> a12, float f10, float f11) {
        this.f9116a = q10;
        this.f9117b = a12;
        this.f9122g = D0.a(f11);
        this.f9123h = D0.a(f10);
        this.f9124i = new C5591N();
    }

    private final F0 e(float f10) {
        return C16314k.d(this.f9116a, (C17168i) null, (T) null, new b(this, f10, (C17164e<? super b>) null), 3, (Object) null);
    }

    private final float f() {
        if (g() <= l()) {
            return g();
        }
        float abs = Math.abs(j()) - 1.0f;
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (abs > 2.0f) {
            abs = 2.0f;
        }
        return l() + (l() * (abs - (((float) Math.pow((double) abs, (double) 2)) / ((float) 4))));
    }

    private final float g() {
        return ((Number) this.f9118c.getValue()).floatValue();
    }

    /* access modifiers changed from: private */
    public final float h() {
        return this.f9121f.a();
    }

    /* access modifiers changed from: private */
    public final float m() {
        return this.f9120e.a();
    }

    private final boolean n() {
        return ((Boolean) this.f9119d.getValue()).booleanValue();
    }

    private final float o() {
        return this.f9123h.a();
    }

    private final float p() {
        return this.f9122g.a();
    }

    private final void s(float f10) {
        this.f9121f.n(f10);
    }

    /* access modifiers changed from: private */
    public final void w(float f10) {
        this.f9120e.n(f10);
    }

    private final void x(boolean z10) {
        this.f9119d.setValue(Boolean.valueOf(z10));
    }

    private final void y(float f10) {
        this.f9123h.n(f10);
    }

    private final void z(float f10) {
        this.f9122g.n(f10);
    }

    public final float i() {
        return m();
    }

    public final float j() {
        return g() / l();
    }

    public final boolean k() {
        return n();
    }

    public final float l() {
        return p();
    }

    public final float q(float f10) {
        if (n()) {
            return 0.0f;
        }
        float d10 = C17978n.d(h() + f10, 0.0f);
        float h10 = d10 - h();
        s(d10);
        w(f());
        return h10;
    }

    public final float r(float f10) {
        if (k()) {
            return 0.0f;
        }
        if (g() > l()) {
            this.f9117b.getValue().invoke();
        }
        e(0.0f);
        if (h() == 0.0f || f10 < 0.0f) {
            f10 = 0.0f;
        }
        s(0.0f);
        return f10;
    }

    public final void t(boolean z10) {
        if (n() != z10) {
            x(z10);
            float f10 = 0.0f;
            s(0.0f);
            if (z10) {
                f10 = o();
            }
            e(f10);
        }
    }

    public final void u(float f10) {
        if (o() != f10) {
            y(f10);
            if (k()) {
                e(f10);
            }
        }
    }

    public final void v(float f10) {
        z(f10);
    }
}
