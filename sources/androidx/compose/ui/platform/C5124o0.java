package androidx.compose.ui.platform;

import G1.l0;
import XH.C16807N;
import android.graphics.Canvas;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import androidx.recyclerview.widget.RecyclerView;
import c2.d;
import c2.f;
import c2.n;
import c2.r;
import c2.s;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5665e;
import o1.C5667g;
import o1.C5668h;
import o1.C5674n;
import p1.C5702H;
import p1.C5732n0;
import p1.H0;
import p1.O0;
import p1.Q0;
import p1.S;
import p1.S0;
import p1.U0;
import p1.Y;
import p1.d1;
import r1.C5815a;
import s1.C5904b;
import s1.C5905c;
import s1.C5906d;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020%H\u0016ø\u0001\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020(H\u0016ø\u0001\u0001¢\u0006\u0004\b*\u0010'J!\u0010,\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010\u0012J\u000f\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b/\u0010\u0012J\u000f\u00100\u001a\u00020\u000bH\u0016¢\u0006\u0004\b0\u0010\u0012J\"\u00103\u001a\u00020 2\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\"H\u0016ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000b2\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u00020\"H\u0016¢\u0006\u0004\b7\u00108J9\u00109\u001a\u00020\u000b2\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0014H\u0016ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010>\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0014H\u0016ø\u0001\u0001¢\u0006\u0004\b>\u0010=R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010?R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010AR,\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010BR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010CR\u001c\u0010)\u001a\u00020(8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001e\u0010DR\u0016\u0010F\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010ER\u001a\u0010H\u001a\u00020\u00148\u0002X\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b>\u0010GR\u001e\u0010I\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u0010GR$\u0010M\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"8\u0002@BX\u000e¢\u0006\f\n\u0004\b.\u0010E\"\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020N8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001d\u001a\u00020U8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010VR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010XR\u001c\u0010[\u001a\u00020Z8\u0002@\u0002X\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010]R\u0018\u0010a\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010`R\u0018\u0010d\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010cR\u0016\u0010e\u001a\u00020\"8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010ER \u0010j\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u000b0f8\u0002X\u0004¢\u0006\u0006\n\u0004\bh\u0010i\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006k"}, d2 = {"Landroidx/compose/ui/platform/o0;", "LG1/l0;", "", "Ls1/c;", "graphicsLayer", "Lp1/H0;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Lp1/n0;", "LXH/N;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Ls1/c;Lp1/H0;Landroidx/compose/ui/platform/AndroidComposeView;LnI/p;LnI/a;)V", "q", "()V", "s", "Lp1/O0;", "o", "()[F", "n", "r", "canvas", "m", "(Lp1/n0;)V", "Landroidx/compose/ui/graphics/d;", "scope", "f", "(Landroidx/compose/ui/graphics/d;)V", "Lo1/g;", "position", "", "d", "(J)Z", "Lc2/n;", "i", "(J)V", "Lc2/r;", "size", "c", "parentLayer", "k", "(Lp1/n0;Ls1/c;)V", "j", "invalidate", "destroy", "point", "inverse", "b", "(JZ)J", "Lo1/e;", "rect", "e", "(Lo1/e;Z)V", "g", "(LnI/p;LnI/a;)V", "matrix", "a", "([F)V", "h", "Ls1/c;", "Lp1/H0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "LnI/p;", "LnI/a;", "J", "Z", "isDestroyed", "[F", "matrixCache", "inverseMatrixCache", "value", "p", "(Z)V", "isDirty", "Lc2/d;", "Lc2/d;", "density", "Lc2/t;", "l", "Lc2/t;", "layoutDirection", "Lr1/a;", "Lr1/a;", "", "I", "mutatedFields", "Landroidx/compose/ui/graphics/f;", "transformOrigin", "Lp1/Q0;", "Lp1/Q0;", "outline", "Lp1/U0;", "Lp1/U0;", "tmpPath", "Lp1/S0;", "Lp1/S0;", "softwareLayerPaint", "drawnWithEnabledZ", "Lkotlin/Function1;", "Lr1/f;", "t", "LnI/l;", "recordLambda", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.o0  reason: case insensitive filesystem */
public final class C5124o0 implements l0 {

    /* renamed from: a  reason: collision with root package name */
    private C5905c f19533a;

    /* renamed from: b  reason: collision with root package name */
    private final H0 f19534b;

    /* renamed from: c  reason: collision with root package name */
    private final AndroidComposeView f19535c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public p<? super C5732n0, ? super C5905c, C16807N> f19536d;

    /* renamed from: e  reason: collision with root package name */
    private C17631a<C16807N> f19537e;

    /* renamed from: f  reason: collision with root package name */
    private long f19538f = s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: g  reason: collision with root package name */
    private boolean f19539g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f19540h = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);

    /* renamed from: i  reason: collision with root package name */
    private float[] f19541i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f19542j;

    /* renamed from: k  reason: collision with root package name */
    private d f19543k = f.b(1.0f, 0.0f, 2, (Object) null);

    /* renamed from: l  reason: collision with root package name */
    private t f19544l = t.Ltr;

    /* renamed from: m  reason: collision with root package name */
    private final C5815a f19545m = new C5815a();

    /* renamed from: n  reason: collision with root package name */
    private int f19546n;

    /* renamed from: o  reason: collision with root package name */
    private long f19547o = androidx.compose.ui.graphics.f.f18947b.a();

    /* renamed from: p  reason: collision with root package name */
    private Q0 f19548p;

    /* renamed from: q  reason: collision with root package name */
    private U0 f19549q;

    /* renamed from: r  reason: collision with root package name */
    private S0 f19550r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f19551s;

    /* renamed from: t  reason: collision with root package name */
    private final C17642l<r1.f, C16807N> f19552t = new a(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/f;", "LXH/N;", "a", "(Lr1/f;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.o0$a */
    static final class a extends C17544u implements C17642l<r1.f, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5124o0 f19553c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5124o0 o0Var) {
            super(1);
            this.f19553c = o0Var;
        }

        public final void a(r1.f fVar) {
            C5124o0 o0Var = this.f19553c;
            C5732n0 e10 = fVar.I1().e();
            p l10 = o0Var.f19536d;
            if (l10 != null) {
                l10.invoke(e10, fVar.I1().h());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r1.f) obj);
            return C16807N.f139792a;
        }
    }

    public C5124o0(C5905c cVar, H0 h02, AndroidComposeView androidComposeView, p<? super C5732n0, ? super C5905c, C16807N> pVar, C17631a<C16807N> aVar) {
        this.f19533a = cVar;
        this.f19534b = h02;
        this.f19535c = androidComposeView;
        this.f19536d = pVar;
        this.f19537e = aVar;
    }

    private final void m(C5732n0 n0Var) {
        if (this.f19533a.k()) {
            Q0 n10 = this.f19533a.n();
            if (n10 instanceof Q0.b) {
                C5732n0.A(n0Var, ((Q0.b) n10).b(), 0, 2, (Object) null);
            } else if (n10 instanceof Q0.c) {
                U0 u02 = this.f19549q;
                if (u02 == null) {
                    u02 = Y.a();
                    this.f19549q = u02;
                }
                u02.a();
                U0.s(u02, ((Q0.c) n10).b(), (U0.b) null, 2, (Object) null);
                C5732n0.o(n0Var, u02, 0, 2, (Object) null);
            } else if (n10 instanceof Q0.a) {
                C5732n0.o(n0Var, ((Q0.a) n10).b(), 0, 2, (Object) null);
            }
        }
    }

    private final float[] n() {
        float[] o10 = o();
        float[] fArr = this.f19541i;
        if (fArr == null) {
            fArr = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
            this.f19541i = fArr;
        }
        if (C5141x0.a(o10, fArr)) {
            return fArr;
        }
        return null;
    }

    private final float[] o() {
        r();
        return this.f19540h;
    }

    private final void p(boolean z10) {
        if (z10 != this.f19542j) {
            this.f19542j = z10;
            this.f19535c.A0(this, z10);
        }
    }

    private final void q() {
        J1.f19268a.a(this.f19535c);
    }

    private final void r() {
        C5905c cVar = this.f19533a;
        long b10 = C5668h.d(cVar.o()) ? C5674n.b(s.d(this.f19538f)) : cVar.o();
        O0.h(this.f19540h);
        float[] fArr = this.f19540h;
        float[] c10 = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
        O0.q(c10, -C5667g.m(b10), -C5667g.n(b10), 0.0f, 4, (Object) null);
        O0.n(fArr, c10);
        float[] fArr2 = this.f19540h;
        float[] c11 = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
        O0.q(c11, cVar.x(), cVar.y(), 0.0f, 4, (Object) null);
        O0.i(c11, cVar.p());
        O0.j(c11, cVar.q());
        O0.k(c11, cVar.r());
        O0.m(c11, cVar.s(), cVar.t(), 0.0f, 4, (Object) null);
        O0.n(fArr2, c11);
        float[] fArr3 = this.f19540h;
        float[] c12 = O0.c((float[]) null, 1, (DefaultConstructorMarker) null);
        O0.q(c12, C5667g.m(b10), C5667g.n(b10), 0.0f, 4, (Object) null);
        O0.n(fArr3, c12);
    }

    private final void s() {
        C17631a<C16807N> aVar;
        Q0 q02 = this.f19548p;
        if (q02 != null) {
            C5906d.b(this.f19533a, q02);
            if ((q02 instanceof Q0.a) && Build.VERSION.SDK_INT < 33 && (aVar = this.f19537e) != null) {
                aVar.invoke();
            }
        }
    }

    public void a(float[] fArr) {
        O0.n(fArr, o());
    }

    public long b(long j10, boolean z10) {
        if (!z10) {
            return O0.f(o(), j10);
        }
        float[] n10 = n();
        return n10 != null ? O0.f(n10, j10) : C5667g.f26701b.a();
    }

    public void c(long j10) {
        if (!r.f(j10, this.f19538f)) {
            this.f19538f = j10;
            invalidate();
        }
    }

    public boolean d(long j10) {
        float m10 = C5667g.m(j10);
        float n10 = C5667g.n(j10);
        if (this.f19533a.k()) {
            return C5110i1.c(this.f19533a.n(), m10, n10, (U0) null, (U0) null, 24, (Object) null);
        }
        return true;
    }

    public void destroy() {
        this.f19536d = null;
        this.f19537e = null;
        this.f19539g = true;
        p(false);
        H0 h02 = this.f19534b;
        if (h02 != null) {
            h02.b(this.f19533a);
            this.f19535c.J0(this);
        }
    }

    public void e(C5665e eVar, boolean z10) {
        if (z10) {
            float[] n10 = n();
            if (n10 == null) {
                eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                O0.g(n10, eVar);
            }
        } else {
            O0.g(o(), eVar);
        }
    }

    public void f(androidx.compose.ui.graphics.d dVar) {
        boolean z10;
        int i10;
        C17631a<C16807N> aVar;
        int z11 = dVar.z() | this.f19546n;
        this.f19544l = dVar.x();
        this.f19543k = dVar.w();
        int i11 = z11 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        if (i11 != 0) {
            this.f19547o = dVar.B();
        }
        if ((z11 & 1) != 0) {
            this.f19533a.X(dVar.F());
        }
        if ((z11 & 2) != 0) {
            this.f19533a.Y(dVar.Q());
        }
        if ((z11 & 4) != 0) {
            this.f19533a.J(dVar.c());
        }
        if ((z11 & 8) != 0) {
            this.f19533a.d0(dVar.M());
        }
        if ((z11 & 16) != 0) {
            this.f19533a.e0(dVar.L());
        }
        if ((z11 & 32) != 0) {
            this.f19533a.Z(dVar.I());
            if (dVar.I() > 0.0f && !this.f19551s && (aVar = this.f19537e) != null) {
                aVar.invoke();
            }
        }
        if ((z11 & 64) != 0) {
            this.f19533a.K(dVar.h());
        }
        if ((z11 & 128) != 0) {
            this.f19533a.b0(dVar.K());
        }
        if ((z11 & 1024) != 0) {
            this.f19533a.V(dVar.f());
        }
        if ((z11 & 256) != 0) {
            this.f19533a.T(dVar.N());
        }
        if ((z11 & 512) != 0) {
            this.f19533a.U(dVar.s());
        }
        if ((z11 & RecyclerView.n.FLAG_MOVED) != 0) {
            this.f19533a.L(dVar.y());
        }
        if (i11 != 0) {
            if (androidx.compose.ui.graphics.f.e(this.f19547o, androidx.compose.ui.graphics.f.f18947b.a())) {
                this.f19533a.P(C5667g.f26701b.b());
            } else {
                this.f19533a.P(C5668h.a(androidx.compose.ui.graphics.f.f(this.f19547o) * ((float) r.h(this.f19538f)), androidx.compose.ui.graphics.f.g(this.f19547o) * ((float) r.g(this.f19538f))));
            }
        }
        if ((z11 & 16384) != 0) {
            this.f19533a.M(dVar.p());
        }
        if ((131072 & z11) != 0) {
            C5905c cVar = this.f19533a;
            dVar.E();
            cVar.S((d1) null);
        }
        if ((32768 & z11) != 0) {
            C5905c cVar2 = this.f19533a;
            int u10 = dVar.u();
            a.C0292a aVar2 = androidx.compose.ui.graphics.a.f18902a;
            if (androidx.compose.ui.graphics.a.e(u10, aVar2.a())) {
                i10 = C5904b.f28939a.a();
            } else if (androidx.compose.ui.graphics.a.e(u10, aVar2.c())) {
                i10 = C5904b.f28939a.c();
            } else if (androidx.compose.ui.graphics.a.e(u10, aVar2.b())) {
                i10 = C5904b.f28939a.b();
            } else {
                throw new IllegalStateException("Not supported composition strategy");
            }
            cVar2.N(i10);
        }
        if (!C17542s.e(this.f19548p, dVar.D())) {
            this.f19548p = dVar.D();
            s();
            z10 = true;
        } else {
            z10 = false;
        }
        this.f19546n = dVar.z();
        if (z11 != 0 || z10) {
            q();
        }
    }

    public void g(p<? super C5732n0, ? super C5905c, C16807N> pVar, C17631a<C16807N> aVar) {
        H0 h02 = this.f19534b;
        if (h02 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        } else if (this.f19533a.z()) {
            this.f19533a = h02.a();
            this.f19539g = false;
            this.f19536d = pVar;
            this.f19537e = aVar;
            this.f19547o = androidx.compose.ui.graphics.f.f18947b.a();
            this.f19551s = false;
            this.f19538f = s.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
            this.f19548p = null;
            this.f19546n = 0;
        } else {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
    }

    public void h(float[] fArr) {
        float[] n10 = n();
        if (n10 != null) {
            O0.n(fArr, n10);
        }
    }

    public void i(long j10) {
        this.f19533a.c0(j10);
        q();
    }

    public void invalidate() {
        if (!this.f19542j && !this.f19539g) {
            this.f19535c.invalidate();
            p(true);
        }
    }

    public void j() {
        if (this.f19542j) {
            if (!androidx.compose.ui.graphics.f.e(this.f19547o, androidx.compose.ui.graphics.f.f18947b.a()) && !r.f(this.f19533a.v(), this.f19538f)) {
                this.f19533a.P(C5668h.a(androidx.compose.ui.graphics.f.f(this.f19547o) * ((float) r.h(this.f19538f)), androidx.compose.ui.graphics.f.g(this.f19547o) * ((float) r.g(this.f19538f))));
            }
            this.f19533a.E(this.f19543k, this.f19544l, this.f19538f, this.f19552t);
            p(false);
        }
    }

    public void k(C5732n0 n0Var, C5905c cVar) {
        Canvas d10 = C5702H.d(n0Var);
        if (d10.isHardwareAccelerated()) {
            j();
            this.f19551s = this.f19533a.u() > 0.0f;
            r1.d I12 = this.f19545m.I1();
            I12.f(n0Var);
            I12.i(cVar);
            C5906d.a(this.f19545m, this.f19533a);
            return;
        }
        float h10 = (float) n.h(this.f19533a.w());
        float i10 = (float) n.i(this.f19533a.w());
        float h11 = h10 + ((float) r.h(this.f19538f));
        float g10 = i10 + ((float) r.g(this.f19538f));
        if (this.f19533a.i() < 1.0f) {
            S0 s02 = this.f19550r;
            if (s02 == null) {
                s02 = S.a();
                this.f19550r = s02;
            }
            s02.d(this.f19533a.i());
            d10.saveLayer(h10, i10, h11, g10, s02.o());
        } else {
            n0Var.t();
        }
        n0Var.d(h10, i10);
        n0Var.v(o());
        if (this.f19533a.k()) {
            m(n0Var);
        }
        p<? super C5732n0, ? super C5905c, C16807N> pVar = this.f19536d;
        if (pVar != null) {
            pVar.invoke(n0Var, null);
        }
        n0Var.n();
    }
}
