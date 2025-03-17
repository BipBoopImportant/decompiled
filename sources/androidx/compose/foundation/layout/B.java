package androidx.compose.foundation.layout;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import androidx.compose.ui.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/B;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Lc2/h;", "x", "y", "", "rtlAware", "<init>", "(FFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "F", "D2", "()F", "G2", "(F)V", "o", "E2", "H2", "p", "Z", "C2", "()Z", "F2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class B extends d.c implements G1.B {

    /* renamed from: n  reason: collision with root package name */
    private float f17910n;

    /* renamed from: o  reason: collision with root package name */
    private float f17911o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f17912p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ B f17913c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a0 f17914d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f17915e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(B b10, a0 a0Var, K k10) {
            super(1);
            this.f17913c = b10;
            this.f17914d = a0Var;
            this.f17915e = k10;
        }

        public final void a(a0.a aVar) {
            if (this.f17913c.C2()) {
                a0.a.m(aVar, this.f17914d, this.f17915e.K0(this.f17913c.D2()), this.f17915e.K0(this.f17913c.E2()), 0.0f, 4, (Object) null);
                return;
            }
            a0.a.i(aVar, this.f17914d, this.f17915e.K0(this.f17913c.D2()), this.f17915e.K0(this.f17913c.E2()), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public /* synthetic */ B(float f10, float f11, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10);
    }

    public final boolean C2() {
        return this.f17912p;
    }

    public final float D2() {
        return this.f17910n;
    }

    public final float E2() {
        return this.f17911o;
    }

    public final void F2(boolean z10) {
        this.f17912p = z10;
    }

    public final void G2(float f10) {
        this.f17910n = f10;
    }

    public final void H2(float f10) {
        this.f17911o = f10;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02 = h10.i0(j10);
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(this, i02, k10), 4, (Object) null);
    }

    private B(float f10, float f11, boolean z10) {
        this.f17910n = f10;
        this.f17911o = f11;
        this.f17912p = z10;
    }
}
