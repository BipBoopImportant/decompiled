package com.google.android.material.chip;

import Ea.C9068b;
import Ea.C9077k;
import I2.C4600b0;
import J2.t;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.a;
import java.util.List;
import java.util.Set;

public class ChipGroup extends FlowLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final int f66402k = C9077k.f59614x;

    /* renamed from: e  reason: collision with root package name */
    private int f66403e;

    /* renamed from: f  reason: collision with root package name */
    private int f66404f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public e f66405g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public final com.google.android.material.internal.a<Chip> f66406h;

    /* renamed from: i  reason: collision with root package name */
    private final int f66407i;

    /* renamed from: j  reason: collision with root package name */
    private final f f66408j;

    class a implements a.b {
        a() {
        }

        public void a(Set<Integer> set) {
            if (ChipGroup.this.f66405g != null) {
                e e10 = ChipGroup.this.f66405g;
                ChipGroup chipGroup = ChipGroup.this;
                e10.a(chipGroup, chipGroup.f66406h.j(ChipGroup.this));
            }
        }
    }

    class b implements e {
        b(d dVar) {
        }

        public void a(ChipGroup chipGroup, List<Integer> list) {
            if (ChipGroup.this.f66406h.l()) {
                ChipGroup.this.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i10, int i11) {
            super(i10, i11);
        }
    }

    @Deprecated
    public interface d {
    }

    public interface e {
        void a(ChipGroup chipGroup, List<Integer> list);
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public ViewGroup.OnHierarchyChangeListener f66411a;

        private f() {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(C4600b0.k());
                }
                ChipGroup.this.f66406h.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f66411a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f66406h.n((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f66411a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59335h);
    }

    private int getVisibleChipCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof Chip) && h(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private boolean h(int i10) {
        return getChildAt(i10).getVisibility() == 0;
    }

    public boolean c() {
        return super.c();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    /* access modifiers changed from: package-private */
    public int g(View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if ((childAt instanceof Chip) && h(i11)) {
                if (((Chip) childAt) == view) {
                    return i10;
                }
                i10++;
            }
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f66406h.k();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f66406h.j(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f66403e;
    }

    public int getChipSpacingVertical() {
        return this.f66404f;
    }

    public boolean i() {
        return this.f66406h.l();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f66407i;
        if (i10 != -1) {
            this.f66406h.f(i10);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.a1(accessibilityNodeInfo).k0(t.e.b(getRowCount(), c() ? getVisibleChipCount() : -1, false, i() ? 1 : 2));
    }

    public void setChipSpacing(int i10) {
        setChipSpacingHorizontal(i10);
        setChipSpacingVertical(i10);
    }

    public void setChipSpacingHorizontal(int i10) {
        if (this.f66403e != i10) {
            this.f66403e = i10;
            setItemSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i10) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingResource(int i10) {
        setChipSpacing(getResources().getDimensionPixelOffset(i10));
    }

    public void setChipSpacingVertical(int i10) {
        if (this.f66404f != i10) {
            this.f66404f = i10;
            setLineSpacing(i10);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i10) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i10));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i10) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener((e) null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(e eVar) {
        this.f66405g = eVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        ViewGroup.OnHierarchyChangeListener unused = this.f66408j.f66411a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z10) {
        this.f66406h.p(z10);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i10) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z10) {
        super.setSingleLine(z10);
    }

    public void setSingleSelection(boolean z10) {
        this.f66406h.q(z10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = f66402k
            android.content.Context r9 = Xa.C9359a.c(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.a r9 = new com.google.android.material.internal.a
            r9.<init>()
            r8.f66406h = r9
            com.google.android.material.chip.ChipGroup$f r6 = new com.google.android.material.chip.ChipGroup$f
            r0 = 0
            r6.<init>(r8, r0)
            r8.f66408j = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = Ea.C9078l.f59663E1
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r11 = Ea.C9078l.f59685G1
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = Ea.C9078l.f59696H1
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = Ea.C9078l.f59707I1
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = Ea.C9078l.f59729K1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine((boolean) r11)
            int r11 = Ea.C9078l.f59740L1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection((boolean) r11)
            int r11 = Ea.C9078l.f59718J1
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = Ea.C9078l.f59674F1
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.f66407i = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$a r10 = new com.google.android.material.chip.ChipGroup$a
            r10.<init>()
            r9.o(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            I2.C4600b0.z0(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i10) {
        setSingleLine(getResources().getBoolean(i10));
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
