package androidx.compose.ui.focus;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "LG1/V;", "Landroidx/compose/ui/focus/p;", "Landroidx/compose/ui/focus/m;", "focusRequester", "<init>", "(Landroidx/compose/ui/focus/m;)V", "c", "()Landroidx/compose/ui/focus/p;", "node", "LXH/N;", "f", "(Landroidx/compose/ui/focus/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Landroidx/compose/ui/focus/m;", "getFocusRequester", "()Landroidx/compose/ui/focus/m;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FocusRequesterElement extends V<p> {

    /* renamed from: d  reason: collision with root package name */
    private final m f18821d;

    public FocusRequesterElement(m mVar) {
        this.f18821d = mVar;
    }

    /* renamed from: c */
    public p a() {
        return new p(this.f18821d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && C17542s.e(this.f18821d, ((FocusRequesterElement) obj).f18821d);
    }

    /* renamed from: f */
    public void b(p pVar) {
        pVar.C2().e().y(pVar);
        pVar.D2(this.f18821d);
        pVar.C2().e().b(pVar);
    }

    public int hashCode() {
        return this.f18821d.hashCode();
    }

    public String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f18821d + ')';
    }
}
