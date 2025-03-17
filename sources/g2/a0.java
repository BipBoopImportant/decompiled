package g2;

import U0.C4884j0;
import U0.C4892n0;
import XH.C16807N;
import c2.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17544u;
import m2.h;
import nI.C17642l;
import o1.C5667g;
import tI.C17978n;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eH@¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lg2/a0;", "", "Lg2/T;", "motionMeasurer", "LU0/n0;", "motionProgress", "<init>", "(Lg2/T;LU0/n0;)V", "Lo1/g;", "offset", "", "d", "(J)Z", "dragAmount", "LXH/N;", "g", "(J)V", "Lc2/y;", "velocity", "e", "(JLdI/e;)Ljava/lang/Object;", "h", "(LdI/e;)Ljava/lang/Object;", "f", "()Z", "a", "Lg2/T;", "b", "LU0/n0;", "Lm2/h;", "c", "()Lm2/h;", "transition", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5376T f23651a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C4892n0 f23652b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timeNanos", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Long, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f23653c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f23654d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, long j10) {
            super(1);
            this.f23653c = a0Var;
            this.f23654d = j10;
        }

        public final void a(long j10) {
            this.f23653c.c().L(this.f23653c.f23652b.a(), j10, y.h(this.f23654d), y.i(this.f23654d));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.constraintlayout.compose.TransitionHandler", f = "TransitionHandler.kt", l = {74}, m = "updateProgressWhileTouchUp")
    static final class b extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f23655c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f23656d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a0 f23657e;

        /* renamed from: f  reason: collision with root package name */
        int f23658f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a0 a0Var, C17164e<? super b> eVar) {
            super(eVar);
            this.f23657e = a0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f23656d = obj;
            this.f23658f |= Integer.MIN_VALUE;
            return this.f23657e.h(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "timeNanos", "", "a", "(J)Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Long, Float> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f23659c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a0 a0Var) {
            super(1);
            this.f23659c = a0Var;
        }

        public final Float a(long j10) {
            return Float.valueOf(this.f23659c.c().C(j10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    public a0(C5376T t10, C4892n0 n0Var) {
        this.f23651a = t10;
        this.f23652b = n0Var;
    }

    /* access modifiers changed from: private */
    public final h c() {
        return this.f23651a.H();
    }

    public final boolean d(long j10) {
        return c().I(C5667g.m(j10), C5667g.n(j10));
    }

    public final Object e(long j10, C17164e<? super C16807N> eVar) {
        Object c10 = C4884j0.c(new a(this, j10), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }

    public final boolean f() {
        return c().J(this.f23652b.a());
    }

    public final void g(long j10) {
        this.f23652b.n(C17978n.l(this.f23652b.a() + c().o(this.f23652b.a(), this.f23651a.o(), this.f23651a.n(), C5667g.m(j10), C5667g.n(j10)), 0.0f, 1.0f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof g2.a0.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            g2.a0$b r0 = (g2.a0.b) r0
            int r1 = r0.f23658f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f23658f = r1
            goto L_0x0018
        L_0x0013:
            g2.a0$b r0 = new g2.a0$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f23656d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f23658f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f23655c
            g2.a0 r0 = (g2.a0) r0
            XH.y.b(r5)
            goto L_0x0049
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            XH.y.b(r5)
            g2.a0$c r5 = new g2.a0$c
            r5.<init>(r4)
            r0.f23655c = r4
            r0.f23658f = r3
            java.lang.Object r5 = U0.C4884j0.c(r5, r0)
            if (r5 != r1) goto L_0x0048
            return r1
        L_0x0048:
            r0 = r4
        L_0x0049:
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            U0.n0 r0 = r0.f23652b
            r0.n(r5)
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.a0.h(dI.e):java.lang.Object");
    }
}
