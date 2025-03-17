package androidx.compose.ui.focus;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n1.C5632l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "LG1/V;", "Landroidx/compose/ui/focus/l;", "Ln1/l;", "scope", "<init>", "(Ln1/l;)V", "c", "()Landroidx/compose/ui/focus/l;", "node", "LXH/N;", "f", "(Landroidx/compose/ui/focus/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ln1/l;", "getScope", "()Ln1/l;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class FocusPropertiesElement extends V<l> {

    /* renamed from: d  reason: collision with root package name */
    private final C5632l f18820d;

    public FocusPropertiesElement(C5632l lVar) {
        this.f18820d = lVar;
    }

    /* renamed from: c */
    public l a() {
        return new l(this.f18820d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && C17542s.e(this.f18820d, ((FocusPropertiesElement) obj).f18820d);
    }

    /* renamed from: f */
    public void b(l lVar) {
        lVar.C2(this.f18820d);
    }

    public int hashCode() {
        return this.f18820d.hashCode();
    }

    public String toString() {
        return "FocusPropertiesElement(scope=" + this.f18820d + ')';
    }
}
