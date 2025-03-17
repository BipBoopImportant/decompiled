package androidx.compose.foundation.layout;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR(\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R(\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R(\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b%\u0010\u001f\"\u0004\b&\u0010!R(\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001f\"\u0004\b)\u0010!R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"Landroidx/compose/foundation/layout/PaddingElement;", "LG1/V;", "Landroidx/compose/foundation/layout/E;", "Lc2/h;", "start", "top", "end", "bottom", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(FFFFZLnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/E;", "node", "f", "(Landroidx/compose/foundation/layout/E;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "F", "getStart-D9Ej5fM", "()F", "setStart-0680j_4", "(F)V", "e", "getTop-D9Ej5fM", "setTop-0680j_4", "getEnd-D9Ej5fM", "setEnd-0680j_4", "g", "getBottom-D9Ej5fM", "setBottom-0680j_4", "h", "Z", "getRtlAware", "()Z", "setRtlAware", "(Z)V", "i", "LnI/l;", "getInspectorInfo", "()LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class PaddingElement extends V<E> {

    /* renamed from: d  reason: collision with root package name */
    private float f18025d;

    /* renamed from: e  reason: collision with root package name */
    private float f18026e;

    /* renamed from: f  reason: collision with root package name */
    private float f18027f;

    /* renamed from: g  reason: collision with root package name */
    private float f18028g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f18029h;

    /* renamed from: i  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f18030i;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, z10, lVar);
    }

    /* renamed from: c */
    public E a() {
        return new E(this.f18025d, this.f18026e, this.f18027f, this.f18028g, this.f18029h, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && h.D(this.f18025d, paddingElement.f18025d) && h.D(this.f18026e, paddingElement.f18026e) && h.D(this.f18027f, paddingElement.f18027f) && h.D(this.f18028g, paddingElement.f18028g) && this.f18029h == paddingElement.f18029h;
    }

    /* renamed from: f */
    public void b(E e10) {
        e10.I2(this.f18025d);
        e10.J2(this.f18026e);
        e10.G2(this.f18027f);
        e10.F2(this.f18028g);
        e10.H2(this.f18029h);
    }

    public int hashCode() {
        return (((((((h.E(this.f18025d) * 31) + h.E(this.f18026e)) * 31) + h.E(this.f18027f)) * 31) + h.E(this.f18028g)) * 31) + Boolean.hashCode(this.f18029h);
    }

    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, C17642l<? super C5137v0, C16807N> lVar) {
        this.f18025d = f10;
        this.f18026e = f11;
        this.f18027f = f12;
        this.f18028g = f13;
        this.f18029h = z10;
        this.f18030i = lVar;
        if (f10 >= 0.0f || h.D(f10, h.f23031b.c())) {
            float f14 = this.f18026e;
            if (f14 >= 0.0f || h.D(f14, h.f23031b.c())) {
                float f15 = this.f18027f;
                if (f15 >= 0.0f || h.D(f15, h.f23031b.c())) {
                    float f16 = this.f18028g;
                    if (f16 >= 0.0f || h.D(f16, h.f23031b.c())) {
                        return;
                    }
                }
            }
        }
        throw new IllegalArgumentException("Padding must be non-negative");
    }
}
