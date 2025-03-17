package androidx.compose.foundation.text.input.internal;

import B0.B;
import E0.q0;
import H0.Q;
import androidx.compose.ui.d;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/d;", "LE0/q0;", "serviceAdapter", "LB0/B;", "legacyTextFieldState", "LH0/Q;", "textFieldSelectionManager", "a", "(Landroidx/compose/ui/d;LE0/q0;LB0/B;LH0/Q;)Landroidx/compose/ui/d;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class a {
    public static final d a(d dVar, q0 q0Var, B b10, Q q10) {
        return dVar.s(new LegacyAdaptingPlatformTextInputModifier(q0Var, b10, q10));
    }
}
