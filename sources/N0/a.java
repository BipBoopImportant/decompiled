package N0;

import QJ.Q;
import U0.A1;
import U0.C4899r0;
import U0.T0;
import U0.o1;
import XH.C16807N;
import XH.C16814e;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleContainer;
import androidx.compose.material.ripple.RippleHostView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import o1.C5673m;
import p1.C5702H;
import p1.C5732n0;
import p1.C5747v0;
import pI.C17752b;
import r0.o;
import r1.C5817c;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B;\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0011*\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0013J\u000f\u0010#\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010\u0013J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010\u0013J\u000f\u0010%\u001a\u00020\u0011H\u0016¢\u0006\u0004\b%\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0002X\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b \u0010(R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010.R/\u00108\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u0001008B@BX\u0002¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R+\u0010<\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048B@BX\u0002¢\u0006\u0012\n\u0004\b\u0015\u00103\u001a\u0004\b2\u00109\"\u0004\b:\u0010;R\u001c\u0010?\u001a\u00020=8\u0002@\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b4\u0010>R\u0016\u0010B\u001a\u00020@8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010AR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00110C8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010D\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"LN0/a;", "LN0/l;", "LU0/T0;", "LN0/j;", "", "bounded", "Lc2/h;", "radius", "LU0/A1;", "Lp1/v0;", "color", "LN0/g;", "rippleAlpha", "Landroid/view/ViewGroup;", "view", "<init>", "(ZFLU0/A1;LU0/A1;Landroid/view/ViewGroup;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "LXH/N;", "h", "()V", "Landroidx/compose/material/ripple/RippleContainer;", "j", "()Landroidx/compose/material/ripple/RippleContainer;", "Lr1/c;", "a", "(Lr1/c;)V", "Lr0/o$b;", "interaction", "LQJ/Q;", "scope", "b", "(Lr0/o$b;LQJ/Q;)V", "d", "(Lr0/o$b;)V", "w0", "o1", "c1", "u1", "c", "Z", "F", "e", "LU0/A1;", "f", "g", "Landroid/view/ViewGroup;", "Landroidx/compose/material/ripple/RippleContainer;", "rippleContainer", "Landroidx/compose/material/ripple/RippleHostView;", "<set-?>", "i", "LU0/r0;", "k", "()Landroidx/compose/material/ripple/RippleHostView;", "m", "(Landroidx/compose/material/ripple/RippleHostView;)V", "rippleHostView", "()Z", "l", "(Z)V", "invalidateTick", "Lo1/m;", "J", "rippleSize", "", "I", "rippleRadius", "Lkotlin/Function0;", "LnI/a;", "onInvalidateRipple", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class a extends l implements T0, j {

    /* renamed from: c  reason: collision with root package name */
    private final boolean f9164c;

    /* renamed from: d  reason: collision with root package name */
    private final float f9165d;

    /* renamed from: e  reason: collision with root package name */
    private final A1<C5747v0> f9166e;

    /* renamed from: f  reason: collision with root package name */
    private final A1<g> f9167f;

    /* renamed from: g  reason: collision with root package name */
    private final ViewGroup f9168g;

    /* renamed from: h  reason: collision with root package name */
    private RippleContainer f9169h;

    /* renamed from: i  reason: collision with root package name */
    private final C4899r0 f9170i;

    /* renamed from: j  reason: collision with root package name */
    private final C4899r0 f9171j;

    /* renamed from: k  reason: collision with root package name */
    private long f9172k;

    /* renamed from: l  reason: collision with root package name */
    private int f9173l;

    /* renamed from: m  reason: collision with root package name */
    private final C17631a<C16807N> f9174m;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: N0.a$a  reason: collision with other inner class name */
    static final class C0132a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a f9175c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0132a(a aVar) {
            super(0);
            this.f9175c = aVar;
        }

        public final void invoke() {
            a aVar = this.f9175c;
            aVar.l(!aVar.i());
        }
    }

    public /* synthetic */ a(boolean z10, float f10, A1 a12, A1 a13, ViewGroup viewGroup, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, a12, a13, viewGroup);
    }

    private final void h() {
        RippleContainer rippleContainer = this.f9169h;
        if (rippleContainer != null) {
            rippleContainer.a(this);
        }
    }

    /* access modifiers changed from: private */
    public final boolean i() {
        return ((Boolean) this.f9171j.getValue()).booleanValue();
    }

    private final RippleContainer j() {
        RippleContainer rippleContainer = this.f9169h;
        if (rippleContainer != null) {
            C17542s.g(rippleContainer);
            return rippleContainer;
        }
        RippleContainer a10 = q.c(this.f9168g);
        this.f9169h = a10;
        C17542s.g(a10);
        return a10;
    }

    private final RippleHostView k() {
        return (RippleHostView) this.f9170i.getValue();
    }

    /* access modifiers changed from: private */
    public final void l(boolean z10) {
        this.f9171j.setValue(Boolean.valueOf(z10));
    }

    private final void m(RippleHostView rippleHostView) {
        this.f9170i.setValue(rippleHostView);
    }

    public void a(C5817c cVar) {
        this.f9172k = cVar.b();
        this.f9173l = Float.isNaN(this.f9165d) ? C17752b.e(i.a(cVar, this.f9164c, cVar.b())) : cVar.K0(this.f9165d);
        long y10 = this.f9166e.getValue().y();
        float d10 = this.f9167f.getValue().d();
        cVar.V1();
        c(cVar, this.f9165d, y10);
        C5732n0 e10 = cVar.I1().e();
        i();
        RippleHostView k10 = k();
        if (k10 != null) {
            k10.f(cVar.b(), y10, d10);
            k10.draw(C5702H.d(e10));
        }
    }

    public void b(o.b bVar, Q q10) {
        RippleHostView b10 = j().b(this);
        b10.b(bVar, this.f9164c, this.f9172k, this.f9173l, this.f9166e.getValue().y(), this.f9167f.getValue().d(), this.f9174m);
        m(b10);
    }

    public void c1() {
        h();
    }

    public void d(o.b bVar) {
        RippleHostView k10 = k();
        if (k10 != null) {
            k10.e();
        }
    }

    public void o1() {
        h();
    }

    public void u1() {
        m((RippleHostView) null);
    }

    public void w0() {
    }

    private a(boolean z10, float f10, A1<C5747v0> a12, A1<g> a13, ViewGroup viewGroup) {
        super(z10, a13);
        this.f9164c = z10;
        this.f9165d = f10;
        this.f9166e = a12;
        this.f9167f = a13;
        this.f9168g = viewGroup;
        this.f9170i = u1.e((Object) null, (o1) null, 2, (Object) null);
        this.f9171j = u1.e(Boolean.TRUE, (o1) null, 2, (Object) null);
        this.f9172k = C5673m.f26722b.b();
        this.f9173l = -1;
        this.f9174m = new C0132a(this);
    }
}
