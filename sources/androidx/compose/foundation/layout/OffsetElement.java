package androidx.compose.foundation.layout;

import G1.V;
import XH.C16807N;
import androidx.compose.ui.platform.C5137v0;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b$\u0010%R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/OffsetElement;", "LG1/V;", "Landroidx/compose/foundation/layout/B;", "Lc2/h;", "x", "y", "", "rtlAware", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v0;", "LXH/N;", "inspectorInfo", "<init>", "(FFZLnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/B;", "node", "f", "(Landroidx/compose/foundation/layout/B;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "F", "getX-D9Ej5fM", "()F", "e", "getY-D9Ej5fM", "Z", "getRtlAware", "()Z", "g", "LnI/l;", "getInspectorInfo", "()LnI/l;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class OffsetElement extends V<B> {

    /* renamed from: d  reason: collision with root package name */
    private final float f18018d;

    /* renamed from: e  reason: collision with root package name */
    private final float f18019e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f18020f;

    /* renamed from: g  reason: collision with root package name */
    private final C17642l<C5137v0, C16807N> f18021g;

    public /* synthetic */ OffsetElement(float f10, float f11, boolean z10, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, z10, lVar);
    }

    /* renamed from: c */
    public B a() {
        return new B(this.f18018d, this.f18019e, this.f18020f, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        if (offsetElement == null) {
            return false;
        }
        return h.D(this.f18018d, offsetElement.f18018d) && h.D(this.f18019e, offsetElement.f18019e) && this.f18020f == offsetElement.f18020f;
    }

    /* renamed from: f */
    public void b(B b10) {
        b10.G2(this.f18018d);
        b10.H2(this.f18019e);
        b10.F2(this.f18020f);
    }

    public int hashCode() {
        return (((h.E(this.f18018d) * 31) + h.E(this.f18019e)) * 31) + Boolean.hashCode(this.f18020f);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + h.F(this.f18018d) + ", y=" + h.F(this.f18019e) + ", rtlAware=" + this.f18020f + ')';
    }

    private OffsetElement(float f10, float f11, boolean z10, C17642l<? super C5137v0, C16807N> lVar) {
        this.f18018d = f10;
        this.f18019e = f11;
        this.f18020f = z10;
        this.f18021g = lVar;
    }
}
