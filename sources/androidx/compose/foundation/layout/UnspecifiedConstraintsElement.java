package androidx.compose.foundation.layout;

import G1.V;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsElement;", "LG1/V;", "Landroidx/compose/foundation/layout/L;", "Lc2/h;", "minWidth", "minHeight", "<init>", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "()Landroidx/compose/foundation/layout/L;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/layout/L;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "F", "getMinWidth-D9Ej5fM", "()F", "e", "getMinHeight-D9Ej5fM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class UnspecifiedConstraintsElement extends V<L> {

    /* renamed from: d  reason: collision with root package name */
    private final float f18039d;

    /* renamed from: e  reason: collision with root package name */
    private final float f18040e;

    public /* synthetic */ UnspecifiedConstraintsElement(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    /* renamed from: c */
    public L a() {
        return new L(this.f18039d, this.f18040e, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UnspecifiedConstraintsElement)) {
            return false;
        }
        UnspecifiedConstraintsElement unspecifiedConstraintsElement = (UnspecifiedConstraintsElement) obj;
        return h.D(this.f18039d, unspecifiedConstraintsElement.f18039d) && h.D(this.f18040e, unspecifiedConstraintsElement.f18040e);
    }

    /* renamed from: f */
    public void b(L l10) {
        l10.D2(this.f18039d);
        l10.C2(this.f18040e);
    }

    public int hashCode() {
        return (h.E(this.f18039d) * 31) + h.E(this.f18040e);
    }

    private UnspecifiedConstraintsElement(float f10, float f11) {
        this.f18039d = f10;
        this.f18040e = f11;
    }
}
