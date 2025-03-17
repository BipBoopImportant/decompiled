package androidx.compose.foundation.layout;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.c;
import c2.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import s0.C5834E;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0006\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/layout/F;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Ls0/E;", "paddingValues", "<init>", "(Ls0/E;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "Ls0/E;", "C2", "()Ls0/E;", "D2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class F extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C5834E f17940n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ a0 f17941c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f17942d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F f17943e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(a0 a0Var, K k10, F f10) {
            super(1);
            this.f17941c = a0Var;
            this.f17942d = k10;
            this.f17943e = f10;
        }

        public final void a(a0.a aVar) {
            a0.a.i(aVar, this.f17941c, this.f17942d.K0(this.f17943e.C2().c(this.f17942d.getLayoutDirection())), this.f17942d.K0(this.f17943e.C2().d()), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public F(C5834E e10) {
        this.f17940n = e10;
    }

    public final C5834E C2() {
        return this.f17940n;
    }

    public final void D2(C5834E e10) {
        this.f17940n = e10;
    }

    public J h(K k10, H h10, long j10) {
        float f10 = (float) 0;
        if (h.v(this.f17940n.c(k10.getLayoutDirection()), h.B(f10)) < 0 || h.v(this.f17940n.d(), h.B(f10)) < 0 || h.v(this.f17940n.b(k10.getLayoutDirection()), h.B(f10)) < 0 || h.v(this.f17940n.a(), h.B(f10)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int K02 = k10.K0(this.f17940n.c(k10.getLayoutDirection())) + k10.K0(this.f17940n.b(k10.getLayoutDirection()));
        int K03 = k10.K0(this.f17940n.d()) + k10.K0(this.f17940n.a());
        a0 i02 = h10.i0(c.o(j10, -K02, -K03));
        return K.v0(k10, c.i(j10, i02.E0() + K02), c.h(j10, i02.z0() + K03), (Map) null, new a(i02, k10, this), 4, (Object) null);
    }
}
