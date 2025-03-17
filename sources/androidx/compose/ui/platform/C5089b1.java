package androidx.compose.ui.platform;

import G1.l0;
import XH.C16807N;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.graphics.f;
import androidx.recyclerview.widget.RecyclerView;
import c2.n;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5665e;
import o1.C5667g;
import p1.C5702H;
import p1.C5732n0;
import p1.C5734o0;
import p1.C5751x0;
import p1.O0;
import p1.S;
import p1.S0;
import p1.U0;
import p1.c1;
import p1.d1;
import s1.C5905c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001*B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001fJ\u000f\u0010\"\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010\u000fJ!\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u000fJ\"\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0019H\u0016¢\u0006\u0004\b.\u0010/J9\u00100\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0016¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u001a\u00106\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00105R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b8\u00109R,\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010:R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010;R$\u0010@\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u00198\u0002@BX\u000e¢\u0006\f\n\u0004\b\u001a\u0010=\"\u0004\b>\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010BR\u0016\u0010D\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010=R\u0016\u0010E\u001a\u00020\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010=R\u0018\u0010H\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010GR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0I8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010NR\u001c\u0010R\u001a\u00020P8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b$\u0010QR\u0014\u0010T\u001a\u00020J8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010SR\u0016\u0010W\u001a\u00020U8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010V\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, d2 = {"Landroidx/compose/ui/platform/b1;", "LG1/l0;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Lp1/n0;", "Ls1/c;", "LXH/N;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;LnI/p;LnI/a;)V", "n", "()V", "canvas", "l", "(Lp1/n0;)V", "Landroidx/compose/ui/graphics/d;", "scope", "f", "(Landroidx/compose/ui/graphics/d;)V", "Lo1/g;", "position", "", "d", "(J)Z", "Lc2/r;", "size", "c", "(J)V", "Lc2/n;", "i", "invalidate", "parentLayer", "k", "(Lp1/n0;Ls1/c;)V", "j", "destroy", "point", "inverse", "b", "(JZ)J", "Lo1/e;", "rect", "e", "(Lo1/e;Z)V", "g", "(LnI/p;LnI/a;)V", "Lp1/O0;", "matrix", "a", "([F)V", "h", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "LnI/p;", "LnI/a;", "value", "Z", "m", "(Z)V", "isDirty", "Landroidx/compose/ui/platform/F0;", "Landroidx/compose/ui/platform/F0;", "outlineResolver", "isDestroyed", "drawnWithZ", "Lp1/S0;", "Lp1/S0;", "softwareLayerPaint", "Landroidx/compose/ui/platform/z0;", "Landroidx/compose/ui/platform/i0;", "Landroidx/compose/ui/platform/z0;", "matrixCache", "Lp1/o0;", "Lp1/o0;", "canvasHolder", "Landroidx/compose/ui/graphics/f;", "J", "transformOrigin", "Landroidx/compose/ui/platform/i0;", "renderNode", "", "I", "mutatedFields", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.b1  reason: case insensitive filesystem */
public final class C5089b1 implements l0 {

    /* renamed from: n  reason: collision with root package name */
    public static final b f19376n = new b((DefaultConstructorMarker) null);

    /* renamed from: o  reason: collision with root package name */
    public static final int f19377o = 8;

    /* renamed from: p  reason: collision with root package name */
    private static final p<C5109i0, Matrix, C16807N> f19378p = a.f19392c;

    /* renamed from: a  reason: collision with root package name */
    private final AndroidComposeView f19379a;

    /* renamed from: b  reason: collision with root package name */
    private p<? super C5732n0, ? super C5905c, C16807N> f19380b;

    /* renamed from: c  reason: collision with root package name */
    private C17631a<C16807N> f19381c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19382d;

    /* renamed from: e  reason: collision with root package name */
    private final F0 f19383e = new F0();

    /* renamed from: f  reason: collision with root package name */
    private boolean f19384f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f19385g;

    /* renamed from: h  reason: collision with root package name */
    private S0 f19386h;

    /* renamed from: i  reason: collision with root package name */
    private final C5145z0<C5109i0> f19387i = new C5145z0<>(f19378p);

    /* renamed from: j  reason: collision with root package name */
    private final C5734o0 f19388j = new C5734o0();

    /* renamed from: k  reason: collision with root package name */
    private long f19389k = f.f18947b.a();

    /* renamed from: l  reason: collision with root package name */
    private final C5109i0 f19390l;

    /* renamed from: m  reason: collision with root package name */
    private int f19391m;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/i0;", "rn", "Landroid/graphics/Matrix;", "matrix", "LXH/N;", "a", "(Landroidx/compose/ui/platform/i0;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.b1$a */
    static final class a extends C17544u implements p<C5109i0, Matrix, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f19392c = new a();

        a() {
            super(2);
        }

        public final void a(C5109i0 i0Var, Matrix matrix) {
            i0Var.A(matrix);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C5109i0) obj, (Matrix) obj2);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/b1$b;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/i0;", "Landroid/graphics/Matrix;", "LXH/N;", "getMatrix", "LnI/p;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.b1$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp1/n0;", "it", "LXH/N;", "a", "(Lp1/n0;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.ui.platform.b1$c */
    static final class c extends C17544u implements C17642l<C5732n0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<C5732n0, C5905c, C16807N> f19393c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(p<? super C5732n0, ? super C5905c, C16807N> pVar) {
            super(1);
            this.f19393c = pVar;
        }

        public final void a(C5732n0 n0Var) {
            this.f19393c.invoke(n0Var, null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5732n0) obj);
            return C16807N.f139792a;
        }
    }

    public C5089b1(AndroidComposeView androidComposeView, p<? super C5732n0, ? super C5905c, C16807N> pVar, C17631a<C16807N> aVar) {
        this.f19379a = androidComposeView;
        this.f19380b = pVar;
        this.f19381c = aVar;
        C5109i0 z02 = Build.VERSION.SDK_INT >= 29 ? new Z0(androidComposeView) : new M0(androidComposeView);
        z02.z(true);
        z02.h(false);
        this.f19390l = z02;
    }

    private final void l(C5732n0 n0Var) {
        if (this.f19390l.y() || this.f19390l.v()) {
            this.f19383e.a(n0Var);
        }
    }

    private final void m(boolean z10) {
        if (z10 != this.f19382d) {
            this.f19382d = z10;
            this.f19379a.A0(this, z10);
        }
    }

    private final void n() {
        J1.f19268a.a(this.f19379a);
    }

    public void a(float[] fArr) {
        O0.n(fArr, this.f19387i.b(this.f19390l));
    }

    public long b(long j10, boolean z10) {
        if (!z10) {
            return O0.f(this.f19387i.b(this.f19390l), j10);
        }
        float[] a10 = this.f19387i.a(this.f19390l);
        return a10 != null ? O0.f(a10, j10) : C5667g.f26701b.a();
    }

    public void c(long j10) {
        int h10 = r.h(j10);
        int g10 = r.g(j10);
        this.f19390l.D(f.f(this.f19389k) * ((float) h10));
        this.f19390l.E(f.g(this.f19389k) * ((float) g10));
        C5109i0 i0Var = this.f19390l;
        if (i0Var.s(i0Var.b(), this.f19390l.w(), this.f19390l.b() + h10, this.f19390l.w() + g10)) {
            this.f19390l.F(this.f19383e.b());
            invalidate();
            this.f19387i.c();
        }
    }

    public boolean d(long j10) {
        float m10 = C5667g.m(j10);
        float n10 = C5667g.n(j10);
        if (this.f19390l.v()) {
            return 0.0f <= m10 && m10 < ((float) this.f19390l.getWidth()) && 0.0f <= n10 && n10 < ((float) this.f19390l.getHeight());
        }
        if (this.f19390l.y()) {
            return this.f19383e.f(j10);
        }
        return true;
    }

    public void destroy() {
        if (this.f19390l.p()) {
            this.f19390l.c();
        }
        this.f19380b = null;
        this.f19381c = null;
        this.f19384f = true;
        m(false);
        this.f19379a.L0();
        this.f19379a.J0(this);
    }

    public void e(C5665e eVar, boolean z10) {
        if (z10) {
            float[] a10 = this.f19387i.a(this.f19390l);
            if (a10 == null) {
                eVar.g(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                O0.g(a10, eVar);
            }
        } else {
            O0.g(this.f19387i.b(this.f19390l), eVar);
        }
    }

    public void f(d dVar) {
        C17631a<C16807N> aVar;
        int z10 = dVar.z() | this.f19391m;
        int i10 = z10 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
        if (i10 != 0) {
            this.f19389k = dVar.B();
        }
        boolean z11 = false;
        boolean z12 = this.f19390l.y() && !this.f19383e.e();
        if ((z10 & 1) != 0) {
            this.f19390l.g(dVar.F());
        }
        if ((z10 & 2) != 0) {
            this.f19390l.m(dVar.Q());
        }
        if ((z10 & 4) != 0) {
            this.f19390l.d(dVar.c());
        }
        if ((z10 & 8) != 0) {
            this.f19390l.o(dVar.M());
        }
        if ((z10 & 16) != 0) {
            this.f19390l.e(dVar.L());
        }
        if ((z10 & 32) != 0) {
            this.f19390l.t(dVar.I());
        }
        if ((z10 & 64) != 0) {
            this.f19390l.G(C5751x0.k(dVar.h()));
        }
        if ((z10 & 128) != 0) {
            this.f19390l.I(C5751x0.k(dVar.K()));
        }
        if ((z10 & 1024) != 0) {
            this.f19390l.l(dVar.f());
        }
        if ((z10 & 256) != 0) {
            this.f19390l.j(dVar.N());
        }
        if ((z10 & 512) != 0) {
            this.f19390l.k(dVar.s());
        }
        if ((z10 & RecyclerView.n.FLAG_MOVED) != 0) {
            this.f19390l.i(dVar.y());
        }
        if (i10 != 0) {
            this.f19390l.D(f.f(this.f19389k) * ((float) this.f19390l.getWidth()));
            this.f19390l.E(f.g(this.f19389k) * ((float) this.f19390l.getHeight()));
        }
        boolean z13 = dVar.p() && dVar.J() != c1.a();
        if ((z10 & 24576) != 0) {
            this.f19390l.H(z13);
            this.f19390l.h(dVar.p() && dVar.J() == c1.a());
        }
        if ((131072 & z10) != 0) {
            C5109i0 i0Var = this.f19390l;
            dVar.E();
            i0Var.n((d1) null);
        }
        if ((32768 & z10) != 0) {
            this.f19390l.r(dVar.u());
        }
        boolean h10 = this.f19383e.h(dVar.D(), dVar.c(), z13, dVar.I(), dVar.b());
        if (this.f19383e.c()) {
            this.f19390l.F(this.f19383e.b());
        }
        if (z13 && !this.f19383e.e()) {
            z11 = true;
        }
        if (z12 != z11 || (z11 && h10)) {
            invalidate();
        } else {
            n();
        }
        if (!this.f19385g && this.f19390l.J() > 0.0f && (aVar = this.f19381c) != null) {
            aVar.invoke();
        }
        if ((z10 & 7963) != 0) {
            this.f19387i.c();
        }
        this.f19391m = dVar.z();
    }

    public void g(p<? super C5732n0, ? super C5905c, C16807N> pVar, C17631a<C16807N> aVar) {
        m(false);
        this.f19384f = false;
        this.f19385g = false;
        this.f19389k = f.f18947b.a();
        this.f19380b = pVar;
        this.f19381c = aVar;
    }

    public void h(float[] fArr) {
        float[] a10 = this.f19387i.a(this.f19390l);
        if (a10 != null) {
            O0.n(fArr, a10);
        }
    }

    public void i(long j10) {
        int b10 = this.f19390l.b();
        int w10 = this.f19390l.w();
        int h10 = n.h(j10);
        int i10 = n.i(j10);
        if (b10 != h10 || w10 != i10) {
            if (b10 != h10) {
                this.f19390l.B(h10 - b10);
            }
            if (w10 != i10) {
                this.f19390l.u(i10 - w10);
            }
            n();
            this.f19387i.c();
        }
    }

    public void invalidate() {
        if (!this.f19382d && !this.f19384f) {
            this.f19379a.invalidate();
            m(true);
        }
    }

    public void j() {
        if (this.f19382d || !this.f19390l.p()) {
            U0 d10 = (!this.f19390l.y() || this.f19383e.e()) ? null : this.f19383e.d();
            p<? super C5732n0, ? super C5905c, C16807N> pVar = this.f19380b;
            if (pVar != null) {
                this.f19390l.x(this.f19388j, d10, new c(pVar));
            }
            m(false);
        }
    }

    public void k(C5732n0 n0Var, C5905c cVar) {
        Canvas d10 = C5702H.d(n0Var);
        boolean z10 = false;
        if (d10.isHardwareAccelerated()) {
            j();
            if (this.f19390l.J() > 0.0f) {
                z10 = true;
            }
            this.f19385g = z10;
            if (z10) {
                n0Var.r();
            }
            this.f19390l.f(d10);
            if (this.f19385g) {
                n0Var.u();
                return;
            }
            return;
        }
        float b10 = (float) this.f19390l.b();
        float w10 = (float) this.f19390l.w();
        float q10 = (float) this.f19390l.q();
        float C10 = (float) this.f19390l.C();
        if (this.f19390l.a() < 1.0f) {
            S0 s02 = this.f19386h;
            if (s02 == null) {
                s02 = S.a();
                this.f19386h = s02;
            }
            s02.d(this.f19390l.a());
            d10.saveLayer(b10, w10, q10, C10, s02.o());
        } else {
            n0Var.t();
        }
        n0Var.d(b10, w10);
        n0Var.v(this.f19387i.b(this.f19390l));
        l(n0Var);
        p<? super C5732n0, ? super C5905c, C16807N> pVar = this.f19380b;
        if (pVar != null) {
            pVar.invoke(n0Var, null);
        }
        n0Var.n();
        m(false);
    }
}
