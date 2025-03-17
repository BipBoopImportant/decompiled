package N0;

import G1.A;
import G1.C4505h;
import G1.C4508k;
import G1.C4515s;
import G1.r;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import c2.s;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import j0.L;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import o1.C5673m;
import p1.C5753y0;
import r0.j;
import r0.k;
import r0.o;
import r1.C5817c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\"J\u0013\u0010$\u001a\u00020\u0014*\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\u00020\u0014*\u00020&H&¢\u0006\u0004\b'\u0010(J*\u0010-\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020*2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020)H&¢\u0006\u0004\b/\u00100R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001f\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\u00078\u0006XD¢\u0006\f\n\u0004\b>\u00104\u001a\u0004\b?\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u00107R*\u0010K\u001a\u00020*2\u0006\u0010F\u001a\u00020*8\u0004@BX\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0016\u0010M\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u00104R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00120N8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0017\u0010T\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010J\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006U"}, d2 = {"LN0/n;", "Landroidx/compose/ui/d$c;", "LG1/h;", "LG1/r;", "LG1/A;", "Lr0/k;", "interactionSource", "", "bounded", "Lc2/h;", "radius", "Lp1/y0;", "color", "Lkotlin/Function0;", "LN0/g;", "rippleAlpha", "<init>", "(Lr0/k;ZFLp1/y0;LnI/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lr0/o;", "pressInteraction", "LXH/N;", "N2", "(Lr0/o;)V", "Lr0/j;", "interaction", "LQJ/Q;", "scope", "P2", "(Lr0/j;LQJ/Q;)V", "Lc2/r;", "size", "p", "(J)V", "m2", "()V", "Lr1/c;", "z", "(Lr1/c;)V", "Lr1/f;", "I2", "(Lr1/f;)V", "Lr0/o$b;", "Lo1/m;", "", "targetRadius", "H2", "(Lr0/o$b;JF)V", "O2", "(Lr0/o$b;)V", "n", "Lr0/k;", "o", "Z", "J2", "()Z", "F", "q", "Lp1/y0;", "r", "LnI/a;", "K2", "()LnI/a;", "s", "h2", "shouldAutoInvalidate", "LN0/r;", "t", "LN0/r;", "stateLayer", "u", "<set-?>", "v", "J", "M2", "()J", "rippleSize", "w", "hasValidSize", "Lj0/L;", "x", "Lj0/L;", "pendingInteractions", "Lp1/v0;", "L2", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class n extends d.c implements C4505h, r, A {
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final k f9233n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f9234o;

    /* renamed from: p  reason: collision with root package name */
    private final float f9235p;

    /* renamed from: q  reason: collision with root package name */
    private final C5753y0 f9236q;

    /* renamed from: r  reason: collision with root package name */
    private final C17631a<g> f9237r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f9238s;

    /* renamed from: t  reason: collision with root package name */
    private r f9239t;

    /* renamed from: u  reason: collision with root package name */
    private float f9240u;

    /* renamed from: v  reason: collision with root package name */
    private long f9241v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public boolean f9242w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final L<o> f9243x;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {378}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f9244c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f9245d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ n f9246e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr0/j;", "interaction", "LXH/N;", "c", "(Lr0/j;LdI/e;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: N0.n$a$a  reason: collision with other inner class name */
        static final class C0135a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f9247a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f9248b;

            C0135a(n nVar, Q q10) {
                this.f9247a = nVar;
                this.f9248b = q10;
            }

            /* renamed from: c */
            public final Object emit(j jVar, C17164e<? super C16807N> eVar) {
                if (!(jVar instanceof o)) {
                    this.f9247a.P2(jVar, this.f9248b);
                } else if (this.f9247a.f9242w) {
                    this.f9247a.N2((o) jVar);
                } else {
                    this.f9247a.f9243x.g(jVar);
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f9246e = nVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f9246e, eVar);
            aVar.f9245d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f9244c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<j> c10 = this.f9246e.f9233n.c();
                C0135a aVar = new C0135a(this.f9246e, (Q) this.f9245d);
                this.f9244c = 1;
                if (c10.collect(aVar, this) == f10) {
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

    public /* synthetic */ n(k kVar, boolean z10, float f10, C5753y0 y0Var, C17631a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(kVar, z10, f10, y0Var, aVar);
    }

    /* access modifiers changed from: private */
    public final void N2(o oVar) {
        if (oVar instanceof o.b) {
            H2((o.b) oVar, this.f9241v, this.f9240u);
        } else if (oVar instanceof o.c) {
            O2(((o.c) oVar).a());
        } else if (oVar instanceof o.a) {
            O2(((o.a) oVar).a());
        }
    }

    /* access modifiers changed from: private */
    public final void P2(j jVar, Q q10) {
        r rVar = this.f9239t;
        if (rVar == null) {
            rVar = new r(this.f9234o, this.f9237r);
            C4515s.a(this);
            this.f9239t = rVar;
        }
        rVar.c(jVar, q10);
    }

    public abstract void H2(o.b bVar, long j10, float f10);

    public abstract void I2(r1.f fVar);

    /* access modifiers changed from: protected */
    public final boolean J2() {
        return this.f9234o;
    }

    /* access modifiers changed from: protected */
    public final C17631a<g> K2() {
        return this.f9237r;
    }

    public final long L2() {
        return this.f9236q.a();
    }

    /* access modifiers changed from: protected */
    public final long M2() {
        return this.f9241v;
    }

    public abstract void O2(o.b bVar);

    public final boolean h2() {
        return this.f9238s;
    }

    public void m2() {
        F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new a(this, (C17164e<? super a>) null), 3, (Object) null);
    }

    public void p(long j10) {
        this.f9242w = true;
        c2.d i10 = C4508k.i(this);
        this.f9241v = s.d(j10);
        this.f9240u = Float.isNaN(this.f9235p) ? i.a(i10, this.f9234o, this.f9241v) : i10.H1(this.f9235p);
        L<o> l10 = this.f9243x;
        Object[] objArr = l10.f24557a;
        int i11 = l10.f24558b;
        for (int i12 = 0; i12 < i11; i12++) {
            N2((o) objArr[i12]);
        }
        this.f9243x.h();
    }

    public void z(C5817c cVar) {
        cVar.V1();
        r rVar = this.f9239t;
        if (rVar != null) {
            rVar.b(cVar, this.f9240u, L2());
        }
        I2(cVar);
    }

    private n(k kVar, boolean z10, float f10, C5753y0 y0Var, C17631a<g> aVar) {
        this.f9233n = kVar;
        this.f9234o = z10;
        this.f9235p = f10;
        this.f9236q = y0Var;
        this.f9237r = aVar;
        this.f9241v = C5673m.f26722b.b();
        this.f9243x = new L<>(0, 1, (DefaultConstructorMarker) null);
    }
}
