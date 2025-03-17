package androidx.compose.foundation;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import r0.m;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/HoverableElement;", "LG1/V;", "Landroidx/compose/foundation/i;", "Lr0/m;", "interactionSource", "<init>", "(Lr0/m;)V", "c", "()Landroidx/compose/foundation/i;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/i;)V", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lr0/m;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class HoverableElement extends V<i> {

    /* renamed from: d  reason: collision with root package name */
    private final m f17503d;

    public HoverableElement(m mVar) {
        this.f17503d = mVar;
    }

    /* renamed from: c */
    public i a() {
        return new i(this.f17503d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HoverableElement) && C17542s.e(((HoverableElement) obj).f17503d, this.f17503d);
    }

    /* renamed from: f */
    public void b(i iVar) {
        iVar.H2(this.f17503d);
    }

    public int hashCode() {
        return this.f17503d.hashCode() * 31;
    }
}
