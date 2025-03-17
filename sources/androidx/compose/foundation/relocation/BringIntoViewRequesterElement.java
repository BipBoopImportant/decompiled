package androidx.compose.foundation.relocation;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y0.C6248b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "LG1/V;", "Landroidx/compose/foundation/relocation/e;", "Ly0/b;", "requester", "<init>", "(Ly0/b;)V", "c", "()Landroidx/compose/foundation/relocation/e;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/relocation/e;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ly0/b;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class BringIntoViewRequesterElement extends V<e> {

    /* renamed from: d  reason: collision with root package name */
    private final C6248b f18422d;

    public BringIntoViewRequesterElement(C6248b bVar) {
        this.f18422d = bVar;
    }

    /* renamed from: c */
    public e a() {
        return new e(this.f18422d);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BringIntoViewRequesterElement) && C17542s.e(this.f18422d, ((BringIntoViewRequesterElement) obj).f18422d));
    }

    /* renamed from: f */
    public void b(e eVar) {
        eVar.D2(this.f18422d);
    }

    public int hashCode() {
        return this.f18422d.hashCode();
    }
}
