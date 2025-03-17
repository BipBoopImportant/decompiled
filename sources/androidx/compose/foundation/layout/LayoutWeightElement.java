package androidx.compose.foundation.layout;

import G1.V;
import kotlin.Metadata;
import s0.C5831B;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/layout/LayoutWeightElement;", "LG1/V;", "Ls0/B;", "", "weight", "", "fill", "<init>", "(FZ)V", "c", "()Ls0/B;", "node", "LXH/N;", "f", "(Ls0/B;)V", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "F", "getWeight", "()F", "e", "Z", "getFill", "()Z", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutWeightElement extends V<C5831B> {

    /* renamed from: d  reason: collision with root package name */
    private final float f18007d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18008e;

    public LayoutWeightElement(float f10, boolean z10) {
        this.f18007d = f10;
        this.f18008e = z10;
    }

    /* renamed from: c */
    public C5831B a() {
        return new C5831B(this.f18007d, this.f18008e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        LayoutWeightElement layoutWeightElement = obj instanceof LayoutWeightElement ? (LayoutWeightElement) obj : null;
        if (layoutWeightElement == null) {
            return false;
        }
        return this.f18007d == layoutWeightElement.f18007d && this.f18008e == layoutWeightElement.f18008e;
    }

    /* renamed from: f */
    public void b(C5831B b10) {
        b10.E2(this.f18007d);
        b10.D2(this.f18008e);
    }

    public int hashCode() {
        return (Float.hashCode(this.f18007d) * 31) + Boolean.hashCode(this.f18008e);
    }
}
