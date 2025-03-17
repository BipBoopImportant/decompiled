package androidx.compose.ui.draw;

import G1.C4502e0;
import G1.C4508k;
import G1.C4515s;
import G1.h0;
import G1.i0;
import XH.C16807N;
import XH.C16820k;
import androidx.compose.ui.d;
import c2.s;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m1.C5572b;
import m1.c;
import m1.i;
import nI.C17631a;
import nI.C17642l;
import p1.H0;
import r1.C5817c;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B#\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0013\u0010\u0016\u001a\u00020\u0010*\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 RB\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0006@FX\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00104\u001a\u0002018VX\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/ui/draw/a;", "Landroidx/compose/ui/d$c;", "Lm1/c;", "LG1/h0;", "Lm1/b;", "Lm1/d;", "cacheDrawScope", "Lkotlin/Function1;", "Lm1/i;", "block", "<init>", "(Lm1/d;LnI/l;)V", "Lr1/c;", "contentDrawScope", "E2", "(Lr1/c;)Lm1/i;", "LXH/N;", "n2", "()V", "v1", "H0", "d1", "z", "(Lr1/c;)V", "n", "Lm1/d;", "", "o", "Z", "isCacheValid", "Landroidx/compose/ui/draw/f;", "p", "Landroidx/compose/ui/draw/f;", "cachedGraphicsContext", "value", "q", "LnI/l;", "C2", "()LnI/l;", "F2", "(LnI/l;)V", "Lc2/d;", "getDensity", "()Lc2/d;", "density", "Lc2/t;", "getLayoutDirection", "()Lc2/t;", "layoutDirection", "Lo1/m;", "b", "()J", "size", "Lp1/H0;", "D2", "()Lp1/H0;", "graphicsContext", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class a extends d.c implements c, h0, C5572b {

    /* renamed from: n  reason: collision with root package name */
    private final m1.d f18779n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18780o;

    /* renamed from: p  reason: collision with root package name */
    private f f18781p;

    /* renamed from: q  reason: collision with root package name */
    private C17642l<? super m1.d, i> f18782q;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lp1/H0;", "b", "()Lp1/H0;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.draw.a$a  reason: collision with other inner class name */
    static final class C0290a extends C17544u implements C17631a<H0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f18783c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0290a(a aVar) {
            super(0);
            this.f18783c = aVar;
        }

        /* renamed from: b */
        public final H0 invoke() {
            return this.f18783c.D2();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f18784c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ m1.d f18785d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, m1.d dVar) {
            super(0);
            this.f18784c = aVar;
            this.f18785d = dVar;
        }

        public final void invoke() {
            this.f18784c.C2().invoke(this.f18785d);
        }
    }

    public a(m1.d dVar, C17642l<? super m1.d, i> lVar) {
        this.f18779n = dVar;
        this.f18782q = lVar;
        dVar.u(this);
        dVar.z(new C0290a(this));
    }

    private final i E2(C5817c cVar) {
        if (!this.f18780o) {
            m1.d dVar = this.f18779n;
            dVar.x((i) null);
            dVar.w(cVar);
            i0.a(this, new b(this, dVar));
            if (dVar.c() != null) {
                this.f18780o = true;
            } else {
                D1.a.c("DrawResult not defined, did you forget to call onDraw?");
                throw new C16820k();
            }
        }
        i c10 = this.f18779n.c();
        C17542s.g(c10);
        return c10;
    }

    public final C17642l<m1.d, i> C2() {
        return this.f18782q;
    }

    public final H0 D2() {
        f fVar = this.f18781p;
        if (fVar == null) {
            fVar = new f();
            this.f18781p = fVar;
        }
        if (fVar.c() == null) {
            fVar.e(C4508k.j(this));
        }
        return fVar;
    }

    public final void F2(C17642l<? super m1.d, i> lVar) {
        this.f18782q = lVar;
        d1();
    }

    public void H0() {
        d1();
    }

    public long b() {
        return s.d(C4508k.h(this, C4502e0.a(128)).a());
    }

    public void d1() {
        f fVar = this.f18781p;
        if (fVar != null) {
            fVar.d();
        }
        this.f18780o = false;
        this.f18779n.x((i) null);
        C4515s.a(this);
    }

    public c2.d getDensity() {
        return C4508k.i(this);
    }

    public t getLayoutDirection() {
        return C4508k.l(this);
    }

    public void n2() {
        super.n2();
        f fVar = this.f18781p;
        if (fVar != null) {
            fVar.d();
        }
    }

    public void v1() {
        d1();
    }

    public void z(C5817c cVar) {
        E2(cVar).a().invoke(cVar);
    }
}
