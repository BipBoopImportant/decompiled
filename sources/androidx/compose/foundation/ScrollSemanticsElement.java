package androidx.compose.foundation;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p0.s;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b(\u0010\"\u001a\u0004\b\t\u0010$R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b\n\u0010$¨\u0006*"}, d2 = {"Landroidx/compose/foundation/ScrollSemanticsElement;", "LG1/V;", "Landroidx/compose/foundation/n;", "Landroidx/compose/foundation/o;", "state", "", "reverseScrolling", "Lp0/s;", "flingBehavior", "isScrollable", "isVertical", "<init>", "(Landroidx/compose/foundation/o;ZLp0/s;ZZ)V", "c", "()Landroidx/compose/foundation/n;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/foundation/o;", "getState", "()Landroidx/compose/foundation/o;", "e", "Z", "getReverseScrolling", "()Z", "Lp0/s;", "getFlingBehavior", "()Lp0/s;", "g", "h", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class ScrollSemanticsElement extends V<n> {

    /* renamed from: d  reason: collision with root package name */
    private final o f17516d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f17517e;

    /* renamed from: f  reason: collision with root package name */
    private final s f17518f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f17519g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f17520h;

    public ScrollSemanticsElement(o oVar, boolean z10, s sVar, boolean z11, boolean z12) {
        this.f17516d = oVar;
        this.f17517e = z10;
        this.f17518f = sVar;
        this.f17519g = z11;
        this.f17520h = z12;
    }

    /* renamed from: c */
    public n a() {
        return new n(this.f17516d, this.f17517e, this.f17518f, this.f17519g, this.f17520h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return C17542s.e(this.f17516d, scrollSemanticsElement.f17516d) && this.f17517e == scrollSemanticsElement.f17517e && C17542s.e(this.f17518f, scrollSemanticsElement.f17518f) && this.f17519g == scrollSemanticsElement.f17519g && this.f17520h == scrollSemanticsElement.f17520h;
    }

    /* renamed from: f */
    public void b(n nVar) {
        nVar.G2(this.f17516d);
        nVar.E2(this.f17517e);
        nVar.D2(this.f17518f);
        nVar.F2(this.f17519g);
        nVar.H2(this.f17520h);
    }

    public int hashCode() {
        int hashCode = ((this.f17516d.hashCode() * 31) + Boolean.hashCode(this.f17517e)) * 31;
        s sVar = this.f17518f;
        return ((((hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31) + Boolean.hashCode(this.f17519g)) * 31) + Boolean.hashCode(this.f17520h);
    }

    public String toString() {
        return "ScrollSemanticsElement(state=" + this.f17516d + ", reverseScrolling=" + this.f17517e + ", flingBehavior=" + this.f17518f + ", isScrollable=" + this.f17519g + ", isVertical=" + this.f17520h + ')';
    }
}
