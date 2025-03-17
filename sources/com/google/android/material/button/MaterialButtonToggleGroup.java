package com.google.android.material.button;

import Ea.C9068b;
import Ea.C9077k;
import I2.C4597a;
import I2.C4600b0;
import I2.C4638v;
import J2.t;
import Ua.C9280a;
import Ua.C9282c;
import Ua.k;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: k  reason: collision with root package name */
    private static final int f66203k = C9077k.f59586C;

    /* renamed from: a  reason: collision with root package name */
    private final List<c> f66204a;

    /* renamed from: b  reason: collision with root package name */
    private final e f66205b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<d> f66206c;

    /* renamed from: d  reason: collision with root package name */
    private final Comparator<MaterialButton> f66207d;

    /* renamed from: e  reason: collision with root package name */
    private Integer[] f66208e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f66209f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f66210g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f66211h;

    /* renamed from: i  reason: collision with root package name */
    private final int f66212i;

    /* renamed from: j  reason: collision with root package name */
    private Set<Integer> f66213j;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        /* renamed from: a */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends C4597a {
        b() {
        }

        public void g(View view, t tVar) {
            super.g(view, tVar);
            tVar.l0(t.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private static class c {

        /* renamed from: e  reason: collision with root package name */
        private static final C9282c f66216e = new C9280a(0.0f);

        /* renamed from: a  reason: collision with root package name */
        C9282c f66217a;

        /* renamed from: b  reason: collision with root package name */
        C9282c f66218b;

        /* renamed from: c  reason: collision with root package name */
        C9282c f66219c;

        /* renamed from: d  reason: collision with root package name */
        C9282c f66220d;

        c(C9282c cVar, C9282c cVar2, C9282c cVar3, C9282c cVar4) {
            this.f66217a = cVar;
            this.f66218b = cVar3;
            this.f66219c = cVar4;
            this.f66220d = cVar2;
        }

        public static c a(c cVar) {
            C9282c cVar2 = f66216e;
            return new c(cVar2, cVar.f66220d, cVar2, cVar.f66219c);
        }

        public static c b(c cVar, View view) {
            return v.i(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            C9282c cVar2 = cVar.f66217a;
            C9282c cVar3 = cVar.f66220d;
            C9282c cVar4 = f66216e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            C9282c cVar2 = f66216e;
            return new c(cVar2, cVar2, cVar.f66218b, cVar.f66219c);
        }

        public static c e(c cVar, View view) {
            return v.i(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            C9282c cVar2 = cVar.f66217a;
            C9282c cVar3 = f66216e;
            return new c(cVar2, cVar3, cVar.f66218b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    private class e implements MaterialButton.b {
        private e() {
        }

        public void a(MaterialButton materialButton, boolean z10) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C9068b.f59296B);
    }

    private void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton h10 = h(i10);
                int min = Math.min(h10.getStrokeWidth(), h(i10 - 1).getStrokeWidth());
                LinearLayout.LayoutParams d10 = d(h10);
                if (getOrientation() == 0) {
                    C4638v.c(d10, 0);
                    C4638v.d(d10, -min);
                    d10.topMargin = 0;
                } else {
                    d10.bottomMargin = 0;
                    d10.topMargin = -min;
                    C4638v.d(d10, 0);
                }
                h10.setLayoutParams(d10);
            }
            n(firstVisibleChildIndex);
        }
    }

    private LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void e(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f66213j);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f66210g && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i10))) {
            if (!this.f66211h || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        } else {
            return;
        }
        q(hashSet);
    }

    private void g(int i10, boolean z10) {
        Iterator<d> it = this.f66206c.iterator();
        while (it.hasNext()) {
            it.next().a(this, i10, z10);
        }
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (k(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private MaterialButton h(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    /* access modifiers changed from: private */
    public int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && k(i11)) {
                i10++;
            }
        }
        return -1;
    }

    private c j(int i10, int i11, int i12) {
        c cVar = this.f66204a.get(i10);
        if (i11 == i12) {
            return cVar;
        }
        boolean z10 = getOrientation() == 0;
        if (i10 == i11) {
            return z10 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i10 == i12) {
            return z10 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    private boolean k(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void n(int i10) {
        if (getChildCount() != 0 && i10 != -1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i10).getLayoutParams();
            if (getOrientation() == 1) {
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
                return;
            }
            C4638v.c(layoutParams, 0);
            C4638v.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void o(int i10, boolean z10) {
        View findViewById = findViewById(i10);
        if (findViewById instanceof MaterialButton) {
            this.f66209f = true;
            ((MaterialButton) findViewById).setChecked(z10);
            this.f66209f = false;
        }
    }

    private static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f66217a).t(cVar.f66220d).F(cVar.f66218b).x(cVar.f66219c);
        }
    }

    private void q(Set<Integer> set) {
        Set<Integer> set2 = this.f66213j;
        this.f66213j = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            o(id2, set.contains(Integer.valueOf(id2)));
            if (set2.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                g(id2, set.contains(Integer.valueOf(id2)));
            }
        }
        invalidate();
    }

    private void r() {
        TreeMap treeMap = new TreeMap(this.f66207d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(h(i10), Integer.valueOf(i10));
        }
        this.f66208e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(C4600b0.k());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f66205b);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    private void t() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setA11yClassName((this.f66210g ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f66204a.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        C4600b0.p0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f66206c.add(dVar);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public void f() {
        q(new HashSet());
    }

    public int getCheckedButtonId() {
        if (!this.f66210g || this.f66213j.isEmpty()) {
            return -1;
        }
        return this.f66213j.iterator().next().intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = h(i10).getId();
            if (this.f66213j.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f66208e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public boolean l() {
        return this.f66210g;
    }

    /* access modifiers changed from: package-private */
    public void m(MaterialButton materialButton, boolean z10) {
        if (!this.f66209f) {
            e(materialButton.getId(), z10);
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f66212i;
        if (i10 != -1) {
            q(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        t.a1(accessibilityNodeInfo).k0(t.e.b(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i10, int i11) {
        s();
        c();
        super.onMeasure(i10, i11);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f66204a.remove(indexOfChild);
        }
        s();
        c();
    }

    /* access modifiers changed from: package-private */
    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton h10 = h(i10);
            if (h10.getVisibility() != 8) {
                k.b v10 = h10.getShapeAppearanceModel().v();
                p(v10, j(i10, firstVisibleChildIndex, lastVisibleChildIndex));
                h10.setShapeAppearanceModel(v10.m());
            }
        }
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            h(i10).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f66211h = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f66210g != z10) {
            this.f66210g = z10;
            f();
        }
        t();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f66203k
            android.content.Context r7 = Xa.C9359a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f66204a = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f66205b = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f66206c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f66207d = r7
            r7 = 0
            r6.f66209f = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f66213j = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = Ea.C9078l.f59753M3
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.s.i(r0, r1, r2, r3, r4, r5)
            int r9 = Ea.C9078l.f59794Q3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection((boolean) r9)
            int r9 = Ea.C9078l.f59774O3
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f66212i = r9
            int r9 = Ea.C9078l.f59784P3
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f66211h = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = Ea.C9078l.f59764N3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            I2.C4600b0.z0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
