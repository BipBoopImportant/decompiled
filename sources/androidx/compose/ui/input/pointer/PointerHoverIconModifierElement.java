package androidx.compose.ui.input.pointer;

import A1.C4354v;
import A1.C4355w;
import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "LG1/V;", "LA1/v;", "LA1/w;", "icon", "", "overrideDescendants", "<init>", "(LA1/w;Z)V", "c", "()LA1/v;", "node", "LXH/N;", "f", "(LA1/v;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "LA1/w;", "getIcon", "()LA1/w;", "e", "Z", "getOverrideDescendants", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PointerHoverIconModifierElement extends V<C4354v> {

    /* renamed from: d  reason: collision with root package name */
    private final C4355w f18974d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f18975e;

    public PointerHoverIconModifierElement(C4355w wVar, boolean z10) {
        this.f18974d = wVar;
        this.f18975e = z10;
    }

    /* renamed from: c */
    public C4354v a() {
        return new C4354v(this.f18974d, this.f18975e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerHoverIconModifierElement)) {
            return false;
        }
        PointerHoverIconModifierElement pointerHoverIconModifierElement = (PointerHoverIconModifierElement) obj;
        return C17542s.e(this.f18974d, pointerHoverIconModifierElement.f18974d) && this.f18975e == pointerHoverIconModifierElement.f18975e;
    }

    /* renamed from: f */
    public void b(C4354v vVar) {
        vVar.P2(this.f18974d);
        vVar.Q2(this.f18975e);
    }

    public int hashCode() {
        return (this.f18974d.hashCode() * 31) + Boolean.hashCode(this.f18975e);
    }

    public String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f18974d + ", overrideDescendants=" + this.f18975e + ')';
    }
}
