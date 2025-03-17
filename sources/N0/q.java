package N0;

import G1.C4507j;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleContainer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import p1.C5753y0;
import r0.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a@\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Lr0/k;", "interactionSource", "", "bounded", "Lc2/h;", "radius", "Lp1/y0;", "color", "Lkotlin/Function0;", "LN0/g;", "rippleAlpha", "LG1/j;", "d", "(Lr0/k;ZFLp1/y0;LnI/a;)LG1/j;", "Landroid/view/ViewGroup;", "view", "Landroidx/compose/material/ripple/RippleContainer;", "c", "(Landroid/view/ViewGroup;)Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/View;", "initialView", "e", "(Landroid/view/View;)Landroid/view/ViewGroup;", "a", "Z", "IsRunningInPreview", "material-ripple_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f9256a = C17542s.e(Build.DEVICE, "layoutlib");

    /* access modifiers changed from: private */
    public static final RippleContainer c(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof RippleContainer) {
                return (RippleContainer) childAt;
            }
        }
        RippleContainer rippleContainer = new RippleContainer(viewGroup.getContext());
        viewGroup.addView(rippleContainer);
        return rippleContainer;
    }

    public static final C4507j d(k kVar, boolean z10, float f10, C5753y0 y0Var, C17631a<g> aVar) {
        return f9256a ? new c(kVar, z10, f10, y0Var, aVar, (DefaultConstructorMarker) null) : new b(kVar, z10, f10, y0Var, aVar, (DefaultConstructorMarker) null);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.ViewParent] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.view.ViewGroup e(android.view.View r2) {
        /*
        L_0x0000:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0031
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0011
            r2 = r0
            goto L_0x0000
        L_0x0011:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Couldn't find a valid parent for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x0031:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N0.q.e(android.view.View):android.view.ViewGroup");
    }
}
