package androidx.compose.foundation.layout;

import E1.C4468a;
import E1.H;
import E1.J;
import E1.K;
import G1.B;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/foundation/layout/b;", "LG1/B;", "Landroidx/compose/ui/d$c;", "LE1/a;", "alignmentLine", "Lc2/h;", "before", "after", "<init>", "(LE1/a;FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "LE1/a;", "getAlignmentLine", "()LE1/a;", "D2", "(LE1/a;)V", "o", "F", "getBefore-D9Ej5fM", "()F", "E2", "(F)V", "p", "getAfter-D9Ej5fM", "C2", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.b  reason: case insensitive filesystem */
final class C5071b extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C4468a f18063n;

    /* renamed from: o  reason: collision with root package name */
    private float f18064o;

    /* renamed from: p  reason: collision with root package name */
    private float f18065p;

    public /* synthetic */ C5071b(C4468a aVar, float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f10, f11);
    }

    public final void C2(float f10) {
        this.f18065p = f10;
    }

    public final void D2(C4468a aVar) {
        this.f18063n = aVar;
    }

    public final void E2(float f10) {
        this.f18064o = f10;
    }

    public J h(K k10, H h10, long j10) {
        return C5070a.c(k10, this.f18063n, this.f18064o, this.f18065p, h10, j10);
    }

    private C5071b(C4468a aVar, float f10, float f11) {
        this.f18063n = aVar;
        this.f18064o = f10;
        this.f18065p = f11;
    }
}
