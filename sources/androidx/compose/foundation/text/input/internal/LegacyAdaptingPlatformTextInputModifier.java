package androidx.compose.foundation.text.input.internal;

import B0.B;
import E0.n0;
import E0.q0;
import G1.V;
import H0.Q;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "LG1/V;", "LE0/n0;", "LE0/q0;", "serviceAdapter", "LB0/B;", "legacyTextFieldState", "LH0/Q;", "textFieldSelectionManager", "<init>", "(LE0/q0;LB0/B;LH0/Q;)V", "c", "()LE0/n0;", "node", "LXH/N;", "f", "(LE0/n0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "LE0/q0;", "getServiceAdapter", "()LE0/q0;", "e", "LB0/B;", "getLegacyTextFieldState", "()LB0/B;", "LH0/Q;", "getTextFieldSelectionManager", "()LH0/Q;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LegacyAdaptingPlatformTextInputModifier extends V<n0> {

    /* renamed from: d  reason: collision with root package name */
    private final q0 f18509d;

    /* renamed from: e  reason: collision with root package name */
    private final B f18510e;

    /* renamed from: f  reason: collision with root package name */
    private final Q f18511f;

    public LegacyAdaptingPlatformTextInputModifier(q0 q0Var, B b10, Q q10) {
        this.f18509d = q0Var;
        this.f18510e = b10;
        this.f18511f = q10;
    }

    /* renamed from: c */
    public n0 a() {
        return new n0(this.f18509d, this.f18510e, this.f18511f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return C17542s.e(this.f18509d, legacyAdaptingPlatformTextInputModifier.f18509d) && C17542s.e(this.f18510e, legacyAdaptingPlatformTextInputModifier.f18510e) && C17542s.e(this.f18511f, legacyAdaptingPlatformTextInputModifier.f18511f);
    }

    /* renamed from: f */
    public void b(n0 n0Var) {
        n0Var.E2(this.f18509d);
        n0Var.D2(this.f18510e);
        n0Var.F2(this.f18511f);
    }

    public int hashCode() {
        return (((this.f18509d.hashCode() * 31) + this.f18510e.hashCode()) * 31) + this.f18511f.hashCode();
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f18509d + ", legacyTextFieldState=" + this.f18510e + ", textFieldSelectionManager=" + this.f18511f + ')';
    }
}
