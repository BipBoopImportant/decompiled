package androidx.compose.foundation.layout;

import G1.V;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "LG1/V;", "Landroidx/compose/foundation/layout/v;", "Li1/c$b;", "horizontal", "<init>", "(Li1/c$b;)V", "c", "()Landroidx/compose/foundation/layout/v;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/layout/v;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Li1/c$b;", "getHorizontal", "()Li1/c$b;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class HorizontalAlignElement extends V<v> {

    /* renamed from: d  reason: collision with root package name */
    private final C5437c.b f17956d;

    public HorizontalAlignElement(C5437c.b bVar) {
        this.f17956d = bVar;
    }

    /* renamed from: c */
    public v a() {
        return new v(this.f17956d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return C17542s.e(this.f17956d, horizontalAlignElement.f17956d);
    }

    /* renamed from: f */
    public void b(v vVar) {
        vVar.D2(this.f17956d);
    }

    public int hashCode() {
        return this.f17956d.hashCode();
    }
}
