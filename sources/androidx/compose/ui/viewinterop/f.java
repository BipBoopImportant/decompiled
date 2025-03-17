package androidx.compose.ui.viewinterop;

import G1.C4508k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.d;
import androidx.compose.ui.focus.g;
import kotlin.Metadata;
import n1.C5629i;
import o1.C5669i;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/d;", "e", "(Landroidx/compose/ui/d;)Landroidx/compose/ui/d;", "Landroidx/compose/ui/d$c;", "Landroid/view/View;", "g", "(Landroidx/compose/ui/d$c;)Landroid/view/View;", "other", "", "d", "(Landroid/view/View;Landroid/view/View;)Z", "Ln1/i;", "focusOwner", "hostView", "embeddedView", "Landroid/graphics/Rect;", "f", "(Ln1/i;Landroid/view/View;Landroid/view/View;)Landroid/graphics/Rect;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {
    /* access modifiers changed from: private */
    public static final boolean d(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final d e(d dVar) {
        return g.a(g.a(dVar.s(FocusGroupPropertiesElement.f19764d)).s(FocusTargetPropertiesElement.f19765d));
    }

    /* access modifiers changed from: private */
    public static final Rect f(C5629i iVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        C5669i o10 = iVar.o();
        if (o10 == null) {
            return null;
        }
        return new Rect((((int) o10.o()) + iArr[0]) - iArr2[0], (((int) o10.r()) + iArr[1]) - iArr2[1], (((int) o10.p()) + iArr[0]) - iArr2[0], (((int) o10.j()) + iArr[1]) - iArr2[1]);
    }

    /* access modifiers changed from: private */
    public static final View g(d.c cVar) {
        View U10 = C4508k.m(cVar.E0()).U();
        if (U10 != null) {
            return U10;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
