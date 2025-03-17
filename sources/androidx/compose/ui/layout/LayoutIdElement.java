package androidx.compose.ui.layout;

import E1.C4490x;
import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "LG1/V;", "LE1/x;", "", "layoutId", "<init>", "(Ljava/lang/Object;)V", "c", "()LE1/x;", "node", "LXH/N;", "f", "(LE1/x;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/Object;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LayoutIdElement extends V<C4490x> {

    /* renamed from: d  reason: collision with root package name */
    private final Object f18985d;

    public LayoutIdElement(Object obj) {
        this.f18985d = obj;
    }

    /* renamed from: c */
    public C4490x a() {
        return new C4490x(this.f18985d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && C17542s.e(this.f18985d, ((LayoutIdElement) obj).f18985d);
    }

    /* renamed from: f */
    public void b(C4490x xVar) {
        xVar.C2(this.f18985d);
    }

    public int hashCode() {
        return this.f18985d.hashCode();
    }

    public String toString() {
        return "LayoutIdElement(layoutId=" + this.f18985d + ')';
    }
}
