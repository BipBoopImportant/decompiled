package androidx.compose.foundation;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5586I;
import r0.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "LG1/V;", "Landroidx/compose/foundation/l;", "Lr0/k;", "interactionSource", "Ln0/I;", "indication", "<init>", "(Lr0/k;Ln0/I;)V", "c", "()Landroidx/compose/foundation/l;", "node", "LXH/N;", "f", "(Landroidx/compose/foundation/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Lr0/k;", "e", "Ln0/I;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class IndicationModifierElement extends V<l> {

    /* renamed from: d  reason: collision with root package name */
    private final k f17504d;

    /* renamed from: e  reason: collision with root package name */
    private final C5586I f17505e;

    public IndicationModifierElement(k kVar, C5586I i10) {
        this.f17504d = kVar;
        this.f17505e = i10;
    }

    /* renamed from: c */
    public l a() {
        return new l(this.f17505e.a(this.f17504d));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return C17542s.e(this.f17504d, indicationModifierElement.f17504d) && C17542s.e(this.f17505e, indicationModifierElement.f17505e);
    }

    /* renamed from: f */
    public void b(l lVar) {
        lVar.I2(this.f17505e.a(this.f17504d));
    }

    public int hashCode() {
        return (this.f17504d.hashCode() * 31) + this.f17505e.hashCode();
    }
}
