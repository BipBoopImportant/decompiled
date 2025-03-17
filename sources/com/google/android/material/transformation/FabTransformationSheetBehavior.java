package com.google.android.material.transformation;

import Ea.C9067a;
import Fa.C9088h;
import Fa.C9090j;
import I2.C4600b0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i  reason: collision with root package name */
    private Map<View, Integer> f67657i;

    public FabTransformationSheetBehavior() {
    }

    private void k0(View view, boolean z10) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f67657i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z11 = (childAt.getLayoutParams() instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) childAt.getLayoutParams()).f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z11) {
                    if (!z10) {
                        Map<View, Integer> map = this.f67657i;
                        if (map != null && map.containsKey(childAt)) {
                            C4600b0.z0(childAt, this.f67657i.get(childAt).intValue());
                        }
                    } else {
                        this.f67657i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        C4600b0.z0(childAt, 4);
                    }
                }
            }
            if (!z10) {
                this.f67657i = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean L(View view, View view2, boolean z10, boolean z11) {
        k0(view2, z10);
        return super.L(view, view2, z10, z11);
    }

    /* access modifiers changed from: protected */
    public FabTransformationBehavior.e i0(Context context, boolean z10) {
        int i10 = z10 ? C9067a.f59294d : C9067a.f59293c;
        FabTransformationBehavior.e eVar = new FabTransformationBehavior.e();
        eVar.f67650a = C9088h.c(context, i10);
        eVar.f67651b = new C9090j(17, 0.0f, 0.0f);
        return eVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
