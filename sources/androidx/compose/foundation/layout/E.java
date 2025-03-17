package androidx.compose.foundation.layout;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010\u0015\u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010\u0019R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006)"}, d2 = {"Landroidx/compose/foundation/layout/E;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Lc2/h;", "start", "top", "end", "bottom", "", "rtlAware", "<init>", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "F", "D2", "()F", "I2", "(F)V", "o", "E2", "J2", "p", "getEnd-D9Ej5fM", "G2", "q", "getBottom-D9Ej5fM", "F2", "r", "Z", "C2", "()Z", "H2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class E extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private float f17932n;

    /* renamed from: o  reason: collision with root package name */
    private float f17933o;

    /* renamed from: p  reason: collision with root package name */
    private float f17934p;

    /* renamed from: q  reason: collision with root package name */
    private float f17935q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f17936r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ E f17937c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a0 f17938d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f17939e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(E e10, a0 a0Var, K k10) {
            super(1);
            this.f17937c = e10;
            this.f17938d = a0Var;
            this.f17939e = k10;
        }

        public final void a(a0.a aVar) {
            if (this.f17937c.C2()) {
                a0.a.m(aVar, this.f17938d, this.f17939e.K0(this.f17937c.D2()), this.f17939e.K0(this.f17937c.E2()), 0.0f, 4, (Object) null);
                return;
            }
            a0.a.i(aVar, this.f17938d, this.f17939e.K0(this.f17937c.D2()), this.f17939e.K0(this.f17937c.E2()), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ E(float f10, float f11, float f12, float f13, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10);
    }

    public final boolean C2() {
        return this.f17936r;
    }

    public final float D2() {
        return this.f17932n;
    }

    public final float E2() {
        return this.f17933o;
    }

    public final void F2(float f10) {
        this.f17935q = f10;
    }

    public final void G2(float f10) {
        this.f17934p = f10;
    }

    public final void H2(boolean z10) {
        this.f17936r = z10;
    }

    public final void I2(float f10) {
        this.f17932n = f10;
    }

    public final void J2(float f10) {
        this.f17933o = f10;
    }

    public J h(K k10, H h10, long j10) {
        int K02 = k10.K0(this.f17932n) + k10.K0(this.f17934p);
        int K03 = k10.K0(this.f17933o) + k10.K0(this.f17935q);
        a0 i02 = h10.i0(c.o(j10, -K02, -K03));
        return K.v0(k10, c.i(j10, i02.E0() + K02), c.h(j10, i02.z0() + K03), (Map) null, new a(this, i02, k10), 4, (Object) null);
    }

    private E(float f10, float f11, float f12, float f13, boolean z10) {
        this.f17932n = f10;
        this.f17933o = f11;
        this.f17934p = f12;
        this.f17935q = f13;
        this.f17936r = z10;
    }
}
