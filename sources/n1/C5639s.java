package n1;

import G1.C4498c0;
import G1.C4508k;
import G1.G;
import G1.m0;
import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0003¨\u0006\t"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetNode;", "Ln1/t;", "d", "(Landroidx/compose/ui/focus/FocusTargetNode;)Ln1/t;", "LXH/N;", "c", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "b", "focusTransactionManager", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n1.s  reason: case insensitive filesystem */
public final class C5639s {
    /* access modifiers changed from: private */
    public static final C5640t b(FocusTargetNode focusTargetNode) {
        G P12;
        m0 p02;
        C5629i focusOwner;
        C4498c0 b22 = focusTargetNode.E0().b2();
        if (b22 == null || (P12 = b22.P1()) == null || (p02 = P12.p0()) == null || (focusOwner = p02.getFocusOwner()) == null) {
            return null;
        }
        return focusOwner.c();
    }

    public static final void c(FocusTargetNode focusTargetNode) {
        C4508k.n(focusTargetNode).getFocusOwner().h(focusTargetNode);
    }

    public static final C5640t d(FocusTargetNode focusTargetNode) {
        return C4508k.n(focusTargetNode).getFocusOwner().c();
    }
}
