package androidx.compose.foundation.layout;

import E1.C4468a;
import G1.V;
import androidx.compose.foundation.layout.I;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "LG1/V;", "Landroidx/compose/foundation/layout/I$b;", "LE1/a;", "alignmentLine", "<init>", "(LE1/a;)V", "c", "()Landroidx/compose/foundation/layout/I$b;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/layout/I$b;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LE1/a;", "getAlignmentLine", "()LE1/a;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WithAlignmentLineElement extends V<I.b> {

    /* renamed from: d  reason: collision with root package name */
    private final C4468a f18043d;

    public WithAlignmentLineElement(C4468a aVar) {
        this.f18043d = aVar;
    }

    /* renamed from: c */
    public I.b a() {
        return new I.b(this.f18043d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return C17542s.e(this.f18043d, withAlignmentLineElement.f18043d);
    }

    /* renamed from: f */
    public void b(I.b bVar) {
        bVar.C2(this.f18043d);
    }

    public int hashCode() {
        return this.f18043d.hashCode();
    }
}
